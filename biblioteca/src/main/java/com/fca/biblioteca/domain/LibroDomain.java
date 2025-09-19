package com.fca.biblioteca.domain;


import com.fca.biblioteca.data.Libro;
import com.fca.biblioteca.data.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


@Service


public class LibroDomain {
    @Autowired
    private LibroRepository libroRepository;


    public List<Libro> buscarLibrosDisponibles(String titulo, String edicion){


        if(titulo == null || edicion == null || titulo.isEmpty() || edicion.isEmpty()){/*Este es de los parametros del metodo*/
            return new ArrayList<>();
        }


        /*Acá libro es otro, son como declaraciones para evaluar la lista en el return*/
        Predicate<Libro> filtroLibro = libro -> libro != null && libro.getTitulo().equals(titulo) && libro.getEdicion().equals(edicion);
        Predicate<Libro> disponible = libro -> libro != null && libro.getEdicion().equals(edicion);
        /*Esto comprueba que libro no sea nulo*/


        return libroRepository.findAll().stream()
                .filter(filtroLibro)
                .collect(Collectors.toList());
    }
}
