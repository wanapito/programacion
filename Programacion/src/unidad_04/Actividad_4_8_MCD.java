package unidad_04;

import java.io.IOException;
import java.util.Scanner;

/*
 * Por definici�n, el m�ximo com�n divisor (MCD) es el mayor n�mero
 *  puede dividir de manera exacta (resto de la divisi�n, nulo), a 
 *  dos o m�s n�meros. Existen varios algoritmos posibles para tratar de 
 *  determinar el MCD de dos n�meros. Quiz� el m�s sencillo es el que se 
 *  basa en la resta sucesiva del mayor menos el menor. Pi�nsalo e intenta 
 *  crear un programa Java que resuelva este problema, de esta forma.
 */
public class Actividad_4_8_MCD {
	public static void main(String args[]) throws IOException {
		Scanner teclado = new Scanner(System.in);

		// Declarar variables
		int dividendo;
		int divisor;

		System.out.println("introduce numero 1:");
		dividendo = teclado.nextInt();
		System.out.println("introduce numero 2:");
		divisor = teclado.nextInt();;

		while (dividendo != divisor) {
			if (dividendo > divisor)
				dividendo = dividendo - divisor;
			else
				divisor = divisor - dividendo;
		} // fin mientras
		System.out.println("El MCD es: " + dividendo);
	}// fin main
}// fin class