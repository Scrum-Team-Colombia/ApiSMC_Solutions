package stc_solutions.apistc_solutions.modelo;

import javax.persistence.*;

@Entity
@Table(name = "...")
public class Empresa {

    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;

    // Constructor//
    public void empresa(String nombre, String direccion, String telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public void empresa() {

    }

    // Getter and Setter (Encapsulado)//

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public String gettelefono() {
        return telefono;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getnit() {
        return nit;
    }

    public void setnit(String nit) {
        this.nit = nit;
    }

}
