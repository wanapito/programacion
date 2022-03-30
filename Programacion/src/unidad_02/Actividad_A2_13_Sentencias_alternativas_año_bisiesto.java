package unidad_02;

import java.util.Scanner;

public class Actividad_A2_13_Sentencias_alternativas_año_bisiesto {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*
		 * Cualquier año divisible por 4 es un año bisiesto a excepción de aquellos que,
		 * siendo divisibles por 100, no lo son por 400.
		 * 
		 * Teniendo esto en cuenta desarrollar un programa en Java que reciba por
		 * teclado un año y determine si es un año bisiesto o no.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un año");
		int año = teclado.nextInt();
		if (año % 4 == 0 && año % 100 != 0 && año % 400 == 0) {

			System.out.println("es bisiesto");
		} else {
			System.out.println("no es bisiesto");
		}

		teclado.close();
	}

}
