package dominio.modificadoresAcceso;

public class testmodificadoresAcceso {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// llamamos a metodos y atributos de clase public
		Clase1 clase1 = new Clase1(25);
		System.out.println("Clase 1 " + clase1);
		System.out.println("Clase 1 " + clase1.atributopublico);
		clase1.metodoPublico();
		// la clase hija hereda datos de clase1 tipo protegido para acceder a
		// datos protected es como se hace
		ClaseHija claseHija = new ClaseHija();
		System.out.println("Clase hija " + claseHija);
		Clase1 clase3 = new Clase1(25);
		// llamamos metodos y atributos de tipo default
		System.out.println("Clase 3 " + clase3);
		System.out.println("Clase 3" + clase3.atributoDefault);
		clase3.metododefault();
		// llamaos metodo y atributos tipo private
		Clase1 clase4 = new Clase1(0);
		System.out.println("clase 4 " + clase4);
		System.out.println("clase 4" + clase4.getAtributoprivate());

	}

}
