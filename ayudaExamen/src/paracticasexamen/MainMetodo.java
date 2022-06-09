/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paracticasexamen;

import java.lang.*;
import java.io.*;
import  java.util.Scanner;

public class MainMetodo {
    public  static  Integer valor1;
    public  static  Integer valor2;
    public  static double resultadofinal;
    
    public static void main(String[] args) {
        Scanner  teclado=new Scanner(System.in);
        System.out.println("Ingrese el Valor 1: ");
        valor1=Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el Valor 2: ");
        valor2=Integer.parseInt(teclado.nextLine());
        
        Metodo obj=new Metodo();
        resultadofinal=obj.calculo(valor1, valor2);
        
        System.out.println(" la suma de los dos valores son: " + resultadofinal);
        
    }
    
    
}
