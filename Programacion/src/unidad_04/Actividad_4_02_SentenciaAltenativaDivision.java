package unidad_04;

import java.util.Scanner;

/*
 * Realizar un programa que lea dos n�meros reales por teclado 
 * y muestre el resultado de la divisi�n del primer n�mero por el 
 * segundo. Se debe comprobar que el divisor no puede ser cero.
 */
public class Actividad_4_02_SentenciaAltenativaDivision {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
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
