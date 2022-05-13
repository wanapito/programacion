package unidad_04;

import java.util.Scanner;

/*
 * Realizar un programa en Java  pida vaya pidiendo números al usuario y muestre por pantalla 
 * si son primos o no. La aplicación terminará cuando el usuario escriba -1.
 */
public class Actividad_4_14_SentenciasrepetitivasNumerosPrimos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un numero");
		numero = teclado.nextInt();
		boolean primo = true;
		while (numero != -1) {
			for (int i = 2; i < numero && primo; i++) {

				if (numero % i == 0) {
					primo = false;
				}
			}
			if (!primo)
				System.out.println("El número no es primo");
			else
				System.out.println("El número es primo");
			System.out.println("Escribe otro número");
			numero = teclado.nextInt();
			primo = true;
		}
	}

}
