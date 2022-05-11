package unidad_04;

import java.util.Scanner;

/*
 * Desarrollar un programa que permita la carga de 10 valores por 
 * teclado y nos muestre posteriormente la suma de los valores ingresados y su promedio.
 */
public class Actividad_4_11_SentenciaAltenativaSuma10Numeros {

	public static void main(String[] args) {
		// TODO code application logic here
		Scanner teclado = new Scanner(System.in);

		final int valores = 10;
		int suma = 0;
		// el bucle for hace una cuenta hasta 10 el cual es un valor fijo final
		for (int i = 0; i <= valores; i++) {
			System.out.print("Escribe el número " + i + ": ");
			suma = suma + teclado.nextInt(); // suma+= sc.nextInt();
		}
		System.out.println("La suma de los " + valores + " números es " + suma);
		// el valor medio es la dicion de los valores entre la suma de los
		// mismos
		System.out.println("La media de los " + valores + " números es "
				+ (double) suma / valores);
	}
}