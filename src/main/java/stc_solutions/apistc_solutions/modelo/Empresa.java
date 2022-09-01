package stc_solutions.apistc_solutions.modelo;

import javax.persistence.*;

@Entity
@Table(name = "...")//Aqui falta agregar el nombre de la tabla a la cual esta asociada esta clase
public class Empresa {

     //Aqui falta la clave primaria para poder relacionar las tablas

    //Falta agregar los column que relacionan los atributos con los campos pertenecen en la tabla
    //dentro de las otras clases faltaria agregar la CARDINALIDAD e instancias de las clases y/o relacion entre las tablas//
    
    
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
