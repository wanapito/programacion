package unidad_02;

import java.util.Scanner;

public class Actividad_A2_11_Sentencias_alternativas_Hora_correcta {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		/*
		 * Realizar un programa que lea por teclado tres n�meros enteros H, M, S 
		 * correspondientes a hora, minutos y segundos respectivamente, y comprueba 
		 * si la hora que indican es una hora v�lida. 
		 * Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor v�lido para 
		las horas ser� mayor o igual que cero y menor que 24.
		El valor v�lido para los minutos y segundos estar� comprendido entre 0 y 59 ambos 
		incluidos
		 */
Scanner teclado=new Scanner(System.in);
System.out.println("introduzca la hora");
int h =teclado.nextInt();
System.out.println("introduzca los minutos");
int m = teclado.nextInt();
System.out.println("introduzca los segundos");
int s = teclado.nextInt();
if (h>=0&&h<=24&&m>=0&&m<=60&&s>=0&&s<=60) {
	System.out.println("la hora  es correcta");
	System.out.println(h+":"+m+":"+s);
		}
		
else {
	System.out.println("la hora no es correcta");

}



teclado.close();

	}

}
