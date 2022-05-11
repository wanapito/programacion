package unidad_04;

/*
 * Mostrar los m�ltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc. 
 */
public class Actividad_4_12_SentenciaAltenativaMultiplosde8 {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		final int numeroMAX = 500;
		final int multiplo = 8;
		for (int i = 0; i < numeroMAX; i++) {
			if (i % 8 == 0) {
				System.out.println("los multiplos de 8 son " + i);
			}

		}
		// otra manera de hacerlo con while en liena
		int numero = multiplo;
		while (numero <= numeroMAX) {
			if (numero > multiplo) {
				System.out.print(" - ");
			}
			System.out.print(numero);
			numero += multiplo;
		}
		System.out.println();

		// otra manera de hacerlo con for en linea
		for (int i = multiplo; i <= numeroMAX; i += multiplo) {
			if (i > multiplo) {
				System.out.print(" - ");
			}
			System.out.print(i);
		}
		System.out.println();
	}

}
