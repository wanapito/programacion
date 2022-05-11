package unidad_04;

import java.util.Scanner;

/*
 * Realizar un programa en Java que lea un número entero 
 * por teclado y nos diga si es par o impar haciendo uso de sentencias alternativas.
 */
public class Actividad_4_01_SentenciaAltenativaNumeroPar {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("introduzca un numero");
		numero = teclado.nextInt();
		if (numero % 2 == 0) {
			System.out.println("el numero es par ");

		} else {
			System.out.println("el numero es impar ");
		}

	}

}
