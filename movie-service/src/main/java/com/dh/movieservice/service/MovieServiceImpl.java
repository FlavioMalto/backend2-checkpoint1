package com.dh.movieservice.service;

import com.dh.movieservice.dto.MovieDTO;
import com.dh.movieservice.model.Movie;
import com.dh.movieservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;

    @Override
    public Movie saveFromDTO(MovieDTO dto) {
        Movie movie = new Movie();
        movie.setName(dto.getName());
        movie.setGenre(dto.getGenre());
        movie.setUrlStream(dto.getUrlStream());

        return repository.save(movie);
    }

    @Override
    public List<Movie> findByGenre(String genre) {
        return repository.findByGenre(genre);
    }

}
