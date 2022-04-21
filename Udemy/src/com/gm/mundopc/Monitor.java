package com.gm.mundopc;

public class Monitor {
	private int idMonitor;
	private String marca;
	private double tamaño;
	private int contadorMonitores;

	private Monitor() {

	}
	public Monitor(String marca, double tamaño) {
		this();

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
	 * Setter
	 * 
	 * @param idMonitor
	 *            el idMonitor a establecer
	 */
	public void setIdMonitor(int idMonitor) {
		this.idMonitor = idMonitor;
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
	 * @return el tamaño
	 */
	public double getTamaño() {
		return tamaño;
	}
	/**
	 * Setter
	 * 
	 * @param tamaño
	 *            el tamaño a establecer
	 */
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	/**
	 * Getter
	 * 
	 * @return el contadorMonitores
	 */
	public int getContadorMonitores() {
		return contadorMonitores;
	}
	/**
	 * Setter
	 * 
	 * @param contadorMonitores
	 *            el contadorMonitores a establecer
	 */
	public void setContadorMonitores(int contadorMonitores) {
		this.contadorMonitores = contadorMonitores;
	}
	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca
				+ ", tamaño=" + tamaño + ", contadorMonitores="
				+ contadorMonitores + "]";
	}

}
