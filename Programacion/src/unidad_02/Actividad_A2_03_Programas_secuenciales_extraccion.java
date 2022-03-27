package unidad_02;

import java.util.Scanner;

public class Actividad_A2_03_Programas_secuenciales_extraccion {
	/*
	 * Realiza un programa Java que lea un número entero de 3 cifras y 
	 * muestre por separado las cifras del número.
	 * Recuerda que la división entre enteros da como resultado 
	 * la parte entera de la división (sin decimales). Si por ejemplo
	 *  N = 123 la operación N/10 da como resultado 12 y no 12.3 
	 *  Recuerda que el operador % obtiene el resto de la división.
	 */

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduzca un numero de 3 cifras ");
		int numero =teclado.nextInt();
		//al ser numero enteros la division saldra sin numeros por lo que al dividir 
		//entre 10 ;100 salen los numeros por unidad 
		   int unidades = numero%10;
	        int decenas = (numero/10)%10;
	        int centenas = numero/100;
	        System.out.println("Centenas: "+centenas);
	        System.out.println("Decenas: "+decenas);
	        System.out.println("Unidades: "+unidades);
	        teclado.close();

	}

}
