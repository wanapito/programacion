/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.tiendaRopa;

import java.io.Serializable;

/**
 *
 * @author brc-9
 */
public class Articulos implements Serializable, iDevolucion {
	protected Referencia referencia;
	protected String descripcion;
	protected int cantidad;
	protected double precio;

	public Referencia getReferencia() {
		return referencia;
	}
	public void setReferencia(Referencia referencia) {
		this.referencia = referencia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void amumentarCantidad(int cantidad) {
		this.cantidad += cantidad;
	}
	public void decrementarCantidad(int cantidad) {
		this.cantidad -= cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Articulos(String referencia, String descripcion, int cantidad,
			double precio) {
		this.referencia = new Referencia(referencia);
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;

	}

	@Override
	public double devolver(double diasTranscurridos) {
		double costeDevolucion;
		costeDevolucion = 4 + (diasTranscurridos / 10);
		return costeDevolucion;
	}

}
