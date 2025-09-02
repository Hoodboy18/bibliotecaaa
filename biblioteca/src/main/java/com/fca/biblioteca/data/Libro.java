package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @Column(name = "idlibro")
    private int idlibro;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "aniopublicacion")
    private int aniopublicacion;

    @Column(name = "editorial")
    private String editorial;

    @Column(name = "edicion")
    private String edicion;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "existencia")
    private int existencia;

    public Libro() {}

    public int getIdlibro() { return idlibro; }
    public void setIdlibro(int idlibro) { this.idlibro = idlibro; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getAniopublicacion() { return aniopublicacion; }
    public void setAniopublicacion(int aniopublicacion) { this.aniopublicacion = aniopublicacion; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public String getEdicion() { return edicion; }
    public void setEdicion(String edicion) { this.edicion = edicion; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getExistencia() { return existencia; }
    public void setExistencia(int existencia) { this.existencia = existencia; }
}