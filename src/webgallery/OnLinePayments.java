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
public interface OnLinePayments {
    public boolean verificarDatos(int formaDePago);
    public void Transferir();
}
