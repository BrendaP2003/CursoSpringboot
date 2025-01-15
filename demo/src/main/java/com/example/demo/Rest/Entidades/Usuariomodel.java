package com.example.demo.Rest.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuarios")
public class Usuariomodel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(unique = true, nullable = false)
    public Long id;
    public String Nombre;
    public String Email;
    public Integer Prioridad;

    public Integer getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        Prioridad = prioridad;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
