package com.fca.biblioteca.data;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "prestamo")
public class Prestamo {

    @Id
    @Column(name = "idprestamo")
    private int idprestamo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpersona")
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idlibro")
    private Libro libro;

    @Column(name = "fechaprestamo")
    private LocalDate fechaprestamo;

    @Column(name = "diasprestamo")
    private int diasprestamo;

    public Prestamo() {}

    public int getIdprestamo() { return idprestamo; }
    public void setIdprestamo(int idprestamo) { this.idprestamo = idprestamo; }

    public Persona getPersona() { return persona; }
    public void setPersona(Persona persona) { this.persona = persona; }

    public Libro getLibro() { return libro; }
    public void setLibro(Libro libro) { this.libro = libro; }

    public LocalDate getFechaprestamo() { return fechaprestamo; }
    public void setFechaprestamo(LocalDate fechaprestamo) { this.fechaprestamo = fechaprestamo; }

    public int getDiasprestamo() { return diasprestamo; }
    public void setDiasprestamo(int diasprestamo) { this.diasprestamo = diasprestamo; }
}