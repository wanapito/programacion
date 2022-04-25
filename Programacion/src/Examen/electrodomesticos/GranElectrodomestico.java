package examen.electrodomesticos;

import java.util.Scanner;

public class GranElectrodomestico extends Codigo {

	private double gastos_envio = 0.0;
	private double gastos = 0.0;
	private double precio = 0.0;

	public GranElectrodomestico(String d) {

		super(d);

	}

	@Override
	public double calcularPrecio() {// gastos de envío

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce alto: ");
		double alto = sc.nextInt();

		System.out.println("Introduce ancho: ");
		double ancho = sc.nextInt();

		System.out.println("Introduce fondo: ");
		double fondo = sc.nextInt();

		System.out.println("¿Desea instalación? ");
		boolean instalacion = sc.nextBoolean();

		double medida = alto * ancho + fondo / 1000000;

		if (medida > 50) {

			gastos_envio = 50;
		} else {

			gastos_envio = medida;
		}

		if (instalacion) {

			gastos = gastos + gastos_envio;
		}

		return precio = precio + gastos;

	}

	public String toString() {
		return "El coste total de su electrodoméstico es de: " + gastos;
	}

}
