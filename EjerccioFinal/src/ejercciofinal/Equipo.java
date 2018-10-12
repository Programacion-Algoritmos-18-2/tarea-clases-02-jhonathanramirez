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
public class Equipo {
    //Atributos de la clase Equipo
    private String nombre;
    private int num_jugadores;
    private String ciudad;
//Metodos obtener y agregar 
    public String ObtenerNombre() {
        return nombre;
    }

    public int ObtenerNum_jugadores() {
        return num_jugadores;
    }

    public String ObtenerCiudad() {
        return ciudad;
    }

    public void AgregarNombre(String x) {
        nombre = x;
    }

    public void Agregarjugadores(int y) {
        num_jugadores = y;
    }

    public void AgregarCiudad(String z) {
        ciudad = z;
    }
    
   // primer constructor (Sin parámetros, que agregue valores por defecto9
    public Equipo(){
     nombre="Barcelona";
     num_jugadores= 10;
     ciudad = "Loja";
    }
   // Segundo constructor (Que reciba un parámetro para asignar valor a nombre) 
    public Equipo(String x){
        nombre = x;
    }
   // Tercer constructor (Que reciba dos parámetros para asignar valores a nombre y num_jugadores) 
    public Equipo(String a,int b){
        nombre = a;
        num_jugadores = b;
    }
   // Cuarto constructor (Que reciba tres parámetros para asignar valores a nombre, num_jugadores, ciudad) 
    public Equipo(String x, int y,String z ){
        nombre = x; 
        num_jugadores= y;
        ciudad = z;
    }
            
}
