package unidad_04;

import java.util.Scanner;

/*
 * Realizar un programa que lea una variable entera mes y 
 * compruebe si el valor corresponde a un mes de 30 días, 
e 31 o de 28. Supondremos que febrero tiene 28 días. Se mostrará 
además el nombre del mes. Se debe comprobar que el valor introducido 
esté comprendido entre 1 y 12.
 */
public class Actividad_4_05_SentenciaAltenativaDiasMes {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int mes;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un numero de mes ");
		mes = teclado.nextInt();
		if (mes >= 1 && mes <= 12) {
			switch (mes) {
				case 1 :
					System.out.println("el mes es enero ");
					break;
				case 2 :
					System.out.println("el mes es febrero");
					break;
				case 3 :
					System.out.println("el mes es marzo");
					break;
				case 4 :
					System.out.println("el mes es abril ");
					break;
				case 5 :
					System.out.println("el mes es mayo");
					break;
				case 6 :
					System.out.println("el mes es junio");
					break;
				case 7 :
					System.out.println("el mes es julio ");
					break;
				case 8 :
					System.out.println("el mes es agosto");
					break;
				case 9 :
					System.out.println("el mes es septiembre");
					break;
				case 10 :
					System.out.println("el mes es octubre ");
					break;
				case 11 :
					System.out.println("el mes es noviembre");
					break;
				case 12 :
					System.out.println("el mes es diciembre");
					break;
				default :

			}

		} else {
			System.out.println("mes no valido");
		}
	}

}
