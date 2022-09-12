package com.smcsolutions.smcsolutions.controladores;

import java.util.ArrayList;

import com.smcsolutions.smcsolutions.modelo.Empresa;
import com.smcsolutions.smcsolutions.services.EmpresaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    
    @Autowired
    EmpresaServicio empresaServicio;

    @GetMapping("/obtener")
    public ArrayList<Empresa> obtenerEmpresas(){
        return empresaServicio.obtenerEmpresas();
    }
    
    @PostMapping("/guardar")
    public Empresa guardarEmpresa(@RequestBody Empresa empresa){
        return this.empresaServicio.guardarEmpresas(empresa);
    }

    @PatchMapping("/actualizar")
    public Empresa actualizarEmpresa(@RequestBody Empresa empresa){
        return this.empresaServicio.guardarEmpresas(empresa);
    }

    @DeleteMapping("/eliminar")
    public String eliminarEmpresa(@RequestBody Empresa empresa){
        boolean ok = this.empresaServicio.eliminarEmpresas(empresa);
        if(ok){
            return "Se eliminó la empresa con éxito";
        }else{
            return "No se pudo eliminar la empresa";
        }
    }
}
