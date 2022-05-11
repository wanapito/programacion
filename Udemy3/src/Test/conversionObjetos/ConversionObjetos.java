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
		((Escritor) empleado).getTipoEscritura();
	}

}
