package com.smcsolutions.smcsolutions.services;

import java.util.ArrayList;
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

    /**
     * @param empresa
     * @return
     */
    public boolean eliminarMovimiento(Empresa empresa) {
        return Empresa.findById(empresa.getId()).map(Empresa -> extracted()).orElse(false);
    }
    private Boolean extracted() {
        empresaRepositorio.delete(guardarEmpresas(null));
        return true;
    }

    /**
     * @param id
     * @return
     */
    public Optional<Empresa> obtenerPorId(Long id) {
        return Empresa.findById(id);
    }
    public boolean eliminarEmpresas(Empresa empresa) {
        return false;
    }

}