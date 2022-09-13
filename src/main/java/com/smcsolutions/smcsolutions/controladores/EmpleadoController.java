package com.smcsolutions.smcsolutions.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smcsolutions.smcsolutions.modelo.Empleado;
import com.smcsolutions.smcsolutions.services.EmpleadoServicio;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    EmpleadoServicio empleado;

    @GetMapping("/obtener")
    public ArrayList<Empleado> obtenerEmpleados(){
        return empleado.obtenerEmpleados();
    }
    
    @PostMapping("/guardar")
    public Empleado guardarEmpleado(@RequestBody Empleado empleado){
        return this.empleado.guardarEmpleado(empleado);
    }

    @PatchMapping("/actualizar")
    public Empleado actualizarEmpleado(@RequestBody Empleado empleado){
        return this.empleado.guardarEmpleado(empleado);
    }

   /*  @DeleteMapping("/eliminar")
    public String eliminarEmpleado(@RequestBody Empleado empleado){
        boolean ok = this.empleado.eliminarEmpleado(empleado);
        if(ok){
            return "Se eliminó el movimiento con éxito";
        }else{
            return "No se pudo eliminar el movimiento";
        }
    } */
}
