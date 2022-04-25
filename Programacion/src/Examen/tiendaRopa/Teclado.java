/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.tiendaRopa;

import java.util.Scanner;

/**
 *
 * @author brc-9
 */
public class Teclado {

	static Scanner sc = new Scanner(System.in);

	public static int leerInt(String mensaje, int min, int max) {
		int numero = 0;
		boolean respuestaValida = false;
		System.out.println(mensaje);
		while (!respuestaValida) {
			try {
				numero = sc.nextInt();
				if (numero >= min && numero <= max) {
					respuestaValida = true;
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

	public static int leerInt(int min, int max) {
		int numero = 0;
		boolean respuestaValida = false;
		System.out.println("Introduce un numero entre " + min + " y " + max);
		while (!respuestaValida) {
			try {
				numero = sc.nextInt();
				if (numero >= min && numero <= max) {
					respuestaValida = true;
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

	public static int leerInt(String mensaje) {
		int numero = 0;
		boolean respuestaValida = false;
		System.out.println(mensaje);
		while (!respuestaValida) {
			try {
				numero = sc.nextInt();
				respuestaValida = true;
			} catch (Exception e) {
				sc.nextLine();
				System.err.println("Introduce un numero entero");
			}
		}
		return numero;
	}

	public static int leerInt() {
		int numero = 0;
		boolean respuestaValida = false;
		System.out.println("Introduce un numero");
		while (!respuestaValida) {
			try {
				numero = sc.nextInt();
				respuestaValida = true;
			} catch (Exception e) {
				sc.nextLine();
				System.err.println("Introduce un numero entero");
			}
		}
		return numero;
	}

	public static double leerDouble(String mensaje) {
		double numero = 0;
		boolean respuestaValida = false;
		System.out.println(mensaje);
		while (!respuestaValida) {
			try {
				numero = sc.nextDouble();
				respuestaValida = true;
			} catch (Exception e) {
				sc.nextLine();
				System.err.println("Introduce un numero entero");
			}
		}
		return numero;
	}
	public static String leerTexto(String mensaje) {
		String texto = "";
		System.out.println(mensaje);
		texto = sc.next();
		return texto;
	}

	public static String leerTexto() {
		String texto = "";
		texto = sc.next();
		return texto;
	}

	public static boolean leerSiNo(String mensaje) {
		String texto = "";
		System.out.println(mensaje);
		boolean respuestaValida = false;
		while (!respuestaValida) {
			texto = sc.next();
			if (texto.equalsIgnoreCase("Si")) {

				return true;
			} else if (texto.equalsIgnoreCase("No")) {
				respuestaValida = true;
				return false;
			} else {
				System.out.println("Introduce Si o No");
			}
		}
		return true;
	}

}
