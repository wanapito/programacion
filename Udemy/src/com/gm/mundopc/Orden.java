package com.gm.mundopc;

public class Orden {
	private final int idorden;
	private Computadora computadoras[];
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private static final int MAX_COMPUTADORAS = 10;

	public Orden() {
		this.idorden = ++contadorOrdenes;
		this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];

	}
	public void agregarComputadora(Computadora computadora) {
		if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
			this.computadoras[this.contadorComputadoras++] = computadora;
		} else {
			System.out
					.println("Has superado el limite" + Orden.MAX_COMPUTADORAS);
		}

	}
	public void mostrarOrden() {
		System.out.println("Orden #:" + this.idorden);
		System.out.println("Computadoras de la orden #: " + this.idorden);
		for (int i = 0; i < this.contadorComputadoras; i++) {
			System.out.println(this.computadoras[i]);

		}

	}
}
