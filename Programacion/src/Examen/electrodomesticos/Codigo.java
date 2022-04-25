package Examen.electrodomesticos;

import java.io.Serializable;

public abstract class Codigo implements Serializable {

	protected String id;
	protected String desc;

	protected boolean finalizado = false;
	private static int contador = 0;

	public Codigo(String d) {
		desc = d;
		id = generarId();
	}

	private String generarId() {
		String num = "" + contador;
		while (num.length() < 8)
			num = "0" + num;
		contador++;
		return "T" + num;
	}

	public void finalizar() {
		finalizado = true;
	}

	public String getId() {
		return id;
	}

	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

}
