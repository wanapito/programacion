package unidad_04;

import java.util.Scanner;

/*
 * Utilizando la sentencia for confeccionar un programa que permita 
 * ingresar un valor del 1 al 10 y nos muestre la tabla de multiplicar 
 * del mismo (los primeros 12 términos) siguiendo el modelo que se muestra en el ejemplo.
Ejemplo: Si ingreso 3 deberá aparecer en pantalla lo siguiente

3 x 1 = 3

3 x 2 = 6

3 x 3 = 9

3 x 4 = 12

3 x 5 = 15

3 x 6 = 18

3 x 7 = 21

3 x 8 = 24

3 x 9 = 27

3 x 10 = 30

3 x 11 = 33

3 x 12 = 36

 */
public class Actividad_4_16_SentenciaAltenativaTablasdeMultiplicar {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int numero;
		int multiplicador = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introducir el numero");
		numero = teclado.nextInt();
		System.out.println("la tabla de multiplicar del " + numero);
		/*
		 * for (int i = 0; i <= 12; i++) {
		 * 
		 * System.out.println(numero + " x " + i + " = " + (numero * i));
		 * 
		 * }
		 */
		while (numero <= 10) {

			multiplicador++;
			if (multiplicador >= 1 && multiplicador <= 12) {
				System.out.println(numero + " x " + multiplicador + " = "
						+ (numero * multiplicador));
				
			}

		}

	}

}
