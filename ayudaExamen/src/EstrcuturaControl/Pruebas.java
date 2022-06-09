/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstrcuturaControl;
import java.text.DecimalFormat;
import java.lang.*;
import java.io.*;
import  java.util.Scanner;

/**
 *
 * @author siste
 */
public class Pruebas {
    
    public static void main(String[] args) {
        //CreandoMetodoPrueba();
        calculadoFor();
    }
    
 public static void CreandoMetodoPrueba(){
     System.out.println("Metodo de Prueba");
 }
    
 public static void calculadoFor(){
 Integer cal;
     
     
     for (int x=1; x<=3;x++){
         cal=0;         
         for (int a=1;a<=12;a++){
           cal= x * a;
             System.out.println("Calculadora resultado:  " + x + " * " + a + " =  "+  cal);
         }
     }
     
 
 }
 
 
    
}
