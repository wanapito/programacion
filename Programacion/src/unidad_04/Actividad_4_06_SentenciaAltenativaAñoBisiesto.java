package unidad_04;

import java.util.Scanner;

/*
 * Cualquier año divisible por 4 es un año bisiesto a excepción de
 *  aquellos que, siendo divisibles por 100, no lo son por 400.

Teniendo esto en cuenta desarrollar un programa en Java que reciba 
por teclado un año y determine si es un año bisiesto o no.

 */
public class Actividad_4_06_SentenciaAltenativaAñoBisiesto {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int año;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un año");
		año = teclado.nextInt();
		if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0)
			System.out.println("El año " + año + " es bisiesto.");
		else
			System.out.println("El año " + año + " no es bisiesto.");
		teclado.close();
	}
}
