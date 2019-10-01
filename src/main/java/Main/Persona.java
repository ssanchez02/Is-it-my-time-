/*
 * Clase que simula una persona con sus atributos
 */
package Main;

import java.util.Date;

/**
 *
 * @author Sebastián Sanchez y Matias Vega
 */
public class Persona {

    private String nombre;
    private String rut;
    private Date horaDeAtencion;

    public Persona(String nombre, Date horaDeAtencion) {
        this.nombre = nombre;
        this.horaDeAtencion = horaDeAtencion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getHoraDeAtencion() {
        return horaDeAtencion;
    }

    public void setHoraDeAtencion(Date horaDeAtencion) {
        this.horaDeAtencion = horaDeAtencion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

}
