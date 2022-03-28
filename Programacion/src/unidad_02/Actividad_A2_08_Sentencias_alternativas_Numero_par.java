package unidad_02;

import java.util.Scanner;

public class Actividad_A2_08_Sentencias_alternativas_Numero_par {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*
		 * Realizar un programa en Java que lea un número entero por teclado y
		 *  nos diga si es par o impar haciendo uso de sentencias alternativas.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un numero entero ");
		int numero=teclado.nextInt();
	//si la divisones entre dos es igual a 0 se hara ... si no se hara...
		if (numero%2==0) {
			System.out.println("el numero es par");
		}
		else {
			System.out.println("el numero es impar");
		}
		teclado.close();
	}

}
