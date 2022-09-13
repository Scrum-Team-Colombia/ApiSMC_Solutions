package scrumteamcolombia.smcsolutions.models;

import java.util.ArrayList;
import java.util.Optional;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public ArrayList<Empresa> obtenerEmpresas() {
        return null;
    }
    public Empresa guardarEmpresa(Empresa empresa) {
        return null;
    }
    public Optional<Empresa> obtenerPorId(Integer prioridad) {
        return null;
    }
    public Optional<Empresa> obtenerPorId(Long id2) {
        return null;
    }
    public boolean eliminarEmpresa(Long id2) {
        return false;
    }

    
    
}
