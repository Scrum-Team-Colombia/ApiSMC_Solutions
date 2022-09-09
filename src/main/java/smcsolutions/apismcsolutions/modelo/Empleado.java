package smcsolutions.apismcsolutions.modelo;

import javax.persistence.*;

@Entity
@Table(name = "...") //Aqui falta agregar el nombre de la tabla a la cual esta asociada esta clase
public class Empleado {

    //Aqui falta la clave primaria para poder relacionar las tablas

    //Falta agregar los column que relacionan los atributos con los campos pertenecen en la tabla
    //dentro de las otras clases faltaria agregar la CARDINALIDAD e instancias de las clases y/o relacion entre las tablas//


    private String nombre;
    private String correo;
    private String empresa;
    private String rol; 

    //Constructor//

    public Empleado(String nombre, String correo, String empresa, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

    public Empleado() {
        
    }
    
    //Getter and Setter (Encapsulado)//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
