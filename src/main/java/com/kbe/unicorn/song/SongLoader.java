package com.kbe.unicorn.song;

import java.nio.file.Paths;
import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class SongLoader {
    @Autowired
    SongRepository repo;

    @PostConstruct
    public void init() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        var songs = mapper.readValue(Paths.get("exercises/1/songs.json").toFile(), SongEntity[].class);
        repo.saveAll(Arrays.asList(songs));
    }
}
