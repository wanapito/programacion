package unidad_04;

import java.util.Scanner;

/*
 * Cualquier a�o divisible por 4 es un a�o bisiesto a excepci�n de
 *  aquellos que, siendo divisibles por 100, no lo son por 400.

Teniendo esto en cuenta desarrollar un programa en Java que reciba 
por teclado un a�o y determine si es un a�o bisiesto o no.

 */
public class Actividad_4_06_SentenciaAltenativaA�oBisiesto {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		int a�o;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un a�o");
		a�o = teclado.nextInt();
		if ((a�o % 4 == 0 && a�o % 100 != 0) || a�o % 400 == 0)
			System.out.println("El a�o " + a�o + " es bisiesto.");
		else
			System.out.println("El a�o " + a�o + " no es bisiesto.");
		teclado.close();
	}
}
