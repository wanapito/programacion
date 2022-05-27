package Test.forEach;

import dominio.forEach.Persona;

public class testForEach {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		// foreach es un bucle for mejorado
		// Definimos array
		int edades[] = {5, 6, 8, 9};
		// Seg�n el tipo de valor de las variables en este caso int
		// recorrera el array autom�ticamente
		for (int edad : edades) {
			System.out.println("edad es " + edad);

		}
		// Vamos a crear un array de tipo persona al que le damos como argumento
		// El nombre
		Persona personas[] = {new Persona("Juan"), new Persona("Karla"),
				new Persona("Agust�n")};
		// Recorremos el array tipo persona
		for (Persona persona : personas) {
			System.out.println("el nombre de la persona es " + persona);

		}
	}
}
