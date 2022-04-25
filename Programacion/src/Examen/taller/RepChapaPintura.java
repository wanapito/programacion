/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen_2018_taller;

/**
 *
 * @author brc-9
 */
public class RepChapaPintura extends Reparacion {

    public RepChapaPintura(String descripcion) {
        super(descripcion);
    }

    @Override
    protected double calcularPrecio() {
        return (super.calcularPrecio()) + (precioMaterial * 1.3); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "\nReparacion Chapa y Pintura\n"
                + "-------------------------------\n"
                + "Identidicador Trabajo:" + identidicadorTrabajo
                + "\n Descripcion: " + descripcion
                + "\n Numero Horas: " + numeroHoras
                + "\n Trabajo finalizado: " + estaFinalizado
                + "\n Precio Material: " + precioMaterial
                + "\n Precio del servicio: " + calcularPrecio()
                + "\n-------------------------------";
    }
}
