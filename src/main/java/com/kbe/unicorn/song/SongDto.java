package com.kbe.unicorn.song;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
