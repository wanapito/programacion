package Test.conversionObjetos;

import dominio.conversionObjetos.Empleado;
import dominio.conversionObjetos.Escritor;
import dominio.conversionObjetos.TipoEscritura;

public class ConversionObjetos {

	public static void main(String[] args) {
		// definimos variable tipo objeto
		Empleado empleado;
		empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
		// vamos a ver lo detalles del objeto
		System.out.println("Empleado =" + empleado);
		System.out.println("Empleado =" + empleado.getDetalles());
		// estamos convirtiendo un empleado en ewcritor
		((Escritor) empleado).getTipoEscritura();
		// estamo haciendo lo mismo en dos lineas
		Escritor escritor = (Escritor) empleado;
		escritor.getTipoEscritura();
		// estamos haciendo que el escritor tenga valores de empleado
		Empleado empleado2 = escritor;
		System.out.println("Empleado =" + empleado2.getDetalles());

	}

}
