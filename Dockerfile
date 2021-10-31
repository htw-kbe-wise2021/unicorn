FROM maven:3-eclipse-temurin-17 AS MAVEN_ENV

RUN $JAVA_HOME/bin/jlink \
         --add-modules java.base \
         --compress=2 \
         --add-modules jdk.jfr,jdk.management.agent,java.base,java.logging,java.xml,jdk.unsupported,java.sql,java.naming,java.desktop,java.management,java.security.jgss,java.instrument \
         --no-header-files \
         --no-man-pages \
         --strip-debug \
         --output /javaruntime

COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package -DskipTests=true

FROM debian:buster-slim
ENV JAVA_HOME=/opt/java/openjdk
ENV PATH "${JAVA_HOME}/bin:${PATH}"
COPY --from=MAVEN_ENV /javaruntime $JAVA_HOME

RUN mkdir /app
WORKDIR /app

COPY --from=MAVEN_ENV /tmp/target/unicorn-*.jar /app/app.jar
COPY exercises /app/exercises

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
