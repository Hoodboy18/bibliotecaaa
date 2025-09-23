package com.fca.biblioteca.presentation;

import com.fca.biblioteca.data.Libro;
import com.fca.biblioteca.domain.LibroDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LibroController {

    private LibroDomain libroDomain;

    LibroController(LibroDomain libroDomain) {
        this.libroDomain = libroDomain;
    }

    @RequestMapping(value = "/libros-disponibles", method = RequestMethod.GET)
    @ResponseBody
    public List<Libro> buscarLibrosPorTitulo(@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibrosDisponibles(titulo, edicion);
    }

    @RequestMapping(value = "/libros", method = RequestMethod.GET)
    @ResponseBody
    public List<Libro> buscarLibrosDisponibles(@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibros(titulo, edicion);
    }

    @RequestMapping(value = "/libros-con-existencia", method = RequestMethod.GET)
    @ResponseBody
    public List<Libro> buscarLibrosConExistencia() {
        return libroDomain.buscarLibrosConExistencia();
    }

    @RequestMapping(value = "/libros-sin-existencia", method = RequestMethod.GET)
    @ResponseBody
    public List<Libro> buscarLibrosSinExistencia() {
        return libroDomain.buscarLibrosSinExistencia();
    }
}