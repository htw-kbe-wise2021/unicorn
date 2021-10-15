# Beleg 1

Bearbeitsungszeit: 2 Wochen

## Kontext

In diesem Semester werden sie an der Implementierung eines Songdienstes arbeiten. Ein solcher Dienst wird oft in Anwendungen wie Spotify, Youtube Music, ... verwendet.

In Beleg 1 legen wir die Grundlage für die nachfolgenden Belege und implementieren einen Dienst, der eine Reihe von Liedern verwalten kann.


## Aufgaben

**Git mit mehreren Remotes:**

1. Holen sie sich die neuen Änderungen vom Template-Repository und fügen sie diese in ihrem Main-Branch hinzu.⭐ Tipps: Um einen Merge zu verhindern, können sie einen Rebase durchführen: https://git-scm.com/book/de/v2/Git-Branching-Rebasing. Danach erstellen sie einen Branch und arbeiten an den Implementierungsaufgaben.

**Spring Boot Implementierungsaufgaben:**

1. Erstellen Sie ein Maven-Projekt. In dem Maven-Projekt sollte Java 11 als Version in der `pom.xml` eingestellt werden. Darüber hinaus sollten Sie `J-Unit` und andere für den Beleg erforderliche Abhängigkeiten hinzufügen. ⭐ Tipps: Es existieren Werkzeuge um Spring-Projekte zu erstellen.

1. Im Pull-Request sollen sich nur die nötigen Änderungen befinden. Sie können eine `.gitignore` erstellen um Dateien zu definieren, welche nicht hochgeladen werden. ⭐

3. Sie erhalten eine Datei im JSON Format. In dieser Datei befinden sich 10 Songs, welche von ihrem Dienst beim Starten geladen werden sollen. Der Dienst lädt bei jedem Neustart die JSON Datei neu. Die JSON Datei soll nicht mit neuen Informationen überschrieben werden.⭐ 

   - (Anmerkung) In der JSON-Datei besitzen die Songs eine nummerische ID. Sie können jedoch auch alternativ einen String-ID für die Songs verwenden und generieren. Überlegen sie sich die Vor- und Nachteile von numerischen IDs gegenüber Hash-Werten und vice versa.

4. Implementieren ihren Dienst, sodass folgende GET-Anfrage behandelt werden kann⭐:

   ```http
   GET http://localhost:8080/TEAMNAME/songs/A_SONGID
   Accept: application/json
   ```

   Falls die HTTP-Anfrage vom Client korrekt gestellt wurde und erfolgreich von Ihrem Service bearbeitet wurde, liefert Ihr Service den Song mit der ID `A_SONGID` in JSON-Format zurück. Beispiel für die entsprechende HTTP-Response für die Anfrage `http://localhost:8080/songsservlet-TEAMNAME/songs/2`:

   ```http
   HTTP/1.1 200 OK
   Content-Type: application/json
   …
   Payload:
   {"id":2,"title":"Breaking Hell","artist":"Smiley C.","label":"RCA","released":2019}
   ```

5. Implementieren ihren Dienst, sodass folgende GET-Anfrage behandelt werden kann⭐:

   ```http
   GET http://localhost:8080/TEAMNAME/songs
   Accept: application/json
   ```

   Falls die HTTP-Anfrage vom Client korrekt gestellt wurde und erfolgreich von Ihrem Service bearbeitet wurde, liefert Ihr Service eine Liste aller Songs in JSON-Format zurück. Beispiel für die entsprechende HTTP-Response:

   ```http
   HTTP/1.1 200 OK
   Content-Type: application/json
   …
   Payload:
   [{"id":1,"title":"7 Years","artist":"LGraham","label":"Blue","released":2015},
   {"id":2,"title":"Breaking Hell","artist":"Smiley C.","label":"RCA","released":2019}
   {"id":3,"title":"Wrecking Ball","artist":"MILEY CYRUS","label":"RCA","released":2013}]
   ```

6. Implementieren sie folgenden POST Endpunkt ⭐: 

   ```http
   POST http://localhost:8080/TEAMNAME/songs
   Content-Type: application/json
   ```

   welcher den folgenden JSON Payload besitzt:

   ```json
   {"title":"Wrecking Ball","artist":"MILEY CYRUS","label":"RCA","released":2013}    
   ```

   Falls die HTTP-Anfrage vom Client korrekt gestellt wurde, erstellt Ihr Service für den Song aus der Payload eine neue, einzigartige Id. Der Song wird entsprechend intern gespeichert. Als HTTP-Response gibt Ihr Service den passenden HTTP-Statuscode und den Pfad zum neuen Song im Location-Header zurück:

   ```http
   HTTP/1.1 201 Created
   Location: /TEAMNAME/songs/NEW_SONGID
   ```

7. Implementieren ihren Dienst, sodass folgende DELETE-Anfrage behandelt werden kann⭐:

   ```http
   DELETE http://localhost:8080/TEAMNAME/songs/A_SONGID
   Accept: application/json
   ```

   Falls die HTTP-Anfrage vom Client korrekt gestellt wurde und erfolgreich von Ihrem Service bearbeitet wurde, löscht Ihr Service den Song mit der ID `A_SONGID` und sendet 204 zurück.

   ```http
   HTTP/1.1 204 No Content
   ```

8. Ihr Dienst behandelt inkorrekten Client-Requests entsprechend RFC 2616, Section 10.04: https://tools.ietf.org/html/rfc2616#section-10.4. Beispielsweise sollen HTTP-Methoden, die Ihr Service nicht anbietet mit dem Statuscode 405 beantwortet werden. ⭐

9. Testen sie ihren Dienst mit Postman. Überlegen sie sich, welche möglichen fehlerhaften Anfragen möglich sind. Dokumentieren sie die verschiedenen Fälle im Pull-Request. Sie können dafür z.B. die CURL Befehle kopieren und im Pull-Request hinzufügen. ⭐ Sie erhalten einen weiteren ⭐, wenn sie alle sinnvollen fehlerhaften Anfragen/Fällen gefunden haben.

10. (Bonus) Integrieren sie Swagger und OpenAPI in ihre Anwendung. Geben sie im Pull-Request den Pfad zu der Dokumentation. ⭐

11. (Bonus)  Implementieren sie eine CI/CD Pipeline mit einer Platform ihrer Wahl. In der Pipeline führen sie ihre Tests aus und stellen die Anwendungen bei erfolgreichen Tests bereit. Zur Implementierung der Pipeline können sie zum Beispiel GitHub Action, TravisCI oder CircleCI verwenden. Die Anwendung können sie zum Beispiel auf Heroku, AWS, GCS bereitstellen. Geben Sie den Link zu Ihrer Anwendung in der Pull-Anfrage an. **Alternative:** Sie können die Anwendung ebenfalls auf HTW VMs bereitstellen. Erstellen sie dazu eine Anfrage bei den Laboringenieuren und stellen sie mich im CC. ⭐

