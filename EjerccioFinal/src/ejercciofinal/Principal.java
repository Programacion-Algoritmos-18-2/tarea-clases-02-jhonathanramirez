/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercciofinal;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Primer objeto (con el primer contructor) 
        Equipo e = new Equipo();
       //imprime primer objeto
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s", e.ObtenerNombre(), e.ObtenerNum_jugadores(), e.ObtenerCiudad());
       //Segundo objeto (con el segundo constructor)
        Equipo e2 = new Equipo("Liga de Loja");
        e2.Agregarjugadores(20);
        e2.AgregarCiudad("LOJA");
       //Imprime segundo objeto
        System.out.printf("\nNombre %s - Jugadores %s - Ciudad %s", e2.ObtenerNombre(), e2.ObtenerNum_jugadores(), e2.ObtenerCiudad());
       //Tercer objeto (con el tercer costructor) 
        Equipo e3 = new Equipo("Liga", 10);
        e3.AgregarCiudad("Cuenca");
       //Imprime tercer objeto 
        System.out.printf("\nNombre %s - Jugadores %s - Ciudad %s", e.ObtenerNombre(), e.ObtenerNum_jugadores(), e.ObtenerCiudad());
       //Cuarto objeto (con el cuarto constructor)
        Equipo e4 = new Equipo("Barcelona",10,"Quito");
       //Imprime cuarto objeto 
        System.out.printf("\nNombre %s - Jugadores %s - Ciudad %s", e.ObtenerNombre(), e.ObtenerNum_jugadores(), e.ObtenerCiudad());

    }
    
}
