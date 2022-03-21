package unidad_02;

import java.util.Scanner;

public class Actividad_2_07_Calculo_factorial_número {
/*
 * El cálculo del factorial de un número natural es una operación 
 * básica aplicada a muchos cálculos matemáticos, físicos y estadísticos en 
 * general. Básicamente consiste el producto sucesivo de los números enteros
 *  que van desde el 1 hasta el propio número. Por ejemplo, el factorial de 5 
 *  (se representa como "5!") es: 1*2*3*4*5.

Este tipo de cálculo, si se quiere hacer eficientemente y adaptable a cualquier 
número, requiere del uso de alguna estructura repetitiva (bucle) para hacerlo. 
Es un poco pronto todavía, ya que dicho concepto lo veremos más adelante, pero 
puedes investigar un poco en Internet, ya que no es complicado. Habrá muchas formas 
alternativas compatibles con la solución que se te entregará.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			Scanner teclado=new Scanner(System.in);
			int numero;
			int resultado=1;
			System.out.println("Escribe un número:");
			numero=teclado.nextInt();
			//bucle for le decimos que la variable i es igual a numero que tiene que ser mayor que 1
			//y que descuente hasta llegar a 1
			for(int i=numero; i>1; i--)
				// el bucle for se hara tanta veces hasta llegar a 1 
				resultado=resultado*i;
			System.out.println("El factorial de "+ numero +" es " + resultado);
			teclado.close();
		}

	


	}


