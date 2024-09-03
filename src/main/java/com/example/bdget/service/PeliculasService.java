package com.example.bdget.service;
import java.util.List;
import java.util.Optional;

import com.example.bdget.model.Pelicula;

public interface PeliculasService {

    List<Pelicula> getAllPeliculas(); 
    Optional<Pelicula> getPeliculaById(long id);
}
