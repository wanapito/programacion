package com.gm.mundopc;
import javax.management.loading.PrivateClassLoader;

import com.gm.mundopc.*;
public class Computadora {
	private int idComputadora;
	private String nombre;
	private Monitor.monitor;
	private Teclado.teclado;
	private Raton.raton;
	
	private Computadora () {
		
	}
	public Computadora(String Monitor, String teclado, String raton) {

	}
	/**
	 * Getter
	 * 
	 * @return el idComputadora
	 */
	public int getIdComputadora() {
		return idComputadora;
	}
	/**
	 * Setter
	 * 
	 * @param idComputadora
	 *            el idComputadora a establecer
	 */
	public void setIdComputadora(int idComputadora) {
		this.idComputadora = idComputadora;
	}
	/**
	 * Getter
	 * 
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Setter
	 * 
	 * @param nombre
	 *            el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Computadora [idComputadora=" + idComputadora + ", nombre="
				+ nombre + "]";
	}

}
