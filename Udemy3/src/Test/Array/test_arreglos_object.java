package Test.Array;
import dominio.arrays.Persona;

public class test_arreglos_object {
	public static void main(String[] args) {
		// Iniciamos el array
		Persona personas[] = new Persona[2];
		personas[0] = new Persona("Juan");
		personas[1] = new Persona("Karla");
		System.out.println("Persona 0 =" + personas[0]);
		System.out.println("Persona 1 =" + personas[1]);
		// Iniciamos bucle for
		for (int i = 0; i < personas.length; i++) {
			// Imprimimos las variables recorridas por el bucle en el array
			System.out.println("Personas índice =" + i + " = " + personas[i]);

		}

	}

}
