
package com.mycompany.faunasalvaje;

/**
 *
 * @author Alumno
 */
public class Mamifero {
    String nombre;
    double tamaño;
    double peso;

    public Mamifero(String nombre, double tamaño, double peso) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
