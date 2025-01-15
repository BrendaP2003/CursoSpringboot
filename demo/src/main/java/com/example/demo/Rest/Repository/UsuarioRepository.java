package com.example.demo.Rest.Repository;

import com.example.demo.Rest.Entidades.Usuariomodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuariomodel, Long> {

}
