/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.taller;

/**
 *
 * @author brc-9
 */
public class Reparacion extends Trabajo {

	protected double precioMaterial;

	public double getPrecioMaterial() {
		return precioMaterial;
	}

	public void setPrecioMaterial(double precioMaterial) {
		this.precioMaterial = precioMaterial;
	}

	public Reparacion(String descripcion) {
		super(descripcion);
		this.precioMaterial = 0;
	}

	public void usarMaterial(double precio) {
		if (!estaFinalizado) {
			precioMaterial = precioMaterial + precio;
			System.out.println("Precio material actual: " + getNumeroHoras());
		} else {
			System.err.println("El trabajo esta finalizado");
		}
	}

}
