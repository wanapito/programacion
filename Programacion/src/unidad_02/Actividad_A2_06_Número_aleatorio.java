package unidad_02;

import java.util.Scanner;

public class Actividad_A2_06_Número_aleatorio {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		/*
		 * Realiza un programa en Java que reciba por teclado dos n�meros y
		 * devuelva un n�mero aleatorio entero entre el primero y el segundo
		 * (ambos incluidos). Se asume que el primer n�mero nunca ser� mayor que
		 * el segundo. Deber�s usar el m�todo ramdom de la clase Math que
		 * devuelve un n�mero aleatorio de tipo double entre 0 y 1
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca el numero mayor");
		int numero1 = teclado.nextInt();
		System.out.println("introduzca el numero menor");
		int numero2 = teclado.nextInt();
		int aleatorio = (int) (Math.random() * (numero1 - numero2 + 1)
				+ numero2);
		System.out.println("el numero aleatorio es " + aleatorio);
		teclado.close();
	}

}
