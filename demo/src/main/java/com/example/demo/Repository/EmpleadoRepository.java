package com.example.demo.Repository;

import com.example.demo.Entidades.EmpleadoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<EmpleadoModel,Long> {


}
