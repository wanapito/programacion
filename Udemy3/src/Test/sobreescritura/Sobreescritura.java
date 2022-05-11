package Test.sobreescritura;

import dominio.sobreescritura.Empleado;
import dominio.sobreescritura.Gerente;

public class Sobreescritura {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Gerente gerente1 = new Gerente("ivan", 5000, "sistemas");
		// System.out.println("gerente1" + gerente1.getDetalles());
		Empleado empleado1 = new Empleado("juan", 5000);
		// creamos un metodo para imprimir

		imprimir(empleado1);
		// System.out.println(empleado1.getDetalles());;
		Gerente gerente2 = new Gerente("karla", 10000, "contabilidad");
		// System.out.println("gerente4 " + gerente2.getDetalles());
		// se eta usadno n polimorfismo ya que el metodo al ser llamado desde
		// una clase padre puede llamar a clase hijas
		imprimir(gerente2);
		imprimir(gerente1);
	}
	public static void imprimir(Empleado empleado) {
		String detalles = empleado.getDetalles();
		System.out.println("empleado=" + detalles);

	}
}
