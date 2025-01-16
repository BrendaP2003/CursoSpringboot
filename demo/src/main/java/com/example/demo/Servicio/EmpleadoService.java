package com.example.demo.Servicio;

import com.example.demo.Entidades.EmpleadoModel;
import com.example.demo.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public class EmpleadoService {
  @Autowired
    EmpleadoRepository empleadoRepository;

  //Obtener todos los empleados
    public ArrayList<EmpleadoModel> ObtenertodosEmpleados(){

        return (ArrayList<EmpleadoModel>) empleadoRepository.findAll();
    }
    //obtener por id empleados

    public Optional <EmpleadoModel> ObtenerporIdEmpleado(Long id){

       return empleadoRepository.findById(id);
    }
     //Guardar empleado
    public EmpleadoModel GuadarEmpleado (EmpleadoModel empleado){

        return  empleadoRepository.save(empleado);
    }


}
