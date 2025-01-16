package com.example.demo.MetodosExtencion;

import com.example.demo.Dto.Request.EmpleadoRequest;
import com.example.demo.Dto.Request.UsuarioRequest;
import com.example.demo.Entidades.EmpleadoModel;
import com.example.demo.Entidades.Usuariomodel;

public class DtoExtensions {

    //convertir Dto (UsuarioRequest) a entidad (UsuarioModel)
    public static Usuariomodel toEntityUsuario (UsuarioRequest usuarioRequest){
        if (usuarioRequest== null){
            return null;
        }
        return new Usuariomodel(usuarioRequest.Nombre(),usuarioRequest.Email(), usuarioRequest.Rol());
    }
    //convertir Dto (EmpleadoRequest) a entidad (EmpleadoModel)
    public static EmpleadoModel toEntityEmpleado (EmpleadoRequest empleadoRequest){
        if (empleadoRequest== null){
            return null;
        }
        return new EmpleadoModel(empleadoRequest.Nombre(),empleadoRequest.Puesto(), empleadoRequest.Salario());
    }
}
