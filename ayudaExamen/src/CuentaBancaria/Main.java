 
package CuentaBancaria;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        
 CuentaBancaria objCuenta =new CuentaBancaria("Henry Sanchez", "123456789",2,1000 );
 
 objCuenta.Ingreso(500);
 objCuenta.reintegro(1000);
 
 
    }
    
    
}
