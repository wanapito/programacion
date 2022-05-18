package Test.JavaBeans;

import dominio.JavaBeans.PersonaBean;

public class javaBeans {
	public static void main(String[] args) {
		PersonaBean persona1 = new PersonaBean();
		persona1.setNombre("juan");

		persona1.setApellido("perez");
		System.out.println(persona1);
		System.out.println(persona1.getApellido());
		System.out.println(persona1.getNombre());
	}

}
