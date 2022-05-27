package Test.instanceOf;

import dominio.instanceOf.Empleado;
import dominio.instanceOf.Gerente;

public class InstanceOf {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Iván", 5000, "Sistemas");
		determinarTipo(gerente1);
		Empleado empleado1 = new Empleado("Juan", 5000);
		determinarTipo(empleado1);
		Gerente gerente2 = new Gerente("Karla", 10000, "Contabilidad");
		determinarTipo(gerente2);

	}
	public static void determinarTipo(Empleado empleado) {
		// Con instanceof estamos preguntado el tipo del objeto

		if (empleado instanceof Gerente) {
			System.out.println("es de tipo gerente");
			// Estamos creando un objeto local para poder modificar atributos
			// del objeto
			Gerente gerente = (Gerente) empleado;
			System.out.println("Gerente =" + gerente.getDepartamento());
			((Gerente) empleado).getDepartamento();
			// se puede convertir de dos maneras
			System.out.println(((Gerente) empleado).getDepartamento());

		} else if (empleado instanceof Empleado) {
			System.out.println("Es de tipo empleado");

		} else if (empleado instanceof Object) {
			System.out.println("Es de tipo objeto");
		}

	}
}
