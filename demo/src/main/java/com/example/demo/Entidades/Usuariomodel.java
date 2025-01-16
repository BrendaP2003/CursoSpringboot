package com.example.demo.Entidades;

import com.example.demo.Dto.Response.UsuarioResponse;
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
    public String Rol;

    public Usuariomodel(String nombre, String email, String rol) {
    }


    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
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
