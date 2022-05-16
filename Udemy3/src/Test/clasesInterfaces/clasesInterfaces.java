package Test.clasesInterfaces;

import dominio.clasesInterfaces.IAccesoDatos;
import dominio.clasesInterfaces.ImplementacionMySql;
import dominio.clasesInterfaces.ImplementacionOracle;

public class clasesInterfaces {
	public static void main(String[] args) {
		// creamos objetos de las classe que se implementan desde interface
		IAccesoDatos datos1 = new ImplementacionMySql();
		datos1.listar();
		imprimir(datos1);
		IAccesoDatos datos2 = new ImplementacionOracle();
		datos2.actualizar();
		imprimir(datos2);
		datos1 = new ImplementacionOracle();
		datos1.listar();
		imprimir(datos1);

	}
	public static void imprimir(IAccesoDatos datos) {
		datos.listar();
	}
}
