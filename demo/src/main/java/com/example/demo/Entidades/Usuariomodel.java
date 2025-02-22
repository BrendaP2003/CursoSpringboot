package com.example.demo.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuarios")
public class Usuariomodel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(unique = true, nullable = false)
    public Long id;
    public String NombreUser;
    public String Email;
    public String Rol;
    public String Password;



    public Usuariomodel(String nombre, String email, String rol, String password) {

        NombreUser = nombre;
        Email = email;
        Rol = rol;
        Password= password;

    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
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
        return NombreUser;
    }

    public void setNombre(String nombre) {
        NombreUser = nombre;
    }
}
