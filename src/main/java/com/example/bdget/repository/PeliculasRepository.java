package com.example.bdget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bdget.model.Pelicula;
// Repository maneja la logica de acceso a datos
// de manera eficiente y modular.
// Tambien aca se crean las interfaces
public interface PeliculasRepository extends JpaRepository<Pelicula, Long>{


    // Interface

}
