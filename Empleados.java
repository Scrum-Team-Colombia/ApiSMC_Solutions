
package aplicación;

public abstract class Empleados {
   
    private String name;
    private String email;
    private String enterprise;
    private String role; 

    //Constructor//
    public Empleados(String name, String email, String enterprise, String role) {
        this.name = name;
        this.email = email;
        this.enterprise = enterprise;
        this.role = role;
    }
    
    public Empleados (){
    
    }

    //Getter and Setter (Encapsulado)//
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
    
    
}
