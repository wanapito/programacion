package com.gm.mundopc;

public class Monitor {
	private final int idMonitor;
	private String marca;
	private double tama�o;
	private static int contadorMonitores;

	private Monitor() {
		this.idMonitor = ++contadorMonitores;
	}
	public Monitor(String marca, double tama�o) {
		// Llamamos al constructor vaci� para que inicialice el contador
		this();
		this.tama�o = tama�o;
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
	public double getTama�o() {
		return tama�o;
	}
	/**
	 * Setter
	 * 
	 * @param tama�o
	 *            el tama�o a establecer
	 */
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}
	/**
	 * Getter
	 * 
	 * @return el contadorMonitores
	 */
	public int getContadorMonitores() {
		return contadorMonitores;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca
				+ ", tama�o=" + tama�o + "]";
	}

}
