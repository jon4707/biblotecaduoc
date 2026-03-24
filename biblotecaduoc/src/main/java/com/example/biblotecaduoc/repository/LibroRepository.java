package com.example.biblotecaduoc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.biblotecaduoc.model.Libro;
@Repository

public class LibroRepository {
    



    private List<Libro> listaLibros=new ArrayList<>();
    public List<Libro> obteneLibros(){
        return listaLibros;
    }
}
