package com.example.demo.Servicio;

import com.example.demo.Dto.Request.EmpleadoRequest;
import com.example.demo.Dto.Response.EmpleadoResponse;
import com.example.demo.Entidades.EmpleadoModel;
import com.example.demo.MetodosExtencion.DtoExtensions;
import com.example.demo.MetodosExtencion.EntityExtensions;
import com.example.demo.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpleadoService {
  @Autowired
    EmpleadoRepository empleadoRepository;

  //obtener todos los empleados

    public ArrayList<EmpleadoResponse> ObtenerEmbleados() {
        ArrayList<EmpleadoResponse> ListaEmpleados = new ArrayList<>();

        var empleados = empleadoRepository.findAll();
        for (EmpleadoModel empleadoModel : empleados){
            ListaEmpleados.add(EntityExtensions.toDtoEmpleadoResponse(empleadoModel));

        }
        return ListaEmpleados;

    }

  //Obtener todos los empleados
    //public ArrayList<EmpleadoModel> ObtenertodosEmpleados(){

   //     return (ArrayList<EmpleadoModel>) empleadoRepository.findAll();
    //}
    //obtener por id empleados
    public  Optional<EmpleadoResponse> ObtenerPorIdEmpleado(Long id){
     Optional<EmpleadoModel> empleado = empleadoRepository.findById(id);

     return empleado.map(EntityExtensions::toDtoEmpleadoResponse);
    }
    public Optional <EmpleadoModel> ObtenerporIdEmpleado(Long id){

       return empleadoRepository.findById(id);
    }

     //Guardar empleado

    public EmpleadoResponse GuardarEmpleados(EmpleadoRequest empleadoRequest){
        //convertir Dto a entidad

        EmpleadoModel empleados= DtoExtensions.toEntityEmpleado(empleadoRequest);
        EmpleadoModel EmpledadogGuardar= empleadoRepository.save(empleados);

        //retornar un dto


        return  EntityExtensions.toDtoEmpleadoResponse(EmpledadogGuardar);
    }
    public EmpleadoModel GuadarEmpleado (EmpleadoModel empleado){

        return  empleadoRepository.save(empleado);
    }

    //Eliminar empleado

    public boolean EliminarEmpleados (Long id){
        if ((empleadoRepository.existsById(id))){
            empleadoRepository.deleteById(id);

            return  true;
        }else {
            return false;
        }
    }


}
