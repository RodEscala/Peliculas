package com.example.bdget.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bdget.model.Pelicula;
import com.example.bdget.repository.PeliculasRepository;

@Service
public class PeliculasServiceImpl implements PeliculasService{
    @Autowired
    private PeliculasRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPeliculas(){
        // aca le decimos que me traiga todo
        return peliculaRepository.findAll();
    }

    @Override
    public Optional<Pelicula> getPeliculaById(long id){
        // aca le decimos que me traiga la pelicula
        // por el id que le damos
        return peliculaRepository.findById(id);
    }
}
