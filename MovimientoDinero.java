package movimientodinero;

public abstract class MovimientoDinero {

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