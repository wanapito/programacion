package dominio.Manejoexcepciones;

public class aritmetica {

	public static int division(int numerador, int denominador)
			throws operacionExcepcion {
		if (denominador == 0) {
			throw new operacionExcepcion("division entre 0");
		}
		return numerador / denominador;
	}
}
