package unidad_02;

import java.util.Scanner;

public class Actividad_2_03_Potencia_de_un_número {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Realizar un programa que visualice en pantalla la potencia de un una base elevada
 *  a un exponente. Ambos datos se pedirán a través de teclado. Nota: Como sucederá 
 *  frecuentemente, este ejercicio se podrá resolver de muchas formas alternativas. 
 *  Una forma habitual será a través de la utilización de estructuras repetitivas, 
 *  puesto que tengo que hacer un determinado número de veces una determinada operación. 
 *  Como aún es un poco pronto (trataremos este tema más adelante), vamos a utilizar un 
 *  método específico que me proporciona la clase Math. Investiga en Internet para ver cómo 
 *  funciona dicho método y pruébalo.
 */
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce la base");
		double base =teclado.nextInt();
		System.out.println("introduce el exponente");
		double exponente = teclado.nextInt();
		double potencia=Math.pow(base, exponente);
		System.out.println("la patencia de de "+base+"elevado a "+exponente+"es "+potencia);
		teclado.close();
	}



}
