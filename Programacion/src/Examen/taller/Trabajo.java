/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen_2018_taller;

import java.io.Serializable;

/**
 *
 * @author brc-9
 */
public abstract class Trabajo implements Serializable {

    protected String identidicadorTrabajo;
    protected String descripcion;
    protected int numeroHoras;
    protected boolean estaFinalizado;
    static int contadorIdentificador;

    public String getIdentidicadorTrabajo() {
        return identidicadorTrabajo;
    }

    public void setIdentidicadorTrabajo(String identidicadorTrabajo) {
        this.identidicadorTrabajo = identidicadorTrabajo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public boolean isEstaFinalizado() {
        return estaFinalizado;
    }

    public void setEstaFinalizado(boolean estaFinalizado) {
        this.estaFinalizado = estaFinalizado;
    }

    public static int getContadorIdentificador() {
        return contadorIdentificador;
    }

    public static void setContadorIdentificador(int contadorIdentificador) {
        Trabajo.contadorIdentificador = contadorIdentificador;
    }

    public Trabajo(String descripcion) {
        contadorIdentificador++;
        this.identidicadorTrabajo = generarIdentificador();
        this.descripcion = descripcion;
        this.numeroHoras = 0;
        this.estaFinalizado = false;
    }

    private String generarIdentificador() {
        String identificador = "T";
        int numeroDeCeros;
        numeroDeCeros = 7 - String.valueOf(contadorIdentificador).length();
        for (int i = 0; i < numeroDeCeros; i++) {
            identificador += "0";
        }
        identificador += String.valueOf(contadorIdentificador);
        return identificador;
    }

    protected void incrementarHoras(int horas) {
        if (!estaFinalizado) {
            numeroHoras = numeroHoras + horas;
            System.out.println("Numero de horas actuales: " + getNumeroHoras());
        } else {
            System.err.println("El trabajo esta finalizado");
        }
    }

    protected double calcularPrecio() {
        double precio;
        precio = 30 * numeroHoras;
        return precio;
    }

    @Override
    public String toString() {
        return "";
    }

}
