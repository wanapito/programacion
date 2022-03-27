package unidad_02;

import java.util.Scanner;

public class Actividad_A2_01_Programas_secuenciales_pasar_celsius_farenheit {

	public static void main(String[] args) {
		/*Realiza un programa que lea una cantidad de grados centígrados y la 
		 * pase a grados Fahrenheit. 
		La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
		F = 32 + ( 9 * C / 5)
		*/
double grados ;
double fahrenheit;
Scanner teclado  =new Scanner(System.in);
System.out.println("introduce grados centígrados");
grados =teclado.nextDouble();
fahrenheit=(32+(9*grados/5));
System.out.println(grados+" seran "+fahrenheit+" grados fahrenheit");
teclado.close();

	}

}
