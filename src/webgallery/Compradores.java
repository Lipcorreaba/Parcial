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
public class Compradores extends Usuarios{
    private ArrayList<Obras> compras;

    public Compradores(String nombre, String apellido) {
        super(nombre, apellido);
        this.compras = new ArrayList<>();
    }

    @Override
    public void agregarObra(Obras obra) {
        compras.add(obra);
    }

    public ArrayList<Obras> getCompras() {
        return compras;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    
}
