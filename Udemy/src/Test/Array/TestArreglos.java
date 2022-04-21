package Test_Array;

public class TestArreglos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// Los []son arrays van después de la variable
		// Indicamos las cantidad de elementos que contiene el array siempre
		// Empiezan a contar desde 0 y no se puede modificar
		int edades[] = new int[3];
		System.out.println("Edades =" + edades);
		// Modificamos el índice 0 del array
		edades[0] = 10;
		edades[2] = 3;
		edades[1] = 2;
		// Imprimimos el valor de la array 0
		System.out.println("Edades 0 =" + edades[0]);
		System.out.println("Edades 1 =" + edades[1]);
		System.out.println("Edades 2 =" + edades[2]);
		// No podemos indicar un numero fuera de los indicados en la array
		// Edades[30] = 5;
		// Esto es un bucle for
		// Vamos a recorrer el array empezando desde 0 hasta la longitud que
		// Hemos indicados con length que era 3 sumando de 1 en 1
		for (int i = 0; i < edades.length; i++) {
			// Imprimo el bucle for el cual nos dice el paso por el que vamos
			System.out.println(
					"Paso por objeto " + i + " Es edades = " + edades[i]);

		}
		// Otro modo de nombra un array con cadenas
		// En el cual indicamos los valores que tiene cada índice siendo 0
		// =Naranja , 1 plátano , 2 uva un array de 3
		String frutas[] = {"Naranja", "Plátano", "Uva"};
		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Frutas índice " + i + " es = " + frutas[i]);

		}
	}

}
