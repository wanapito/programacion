package Examen.QuienNoCorreVuela;

import java.io.Serializable;

public class Aeropuerto implements Serializable {

	private String codigo;
	private String nombre;
	private String ciudad;

	public Aeropuerto(String cod, String n, String ciu) {
		codigo = cod;
		nombre = n;
		ciudad = ciu;
	}

	public String getCodigo() {
		return codigo;
	}

	public String toString() {
		return codigo + " - " + nombre + " - " + ciudad;
	}

}
