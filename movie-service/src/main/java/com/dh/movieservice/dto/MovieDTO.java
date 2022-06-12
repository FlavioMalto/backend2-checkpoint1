package com.dh.movieservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDTO {

    private Integer id;
    private String name;
    private String genre;
    private String urlStream;

}
