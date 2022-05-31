package com.gm.mundopc;

public class Computadora {
	private final int idComputadora;
	private String nombre;
	// Vamos a agregar objetos en formato variable
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputadoras;

	private Computadora() {
		this.idComputadora = ++contadorComputadoras;
	}
	public Computadora(String nombre, Monitor monitor, Teclado teclado,
			Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.raton = raton;
		this.teclado = teclado;

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
	/**
	 * Getter
	 * 
	 * @return el monitor
	 */
	public Monitor getMonitor() {
		return monitor;
	}
	/**
	 * Setter
	 * 
	 * @param monitor
	 *            el monitor a establecer
	 */
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	/**
	 * Getter
	 * 
	 * @return el teclado
	 */
	public Teclado getTeclado() {
		return teclado;
	}
	/**
	 * Setter
	 * 
	 * @param teclado
	 *            el teclado a establecer
	 */
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	/**
	 * Getter
	 * 
	 * @return el raton
	 */
	public Raton getRaton() {
		return raton;
	}
	/**
	 * Setter
	 * 
	 * @param raton
	 *            el raton a establecer
	 */
	public void setRaton(Raton raton) {
		this.raton = raton;
	}
	/**
	 * Getter
	 * 
	 * @return el contadorComputadoras
	 */
	public static int getContadorComputadoras() {
		try {
			return contadorComputadoras;
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		return contadorComputadoras;
	}
	/**
	 * Setter
	 * 
	 * @param contadorComputadoras
	 *            el contadorComputadoras a establecer
	 */
	public void setContadorComputadoras(int contadorComputadoras) {
		this.contadorComputadoras = contadorComputadoras;
	}
	/**
	 * Getter
	 * 
	 * @return el idComputadora
	 */
	public int getIdComputadora() {
		return idComputadora;
	}
	@Override
	public String toString() {
		return "Computadora [idComputadora=" + idComputadora + ", nombre="
				+ nombre + ", monitor=" + monitor + ", teclado=" + teclado
				+ ", raton=" + raton + ", contadorComputadoras="
				+ contadorComputadoras + "]";
	}

}
