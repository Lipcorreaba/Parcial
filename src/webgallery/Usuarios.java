/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public abstract class Usuarios {
    protected String nombre;
    protected String apellido;

    public Usuarios(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public abstract void agregarObra(Obras obra);

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
}
