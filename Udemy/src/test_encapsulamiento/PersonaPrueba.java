package test_encapsulamiento;
import dominio_encapsulamiento.*;
public class PersonaPrueba {

	public static void main(String[] args) {
		// Creamos objeto tipo persona
Persona persona1 =new Persona("Juan",5000.00, false);
//se llama al m�todo toString
System.out.println("Persona "+ persona1);
//Lamamos a los m�todos
persona1.setnombre("Juan Carlos");
//se llama al m�todo toString
System.out.println("Persona "+ persona1);
System.out.println("El nombre es: "+persona1.getNombre());
//Lamamos a los m�todos
System.out.println("El sueldo es "+persona1.getSueldo());
//Lamamos a los m�todos
System.out.println("Su estado es "+persona1.isElinado());
//Creamos objeto
Persona persona2=new Persona("maria", 3000, true);
System.out.println("El nombre es: "+persona2.getNombre());
System.out.println("El sueldo es "+persona2.getSueldo());
System.out.println("Su estado es "+persona2.isElinado());
//Lamamos a los m�todos
persona2.setnombre("Ana");
System.out.println("El nombre es: "+persona2.getNombre());
//Lamamos a los m�todos
persona2.setSueldo(2000);
System.out.println("El sueldo es "+persona2.getSueldo());
//Lamamos a los m�todos
persona2.setEliminado(false);
System.out.println("Su estado es "+persona2.isElinado());
//M�todo toString
System.out.println("Persona "+ persona2);

	}

}
