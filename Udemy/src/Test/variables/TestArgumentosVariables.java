package Test.variables;

public class TestArgumentosVariables {
	public static void main(String[] args) {
		// Llamamos al método
		imprimirNumeros(3, 4, 5);
		imprimirNumeros(1, 2);
	}
	// int ... siginifica que los argumentos son variables
	private static void imprimirNumeros(int... numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento : " + numeros[i]);

		}

	}
}
