package com.example.bdget.model;

// jakarta mantiene conexiones a base de datos
// la libreria permite usar jpa y hibernate
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// nos permite crear una entidad
@Entity
// la tabla que se creara se llamara pelicula
@Table(name = "pelicula")
public class Pelicula {
    //Se le dice que sera un id
    @Id
    // tambien que se auto-Incrementara 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    // se le dice el nombre que tendra la columna en la bd 
    @Column(name = "id")
    // aca es el tipo de dato al que hace referencia
    // los decoradores de arriba y el tipo de dato que mantendra
    // sera de tipo long en este caso.
    private long id;
    @Column(name="titulo")
    private String titulo;
    @Column(name="ano")
    private int año;
    @Column(name="director")
    private String director;
    @Column(name="genero")
    private String genero;
    @Column(name="sinopsis")
    private String sinopsis;

    public long getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAño(){
        return año;
    }

    public String getDirector(){
        return director;
    }

    public String getGenero(){
        return genero;
    }

    public String getSinopsis(){
        return sinopsis;
    }



    
}
