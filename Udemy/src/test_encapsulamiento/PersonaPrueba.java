package test_encapsulamiento;
import dominio_encapsulamiento.*;
public class PersonaPrueba {

	public static void main(String[] args) {
		// Creamos objeto tipo persona
Persona persona1 =new Persona("Juan",5000.00, false);
//se llama al método toString
System.out.println("Persona "+ persona1);
//Lamamos a los métodos
persona1.setnombre("Juan Carlos");
//se llama al método toString
System.out.println("Persona "+ persona1);
System.out.println("El nombre es: "+persona1.getNombre());
//Lamamos a los métodos
System.out.println("El sueldo es "+persona1.getSueldo());
//Lamamos a los métodos
System.out.println("Su estado es "+persona1.isElinado());
//Creamos objeto
Persona persona2=new Persona("maria", 3000, true);
System.out.println("El nombre es: "+persona2.getNombre());
System.out.println("El sueldo es "+persona2.getSueldo());
System.out.println("Su estado es "+persona2.isElinado());
//Lamamos a los métodos
persona2.setnombre("Ana");
System.out.println("El nombre es: "+persona2.getNombre());
//Lamamos a los métodos
persona2.setSueldo(2000);
System.out.println("El sueldo es "+persona2.getSueldo());
//Lamamos a los métodos
persona2.setEliminado(false);
System.out.println("Su estado es "+persona2.isElinado());
//Método toString
System.out.println("Persona "+ persona2);

	}

}
