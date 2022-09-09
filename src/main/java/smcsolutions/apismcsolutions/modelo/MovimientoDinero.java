package smcsolutions.apismcsolutions.modelo;

import javax.persistence.*;

@Entity
@Table(name = "...") //Aqui falta agregar el nombre de la tabla a la cual esta asociada esta clase

public class MovimientoDinero {

    //Aqui falta la clave primaria para poder relacionar las tablas

    //Falta agregar los column que relacionan los atributos con los campos pertenecen en la tabla
    //dentro de las otras clases faltaria agregar la CARDINALIDAD e instancias de las clases y/o relacion entre las tablas//

    private Float monto;
    private String concepto;
    private String usuario;
    private String empresa;

    public MovimientoDinero(Float monto, String concepto, String usuario, String empresa) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
        this.empresa = empresa;
    }

    public MovimientoDinero (){    
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmpresa() {
        return empresa;
    }
    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
