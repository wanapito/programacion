package unidad_04;

import java.io.IOException;

/*
 * Crear una clase sencilla que permita dibujar mediante símbolos repetidos 
 * el contorno de la figura de un triángulo. Pedirá la altura del triángulo y 
 * el carácter utilizado para el relleno. Un ejemplo de uso:
Indique la altura:
5
Escriba caracter de relleno:

*



    *

   * *

  * * *

 * * * *

* * * * *

 

Nota: Para realizar el cálculo la clase dispondrá de un método estático 
que tendrá como parámetros la altura y el carácter de relleno. Para leer
 el carácter de relleno utilizaremos el método read() de la clase System 
 adaptándolo mediante un casting de tipos de la forma:
        char caracter;
        caracter=(char)System.in.read();
 */

public class Actividad_4_6_dibujaTriangulo {
	public static void main(String[] args) throws IOException {
		char caracter;
		int altura;
		System.out.println("Indique la altura: ");
		altura = Leer.datoInt();
		System.out.println("Escriba caracter de relleno: ");
		caracter = (char) System.in.read();

		dibujar(caracter, altura);
	}
	public static void dibujar(char car, int alt) {
		for (int i = alt; i > 0; i--) {
			for (int j = i - 1; j > 0; j--)
				System.out.print(" ");
			for (int j = 0; j < alt - i + 1; j++)
				System.out.print(car + " ");
			System.out.println("");
		}
	}

}