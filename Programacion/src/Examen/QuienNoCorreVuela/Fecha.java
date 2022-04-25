package Examen.QuienNoCorreVuela;

import java.io.Serializable;

public class Fecha implements Serializable {
	private int dia;
	private int mes;
	private int anio;

	public Fecha(int d, int m, int a) {
		dia = d;
		mes = m;
		anio = a;
	}

	public int comparar(Fecha f) {
		if (anio < f.anio)
			return -1;
		else if (anio > f.anio)
			return 1;
		else if (mes < f.mes)
			return -1;
		else if (mes > f.mes)
			return 1;
		else if (dia < f.dia)
			return -1;
		else if (dia > f.dia)
			return 1;
		else
			return 0;
	}

	public String toString() {
		String texto = "";
		if (dia < 10)
			texto += "0" + dia + "/";
		else
			texto += dia + "/";
		if (mes < 10)
			texto += "0" + mes + "/" + anio;
		else
			texto += mes + "/" + anio;

		return texto;
	}

}
