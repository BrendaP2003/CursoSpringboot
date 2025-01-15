package com.example.demo.Rest.Servicio;


import com.example.demo.Rest.Entidades.Usuariomodel;
import com.example.demo.Rest.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Optional;


@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
//obtener
    public ArrayList<Usuariomodel> ObtenerUsuarios(){
         return (ArrayList<Usuariomodel>) usuarioRepository.findAll();

    }
    //obtener Por id
    public Optional<Usuariomodel> ObtenerPorId (Long id){
        return usuarioRepository.findById(id);
    }
//Guadar
    public Usuariomodel GuardarUsuario (Usuariomodel usuario){
        return usuarioRepository.save(usuario);

    }

    // Eliminar
    public void EliminarUsuario (Long id){
        usuarioRepository.deleteById(id);
    }
}
