package stc_solutions.apistc_solutions.modelo;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Arrays;


@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empresa")
    private long idEmpresa;
    private String nombre;
    private String nit;
    private String telefono;
    private String direccion;
    private Empleado usuarios[];
    private MovimientoDinero movimientos[];
    private LocalDate fechaCreacion;
    private LocalDate fechaActualizacion;

    
    // Constructor//
    public void empresa(String nombre, String direccion, String telefono, String nit, Empleado[] empleados, MovimientoDinero[] movimientos) {
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.usuarios = empleados;
        this.movimientos = movimientos;
        this.fechaCreacion = LocalDate.now();;
        
        
    }

    public void empresa() {

    }

     // Getter and Setter (Encapsulado)//

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empleado[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Empleado[] usuarios) {
        this.usuarios = usuarios;
    }

    public MovimientoDinero[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(MovimientoDinero[] movimientos) {
        this.movimientos = movimientos;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizaion = fechaActualizacion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + idEmpresa +
                ", nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", usuario=" + Arrays.toString(usuarios) +
                ", movimientos=" + Arrays.toString(movimientos) +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }

    
}
