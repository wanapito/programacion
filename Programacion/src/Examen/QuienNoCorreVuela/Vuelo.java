package Examen.QuienNoCorreVuela;

import java.io.Serializable;

public class Vuelo implements Serializable {

	private String codigo;
	private Fecha salida;
	private String hora;
	private Aeropuerto origen;
	private Aeropuerto destino;
	private int duracion; // en minutos
	private int plazas;
	private int reservas;
	private String estado = "OPERATIVO";

	public Vuelo(String c, Fecha s, String h, Aeropuerto o, Aeropuerto d,
			int dur, int p) {
		codigo = c;
		salida = s;
		hora = h;
		origen = o;
		destino = d;
		duracion = dur;
		plazas = p;
		reservas = 0;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getReservas() {
		return reservas;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setReservas(int reservas) {
		this.reservas = reservas;
	}

	public String getCodigo() {
		return codigo;
	}

	public Fecha getSalida() {
		return salida;
	}

	public Aeropuerto getOrigen() {
		return origen;
	}

	public Aeropuerto getDestino() {
		return destino;
	}

	public void cancelar() {
		estado = "CANCELADO";
	}

	public boolean cancelado() {
		return estado.equals("CANCELADO");
	}

	public String toString() {
		return "Código: " + codigo + "\nSalida: " + salida + "\nHora: " + hora
				+ "\nOrigen: " + origen + "\nDestino: " + destino
				+ "\nDuración: " + duracion + "min" + "\nPlazas: " + plazas
				+ "\nReservas: " + reservas;
	}

}
