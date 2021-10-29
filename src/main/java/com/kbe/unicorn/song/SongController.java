package com.kbe.unicorn.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/songs")
public class SongController {
    @Autowired
    SongService service;

    @GetMapping("/{id}")
    public SongEntity one(@PathVariable long id) {
        return service.findById(id);
    }
}
