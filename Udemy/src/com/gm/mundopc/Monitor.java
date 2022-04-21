package com.gm.mundopc;

public class Monitor {
	private int idMonitor;
	private String marca;
	private double tama�o;
	private int contadorMonitores;

	private Monitor() {

	}
	public Monitor(String marca, double tama�o) {
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
				+ ", tama�o=" + tama�o + ", contadorMonitores="
				+ contadorMonitores + "]";
	}

}
