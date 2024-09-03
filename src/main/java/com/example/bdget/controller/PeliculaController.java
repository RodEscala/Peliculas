package com.example.bdget.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bdget.model.Pelicula;
import com.example.bdget.service.PeliculasService;


@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
    @Autowired
    private PeliculasService peliculasService;

    @GetMapping
    public List<Pelicula> getAllPeliculas() {
        return peliculasService.getAllPeliculas();
    }

    @GetMapping("/{id}")
    public Optional<Pelicula> getMethodName(@PathVariable long id) {
        return peliculasService.getPeliculaById(id);
    }
    
    
    
}
