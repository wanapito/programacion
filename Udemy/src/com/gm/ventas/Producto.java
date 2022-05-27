package com.gm.ventas;

public class Producto {
	// La declaramos final para que no se pueda modificar
	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProducto;
	private Producto() {
		// Le asignamos valor a idProducto una suma de contador con ++
		this.idProducto = ++Producto.contadorProducto;
	}
	public Producto(String nombre, double precio) {
		// Llamamos al constructor vació
		this();
		this.nombre = nombre;
		this.precio = precio;
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
	 * @return el precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * Setter
	 * 
	 * @param precio
	 *            el precio a establecer
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Getter
	 * 
	 * @return el idProducto
	 */
	public int getIdProducto() {
		return idProducto;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", Nombre=" + nombre
				+ ", Precio=" + precio + "]";
	}

}
