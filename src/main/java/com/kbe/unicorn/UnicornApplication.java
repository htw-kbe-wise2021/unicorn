package com.kbe.unicorn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kbe.unicorn.song.SongEntity;
import com.kbe.unicorn.song.SongRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.nio.file.Paths;
import java.util.Arrays;

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
