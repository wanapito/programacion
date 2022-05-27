package com.gm.mundopc;

public class Monitor {
	private final int idMonitor;
	private String marca;
	private double tamaño;
	private static int contadorMonitores;

	private Monitor() {
		this.idMonitor = ++contadorMonitores;
	}
	public Monitor(String marca, double tamaño) {
		// Llamamos al constructor vaci� para que inicialice el contador
		this();
		this.tamaño = tamaño;
		this.marca = marca;

	}
	/**
	 * Getter
	 * 
	 * @return el idMonitor
	 */
	public int getIdMonitor() {
		return idMonitor;
	}

	/**
	 * Getter
	 * 
	 * @return el marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * Setter
	 * 
	 * @param marca
	 *            el marca a establecer
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * Getter
	 * 
	 * @return el tama�o
	 */
	public double getTamaño() {
		return tamaño;
	}
	/**
	 * Setter
	 * 
	 * @param tama�o
	 *            el tama�o a establecer
	 */
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	/**
	 * Getter
	 * 
	 * @return el contadorMonitores
	 */
	public static int getContadorMonitores() {
		return contadorMonitores;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca
				+ ", tama�o=" + tamaño + "]";
	}

}
