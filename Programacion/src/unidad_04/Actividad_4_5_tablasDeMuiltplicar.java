package unidad_04;
//Realizar un programa que visualice en pantalla las tablas de multiplicar del 1 al 10.
public class Actividad_4_5_tablasDeMuiltplicar {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		for (numero1 = 0; numero1 < 11; numero1++) {
			System.out.println("Tabla del " + numero1);
			for (numero2 = 0; numero2 < 11; numero2++) {

				System.out.println("La multiplicación es " + numero1 + " * "
						+ numero2 + " = " + (numero1 * numero2));
			}
		}
	}

}
