package unidad_02;

import java.util.Scanner;

public class Actividad_2_03_Potencia_de_un_número {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que visualice en pantalla la potencia de un una
		 * base elevada a un exponente. Ambos datos se pedir�n a trav�s de
		 * teclado. Nota: Como suceder� frecuentemente, este ejercicio se podr�
		 * resolver de muchas formas alternativas. Una forma habitual ser� a
		 * trav�s de la utilizaci�n de estructuras repetitivas, puesto que tengo
		 * que hacer un determinado n�mero de veces una determinada operaci�n.
		 * Como a�n es un poco pronto (trataremos este tema m�s adelante), vamos
		 * a utilizar un m�todo espec�fico que me proporciona la clase Math.
		 * Investiga en Internet para ver c�mo funciona dicho m�todo y pru�balo.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce la base");
		double base = teclado.nextInt();
		System.out.println("introduce el exponente");
		double exponente = teclado.nextInt();
		double potencia = Math.pow(base, exponente);
		System.out.println("la patencia de de " + base + "elevado a "
				+ exponente + "es " + potencia);
		teclado.close();
	}

}
