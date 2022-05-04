package Test.forEach;

import dominio.forEach.Persona;

public class testForEach {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// foreach es un bucle for mejorado
		// Definimos array
		int edades[] = {5, 6, 8, 9};
		// Según el tipo de valor de las variables en este caso int
		// recorrera el array automáticamente
		for (int edad : edades) {
			System.out.println("edad es " + edad);

		}
		// Vamos a crear un array de tipo persona al que le damos como argumento
		// El nombre
		Persona personas[] = {new Persona("Juan"), new Persona("Karla"),
				new Persona("Agustín")};
		// Recorremos el array tipo persona
		for (Persona persona : personas) {
			System.out.println("el nombre de la persona es " + persona);

		}
	}
}
