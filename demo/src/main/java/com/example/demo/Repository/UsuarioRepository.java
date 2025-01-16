package com.example.demo.Repository;

import com.example.demo.Entidades.Usuariomodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuariomodel, Long> {

}
