
package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @Column(name = "idautor")
    private int idautor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpersona")
    private Persona persona;

    public Autor() {}

    public int getIdautor() { return idautor; }
    public void setIdautor(int idautor) { this.idautor = idautor; }

    public Persona getPersona() { return persona; }
    public void setPersona(Persona persona) { this.persona = persona; }
}