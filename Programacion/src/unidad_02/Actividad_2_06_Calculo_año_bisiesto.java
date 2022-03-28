package unidad_02;

import java.util.Scanner;

public class Actividad_2_06_Calculo_año_bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 * Estamos acostumbrados a considerar como años bisiestos, aquellos 
 * que son múltiplos de 4. La realidad es que aunque es una buena aproximación,
 *  no es del todo precisa, ya que años como 1900 y como 2100 no fueron, ni serán, 
 *  bisiesto respectivamente. Existe una explicación física que tiene que ver con 
 *  que el año del calendario no coincide exactamente, en duración, con el año solar.
 *   Así, un cálculo más exacto indica que la duración real de un año es de 365,2425 días. 
 *   Para corregir este desfase, se utiliza el criterio de que se considerará año bisiesto 
 *   aquel que sea divisible por 4 pero no por 100 salvo que sea divisible por 400. 
 *   Por esto 1900 no es bisiesto, 1904 sí y 2000 también.
Se pide: crear un programa que pida por teclado un año y me indique si es bisiesto o no.
 */
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce un año ");
		int año=teclado.nextInt();
		//% sigifnica resto con esto indicamos que el resto de la division entre 4
		// da 0 entre 100 distinto de 0 != y igual a 0 entre 400
		if((año%4==0 && año%100!=0) || año%400==0)
			System.out.println("El anno "+ año + " es bisiesto.");
		else
			System.out.println("El anno "+ año + " no es bisiesto.");
		teclado.close();

		
	}

}
