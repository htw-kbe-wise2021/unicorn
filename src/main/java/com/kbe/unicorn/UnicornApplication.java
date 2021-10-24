package com.kbe.unicorn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kbe.unicorn.entity.SongEntity;
import com.kbe.unicorn.repository.SongRepository;
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
	public CommandLineRunner loadSongs(ApplicationContext ctx, SongRepository repo) {
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			var songs = mapper.readValue(Paths.get("exercises/1/songs.json").toFile(), SongEntity[].class);
			repo.saveAll(Arrays.asList(songs));
			System.out.println(repo.findAll());
			System.out.println("UNICORNS ARE GREAT");
		};
	}
}
