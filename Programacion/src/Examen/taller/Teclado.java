/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.taller;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author brc-9
 */
public class Teclado {

	static Scanner sc = new Scanner(System.in);
	static Scanner scString = new Scanner(System.in);

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
			} catch (InputMismatchException e) {
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
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("Introduce un numero entero");
			}
		}
		return numero;
	}

	public static double leerDouble(String mensaje, int min, int max) {
		double numero = 0;
		boolean respuestValida = false;
		System.out.println(mensaje);
		while (!respuestValida) {
			try {
				numero = sc.nextDouble();
				if (numero >= min && numero <= max) {
					respuestValida = true;
				} else {
					System.err.println(
							"Introduce un numero entre " + min + " y " + max);
				}
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("Introduce un numero decimal");
			}
		}
		return numero;
	}

	public static double leerDouble(String mensaje) {
		double numero = 0;
		boolean respuestValida = false;
		System.out.println(mensaje);
		while (!respuestValida) {
			try {
				numero = sc.nextDouble();
				respuestValida = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("Introduce un numero decimal");
			}
		}
		return numero;
	}

	public static String leerTexto(String mensaje) {
		String texto;
		System.out.println(mensaje);
		texto = scString.nextLine();
		return texto;
	}

}
