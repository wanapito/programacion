package unidad_02;

import java.util.Scanner;

public class Actividad_A2_02_Programas_secuenciales_simbolos_condicionales {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*
		 * Realiza un programa en Java que pida al usuario de tipo entero. 
		 * A continuación muestra un mensaje indicando si el valor de dicha 
		 * variable es positivo o negativo, si es par o impar, si es múltiplo de
		 *  5, si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos 
		 *  el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del
		 *   println para resolverlo./*
		 * 
		 */
Scanner teclado = new Scanner(System.in);
System.out.println("introduzca un numero entero");
int entero =teclado.nextInt();
//con el operador condicional ? estblecemos dos opcinoes separadas por : la primera sera true la seguna false
//con esta sentencia establecemoa mayo o igual que 0
System.out.println((entero >=0)?"Positivo":"Negativo");
//con esta sentencia establecemos que la resto de la division sea 0
System.out.println((entero%2==0)?"Es par":"Es impar");
//con esta sentencia establecemos que la resto de la division sea 0
System.out.println((entero%5==0)?"Es múltiplo de 5":"No es múltiplo de 5");
//con esta sentencia establecemos que la resto de la division sea 0
System.out.println((entero%10==0)?"Es múltiplo de 10":"No es múltiplo de 10");
//con esta sentencia establecemoa mayo o igual que 100
System.out.println((entero>=100)?"Es mayor o igual a 100":"Es menor que 100");
teclado.close();
}

	}


