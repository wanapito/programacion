package unidad_04;

import java.util.Scanner;

/*
 * Por definición, el mínimo común múltiplo (mcm) de un 
 * grupo de números, es el número  más pequeño que es múltiplo de cualquiera de ellos.

a) Crea una aplicación Java que determine el mcm de 2 números.

b) Crea una segunda aplicación que determine el mcm de 3 números.
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
		if (primo) // si se ha mantenido indivisible por los números intermedios
					// (desde el 2 hasta el número inmediata/ inferior, es que
					// es primo
			System.out.println("El número es primo.");
		else
			System.out.println("El número NO es primo.");

	}

}
