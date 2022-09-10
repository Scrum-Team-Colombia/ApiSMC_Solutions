package com.smcsolutions.smcsolutions.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.smcsolutions.smcsolutions.modelo.Empresa;
import com.smcsolutions.smcsolutions.repositorios.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmpresaServicio {
    @Autowired
    EmpresaRepositorio empresaRepositorio;
    
    public ArrayList<Empresa> obtenerEmpresas(){
        return (ArrayList<Empresa>) empresaRepositorio.findAll();
    }
    public Empresa guardarEmpresas(Empresa empresa){
        return empresaRepositorio.save(empresa);
    }

    public boolean eliminarMovimiento(Empresa empresa) {
        return empresa.findById(empresa.getId()).map(empresa -> {
            empresaRepositorio.delete(empresas);
            return true;
        }).orElse(false);
    }

    public Optional<Empresa> obtenerPorId(Long id) {
        return empresa.findById(id);
    }

}