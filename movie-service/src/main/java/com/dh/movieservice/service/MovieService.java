package com.dh.movieservice.service;

import com.dh.movieservice.dto.MovieDTO;
import com.dh.movieservice.model.Movie;

import java.util.List;

public interface MovieService {

    Movie saveFromDTO(MovieDTO dto);

    List<Movie> findByGenre(String name);
}
