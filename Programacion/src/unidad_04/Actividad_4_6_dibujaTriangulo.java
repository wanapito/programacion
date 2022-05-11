package unidad_04;

import java.io.IOException;

/*
 * Crear una clase sencilla que permita dibujar mediante s�mbolos repetidos 
 * el contorno de la figura de un tri�ngulo. Pedir� la altura del tri�ngulo y 
 * el car�cter utilizado para el relleno. Un ejemplo de uso:
Indique la altura:
5
Escriba caracter de relleno:

*



    *

   * *

  * * *

 * * * *

* * * * *

 

Nota: Para realizar el c�lculo la clase dispondr� de un m�todo est�tico 
que tendr� como par�metros la altura y el car�cter de relleno. Para leer
 el car�cter de relleno utilizaremos el m�todo read() de la clase System 
 adapt�ndolo mediante un casting de tipos de la forma:
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