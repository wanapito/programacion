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

public class CCuentaAhorro extends  CCuenta{
private double cuotaMantenimiento;
    
    public CCuentaAhorro() {
    }

    public CCuentaAhorro(String nombreTitular, String numCuenta, double Saldo, double TipoDeInteres,double cuotaMantenimiento) {
        super(nombreTitular, numCuenta, Saldo, TipoDeInteres);
        setCuotaMantenimiento(cuotaMantenimiento);
    }

               
    @Override
    public void comisiones() {
        GregorianCalendar fecha = new GregorianCalendar();
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
    
           if(dia == 1){
               setSaldo(getSaldo() - getCuotaMantenimiento());               
          }                                        
   }

    @Override
    public double intereses() {
        GregorianCalendar fecha = new GregorianCalendar();
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
    
        double ImporteinteresesProducidos;
        ImporteinteresesProducidos=  (getTipoDeInteres() /12);
        double Impor;
        
        if (dia==1){
            ingreso(ImporteinteresesProducidos);
            Impor=ImporteinteresesProducidos;
        }else{
            ingreso(0);
            Impor=0;
        }
        return Impor;
    }         
        
    
    
    @Override
    public void reintegro(double cantidad) {
        super.reintegro(cantidad); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ingreso(double cantidad) {
        super.ingreso(cantidad); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
        
 
    /**
     * Get the value of cuotaMantenimiento
     *
     * @return the value of cuotaMantenimiento
     */
    public double getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }

    /**
     * Set the value of cuotaMantenimiento
     *
     * @param cuotaMantenimiento new value of cuotaMantenimiento
     */
    public void setCuotaMantenimiento(double cuotaMantenimiento) {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }
    
    
    

    
    
}
