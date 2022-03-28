package unidad_02;

import java.util.Scanner;

public class Actividad_A2_10_Sentencias_alternativas_Calcula_mayor {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
/*
 * Realizar un programa que lea por teclado tres números enteros y 
 * calcula y muestra el mayor de los tres.
 */
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduzca un numero 1");
		int numero1=teclado.nextInt();
		System.out.println("introduzca un numero 2");
		int numero2=teclado.nextInt();
		System.out.println("introduzca un numero 3");
		int numero3=teclado.nextInt();
		if (numero1>=numero2&&numero1>=numero3) {
			System.out.println("el numero "+numero1+" es el mayor");
					}
		if (numero2>=numero1&&numero2>=numero3) {
			System.out.println("el numero "+numero2 +" es el mayor ");
					}
		if (numero3>=numero1&&numero3>=numero2) {
			System.out.println("el numero "+numero3+" es el mayor");
		}
		teclado.close();
	}

}
