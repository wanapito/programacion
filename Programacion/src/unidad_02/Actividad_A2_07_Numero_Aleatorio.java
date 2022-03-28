package unidad_02;

import java.util.Scanner;

public class Actividad_A2_07_Numero_Aleatorio {
	public static void main (String[]args) {
		/*Realiza un programa en Java que reciba por teclado dos números y devuelva un 
		 * número aleatorio entero entre el primero y el segundo (ambos incluidos). 
		No sabemos cuál de los dos números es mayor ya que el usuario puede escribirlos 
		en cualquier orden.
		Deberás usar el método ramdom de la clase Math que devuelve un número aleatorio
		 de tipo double entre 0 y 1
		*/
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduzca primer numero");
		int numero1=teclado.nextInt();
		System.out.println("introduzca segundo numero");
		int numero2=teclado.nextInt();
			/*
        No es necesario ordenarlos ya que la fórmula es válida
        sea cual sea el orden de los dos números
        int min = (a<b)?a:b;
        int max = (a>b)?a:b;
        */
        int aleatorio = (int)(Math.random()*(numero2-numero1+1)+numero1);
		System.out.println("el numero aletorio es "+aleatorio);
		teclado.close();
	}

}
