package com.kbe.unicorn;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition(info = @Info(title = "Unicorn API", version = "1.0"),
		servers = @Server(url = "/songsservlet-unicorn", description = "Magical API"))
@SpringBootApplication
public class UnicornApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnicornApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
