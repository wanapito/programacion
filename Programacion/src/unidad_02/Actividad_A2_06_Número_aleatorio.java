package unidad_02;

import java.util.Scanner;

public class Actividad_A2_06_Número_aleatorio {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*
		 * Realiza un programa en Java que reciba por teclado 
		 * dos números y devuelva un número aleatorio entero entre 
		 * el primero y el segundo (ambos incluidos). Se asume que 
		 * el primer número nunca será mayor que el segundo.
Deberás usar el método ramdom de la clase Math que devuelve un número 
aleatorio de tipo double entre 0 y 1
		 */
Scanner teclado=new Scanner(System.in);
System.out.println("introduzca el numero mayor");
int numero1=teclado.nextInt();
System.out.println("introduzca el numero menor");
int numero2=teclado.nextInt();
int aleatorio=  (int)(Math.random()*(numero1-numero2+1)+numero2);
System.out.println("el numero aleatorio es "+aleatorio);
teclado.close();
	}

}
