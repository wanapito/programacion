package literatura;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		System.out.println("se inicia por primera vez ");
		Scanner teclado = new Scanner(System.in);
		profesor profesor1 = new profesor();
		System.out.println("introduzca el dni");
		profesor1.setDni(teclado.next());
		profesor1.setContraseña(teclado.next());

	}

}
