package Examen.loteria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Fecha {
	static String fecha = "";
	static Scanner sc = new Scanner(System.in);
	public static String leerFecha() {
		boolean completado = false;
		while (!completado)
			try {
				System.out
						.println("Introduce una fecha con formato dd/MM/yyyy");
				fecha = sc.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter
						.ofPattern("dd/MM/yyyy");
				LocalDate dateTime = LocalDate.parse(fecha, formatter);
				fecha = dateTime.format(formatter);
				completado = true;
			} catch (DateTimeParseException e) {
				System.err.println(
						"Fecha introducida incorrectamente, respete el formato dd/MM/yyyy");
			}
		return fecha;
	}
}
