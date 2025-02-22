package com.example.demo.Controller;


import com.example.demo.Dto.Response.UsuarioResponse;
import com.example.demo.Servicio.UsuarioService;
//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;
import java.util.ArrayList;


@RestController
@RequestMapping("/usuarios")
public class UsuarioCntrollers {

    @Autowired
    private UsuarioService usuarioservice;

    @GetMapping
    public ResponseEntity<ArrayList<UsuarioResponse>> obtenerusuario(){
        ArrayList<UsuarioResponse> usuarios = usuarioservice.ObtenerUsuarios();

        return ResponseEntity.ok(usuarios);
    }
    //obtener usuario por id

    @GetMapping("/usuarios/{id}")
    public ResponseEntity<UsuarioResponse> obtenerUsuarioPorId(@PathVariable Long id) {
        Optional<UsuarioResponse> usuarioResponse = usuarioservice.ObtenerPorId(id);

        // Si el usuario está presente, devuelve una respuesta 200 con el usuario
        return usuarioResponse
                .map(ResponseEntity::ok) // Mapea el valor a ResponseEntity.ok()
                .orElseGet(() -> ResponseEntity.notFound().build()); // Si no está presente, devuelve 404
    }

}
