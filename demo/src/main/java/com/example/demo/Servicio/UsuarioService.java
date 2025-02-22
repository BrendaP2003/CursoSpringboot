package com.example.demo.Servicio;


import com.example.demo.Dto.Request.UsuarioRequest;
import com.example.demo.Dto.Response.UsuarioResponse;
import com.example.demo.Entidades.Usuariomodel;
import com.example.demo.MetodosExtencion.DtoExtensions;
import com.example.demo.MetodosExtencion.EntityExtensions;
import com.example.demo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    //obtener
    public ArrayList<UsuarioResponse> ObtenerUsuarios() {
        ArrayList<UsuarioResponse> ListaUsuarios = new ArrayList<>();
        var usuarios = usuarioRepository.findAll();
        for (Usuariomodel usuariomodel : usuarios) {
            ListaUsuarios.add(EntityExtensions.toDtoUsuarioResponse(usuariomodel));
        }
        return ListaUsuarios;
    }

    //obtener Por id
    public Optional<UsuarioResponse> ObtenerPorId(Long id) {
        Optional<Usuariomodel> usuario = usuarioRepository.findById(id); // Obtiene el usuario como Optional
        // Si el usuario está presente, lo convierte a UsuarioResponse y devuelve Optional<UsuarioResponse>
        return usuario.map(EntityExtensions::toDtoUsuarioResponse);
    }
//Guadar usuario
    public UsuarioResponse GuardarUsuarios (UsuarioRequest usuarioRequest){
        //convertir dto a entidad
        Usuariomodel usuario= DtoExtensions.toEntityUsuario(usuarioRequest);
        Usuariomodel   UsuarioGuardar = usuarioRepository.save(usuario);

        //retornar un dto
        return EntityExtensions.toDtoUsuarioResponse(UsuarioGuardar);
    }
//Eliminar Usuario

    public boolean EliminarUsuarios (Long id){

        if ((usuarioRepository.existsById(id))){
            usuarioRepository.deleteById(id);
            return  true;
        }else {
            return false;
        }
    }



}
