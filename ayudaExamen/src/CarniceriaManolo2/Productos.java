/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CarniceriaManolo2;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public abstract class Productos  implements Serializable{
        private int Codigo;
        private String Descripcion;        
        private int Stock;         
        private double Precio;
        public static int contador=0;
        
        
    public Productos(String Descripcion, int Stock, double Precio) {
        contador = contador + 1;
        
        this.Codigo = contador;
        this.Descripcion = Descripcion;
        this.Stock = Stock;
        this.Precio = Precio;
    }

public double calcularGanancia(int cantidad){
        double calculo;
        calculo=getPrecio() * cantidad;
        return calculo;
}
     
    /**
     * Get the value of CacularGanancia
     *
     * @return the value of CacularGanancia
     */
 

    
    public void SumaStock(int cantidad){
        setStock(getStock() +  cantidad);
    }
    
     public void RestaStock(int cantidad){
        setStock(getStock() -  cantidad);
    }
    
    
    /**
     * Get the value of Precio
     *
     * @return the value of Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * Set the value of Precio
     *
     * @param Precio new value of Precio
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }


    /**
     * Get the value of Stock
     *
     * @return the value of Stock
     */
    public int getStock() {
        return Stock;
    }

    /**
     * Set the value of Stock
     *
     * @param Stock new value of Stock
     */
    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    

    /**
     * Get the value of Descripcion
     *
     * @return the value of Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * Set the value of Descripcion
     *
     * @param Descripcion new value of Descripcion
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
