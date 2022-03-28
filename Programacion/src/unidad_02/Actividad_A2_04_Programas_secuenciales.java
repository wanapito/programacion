package unidad_02;

import java.util.Scanner;

public class Actividad_A2_04_Programas_secuenciales {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*
		 * Realizar un programa que pida por teclado la fecha de nacimiento de una persona 
		 * (dia, mes, año) y calcule su número de la suerte.
		 * 		 * El número de la suerte se calcula sumando 
		 * el día, mes y año de la fecha de nacimiento y a 
		 * continuación sumando las cifras obtenidas en la suma.
		 * Por ejemplo:Si la fecha de nacimiento es 12/07/1980 
		 * Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
		 * Número de la suerte: 28
		 */

		Scanner teclado=new Scanner(System.in );
		System.out.println("introduzca dia de nacimiento");
		int dia ,mes,año;
		dia=teclado.nextInt();
		System.out.println("introduzca mes de nacimiento");
		mes=teclado.nextInt();
		System.out.println("introduzca año de nacimiento");
		año=teclado.nextInt();
		int suma_fecha=(dia+mes+año);
		int suerte = suma_fecha%10 + (suma_fecha/10)%10 + (suma_fecha/100)%10 + (suma_fecha/1000);
	    System.out.println("Tu número de la suerte es: "+suerte);
		teclado.close();
	}

}
