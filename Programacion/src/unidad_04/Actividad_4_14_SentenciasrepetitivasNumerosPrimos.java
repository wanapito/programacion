package unidad_04;

import java.util.Scanner;

/*
 * Realizar un programa en Java  pida vaya pidiendo n�meros al usuario y muestre por pantalla 
 * si son primos o no. La aplicaci�n terminar� cuando el usuario escriba -1.
 */
public class Actividad_4_14_SentenciasrepetitivasNumerosPrimos {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
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
				System.out.println("El n�mero no es primo");
			else
				System.out.println("El n�mero es primo");
			System.out.println("Escribe otro n�mero");
			numero = teclado.nextInt();
			primo = true;
		}
	}

}
