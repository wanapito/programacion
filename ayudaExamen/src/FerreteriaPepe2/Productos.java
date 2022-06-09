/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FerreteriaPepe2;


import java.sql.Date;  
import java.time.LocalDate;  
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract  class Productos  implements Serializable  {

     public Productos() {
    }

    public Productos(int Codigo, String Descripcion, double Precio, boolean TipoPrecio) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.TipoPrecio = TipoPrecio;
    }
     
     
 
    private int Codigo;
    private String Descripcion;   
    private double Precio;  
    private boolean TipoPrecio;

    
    @Override
    public String toString() {
        String Pre;
        Pre=TipoPrecio?"Precio unitario":"Precio al Peso";
        
        return "Productos{" + "Codigo=" + Codigo + ", Descripcion=" + Descripcion +
                ", Precio=" + Precio + "    " + Pre +  '}';
    }

    
     
    public double CalcularPrecio(int PesoGramos) {
        double PrecioKilo;
        PrecioKilo=getPrecio() * (PesoGramos / 1000);
        return PrecioKilo ;
    }
    
    
    /**
     * Get the value of TipoPrecio
     *
     * @return the value of TipoPrecio
     */
    public boolean isTipoPrecio() {
        return TipoPrecio;
    }

    /**
     * Set the value of TipoPrecio
     *
     * @param TipoPrecio new value of TipoPrecio
     */
    public void setTipoPrecio(boolean TipoPrecio) {
        this.TipoPrecio = TipoPrecio;
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
