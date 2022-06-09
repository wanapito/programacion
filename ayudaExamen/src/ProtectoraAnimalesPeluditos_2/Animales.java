/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProtectoraAnimalesPeluditos_2;


import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public abstract class Animales implements Serializable{


    private int Codigo;
    private String Nombre;
    private int Edad;    
    private boolean Reservado;

    public static int Contador;
    
        public Animales() {
    }

    public Animales(String Nombre, int Edad) {
        Contador = Contador + 1;
                
        this.Codigo = Contador;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Reservado = false;
    }
    
    public void Reserva(){
        setReservado(true);
    }
    
    public void AnularReserva(){
        setReservado(false);
    }
    
    
    /**
     * Get the value of Reservado
     *
     * @return the value of Reservado
     */
    public boolean isReservado() {
        return Reservado;
    }

    /**
     * Set the value of Reservado
     *
     * @param Reservado new value of Reservado
     */
    public void setReservado(boolean Reservado) {
        this.Reservado = Reservado;
    }

    

    /**
     * Get the value of Edad
     *
     * @return the value of Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * Set the value of Edad
     *
     * @param Edad new value of Edad
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    
    
    
    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Get the value of Codigo
     *
     * @return the value of Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * Set the value of Codigo
     *
     * @param Codigo new value of Codigo
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    
}
