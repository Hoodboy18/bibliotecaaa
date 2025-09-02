package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "autorlibro")
public class AutorLibro {

    @Id
    @Column(name = "idautorlibro")
    private int idautorlibro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idautor")
    private Autor autor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idlibro")
    private Libro libro;

    public AutorLibro() {}

    public int getIdautorlibro() { return idautorlibro; }
    public void setIdautorlibro(int idautorlibro) { this.idautorlibro = idautorlibro; }

    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }

    public Libro getLibro() { return libro; }
    public void setLibro(Libro libro) { this.libro = libro; }
}
