package unidad_04;

import java.util.Scanner;

/*
 * Realizar un programa que lea dos números reales por teclado 
 * y muestre el resultado de la división del primer número por el 
 * segundo. Se debe comprobar que el divisor no puede ser cero.
 */
public class Actividad_4_02_SentenciaAltenativaDivision {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int dividendo;
		int divisor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca el dividendo");
		dividendo = teclado.nextInt();
		System.out.println("introduzca el divisor");
		divisor = teclado.nextInt();
		if (divisor == 0) {
			System.out.println("division no de puede hacer");

		} else {
			System.out.println("la division es " + (dividendo / divisor));
		}
	}

}
