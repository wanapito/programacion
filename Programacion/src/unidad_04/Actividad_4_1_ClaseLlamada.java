package unidad_04;

import java.util.Scanner;

public class Actividad_4_1_ClaseLlamada {
	private double tiempo;
	private static double costeFijo = 0.20;
	private static double costeMin = 0.05;
	public Actividad_4_1_ClaseLlamada() {

	}
	public double precioLlamada(double tiempo) {
		this.tiempo = tiempo;
		double total = 0;

		if (tiempo <= 3) {
			total = costeFijo;
			return total;
		}
		if (tiempo > 3) {
			total = (((tiempo - 3) * costeMin) + costeFijo);
			return total;
		} else {
			return total;

		}

	}

	/**
	 * @return el tiempo
	 */
	public double getTiempo() {
		return tiempo;
	}
	/**
	 * @param tiempo
	 *            el tiempo a establecer
	 */
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Actividad_4_1_ClaseLlamada llamada1 = new Actividad_4_1_ClaseLlamada();
		System.out.println("introduzca el tiempo de llamada");
		System.out.println("el precio de la llamada es "
				+ llamada1.precioLlamada(teclado.nextDouble()));
	}

}
