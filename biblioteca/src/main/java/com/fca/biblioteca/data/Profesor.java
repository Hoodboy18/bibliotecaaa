package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "profesor")
public class Profesor {

    @Id
    @Column(name = "idprofesor")
    private int idprofesor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpersona")
    private Persona persona;

    @Column(name = "numerotrabajador")
    private String numerotrabajador;

    public Profesor() {}

    public int getIdprofesor() { return idprofesor; }
    public void setIdprofesor(int idprofesor) { this.idprofesor = idprofesor; }

    public Persona getPersona() { return persona; }
    public void setPersona(Persona persona) { this.persona = persona; }

    public String getNumerotrabajador() { return numerotrabajador; }
    public void setNumerotrabajador(String numerotrabajador) { this.numerotrabajador = numerotrabajador; }
}