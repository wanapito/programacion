package Test.arreglos;

public class testmatrices {
	public static void main(String[] args) {
		// Primer array 'filas' segundo array 'columnas '
		// El funcionamiento es igual que un array solo que hay que marcar
		// Coordenadas renglón columna
		/*
		 * 0 1 0---------- 1--------- 2---------
		 *
		 */
		int edades[][] = new int[3][2];
		edades[0][0] = 5;
		edades[0][1] = 7;
		edades[1][0] = 8;
		edades[1][1] = 4;
		// Los siguientes valores los dejamos a 0 es el valor por defecto
		// Imprimimos todos los valores
		System.out.println("Edades 0-0 es  " + edades[0][0]);
		System.out.println("Edades 0-1 es  " + edades[0][1]);
		System.out.println("Edades 0-1 es  " + edades[1][0]);
		System.out.println("Edades 0-1 es  " + edades[1][1]);
		System.out.println("Edades 0-1 es  " + edades[2][0]);
		System.out.println("Edades 0-1 es  " + edades[2][1]);
		// Creamos bucle for para recorrer la matriz
		for (int ren = 0; ren < edades.length; ren++) {
			// Una vez seleccionada el primer valor del renglón
			// Hacemos bucle for el cual recorrerá las columnas del mismo
			for (int col = 0; col < edades[ren].length; col++) {
				System.out.println(
						"Edades " + ren + "-" + col + " : " + edades[ren][col]);

			}

		}
	}
}
