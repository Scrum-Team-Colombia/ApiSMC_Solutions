package com.smcsolutions.smcsolutions.services;

import java.util.ArrayList;
import java.util.Optional;

import com.smcsolutions.smcsolutions.modelo.RolModelo;
import com.smcsolutions.smcsolutions.repositorios.RolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Rol {
    @Autowired
    Rol rol;

    public ArrayList<Rol> obtenerRol(){
        return (ArrayList<Rol>) rolRepositorio.findAll();
    }

    public Rol guardarRol(Rol rol){
        return rolRepositorio.save(rol);
    }

    public boolean eliminarRol(Rol rol) {
        return rolRepositorio.findById(rol.getId()).map(rol -> {
            rolRepositorio.delete(rol);
            return true;
        }).orElse(false);
    }

    public Optional<Rol> obtenerPorId(Long id) {
        return rolRepositorio.findById(id);
    }

}
