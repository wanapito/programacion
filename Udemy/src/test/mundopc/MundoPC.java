package test.mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPC {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Raton raton1 = new Raton("USB", "hp");
		Teclado teclado1 = new Teclado("Usb", "Asus");
		Monitor monitor1 = new Monitor("Asus", 15.0);
		Computadora computadora1 = new Computadora("Windows", monitor1,
				teclado1, raton1);

		Raton raton2 = new Raton("USB", "asus");
		Teclado teclado2 = new Teclado("Usb", "hp");
		Monitor monitor2 = new Monitor("hp", 25.0);
		Computadora computadora2 = new Computadora("gammer", monitor1, teclado1,
				raton1);

		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadora1);
		orden1.agregarComputadora(computadora2);

		orden1.mostrarOrden();

	}

}
