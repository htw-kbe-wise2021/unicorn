package com.kbe.unicorn.song;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class SongDto {
    @NotBlank
    private String title;
    @NotBlank
    private String label;
    @NotNull
    private Integer released;
    @NotBlank
    private String artist;
}
