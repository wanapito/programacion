 
package CuentaBancaria;
 import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CuentaBancaria {

    public CuentaBancaria() {
    }
    
        public CuentaBancaria(String Nombre,String NumeroCuenta,double Interes,double Saldo) {
            setNombre(Nombre);
            setNumeroCuenta(NumeroCuenta);
            setInteres(Interes);
            setSaldo(Saldo);
    }
    
        public void Ingreso(double Saldo){                                   
        double SaldoActual;
        double interes;
        interes=getInteres();
        
        if (Saldo==0){
            System.out.println(" El Saldo tiene que ser superior a 0 ");
            return;
        }
        
        SaldoActual=getSaldo() +   ((getSaldo() * interes)/ 100);
        
            setSaldo( SaldoActual + Saldo);
            System.out.println(" El Saldo ha sido actualizado correctamente. ");
            System.out.println(" El Saldo actual es: " + getSaldo());
            
        }
        
        public void reintegro(double Saldo){
        double SaldoActual;
        SaldoActual =getSaldo();
        
            if (SaldoActual>Saldo){
                setSaldo(SaldoActual - Saldo);
                System.out.println("..Reintegro Realizado Correctamente..");
                System.out.println("..Saldo Actual.." + getSaldo());
            }else {
                System.out.println("..El importe que intenta retirar es superior al disponible..");
                System.out.println("..No Hay Saldo disponible..");
            }
            
        }
                
        
        
    
    
    private String Nombre;
    private String NumeroCuenta;
    private double Interes;    
    private double Saldo;

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
     * Get the value of Interes
     *
     * @return the value of Interes
     */
    public double getInteres() {
        return Interes;
    }

    /**
     * Set the value of Interes
     *
     * @param Interes new value of Interes
     */
    public void setInteres(double Interes) {
        this.Interes = Interes;
    }

    
    
    /**
     * Get the value of NumeroCuenta
     *
     * @return the value of NumeroCuenta
     */
    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    /**
     * Set the value of NumeroCuenta
     *
     * @param NumeroCuenta new value of NumeroCuenta
     */
    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
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

    
    
    
}
