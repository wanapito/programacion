package Examen.QuienNoCorreVuela;

import java.io.Serializable;

public class Reserva implements Serializable {

	private Vuelo vuelo;
	private String viajero;
	private int codigo;
	private static int num_reser = 0;

	public Reserva(Vuelo vu, String via) {
		codigo = ++num_reser;
		vuelo = vu;
		viajero = via;

	}

	public boolean contiene(String n) {
		return (viajero.toUpperCase().indexOf(n.toUpperCase()) != -1);
	}

	public String toString() {
		return codigo + " - " + vuelo.getCodigo() + " " + vuelo.getSalida()
				+ " " + vuelo.getHora() + " - " + viajero + " - "
				+ ((vuelo.cancelado()) ? "CANCELADO" : "RESERVADO");
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getViajero() {
		return viajero;
	}

}
