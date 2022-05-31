package unidad_02;

import java.util.Scanner;

public class Actividad_2_07_Calculo_factorial_número {
	/*
	 * El c�lculo del factorial de un n�mero natural es una operaci�n b�sica
	 * aplicada a muchos c�lculos matem�ticos, f�sicos y estad�sticos en
	 * general. B�sicamente consiste el producto sucesivo de los n�meros enteros
	 * que van desde el 1 hasta el propio n�mero. Por ejemplo, el factorial de 5
	 * (se representa como "5!") es: 1*2*3*4*5.
	 * 
	 * Este tipo de c�lculo, si se quiere hacer eficientemente y adaptable a
	 * cualquier n�mero, requiere del uso de alguna estructura repetitiva
	 * (bucle) para hacerlo. Es un poco pronto todav�a, ya que dicho concepto lo
	 * veremos m�s adelante, pero puedes investigar un poco en Internet, ya que
	 * no es complicado. Habr� muchas formas alternativas compatibles con la
	 * soluci�n que se te entregar�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int numero;
		int resultado = 1;
		System.out.println("Escribe un n�mero:");
		numero = teclado.nextInt();
		// bucle for le decimos que la variable i es igual a numero que tiene
		// que ser mayor que 1
		// y que descuente hasta llegar a 1
		for (int i = numero; i > 1; i--)
			// el bucle for se hara tanta veces hasta llegar a 1
			resultado = resultado * i;
		System.out.println("El factorial de " + numero + " es " + resultado);
		teclado.close();
	}

}
