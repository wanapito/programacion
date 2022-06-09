/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProtectoraAnimalesPeluditos_2;

/**
 *
 * @author siste
 */
public class Gatos extends Animales{

    public Gatos() {
    }

    public Gatos(String Nombre, int Edad) {
        super(Nombre, Edad);
    }

   
    @Override
    public String toString() {
        String Info;
        Info=getCodigo() +" \t "+ getNombre() +" \t "+ getEdad() +" \t "+ ((isReservado())?"Reservado":"NoReservado") +"\t  Gatos";
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return Info;
    }
    
}
