package com.fca.biblioteca.presentation;

import com.fca.biblioteca.data.Libro;
import com.fca.biblioteca.domain.LibroDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LibroController {

    /*Inyección de Dependencias*/
    private LibroDomain libroDomain;
    LibroController(LibroDomain libroDomain) {
        this.libroDomain = libroDomain;
    }

    @RequestMapping(value = "/libros-dispoibles", method = RequestMethod.GET)
    /*Capa de Presentación*/

    @ResponseBody /*Para que nos regrese la lista de libros en un tipo Json*/
    public List<Libro> buscarLibrosPorTitulo
            (@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibrosDisponibles(titulo,edicion);/*Aqui ya traemos la lista a la capa de dominio*/
    }

    @RequestMapping(value = "/libros", method = RequestMethod.GET)
    /*Capa de Presentación*/

    @ResponseBody /*Para que nos regrese la lista de libros en un tipo Json*/
    public List<Libro> buscarLibrosDisponibles
            (@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibros(titulo,edicion);/*Aqui ya traemos la lista a la capa de dominio*/
    }
}

