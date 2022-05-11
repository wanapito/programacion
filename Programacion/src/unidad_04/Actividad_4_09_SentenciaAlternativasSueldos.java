package unidad_04;

import java.util.Scanner;

/*
 * De un operario se conoce su sueldo y los años de antigüedad. 
 * Se pide confeccionar un programa que lea los datos de entrada e informe:
a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a
 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
b) Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 
años, otorgarle un aumento de 5 %.
c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
 */
public class Actividad_4_09_SentenciaAlternativasSueldos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		double sueldo;
		int antigüedad;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca el sueldo");
		sueldo = teclado.nextDouble();
		System.out.println("introduzca la antigüedad");
		antigüedad = teclado.nextInt();
		if (sueldo < 500 && antigüedad >= 10) {
			System.out.println(
					"el sueldo sube un 20% " + (sueldo + (sueldo * 0.20)));

		}
		if (sueldo < 500 && antigüedad < 10) {
			System.out.println(
					"el sueldo sube un 5% " + (sueldo + (sueldo * 0.05)));
		}
		if (sueldo >= 500) {
			System.out.println("el sueldo no sube");
		}

	}

}
