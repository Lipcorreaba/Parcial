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
public class Artistas extends Usuarios{
    private ArrayList<Obras> galeria;
    private String info_Curriculum;
    private String distinciones;

    public Artistas(String info_Curriculum, String distinciones, String nombre, String apellido) {
        super(nombre, apellido);
        this.galeria = new ArrayList<>();;
        this.info_Curriculum = info_Curriculum;
        this.distinciones = distinciones;
    }    

    @Override
    public void agregarObra(Obras obra) {
        galeria.add(obra);
    }

    public ArrayList<Obras> getGaleria() {
        return galeria;
    }

    public String getInfo_Curriculum() {
        return info_Curriculum;
    }

    public String getDistinciones() {
        return distinciones;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }
    
}
