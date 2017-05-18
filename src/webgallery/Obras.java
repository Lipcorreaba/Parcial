/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

/**
 *
 * @author Estudiante
 */
public class Obras {
    private String nombre;
    private String descripcion;
    private String estilo;
    private double precio;

    public Obras(String nombre, String descripcion, String estilo, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estilo = estilo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstilo() {
        return estilo;
    }

    public double getPrecio() {
        return precio;
    }
    
}
