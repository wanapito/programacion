/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ivan
 */
public class Capitulo4 {

    public static void main(String arg[]) {
        var nombre = "Karla";
        // caracter \n significa salto de linea

        System.out.println("Nueva linea: \n" + nombre);
        // caracter \t significa tabulador
        System.out.println("tabulador: \t" + nombre);
        // caracter \b significa borrar 1 espacio 
        System.out.println("retroceso: \b\b" + nombre);
        // caracter \' introduce comilla simple
        System.out.println("comilla simple: \'" + nombre + "\'");
        // caracter \" introduce comilla simple
        System.out.println("comilla doble: \"" + nombre + "\"");
    }

}
