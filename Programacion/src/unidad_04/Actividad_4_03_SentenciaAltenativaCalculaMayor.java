package unidad_04;

import java.util.Scanner;

public class Actividad_4_03_SentenciaAltenativaCalculaMayor {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int numero1;
		int numero2;
		int numero3;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un numero");
		numero1 = teclado.nextInt();
		System.out.println("introduzca un numero");
		numero2 = teclado.nextInt();
		System.out.println("introduzca un numero");
		numero3 = teclado.nextInt();
		if (numero1 > numero2 && numero1 > numero2) {
			System.out.println("el numero " + numero1 + " es el mayor ");
		} else {
			if (numero2 > numero1 && numero2 > numero3) {

				System.out.println("el numero " + numero2 + " es el mayor ");
			} else {
				if (numero3 > numero2 && numero3 > numero1) {
					System.out
							.println("el numero " + numero3 + " es el mayor ");
				}

			}
		}

	}
}
