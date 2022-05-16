package Test.claseObject;

import dominio.claseObject.Empleado;

public class Claseobject {
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("juan", 50000);
		Empleado empleado2 = new Empleado("juan", 50000);
		if (empleado1 == empleado2) {
			System.out.println("tienen la misma referencia de memoria");

		} else {
			System.out.println("tienen distinta referencia de memoria");
		}

		if (empleado1.equals(empleado2)) {
			System.out.println("los sujetos son iguales en contenido");
		} else {
			System.out.println("los obejtos son diferentes en contenido");
		}

		if (empleado1.hashCode() == empleado2.hashCode()) {
			System.out.println("el valor hashcode es igual ");
			System.out.println(empleado1.hashCode());
			System.out.println(empleado2.hashCode());
		} else {
			System.out.println("el valor hash code es distinto");
		}
	}

}
