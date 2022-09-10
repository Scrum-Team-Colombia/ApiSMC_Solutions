package com.smcsolutions.smcsolutions.repositorios;

import com.smcsolutions.smcsolutions.modelo.Empleado;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends CrudRepository<Empleado, Long> {
    public abstract ArrayList<Empleado> findAllByEmpleado(String empleado);



}

