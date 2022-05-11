package unidad_04;

import java.util.Scanner;

/*
 * Queremos desarrollar un programa tal que al escribir un d�a de la semana 
 * aparezca por pantalla la actividad extraescolar a la que debe acudir nuestro 
 * hijo. Por ejemplo, si ejecutamos el programa y escribimos martes (los d�as los
 *  escribir�n siempre en min�sculas y sin acentos) que aparezca "Nataci�n". Las 
 *  actividades que se realizan cada d�a son:

Lunes	Psicomotricidad
Martes	Nataci�n
Mi�rcoles	M�sica
Jueves	Nataci�n
Viernes	Descanso
Los s�bados y domingos no se realizan actividades con lo que si el usuario 
escribe alguno de estos d�as debe mostrar el mensaje "D�a sin actividades". 
Si por equivocaci�n se escribe un d�a inexistente se debe mostrar en pantalla "D�a err�neo".
 */
public class Actividad_4_07_SentenciaAltenativaExtraescolares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println(
				"Escribe el d�a de la semana en m�nusculas sin acentos");
		String dia = teclado.nextLine();

		// SOLUCi�N USANDO IF
		System.out.println("Ejecutando con if");
		if (dia.equals("lunes")) {
			System.out.println("Psicomotricidad");
		} else if (dia.equals("martes")) {
			System.out.println("Nataci�n");
		} else if (dia.equals("miercoles")) {
			System.out.println("M�sica");
		} else if (dia.equals("jueves")) {
			System.out.println("Nataci�n");
		} else if (dia.equals("viernes")) {
			System.out.println("Descanso");
		} else if (dia.equals("sabado") || dia.equals("domingo")) {
			System.out.println("D�a sin actividades");
		} else {
			System.out.println("D�a err�neo");
		}

		// SOLUCI�N USANDO SWITCH-CASE
		System.out.println("Ejecutando con switch-case");
		switch (dia) {
			case "lunes" :
				System.out.println("Psicomotricidad");
				break;
			case "martes" :
				System.out.println("Nataci�n");
				break;
			case "miercoles" :
				System.out.println("M�sica");
				break;
			case "jueves" :
				System.out.println("Nataci�n");
				break;
			case "viernes" :
				System.out.println("Descanso");
				break;
			case "sabado" :
			case "domingo" :
				System.out.println("D�a sin actividades");
				break;
			default :
				System.out.println("D�a err�neo");

		}

	}

}
