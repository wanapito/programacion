 
package ClasesHerencia;

import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class CCuentaCorriente extends CCuenta{
    
    private double importePorTrans; 
    private int transacciones=0;     
    private int transExentas=0;
     
    public CCuentaCorriente() {
    }

    public CCuentaCorriente(String nombreTitular, String numCuenta, double Saldo, double TipoDeInteres,double importeTransaccion) {
        super(nombreTitular, numCuenta, Saldo, TipoDeInteres);
        setImportePorTrans(importePorTrans);
    }

     
    public void DecrementarTransacciones(){
        setTransacciones(getTransacciones() - 1);
    }
    
        public void incrementarTransacciones(){
        setTransacciones(getTransacciones() + 1);
    }

    @Override
    public void ingreso(double cantidad) {
        super.ingreso(cantidad); //To change body of generated methods, choose Tools | Templates.
        incrementarTransacciones();
    }

    @Override
    public void reintegro(double cantidad) {
        super.reintegro(cantidad); //To change body of generated methods, choose Tools | Templates.
        incrementarTransacciones();
    }
    
//    @Override
    public void comisiones() {
        GregorianCalendar fecha = new GregorianCalendar();
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
    
  int CantidadTransacciones=getTransacciones();
  int CantidadTransaccionesExentas=getTransExentas();
  double importeTransaccion=(CantidadTransacciones * getImportePorTrans());
  
           if(dia == 1){
               reintegro(importeTransaccion);
               setTransacciones(0);
          }                                        
   }
    
    public double intereses(){
        GregorianCalendar fecha = new GregorianCalendar();
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
       double importeInteresMensual=0;
                                
                if (dia==1){
                if (getSaldo()>=3000){
                importeInteresMensual=getSaldo() + (getSaldo() * (0.5 / 12));
                    ingreso(importeInteresMensual);               
                    
                }else{
                    ingreso(0);
                    importeInteresMensual=0;
                }
                    
                }
                return importeInteresMensual;
    } 
    
    
    

    /**
     * Get the value of transExentas
     *
     * @return the value of transExentas
     */
    public int getTransExentas() {
        return transExentas;
    }

    /**
     * Set the value of transExentas
     *
     * @param transExentas new value of transExentas
     */
    public void setTransExentas(int transExentas) {
        this.transExentas = transExentas;
    }

    /**
     * Get the value of importePorTrans
     *
     * @return the value of importePorTrans
     */
    public double getImportePorTrans() {
        return importePorTrans;
    }

    /**
     * Set the value of importePorTrans
     *
     * @param importePorTrans new value of importePorTrans
     */
    public void setImportePorTrans(double importePorTrans) {
        this.importePorTrans = importePorTrans;
    }

     
     
     
    /**
     * Get the value of transacciones
     *
     * @return the value of transacciones
     */
    public int getTransacciones() {
        return transacciones;
    }

    /**
     * Set the value of transacciones
     *
     * @param transacciones new value of transacciones
     */
    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

  
    
}
