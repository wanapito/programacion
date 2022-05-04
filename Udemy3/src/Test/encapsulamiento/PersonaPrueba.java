package Test.encapsulamiento;
import dominio.encapsulamiento.Persona;
public class PersonaPrueba {

	public static void main(String[] args) {
		// Creamos objeto tipo persona
		Persona persona1 = new Persona("Juan", 5000.00, false);
		// Se llama al método toString
		System.out.println("Persona " + persona1);
		// Lamamos a los métodos
		persona1.setnombre("Juan Carlos");
		// Se llama al método toString
		System.out.println("Persona " + persona1);
		System.out.println("El nombre es: " + persona1.getNombre());
		// Lamamos a los métodos
		System.out.println("El sueldo es " + persona1.getSueldo());
		// Lamamos a los métodos
		System.out.println("Su estado es " + persona1.isEliminado());
		// Creamos objeto
		Persona persona2 = new Persona("maria", 3000, true);
		System.out.println("El nombre es: " + persona2.getNombre());
		System.out.println("El sueldo es " + persona2.getSueldo());
		System.out.println("Su estado es " + persona2.isEliminado());
		// Lamamos a los métodos
		persona2.setnombre("Ana");
		System.out.println("El nombre es: " + persona2.getNombre());
		// Lamamos a los métodos
		persona2.setSueldo(2000);
		System.out.println("El sueldo es " + persona2.getSueldo());
		// Lamamos a los métodos
		persona2.setEliminado(false);
		System.out.println("Su estado es " + persona2.isEliminado());
		// Método toString
		System.out.println("Persona " + persona2.toString());

	}

}
