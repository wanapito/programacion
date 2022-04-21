package com.gm.mundopc;

public class DispositivoEntrada {
	private String tipoEntrada;
	private String marca;
	public DispositivoEntrada(String tipoEntrada, String marca) {
		// Inicializa las variables
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;

	}

	/**
	 * Getter
	 * 
	 * @return el tipoEntrada
	 */
	public String getTipoEntrada() {
		return tipoEntrada;
	}

	/**
	 * Setter
	 * 
	 * @param tipoEntrada
	 *            el tipoEntrada a establecer
	 */
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
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

	@Override
	public String toString() {
		return "DispositivoEntrada [tipoEntrada=" + tipoEntrada + ", marca="
				+ marca + "]";
	}

}
