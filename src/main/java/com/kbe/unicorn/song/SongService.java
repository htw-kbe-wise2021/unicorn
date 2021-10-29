package com.kbe.unicorn.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

@Service
public class SongService {
    @Autowired
    SongRepository repo;

    public SongEntity findById(long id) {
        return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Collection<SongEntity> findAll() {
        return repo.findAll();
    }
}
