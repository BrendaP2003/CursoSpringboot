package com.example.demo.MetodosExtencion;

import com.example.demo.Dto.Response.EmpleadoResponse;
import com.example.demo.Dto.Response.UsuarioResponse;
import com.example.demo.Entidades.EmpleadoModel;
import com.example.demo.Entidades.Usuariomodel;

public  class EntityExtensions {
    //convertir usuario(Entidad) a UsuarioResponse(Dto)
    public static UsuarioResponse toDtoUsuarioResponse (Usuariomodel usuario){
        if(usuario == null){
            return null;
        }
        return new UsuarioResponse(usuario.getNombre(),usuario.getEmail(), usuario.getRol());

    }
    //convertir Empleado(Entidad) a EmpleadoResponse(Dto)
    public  static EmpleadoResponse toDtoEmpleadoResponse (EmpleadoModel empleado){
        if(empleado == null){
            return null;
        }
        return new EmpleadoResponse(empleado.getNombre(), empleado.getPuesto(), empleado.getSalario());


    }

}
