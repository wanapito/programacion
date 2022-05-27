package Test.clasesGenericas;

import dominio.ClasesGenericas.claseGenerica;

public class testGenericas {
	public static void main(String[] args) {
		// en donde pone T definimos que tipo sera el objeto
		// en este caso es un int
		claseGenerica<Integer> objetoInt = new claseGenerica<Integer>(15);
		// de esta manera sabemos de que tipo es el objeto
		objetoInt.obtenerTipo();
		claseGenerica<String> objetoString = new claseGenerica<String>("juan");
		objetoString.obtenerTipo();

	}
}
