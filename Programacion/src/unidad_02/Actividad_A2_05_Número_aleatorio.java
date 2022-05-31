package unidad_02;

import java.util.Scanner;

public class Actividad_A2_05_Número_aleatorio {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		/*
		 * Realiza un programa en Java que reciba por teclado un n�mero entero
		 * mayor que 1 y devuelva un n�mero aleatorio entero entre 1 y el n�mero
		 * recibido (ambos incluidos). Deber�s usar el m�todo ramdom de la clase
		 * Math que devuelve un n�mero aleatorio de tipo double entre 0 y 1
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un numero entero mayor que 1");
		int numero = teclado.nextInt();
		// con (int)estamos convirtiendo un doble de math.. en int
		int aleatorio = (int) Math.random() * numero + 1;
		System.out.println("el numero aleatorio elegido es " + aleatorio);
		teclado.close();
	}

}
