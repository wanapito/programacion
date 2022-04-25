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
public class Revision extends Trabajo {

	public Revision(String descripcion) {
		super(descripcion);
	}

	@Override
	protected double calcularPrecio() {
		return (super.calcularPrecio()) + 20;
	}

	@Override
	public String toString() {
		return "\nRevision\n" + "-------------------------------\n"
				+ "Identidicador Trabajo:" + identidicadorTrabajo
				+ "\n Descripcion: " + descripcion + "\n Numero Horas: "
				+ numeroHoras + "\n Trabajo finalizado: " + estaFinalizado
				+ "\n Precio del servicio: " + calcularPrecio()
				+ "\n-------------------------------";
	}

}
