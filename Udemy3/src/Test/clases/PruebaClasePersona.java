package Test.clases;

import dominio.clases.Persona;

public class PruebaClasePersona {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		// Creamos objeto o instancia
		Persona persona1 = new Persona();

		// Modificamos datos de los atributos
		persona1.nombre = "Juan";
		persona1.apellido = "Ramírez";
		// Lamamos al método que mostrara los datos que le hemos dado antes
		persona1.desplegarInformacion();
		Persona persona2 = new Persona();
		// De esa manera sabemos que valor ocupa en la memoria
		System.out.println(persona1);
		System.out.println(persona2);
		// Modificamos dato e los atributos
		persona2.nombre = "Karla";
		persona2.apellido = "Lara";
		persona2.desplegarInformacion();
	}
}
