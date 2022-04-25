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
public class RepMecanica extends Reparacion {

	public RepMecanica(String descripcion) {
		super(descripcion);
	}

	@Override
	protected double calcularPrecio() {
		return (super.calcularPrecio()) + (precioMaterial * 1.1); // To change
																	// body of
																	// generated
																	// methods,
																	// choose
																	// Tools |
																	// Templates.
	}

	@Override
	public String toString() {
		return "\nReparacion Mecanica\n" + "------------------------------\n"
				+ "Identidicador Trabajo:" + identidicadorTrabajo
				+ "\n Descripcion: " + descripcion + "\n Numero Horas: "
				+ numeroHoras + "\n Trabajo finalizado: " + estaFinalizado
				+ "\n Precio Material: " + precioMaterial
				+ "\n Precio del servicio: " + calcularPrecio()
				+ "\n-------------------------------";
	}

}
