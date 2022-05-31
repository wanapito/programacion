package unidad_02;

import java.util.Scanner;

public class Actividad_A2_04_Programas_secuenciales {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		/*
		 * Realizar un programa que pida por teclado la fecha de nacimiento de
		 * una persona (dia, mes, a�o) y calcule su n�mero de la suerte. * El
		 * n�mero de la suerte se calcula sumando el d�a, mes y a�o de la fecha
		 * de nacimiento y a continuaci�n sumando las cifras obtenidas en la
		 * suma. Por ejemplo:Si la fecha de nacimiento es 12/07/1980 Calculamos
		 * el n�mero de la suerte as�: 12+7+1980 = 1999 1+9+9+9 = 28 N�mero de
		 * la suerte: 28
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca dia de nacimiento");
		int dia, mes, año;
		dia = teclado.nextInt();
		System.out.println("introduzca mes de nacimiento");
		mes = teclado.nextInt();
		System.out.println("introduzca a�o de nacimiento");
		año = teclado.nextInt();
		int suma_fecha = (dia + mes + año);
		int suerte = suma_fecha % 10 + (suma_fecha / 10) % 10
				+ (suma_fecha / 100) % 10 + (suma_fecha / 1000);
		System.out.println("Tu n�mero de la suerte es: " + suerte);
		teclado.close();
	}

}
