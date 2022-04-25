/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen_2019_mensajes;

import java.util.Scanner;

/**
 *
 * @author brc-9
 */
public class Teclado {
    static Scanner sc = new Scanner(System.in);
    
    public static int leerInt (String mensaje, int min, int max){
        int numero = 0;
        boolean respuestValida = true;
        System.out.println(mensaje);
        while(respuestValida) {
            try {
                numero = sc.nextInt();
                if (numero >= min && numero <= max) {
                    respuestValida = false;
                }else {
                    System.err.println("Introduce un numero entre " + min + " y " + max);
                }
            }catch(Exception e){
                sc.nextLine();
                System.err.println("Introduce un numero entero");
            }

        }
        return numero;
    }
    
    public static int leerInt(String mensaje){
        int numero = 0;
        boolean respuestValida = true;
        System.out.println(mensaje);
        while(respuestValida) {
            try {
                numero = sc.nextInt();
                respuestValida = false;
            }catch(Exception e){
                sc.nextLine();
                System.err.println("Introduce un numero entero");
            }
        }
        return numero;
    }
    
    
    public static String leerTexto(String mensaje){
        String texto = "";
        System.out.println(mensaje);
        texto = sc.next();
        return texto;
    }
    
    
    
    
}
