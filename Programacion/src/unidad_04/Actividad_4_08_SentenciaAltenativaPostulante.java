package unidad_04;

import java.util.Scanner;

/*
 * Un postulante a un empleo, realiza un test de capacitaci�n, se obtuvo 
 * la siguiente informaci�n: cantidad total de preguntas que se le realizaron 
 * y la cantidad de preguntas que contest� correctamente. Se pide confeccionar 
 * un programa que ingrese los dos datos por teclado e informe el nivel del mismo 
 * seg�n el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:

	Nivel m�ximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
 */
public class Actividad_4_08_SentenciaAltenativaPostulante {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		int totalpreguntas;
		int aprobadas;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca el numero de preguntas ");
		totalpreguntas = teclado.nextInt();
		System.out.println("introduzca el numero de preguntas aprobadas");
		aprobadas = teclado.nextInt();
		// estamos haciendo que valor que salga sea de tipo double
		double porcentaje = (double) aprobadas * 100 / totalpreguntas;

		System.out.println("El portentaje de aciertos es " + porcentaje + "%");

		if (porcentaje >= 90) {
			System.out.println("Nivel m�ximo");
		} else if (porcentaje >= 75) {
			System.out.println("Nivel medio");
		} else if (porcentaje >= 50) {
			System.out.println("Nivel regular");
		} else {
			System.out.println("Fuera de nivel");
		}
	}

}
