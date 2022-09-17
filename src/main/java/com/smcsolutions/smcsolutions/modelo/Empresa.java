package com.smcsolutions.smcsolutions.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id 
    @GeneratedValue(strategy = GenerationType.Auto) //el id no se genera automaticamente falta -->importar persistence<--
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    
    @Column(name = "nombre", nullable = false, unique = true, length = 50)
    private String nombre;
    
    @Column(name = "direccion", nullable = false, length = 50)
    private String direccion;
    
    @Column(name = "telefono", length = 50)
    private int telefono;
    
    @Column(name = "nit", nullable = false, unique = true, length = 50)
    private String nit;
/*
    @Transient  
    Empleado empleado1;
*/
    public Empresa(String nombre, String direccion, int telefono, String nit, Empleado emp1) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        
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
/*
    public Empleado getEmpleado1() {    
        return empleado1;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }
*/    
}
