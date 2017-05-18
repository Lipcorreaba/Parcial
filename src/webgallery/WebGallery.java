/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class WebGallery implements OnLinePayments{
    private ArrayList<Usuarios> usuarios;
    private ArrayList<Obras> coleccion;

    public WebGallery() {
        this.coleccion=new ArrayList<>();
        this.usuarios=new ArrayList<>();
    }
    public void registrarUsuario(Usuarios user){
        this.usuarios.add(user);
    }
    public void agregarObra(Obras obra){
        this.coleccion.add(obra);
    }
    public void consultarObras(){
        for(Obras obra : coleccion){
            System.out.println("Nombre: " + obra.getNombre() + "Descripcion: " + obra.getDescripcion());
            System.out.println("Estilo: " + obra.getEstilo() + "Precio: " + obra.getPrecio());
        }
    }
    public void Compra(int formaDePago){
        System.out.println("Nombre de la obra a comprar");
        Scanner leer=new Scanner(System.in);
        String nom=leer.next();
        int j=0;
        for(int i=0; i<coleccion.size();i++){
            if(coleccion.get(i).getNombre().equals(nom)){
                j=i;
            }
        }
        
    }

    @Override
    public void Transferir() {
        
    }

    @Override
    public boolean verificarDatos(int formaDePago) {
        boolean verificado;
        if(formaDePago % 2 == 0){
            verificado =true;
        }else{
            verificado =false;
        }
        return verificado;
    }
}
