package com.fca.biblioteca.domain;

import com.fca.biblioteca.data.Libro;
import com.fca.biblioteca.data.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibroDomain {
    @Autowired
    private LibroRepository libroRepository;

    /*
    public List<Libro> buscarLibroPorTitulo(String titulo) {
        return libroRepository.findAll(); /*= SELECT * FROM libro;
    }
}*/

    public List<Libro> buscarLibroPorTitulo(String titulo, String edicion) {
        return libroRepository.findAll() /*Regresa lista de Libros*/
                .stream()
                .filter(libro -> libro.getTitulo().equals(titulo))
                .filter(libro -> libro.getEdicion().equals(edicion))
                .collect(Collectors.toList());
    }
}