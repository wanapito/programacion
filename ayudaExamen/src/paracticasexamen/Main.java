
package paracticasexamen;
import java.lang.*;
import java.io.*;
import  java.util.Scanner;

 
public class Main {

    public  static  Integer numero1;
    public static Integer numero2;
    public static double resultado;
     public  static String Operacion;

    public static void main(String[] args) {
   Scanner teclado=new Scanner(System.in);
 
    Calculadora objCalculadora=new Calculadora();
   
        System.out.println("Calculadora Henry Sanchez   Quispe de Prueba");
        System.out.println(" Ingrese el Numero 1 :");
        numero1     = Integer.parseInt(teclado.nextLine());
        
        System.out.println(" Ingrese el Numero 2  :");
        numero2=Integer.parseInt(teclado.nextLine());
   
        System.out.println(" Ingrese la Operación (+,-,*,/):");
        Operacion=teclado.nextLine();                               
        
        resultado= objCalculadora.operacionCaculadora(numero1,numero2, Operacion);
        System.out.println("El resultado de la operacion es : " + resultado);              
    }
    
}
