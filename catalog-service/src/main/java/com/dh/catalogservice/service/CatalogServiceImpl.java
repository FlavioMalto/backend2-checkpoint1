package com.dh.catalogservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService{

    @Autowired
    private MovieFeign movieFeign;

    @Override
    public List<Object> fingMovies(String genre) {
        return movieFeign.getMovies(genre);
    }

}
