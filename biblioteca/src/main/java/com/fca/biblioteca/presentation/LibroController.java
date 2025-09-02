package com.fca.biblioteca.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LibroController {
    @RequestMapping(value = "/libros", method = RequestMethod.GET)
    public String getLibros(){
        return "Get some Libros";
    }
}