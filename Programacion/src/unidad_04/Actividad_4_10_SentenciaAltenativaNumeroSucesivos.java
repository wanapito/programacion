package unidad_04;

import java.util.Scanner;

/*
 * Realizar un programa en Java  pida un n�mero entero positivo por 
 * pantalla y escriba los n�meros desde 1 hasta el n�mero introducido. 
 * Se deber� controlar si el n�mero introducido es igual o menor a 0.
 */
public class Actividad_4_10_SentenciaAltenativaNumeroSucesivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un n�mero mayor o igual que 1");
		int numero = teclado.nextInt();
		if (numero <= 0) {
			System.out.println("El n�mero ha de ser mayor que 0");
		} else {
			int aux = 1;
			while (aux <= numero) {
				System.out.print(aux + " ");
				aux++;
			}
		}

	}

}