package com.smcsolutions.smcsolutions.modelo;

import javax.persistence.*;

@Entity
@Table(name = "Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    /*private Long id;*/
    private String nombre;
    private String direccion;
    private int telefono;
    private String nit;

    public Empresa(String nombre, String direccion, int telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public Empresa (){    
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Long getId() {
        return null;
    }
}