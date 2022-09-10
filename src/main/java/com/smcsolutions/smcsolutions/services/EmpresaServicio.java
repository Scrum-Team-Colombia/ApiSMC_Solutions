package com.smcsolutions.smcsolutions.services;

import java.util.List;
import java.util.Optional;

import com.smcsolutions.smcsolutions.modelo.Empresa;
import com.smcsolutions.smcsolutions.repositorios.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmpresaServicio implements IEmpresaServicio {
    
    @Autowired
    private EmpresaRepository empresaRepository;
    @Override
    public List<Empresa> BuscarTodo() {
    List<Empresa> Empresas = (List<Empresa>) EmpresaRepository.findAll();
    return Empresas;
    }

    @Override
    public Empresa crearEmpresa(Empresa empresa) {
    Empresa newEmpresa = EmpresaRepository.save(empresa);
    return newEmpresa;
    }

    @Override
    public Empresa EncontrarId(Long id) {
    Optional<Empresa> empresa = EmpresaRepository.findById(id);
    return empresa.get();
    }

    @Override
    public Empresa UpdateEmpresa(Long id, Empresa empresa) {
    Empresa putEmpresa = empresaRepository.save(empresa);
    return putEmpresa;

    }

    @Override
    public void deleteEmpresa(Long id) {
    empresaRepository.deleteById(id);

    }
}

