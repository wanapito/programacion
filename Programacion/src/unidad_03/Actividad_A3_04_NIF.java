package unidad_03;
/*
 * Crea una clase NIF que represente el DNI con su correspondiente letra. 
 * Los atributos de la clase serán el número de DNI y su letra.
La clase NIF dispondrá de los siguientes métodos:
Un constructor por defecto.
Un constructor que reciba como parámetro el DNI y calcule y asigne la 
letra que le corresponde.
Un método leer(): que pida por teclado el número de DNI y calcule a partir 
del DNI introducido la letra que le corresponde y se los asigne al objeto.
Método toString() que devuelve un String con el NIF de la siguiente forma: 
ocho dígitos, un guión y la letra en mayúscula. Por ejemplo: 12345678-Z
Método para obtener la letra del NIF:
La letra del NIF se calculará usando un método privado. La forma de obtener 
la letra del NIF es la siguiente:
Se obtiene el resto de la división entera del número de DNI entre 23 y se 
usa la siguiente tabla para obtener la letra que corresponde:
 0 - T     1 - R    2 - W     3 - A     4 - G     5 – M
 6 – Y     7 – F    8 – P     9 - D    10 – X    11 – B
12 – N    13 – J   14 – Z    15 – S    16 - Q    17 - V
18 - H    19 - L   20 – C    21 – K    22 – E
 */

import java.util.Scanner;

public class Actividad_A3_04_NIF {
	private int numero;
	private char letra;
	public Actividad_A3_04_NIF() {

	}
	public Actividad_A3_04_NIF(int numero) {
		this.numero = numero;
		this.letra = (char) obtenerLetra(numero);

	}
	public int leer() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el numero del dni");
		numero = teclado.nextInt();
		teclado.close();
		return numero;

	}
	public int obtenerLetra(int numero) {

		if (numero % 23 == 0) {
			letra = 'T';
		}
		if (numero % 23 == 1) {
			letra = 'R';
		}
		if (numero % 23 == 2) {
			letra = 'W';
		}
		if (numero % 23 == 3) {
			letra = 'A';
		}
		if (numero % 23 == 4) {
			letra = 'G';
		}
		if (numero % 23 == 5) {
			letra = 'M';
		}
		if (numero % 23 == 6) {
			letra = 'Y';
		}
		if (numero % 23 == 7) {
			letra = 'F';
		}
		if (numero % 23 == 8) {
			letra = 'P';
		}
		if (numero % 23 == 9) {
			letra = 'D';
		}
		if (numero % 23 == 10) {
			letra = 'X';
		}
		if (numero % 23 == 11) {
			letra = 'B';
		}
		if (numero % 23 == 12) {
			letra = 'N';
		}
		if (numero % 23 == 13) {
			letra = 'J';
		}
		if (numero % 23 == 14) {
			letra = 'Z';
		}
		if (numero % 23 == 15) {
			letra = 'S';
		}
		if (numero % 23 == 16) {
			letra = 'Q';
		}
		if (numero % 23 == 17) {
			letra = 'V';
		}
		if (numero % 23 == 18) {
			letra = 'H';
		}
		if (numero % 23 == 19) {
			letra = 'L';
		}
		if (numero % 23 == 20) {
			letra = 'C';
		}
		if (numero % 23 == 21) {
			letra = 'K';
		}
		if (numero % 23 == 22) {
			letra = 'E';
		}

		return letra;
	}

	@Override
	public String toString() {

		return "El nif es  [" + numero + "-" + letra + "]";
	}
	public static void main(String[] args) {
		Actividad_A3_04_NIF DNI1 = new Actividad_A3_04_NIF();
		Actividad_A3_04_NIF DNI2 = new Actividad_A3_04_NIF(47039141);
		DNI1.obtenerLetra(DNI1.leer());

		System.out.println(DNI1.toString());
		System.out.println(DNI2.toString());

	}
}
