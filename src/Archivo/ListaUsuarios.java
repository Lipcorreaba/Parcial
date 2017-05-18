/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import webgallery.*;

/**
 *
 * @author Estudiante
 */
public class ListaUsuarios {
    public void registrarUsuarios(ArrayList<Usuarios> usuarios){
        try{
            File file = new File("Usuarios.txt");
            PrintStream escribir = new PrintStream(file);
            for(Usuarios user : usuarios){
                if(user instanceof Compradores){
                    Compradores c=(Compradores)user;
                    escribir.println("Comprador: " + c.getNombre() + " " +c.getApellido() + ".");
                }else{
                    if(user instanceof Artistas){
                        Artistas a=(Artistas)user;
                        escribir.print("Artista: " + user.getNombre() + " " + user.getApellido() + " ");
                        escribir.println("Curriculum: "+a.getInfo_Curriculum() + " Distinciones: " + a.getDistinciones() + ".");
                        escribir.println(a.getGaleria().size() + ".");
                        for(Obras obra : a.getGaleria()){
                            escribir.print("Nombre: " + obra.getNombre() + "Descripcion: " + obra.getDescripcion()
                                            + "Estilo: " + obra.getEstilo() + "Valor: " + obra.getPrecio()+ ".");
                        }
                    }
                }
            }
            escribir.close();
        }catch(FileNotFoundException e){
            Logger.getLogger(ListaUsuarios.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void cargarInfo(){
        File file = new File("Usuarios.txt");
        Scanner leer;
        try {
            leer = new Scanner(file);
            leer.useDelimiter(".");
            while(leer.hasNext()){
             
             }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
