package unidad_02;

import java.util.Scanner;

public class Actividad_A2_07_Numero_Aleatorio {
	public static void main (String[]args) {
		/*Realiza un programa en Java que reciba por teclado dos n�meros y devuelva un 
		 * n�mero aleatorio entero entre el primero y el segundo (ambos incluidos). 
		No sabemos cu�l de los dos n�meros es mayor ya que el usuario puede escribirlos 
		en cualquier orden.
		Deber�s usar el m�todo ramdom de la clase Math que devuelve un n�mero aleatorio
		 de tipo double entre 0 y 1
		*/
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduzca primer numero");
		int numero1=teclado.nextInt();
		System.out.println("introduzca segundo numero");
		int numero2=teclado.nextInt();
			/*
        No es necesario ordenarlos ya que la f�rmula es v�lida
        sea cual sea el orden de los dos n�meros
        int min = (a<b)?a:b;
        int max = (a>b)?a:b;
        */
        int aleatorio = (int)(Math.random()*(numero2-numero1+1)+numero1);
		System.out.println("el numero aletorio es "+aleatorio);
		teclado.close();
	}

}
