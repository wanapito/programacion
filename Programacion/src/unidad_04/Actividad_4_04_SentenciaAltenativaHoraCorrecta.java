package unidad_04;

import java.util.Scanner;

/*
 * Realizar un programa que lea por teclado tres n�meros enteros H, M, S
correspondientes a hora, minutos y segundos respectivamente, y comprueba 
si la hora que indican es una hora v�lida. 

Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor 
v�lido para las horas ser� mayor o igual que cero y menor que 24.

El valor v�lido para los minutos y segundos estar� comprendido entre 0 y
 59 ambos incluidos
 */
public class Actividad_4_04_SentenciaAltenativaHoraCorrecta {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		int H;
		int M;
		int S;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca la hora ");
		H = teclado.nextInt();
		System.out.println("introduzca los minutos");
		M = teclado.nextInt();
		System.out.println("introduzca los segundos");
		S = teclado.nextInt();
		if (H >= 0 && H <= 24 && M >= 0 && M <= 59 && S >= 0 && S <= 59) {
			System.out.println(
					"la hora " + H + ":" + M + ":" + S + " es correcta ");
		} else {
			System.out.println("la hora es incorrecta");
		}
	}

}
