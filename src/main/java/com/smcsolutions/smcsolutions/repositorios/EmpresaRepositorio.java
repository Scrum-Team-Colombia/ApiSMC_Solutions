package com.smcsolutions.smcsolutions.repositorios;


import com.smcsolutions.smcsolutions.modelo.Empresa;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EmpresaRepositorio extends CrudRepository<Empresa, Long> {
    public abstract ArrayList<Empresa> findAllByEmpresa(String empresa);{
    
}

    
