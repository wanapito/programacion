
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ivan
 */
public class capitulo05 {

    public static void main(String arg[]) {
        System.out.println("Escribe tu nombre");
        //introducir datos desde la consola
        //scanner añadir java.util
        Scanner consola = new Scanner(System.in);
        //nextline escribe acontinuacion en variable "usuario"
        var usuario = consola.nextLine();
        System.out.println("usuario =" + usuario);
        System.out.println("escribe el titulo");
        var titulo = consola.nextLine();
        System.out.println("resultado: " + titulo + " " + usuario);
 consola.close();   }

}
