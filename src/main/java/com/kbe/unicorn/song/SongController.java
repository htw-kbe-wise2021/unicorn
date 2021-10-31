package com.kbe.unicorn.song;

import java.util.Collection;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController()
@RequestMapping("/songs")
public class SongController {
    @Autowired
    SongService service;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/{id}")
    public SongEntity one(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping()
    public Collection<SongEntity> all() {
        return service.findAll();
    }

    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody @Valid SongDto song) {
        System.out.println(song);
        var createdSong = service.newSong(convertToEntity(song));
        var location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdSong.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    private SongDto convertToDto(SongEntity song) {
        return modelMapper.map(song, SongDto.class);
    }
    private SongEntity convertToEntity(SongDto song) {
        return modelMapper.map(song, SongEntity.class);
    }
}
