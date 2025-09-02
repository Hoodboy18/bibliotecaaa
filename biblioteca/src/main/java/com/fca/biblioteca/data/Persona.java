package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @Column(name = "idpersona")
    private int idpersona;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "primerapellido")
    private String primerapellido;

    @Column(name = "segundoapellido")
    private String segundoapellido;

    public Persona() {}

    public int getIdpersona() { return idpersona; }
    public void setIdpersona(int idpersona) { this.idpersona = idpersona; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPrimerapellido() { return primerapellido; }
    public void setPrimerapellido(String primerapellido) { this.primerapellido = primerapellido; }

    public String getSegundoapellido() { return segundoapellido; }
    public void setSegundoapellido(String segundoapellido) { this.segundoapellido = segundoapellido; }
}