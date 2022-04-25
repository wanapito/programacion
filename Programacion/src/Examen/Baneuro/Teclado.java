
package Examen.Baneuro;

import java.util.Scanner;

public class Teclado {
	static Scanner sc = new Scanner(System.in);
	public static int leerEntero(String mensaje, int min, int max) {
		int numero = 0;
		boolean respuestValida = false;
		System.out.println(mensaje);
		while (!respuestValida) {
			try {
				numero = sc.nextInt();
				if (numero >= min && numero <= max) {
					respuestValida = true;
				} else {
					System.err.println(
							"Introduce un numero entre " + min + " y " + max);
				}
			} catch (Exception e) {
				sc.nextLine();
				System.err.println("Introduce un numero entero");
			}
		}
		return numero;
	}
	public static int leerEntero(int min, int max) {
		int numero = 0;
		boolean respuestValida = false;
		System.out.println("Introduce un numero entre " + min + " y " + max);
		while (!respuestValida) {
			try {
				numero = sc.nextInt();
				if (numero >= min && numero <= max) {
					respuestValida = true;
				} else {
					System.err.println(
							"Introduce un numero entre " + min + " y " + max);
				}
			} catch (Exception e) {
				sc.nextLine();
				System.err.println("Introduce un numero entero");
			}
		}
		return numero;
	}

	public static int leerEntero() {
		int numero = 0;
		boolean respuestValida = false;
		System.out.println("Introduce un numero");
		while (!respuestValida) {
			try {
				numero = sc.nextInt();
				respuestValida = true;
			} catch (Exception e) {
				sc.nextLine();
				System.err.println("Introduce un numero entero");
			}
		}
		return numero;
	}
	public static int leerEntero(String mensaje) {
		int numero = 0;
		boolean respuestValida = false;
		System.out.println(mensaje);
		while (!respuestValida) {
			try {
				numero = sc.nextInt();
				respuestValida = true;
			} catch (Exception e) {
				sc.nextLine();
				System.err.println("Introduce un numero entero");
			}
		}
		return numero;
	}

	public static String leerTexto() {
		String texto = "";
		texto = sc.nextLine();
		return texto;
	}
	public static String leerTexto(String mensaje) {
		String texto = "";
		System.out.println(mensaje);
		texto = sc.next();
		return texto;
	}

	public static double leerDouble(String mensaje) {
		double numero = 0;
		boolean respuestValida = false;
		System.out.println(mensaje);
		while (!respuestValida) {
			try {
				numero = sc.nextDouble();
				respuestValida = true;
			} catch (Exception e) {
				sc.nextLine();
				System.err.println("Introduce un numero decimal");
			}
		}
		return numero;
	}
}