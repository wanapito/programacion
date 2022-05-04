package Test.variables;

public class TestArgumentosVariables {
	public static void main(String[] args) {
		// Llamamos al método
		imprimirNumeros(3, 4, 5);
		imprimirNumeros(1, 2);
		variosParametros("Juan", 8, 9, 10);
	}
	// Siempre debe ser el ultimo argumentos int...
	// int... permite introducir una serie de parametros al atributos

	private static void variosParametros(String nombre, int... numeros) {
		System.out.println("nombre" + nombre);
		imprimirNumeros(numeros);
	}
	// Int ... significa que los argumentos son variables
	private static void imprimirNumeros(int... numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento : " + numeros[i]);

		}

	}
}
