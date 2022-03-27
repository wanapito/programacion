package unidad_02;

import java.util.Scanner;

public class Actividad_A2_05_Número_aleatorio {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
/*
 * Realiza un programa en Java que reciba por teclado un 
 * número entero mayor que 1 y devuelva un número aleatorio
 *  entero entre 1 y el número recibido (ambos incluidos).
 *Deberás usar el método ramdom de la clase Math que devuelve 
 *un número aleatorio de tipo double entre 0 y 1
 */
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduzca un numero entero mayor que 1");
		int numero=teclado.nextInt();
		//con (int)estamos convirtiendo un doble de math.. en int 
		int aleatorio=(int)Math.random()*numero+1;
		System.out.println("el numero aleatorio elegido es "+aleatorio);
		teclado.close();
	}

}
