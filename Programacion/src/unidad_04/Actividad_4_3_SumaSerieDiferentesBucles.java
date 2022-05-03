package unidad_04;

import java.io.IOException;

public class Actividad_4_3_SumaSerieDiferentesBucles {

	public static void main(String args[]) throws IOException {
		// declaracion de variables
		int contador;
		int suma;
		final int incremento = 4;

		// inicializamos variable
		suma = 0;
		contador = 3;

		for (contador = 3; contador <= 1500; contador = contador + incremento) {
			suma = suma + contador;
		} // fin para
		while (contador <= 1500) {
			suma = suma + contador;
			contador = contador + incremento;
		} // fin mientras
		do {
			suma = suma + contador;
			contador = contador + incremento;
		} while (contador <= 1500); // fin repetir-mientras

		System.out.println("La suma de la serie es: " + suma);
	}// fin main
}// fin class
