package unidad_03;

import java.util.Scanner;

/*
 * Se pide escribir una clase Binario para manejar 
 * números binarios. La clase tendrá un atributo que 
 * será el número en binario formado por ceros y unos. 
 * Utilizaremos el tipo long para representar dicho atributo.
La clase debe contener los siguientes constructores
constructor por defecto sin parámetros
constructor que recibe un parámetro de tipo long que
 representa el número en binario 
constructor que recibe un parámetro de tipo int que 
representa el número en decimal. Este constructor 
llamará a un método llamado toBinario que recibe un 
entero y devuelve un long con su representación en código binario.
Además tendrá los siguientes métodos:

Métodos get y set
Método toBinario descrito anteriormente que estará 
implementado de forma recursiva
Método toDecimal que nos devuelve el entero correspondiente
 de convertir el número binario a decimal
Método esValido que nos devuelve true si el número es un 
número binario válido (formado sólo por 0 y 1). Deberá 
implementarse usando recursividad

Crear una clase main para probar la clase Binario.
 */
public class Actividad_A3_10_Clase_binario {
	private long binario;
	private int entero;
	private long valor;

	public Actividad_A3_10_Clase_binario() {

	}
	public Actividad_A3_10_Clase_binario(long valor) {
		this.valor = valor;

	}
	public Actividad_A3_10_Clase_binario(int valor) {
		toBinario(valor);
	}

	public long toBinario(long valor) {
		// convertir a binario
		if (valor < 2) {
			return valor;
		} else {
			return toBinario(valor / 2) * 10 + (valor % 2);
		}
	}
	public int toDecimal() {
		// convertir a decimal
		int nDec = 0;
		int pos = 0;
		while (valor > 0) {
			nDec = nDec + (int) (valor % 10) * (int) Math.pow(2, pos);
			pos++;
			valor = valor / 10;
		}
		return nDec;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;

	}
	public static boolean esValido(long valor) {
		if (valor == 0 || valor == 1) {
			return true;
		} else {
			int ultima = (int) valor % 10;
			return (ultima == 0 || ultima == 1) && esValido(valor / 10);
		}

	}
	public boolean esValido() {
		return esValido(valor);
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe un número en decimal");
		int dec = teclado.nextInt();
		Actividad_A3_10_Clase_binario bin = new Actividad_A3_10_Clase_binario(
				dec);
		System.out.println(dec + " en binario es " + bin.getValor());
		long nBin;
		do {
			System.out.println("Escribe un número en binario");
			nBin = teclado.nextLong();

		} while (!Actividad_A3_10_Clase_binario.esValido(nBin));
		Actividad_A3_10_Clase_binario bin2 = new Actividad_A3_10_Clase_binario(
				nBin);
		System.out.println(nBin + " en decimal es " + bin2.toDecimal());
	}

}
