package unidad_02;

import java.util.Scanner;

public class Actividad_2_06_Calculo_año_bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Estamos acostumbrados a considerar como a�os bisiestos, aquellos que
		 * son m�ltiplos de 4. La realidad es que aunque es una buena
		 * aproximaci�n, no es del todo precisa, ya que a�os como 1900 y como
		 * 2100 no fueron, ni ser�n, bisiesto respectivamente. Existe una
		 * explicaci�n f�sica que tiene que ver con que el a�o del calendario no
		 * coincide exactamente, en duraci�n, con el a�o solar. As�, un c�lculo
		 * m�s exacto indica que la duraci�n real de un a�o es de 365,2425 d�as.
		 * Para corregir este desfase, se utiliza el criterio de que se
		 * considerar� a�o bisiesto aquel que sea divisible por 4 pero no por
		 * 100 salvo que sea divisible por 400. Por esto 1900 no es bisiesto,
		 * 1904 s� y 2000 tambi�n. Se pide: crear un programa que pida por
		 * teclado un a�o y me indique si es bisiesto o no.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un a�o ");
		int año = teclado.nextInt();
		// % sigifnica resto con esto indicamos que el resto de la division
		// entre 4
		// da 0 entre 100 distinto de 0 != y igual a 0 entre 400
		if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0)
			System.out.println("El anno " + año + " es bisiesto.");
		else
			System.out.println("El anno " + año + " no es bisiesto.");
		teclado.close();

	}

}
