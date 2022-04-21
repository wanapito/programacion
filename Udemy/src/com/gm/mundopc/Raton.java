package com.gm.mundopc;

public class Raton extends DispositivoEntrada {
	private final int idRaton;
	private static int contadorRaton;
	// Creamos constructor que nos pediría los atributos heredaros de la clase
	// Padre
	public Raton(String tipoEntrada, String marca) {
		// Llamamos la clase padre con super
		super(tipoEntrada, marca);
		// Este constructor sumara 1 al contador raton
		this.idRaton = ++Raton.contadorRaton;
	}

	@Override
	public String toString() {
		return "Raton [idRaton=" + idRaton + ", contadorRaton=" + contadorRaton
				+ "]";
	}

}
