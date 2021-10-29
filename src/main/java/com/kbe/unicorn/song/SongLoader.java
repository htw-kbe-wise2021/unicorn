package com.kbe.unicorn.song;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.nio.file.Paths;
import java.util.Arrays;

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
