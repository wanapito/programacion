package Examen.loteria;

import java.util.Arrays;

public class Euromillones extends Boleto {

	int[] estrellas = new int[2];

	public Euromillones(String fecha) {
		super(fecha);
		System.out.println(
				"¿Quieres generar el boleto del Gordo aleatoriamente? (S/N)");
		if (Teclado.leerSiNo()) {
			generarBoletoAleatorio(5, 50);

		} else {
			generarBoletoManual(5, 50);
		}
		System.out.println("Introduce 2 estrellas:");
		estrellas[0] = Teclado.leerNumero(1, 12);
		estrellas[1] = Teclado.leerNumero(1, 12);
		Arrays.sort(estrellas);
	}

	public String boletoImpreso() {
		String boletoImpreso = "";
		boletoImpreso = boletoImpreso + "Euromillones" + "\n";
		boletoImpreso = boletoImpreso + "Numero del boleto: " + codigoBoleto
				+ "\n";
		boletoImpreso = boletoImpreso + "Fecha del sorteo: " + fecha + "\n";
		boletoImpreso = boletoImpreso + "Apuesta: ";
		for (int i = 0; i < apuesta.length; i++) {

			if (i == apuesta.length - 1) {
				boletoImpreso = boletoImpreso + apuesta[i] + "\n";
			} else {
				boletoImpreso = boletoImpreso + i + ", ";
			}
		}
		boletoImpreso = boletoImpreso + "Estrellas: ";
		for (int i = 0; i < estrellas.length; i++) {

			if (i == estrellas.length - 1) {
				boletoImpreso = boletoImpreso + estrellas[i] + "\n";
			} else {
				boletoImpreso = boletoImpreso + i + ", ";
			}
		}
		return boletoImpreso;
	}
}
