package unidad_04;

import java.util.Scanner;

/*
 * Queremos desarrollar un programa tal que al escribir un día de la semana 
 * aparezca por pantalla la actividad extraescolar a la que debe acudir nuestro 
 * hijo. Por ejemplo, si ejecutamos el programa y escribimos martes (los días los
 *  escribirán siempre en minúsculas y sin acentos) que aparezca "Natación". Las 
 *  actividades que se realizan cada día son:

Lunes	Psicomotricidad
Martes	Natación
Miércoles	Música
Jueves	Natación
Viernes	Descanso
Los sábados y domingos no se realizan actividades con lo que si el usuario 
escribe alguno de estos días debe mostrar el mensaje "Día sin actividades". 
Si por equivocación se escribe un día inexistente se debe mostrar en pantalla "Día erróneo".
 */
public class Actividad_4_07_SentenciaAltenativaExtraescolares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println(
				"Escribe el día de la semana en mínusculas sin acentos");
		String dia = teclado.nextLine();

		// SOLUCiÓN USANDO IF
		System.out.println("Ejecutando con if");
		if (dia.equals("lunes")) {
			System.out.println("Psicomotricidad");
		} else if (dia.equals("martes")) {
			System.out.println("Natación");
		} else if (dia.equals("miercoles")) {
			System.out.println("Música");
		} else if (dia.equals("jueves")) {
			System.out.println("Natación");
		} else if (dia.equals("viernes")) {
			System.out.println("Descanso");
		} else if (dia.equals("sabado") || dia.equals("domingo")) {
			System.out.println("Día sin actividades");
		} else {
			System.out.println("Día erróneo");
		}

		// SOLUCIÓN USANDO SWITCH-CASE
		System.out.println("Ejecutando con switch-case");
		switch (dia) {
			case "lunes" :
				System.out.println("Psicomotricidad");
				break;
			case "martes" :
				System.out.println("Natación");
				break;
			case "miercoles" :
				System.out.println("Música");
				break;
			case "jueves" :
				System.out.println("Natación");
				break;
			case "viernes" :
				System.out.println("Descanso");
				break;
			case "sabado" :
			case "domingo" :
				System.out.println("Día sin actividades");
				break;
			default :
				System.out.println("Día erróneo");

		}

	}

}
