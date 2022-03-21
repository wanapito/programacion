package unidad_02;

import java.util.Scanner;

/*
 * Crear una pequeña aplicación Java que permita calcular el 
 * salario semanal de un trabajador. Se tendrá en cuenta que 
 * la hora ordinaria se le paga a 8.25€/hora, y que las horas 
 * extraordinarias se le pagan a 12€/hora. Se considera que su 
 * jornada laboral normal es de 40 horas/semana, por lo que las 
 * horas trabajadas que superen dicha cantidad, serán consideradas 
 * horas extraordinarias.
 */
public class Actividad_2_01_Calculo_de_salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double horanormal=8.25;
		int horaextra=12;
		int jornadalaboral =40;
	System.out.println("introduzca cantidad de horas");
		Scanner teclado=new Scanner(System.in);
		int cantidadHoras=teclado.nextInt();
		System.out.println("el salario de paco es "+((jornadalaboral*horanormal)+((cantidadHoras-jornadalaboral)*horaextra)));
		teclado.close();
		

	}

}
