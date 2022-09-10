package com.smcsolutions.smcsolutions.repositorios;

import com.smcsolutions.smcsolutions.modelo.Rol;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepositorio extends CrudRepository<Rol, Long> {
    public abstract ArrayList<Rol> findAllByRol(String rol);

}
