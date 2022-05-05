package Test.modificadoresAcceso;

import dominio.modificadoresAcceso.Clase1;

public class testmodificadoresAcceso {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Clase1 clase1 = new Clase1();
		System.out.println("Clase 1 " + clase1);
		System.out.println("Clase 1 " + clase1.atributopublico);
		clase1.metodoPublico();
		// la clase hija hereda datos de clase1 tipo protegido
		ClaseHija claseHija = new ClaseHija();
		System.out.println("clase hija " + claseHija);

	}

}
