package unidad_02;

import java.util.Scanner;

public class Actividad_A2_09_Sentencias_alternativas_Division {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*
		 * Realizar un programa que lea dos números reales por teclado
		 *  y muestre el resultado de la división del primer número por el 
		 *  segundo. Se debe comprobar que el divisor no puede ser cero.
		 */
Scanner teclado=new Scanner(System.in);
System.out.println("introduce un numero ");
//al ser una division los datos tienen que ser de tipo double 
double dividendo=teclado.nextInt();
System.out.println("introduce otro numero");
double divisor = teclado.nextInt();
double division=dividendo/divisor;
if (divisor==0) {
	System.out.println("la division no se puede realizar");
	
}
else {
	System.out.println("el resutaldo de la divion es "+division);
}


teclado.close();
	}

}
