package com.dh.movieservice.controller;

import com.dh.movieservice.dto.MovieDTO;
import com.dh.movieservice.model.Movie;
import com.dh.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping("/{genre}")
    public ResponseEntity<List<Movie>> getByGenre(@PathVariable String genre){
        List<Movie> movies = service.findByGenre(genre);
        return ResponseEntity.ok(movies);
    }

    @PostMapping
    public ResponseEntity<Movie> postMovie(@RequestBody MovieDTO dto) {
        return ResponseEntity.status(201).body(service.saveFromDTO(dto));
    }
}
