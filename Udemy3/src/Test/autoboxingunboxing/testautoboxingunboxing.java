package Test.autoboxingunboxing;

public class testautoboxingunboxing {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// clases envolventes de tipos primitivos
		/*
		 * int -Integer long-Long float-Float double-Double boolean-Boolean byte
		 * Byte char- Character short -Short
		 * 
		 */
		// es una clase envolvente
		// autoboxing
		Integer entero = 10;
		System.out.println("entero" + entero);
		// al ser un objeto se pude tener acceso a mas metodos
		System.out.println("entero" + entero.toString());
		// podemos cambiar el tipo int a double etc
		System.out.println("entero" + entero.doubleValue());
		// del objeto entero se extrae el valor
		// unboxing
		int entero2 = entero;
		System.out.println("entero2 " + entero2);

	}

}
