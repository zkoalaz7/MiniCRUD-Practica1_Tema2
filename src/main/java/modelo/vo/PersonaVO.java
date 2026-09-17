package modelo.vo;

public class PersonaVO {
    private int cod;
    private String nombre;
    private double sueldo;
    private String email;
    
    public PersonaVO() {

    }

    public PersonaVO(int cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return cod;
    }

    public void setCodigo(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "PersonaVO{" + "cod=" + cod + ", nombre=" + nombre + ", sueldo=" + sueldo + ", email=" + email +'}';
    }

}
