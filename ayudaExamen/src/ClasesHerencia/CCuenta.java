/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesHerencia;

import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public abstract class CCuenta {
    
       private String nombreTitular;   
    private String numCuenta;    
    private double Saldo;    
    private double TipoDeInteres;

   public CCuenta() {        
    }
   
    public CCuenta(String nombreTitular, String numCuenta, double Saldo, double TipoDeInteres) {
        this.nombreTitular = nombreTitular;
        this.numCuenta = numCuenta;
        this.Saldo = Saldo;
        this.TipoDeInteres = TipoDeInteres;
    }
   
    
      public abstract  void comisiones();       
      public abstract double intereses();
      
       public void ingreso(double cantidad){       
           setSaldo(getSaldo() + cantidad);
       }
       
    public void reintegro(double  cantidad){
        setSaldo(getSaldo() - cantidad );    
    }
       
       
    /**
     * Get the value of TipoDeInteres
     *
     * @return the value of TipoDeInteres
     */
    public double getTipoDeInteres() {
        return TipoDeInteres;
    }

    /**
     * Set the value of TipoDeInteres
     *
     * @param TipoDeInteres new value of TipoDeInteres
     */
    public void setTipoDeInteres(double TipoDeInteres) {
        this.TipoDeInteres = TipoDeInteres;
    }


    /**
     * Get the value of Saldo
     *
     * @return the value of Saldo
     */
    public double getSaldo() {
        return Saldo;
    }

    /**
     * Set the value of Saldo
     *
     * @param Saldo new value of Saldo
     */
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    
    

    /**
     * Get the value of numCuenta
     *
     * @return the value of numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * Set the value of numCuenta
     *
     * @param numCuenta new value of numCuenta
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Get the value of nombreTitular
     *
     * @return the value of nombreTitular
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Set the value of nombreTitular
     *
     * @param nombreTitular new value of nombreTitular
     */
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

}
