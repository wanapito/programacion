package unidad_04;

import java.util.Scanner;

/*
 * Realizar un programa en Java que pida un n�mero al usuario y devuelva la suma de todos sus d�gitos.
 */
public class Actividad_4_13_SentenciaAltenativaSumaDigitos {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
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
