/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete3;

/**
 *
 * @author Usuario
 */
public class Principal {
     public static void main(String[] args) {
     Precio p = new Precio();
     Precio p2 = new Precio(259);
        System.out.println(p.obtener());
        System.out.println(p2.obtener());
     
    }
}
