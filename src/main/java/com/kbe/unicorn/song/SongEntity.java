package com.kbe.unicorn.song;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class SongEntity {
    @Id
    private long id;
    private String title;
    private String label;
    private int released;
    private String artist;
}
