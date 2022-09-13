package com.smcsolutions.smcsolutions.repositorios;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smcsolutions.smcsolutions.modelo.Empleado;

@Repository
public interface EmpleadoRepositorio extends CrudRepository<Empleado, Long> {
    public abstract ArrayList<Empleado> findAllByEmpleado(String empleado);

}
