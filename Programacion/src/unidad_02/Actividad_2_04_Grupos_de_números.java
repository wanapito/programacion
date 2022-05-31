package unidad_02;

import java.util.Scanner;

public class Actividad_2_04_Grupos_de_números {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que determine de un conjunto de 10 n�meros
		 * enteros, introducidos por teclado, cu�ntos son menores que 18,
		 * cu�ntos mayores de 65 y cu�ntos est�n comprendidos entre 18 y 65.
		 * Nota: Para hacer este ejercicio ser� interesante disponer de una
		 * estructura de almacenamiento de tipo array que contenga los n�meros.
		 * Ver Anexo I: Introducci�n a los arrays.
		 */

		Scanner teclado = new Scanner(System.in);

		// declarar variables
		int numero;
		int mayores;
		int intermedios;
		int menores;
		int contador;

		// inicializar contador
		mayores = 0;
		intermedios = 0;
		menores = 0;

		System.out.println("Introduce 10 numeros");

		for (contador = 0; contador < 10; contador++) {
			System.out.println("N�mero " + (contador + 1));
			numero = teclado.nextInt();
			if (numero < 15) {
				menores++;
			} else if (numero > 55) {
				mayores++;
			} else {
				intermedios++;
				teclado.close();
			} // fin si

		} // fin para

		System.out.println("Los numeros menores son :" + menores);
		System.out.println("Los numeros intermedios son: " + intermedios);
		System.out.println("Los numeros mayores son: " + mayores);

	}

}
