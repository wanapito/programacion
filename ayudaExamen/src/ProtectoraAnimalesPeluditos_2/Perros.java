/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProtectoraAnimalesPeluditos_2;

/**
 *
 * @author siste
 */
public class Perros extends Animales{

    public Perros() {
    }

    public Perros(String Nombre, int Edad) {
        super(Nombre, Edad);
    }
 

    @Override
    public String toString() {
        String info;
        info=getCodigo() +" \t "+ getNombre() +" \t "+ getEdad() +" \t "+  ((isReservado())?"Reservado":"No Reservado") +" \t Perro ";        
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return info;
    }
    
    
    
    
}
