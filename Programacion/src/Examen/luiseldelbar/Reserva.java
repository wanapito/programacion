package Examen.luiseldelbar;

import java.io.Serializable;

public abstract class Reserva implements Serializable {
	protected int id;
	protected String cliente;

	public Reserva(int año, int semana, String cliente) {
		id = generarId(año, semana);
		this.cliente = cliente;
	}

	public static int generarId(int año, int semana) {
		return año * 100 + semana;
	}

	public static boolean esSemanaValida(int semana) {
		return semana >= 1 && semana <= 53;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + "\t" + cliente;
	}

	public abstract double calcularPrecio();

}
