public class capitulo16_operadores_igualdad_relacionales {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int a = 3;
		int b = 2;
		// vamos a ver si son iguales tipo boolean
		boolean c = (a == b);
		System.out.println("c =" + c);
		// vamos a ver si son diferentes tipo boolean
		boolean d = (a != b);
		System.out.println("d =" + d);

		String cadena = "hola";
		String cadena2 = "adios";
		boolean e = cadena == cadena2;
		// comprobamos si la cadena es igual en "referencia"
		System.out.println("e= " + e);
		// usamos un metodo para comprobar si tienen el mismo "contenido" los dos string
		boolean f = cadena.equals(cadena2);
		System.out.println("f =" + f);
		// unos mayor o menor para sabes si es true o false una comparacion
		boolean g = a >= b;
		System.out.println("g =" + g);
		// si la resta de a entre 2 da resto 0
		if (a % 2 == 0) {
			System.out.println("es un numero par");
		}
		else {
			System.out.println("es un nmero impar");
	}
		
			int edad = 30;
		int adulto=18;
		//comparamos la variables 
		if (edad>=adulto) {
			System.out.println("es un adulto");
						
		}
		else {
			System.out.println("es menor de edad");
		}
		
		}

}
