/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ivan
 */
public class capitulo03 {

    public static void main(String args[]) {
        var usuario = "juan ";
        var titulo = "ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        //se realiza la suma de numeros
        System.out.println(i + j);
        //si de izquierda a derecha primero numero se hace suma y luego cadena
        System.out.println(i + j + usuario);
        //Si de izquierda a derecha primero hay palabra se hace solo enumeraci�n 
        System.out.println(usuario + i + " " + j);
        //Si ponemos par�ntesis damos prioridad a al par�ntesis
        System.out.println(usuario + (i + j));

    }

}
