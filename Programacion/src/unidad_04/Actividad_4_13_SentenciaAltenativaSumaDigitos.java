package unidad_04;

import java.util.Scanner;

/*
 * Realizar un programa en Java que pida un número al usuario y devuelva la suma de todos sus dígitos.
 */
public class Actividad_4_13_SentenciaAltenativaSumaDigitos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un numero");
		numero = teclado.nextInt();
		int suma = 0;
		while (numero > 0) {
			suma = suma + numero % 10;
			numero = numero / 10;
		}
		System.out.println("La suma de las cifras es " + suma);
	}

}
