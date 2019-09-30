/*
 * Clase que simula una persona con sus atributos
 */
package Main;

/**
 *
 * @author Sebastián Sanchez y Matias Vega
 */
public class Persona {
    private String rut;
    private String nombre;
    private String hora;

    public Persona(String rut, String nombre, String hora) {
        this.rut = rut;
        this.nombre = nombre;
        this.hora = hora;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
