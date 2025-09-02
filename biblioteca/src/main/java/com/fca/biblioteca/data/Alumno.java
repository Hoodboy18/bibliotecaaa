package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @Column(name = "idalumno")
    private int idalumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpersona")
    private Persona persona;

    @Column(name = "numerocuenta")
    private String numerocuenta;

    public Alumno() {}

    public int getIdalumno() { return idalumno; }
    public void setIdalumno(int idalumno) { this.idalumno = idalumno; }

    public Persona getPersona() { return persona; }
    public void setPersona(Persona persona) { this.persona = persona; }

    public String getNumerocuenta() { return numerocuenta; }
    public void setNumerocuenta(String numerocuenta) { this.numerocuenta = numerocuenta; }
}