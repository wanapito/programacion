package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		/*	
		 //creamoa un nuevos objetos los datos del objeto de almacenan en el orden que
		// se dan en la clase recordamos que la fecha mes emieza a contar desde 0


		Empleado empleado1 = new Empleado("paco gomez", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("ana lopez", 95000, 1995, 6, 2);
		Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 3, 15);
		// subimos un 5 por ciento llamamos al setter subesueldo

		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);

		System.out.println("nombre: " + empleado1.dameNombre() + " Sueldo " + empleado1.dameSueldo() + " fecha alta :"
				+ empleado1.dameFechaContrato());
		System.out.println("nombre: " + empleado2.dameNombre() + " Sueldo " + empleado2.dameSueldo() + " fecha alta :"
				+ empleado2.dameFechaContrato());
		System.out.println("nombre: " + empleado3.dameNombre() + " Sueldo " + empleado3.dameSueldo() + " fecha alta :"
				+ empleado3.dameFechaContrato());*/

		Empleado[]misEmpleados=new Empleado[3];
		//estamos haciendo un array  para decir lo mismo que arriba de manera mas resumida 
		misEmpleados[0]=new Empleado("paco gomez", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("ana lopez", 95000, 1995, 6, 2);
		misEmpleados[2]=new Empleado("maria Martin", 105000, 2002, 3, 15);
		//de esta manera subimos el sueldo 
		//for (int i=0;i<3;i++) {
		//	misEmpleados[i].subeSueldo(5);
		//}
		/*
		 * ahora hacemos bucle "for" mejorado
		 */
		for (Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}

		//de esta manera imprimimos los datos del array 

		//	for (int i=0;i<3;i++) {
		//System.out.println("nombre :"+misEmpleados[i].dameNombre()+"sueldo :"+misEmpleados[i].dameSueldo()+"fecha alta :"+misEmpleados[i].dameFechaContrato());
		/*
		 * ahora hacemo un bucle for mejorado para imprimir pantalla donde no temos que identifcar el numero de 
		 * cossa solo pasara por todas la variable hasta que no haya mas o se lo hayamos infdicaco
		 */
		for (Empleado e: misEmpleados) {
			System.out.println("nombre :"+e.dameNombre()+"sueldo :"+e.dameSueldo()+"fecha alta :"+e.dameFechaContrato());

		}

	}

}

class Empleado {

	/*
	 * vamos a crear un constructor
	 */
	public Empleado(String nom, double sue, int año, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		/*
		 * vamos a importar una clase ya hecha en la api para fechas donde le daremos
		 * los datos teniendo en cuenta que los meses se cuentan desde 0 = enero
		 * entonces restamos 1 a lo que usamos habitalmente entonces diciembre es 12-1
		 * osea 11
		 */
		GregorianCalendar calendario = new GregorianCalendar(año, mes - 1, dia);
		// de esta manera se optine ela fecha que le hemos dado
		altaContrato = calendario.getTime();

	}

	// getter
	public String dameNombre() {
		return nombre;

	}

	// getter
	public double dameSueldo() {
		return sueldo;
	}

	// getter
	public Date dameFechaContrato() {
		return altaContrato;

	}

	// setter
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;
}