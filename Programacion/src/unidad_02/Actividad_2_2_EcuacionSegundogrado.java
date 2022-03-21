package unidad_02;


import java.util.Scanner;

/**
 *Crear un programa Java que pida los coeficientes de una ecuación de segundo grado, 
 *mostrando  sus soluciones reales. Si no existen, se indicará mediante un texto
 * alusivo a tal circunstancia.
 */
public class Actividad_2_2_EcuacionSegundogrado {

    public static void main(String[] args) {
        /*
        la ecuacion de segundo grado se escribe 
        x= (-b +/- raiz (b^2-4 ac ))/2a
        ax^2 +bx +c =0
         */

        var consola = new Scanner(System.in);
        System.out.print("introduzca variable a : ");
        double a = consola.nextDouble();
        System.out.print("introduzca variable b : ");
        double b = consola.nextDouble();
        System.out.print("introduzca variable c : ");
        double c = consola.nextDouble();
        double x1;
        double x2;
        // se especifica que no puede ser negativa 
        if (Math.pow(b, 2) - (4 * a * c) >= 0) {
            x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println("la incognita x1 sera  = " + x1);
            System.out.println("la incognita x2 sera  = " + x2);
            //si sale numero complejo se indica que no tiene solucion 
        } else {
            System.out.println("no hay solucion");
        }
  consola.close() ; }

}
