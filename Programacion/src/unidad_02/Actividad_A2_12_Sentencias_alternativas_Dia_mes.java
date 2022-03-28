package unidad_02;

import java.util.Scanner;

public class Actividad_A2_12_Sentencias_alternativas_Dia_mes {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*
		 * Realizar un programa que lea una variable entera mes y 
		 * compruebe si el valor corresponde a un mes de 30 días, de 31 o de 28. 
		 * Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes. 
		 * Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero de mes");
		int mes =teclado.nextInt();
		//con switch vamos cambiando variables en funcion del numero de caso
		//si mes es 5 ira al caso 5 y dara como resultado lo que hayamos puesto
		//en caso contrario de ira al default
		switch (mes) {
		case 1:
			System.out.println("Enero");
			System.out.println("tiene 31 dias");
			break;
		case 2:
			System.out.println("Febrero");
			System.out.println("tiene 28 dias");
			break;
		case 3:
			System.out.println("Marzo");
			System.out.println("tiene 31 dias");
			break;
		case 4:
			System.out.println("Abril");
			System.out.println("tiene 30 dias");
			break;
		case 5:
			System.out.println("Mayo");
			System.out.println("tiene 31 dias");
			break;
		case 6:
			System.out.println("Junio");
			System.out.println("tiene 30 dias");
			break;
		case 7:
			System.out.println("Julio");
			System.out.println("tiene 31 dias");
			break;
		case 8:
			System.out.println("Agosto");
			System.out.println("tiene 31 dias");
			break;
		case 9:
			System.out.println("Septiembre");
			System.out.println("tiene 30 dias");
			break;
		case 10:
			System.out.println("Octubre");
			System.out.println("tiene 31 dias");
			break;
		case 11:
			System.out.println("Noviembre");
			System.out.println("tiene 30 dias");
			break;
		case 12:
			System.out.println("Diciembre");
			System.out.println("tiene 31 dias");
			break;
		default:
			System.out.println("Mes incorrecto");
			break;
		}
		teclado.close();
	}




		
		

	}

