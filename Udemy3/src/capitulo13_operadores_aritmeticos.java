//
public class capitulo13_operadores_aritmeticos {
	// 9
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int a = 3;
		int b = 2;
		int resultado = a + b;
		System.out.println("resultado de la suma = " + resultado);

		resultado = a - b;
		System.out.println("resultado de la resta =" + resultado);

		resultado = a * b;
		System.out.println("resultado de la multiplicacion = " + resultado);

		// como resultado es tipo int el resultado saldra solo el numero entero

		// la ponemos con otrra variable tipo double
		double resultado2 = a / b;
		System.out.println("resultado de la divion = " + resultado2);
		// sacamos el resto
		resultado = a % b;
		System.out.println("el resto de la division = " + resultado);
		// verificamos si es par
		// si el resto de la divion entre 2 es o sera par
		if (a % 2 == 0) {
			System.out.println("es numero par");
		}

		else {
			System.out.println("es numero impar");
		}

	}
}
