package unidad_04;

import java.util.Scanner;

/*
 * Por definici�n, el m�nimo com�n m�ltiplo (mcm) de un 
 * grupo de n�meros, es el n�mero  m�s peque�o que es m�ltiplo de cualquiera de ellos.

a) Crea una aplicaci�n Java que determine el mcm de 2 n�meros.

b) Crea una segunda aplicaci�n que determine el mcm de 3 n�meros.
 */
public class Actividad_4_9_numeroPrimo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Declarar variables
		int num;
		boolean primo = true;

		System.out.println("introduce numero:");
		num = teclado.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				primo = false;
				break;
			}
		}
		if (primo) // si se ha mantenido indivisible por los n�meros intermedios
					// (desde el 2 hasta el n�mero inmediata/ inferior, es que
					// es primo
			System.out.println("El n�mero es primo.");
		else
			System.out.println("El n�mero NO es primo.");

	}

}
