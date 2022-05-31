package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		/*
		 * //creamoa un nuevos objetos los datos del objeto de almacenan en el
		 * orden que // se dan en la clase recordamos que la fecha mes emieza a
		 * contar desde 0
		 * 
		 * 
		 * Empleado empleado1 = new Empleado("paco gomez", 85000, 1990, 12, 17);
		 * Empleado empleado2 = new Empleado("ana lopez", 95000, 1995, 6, 2);
		 * Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 3,
		 * 15); // subimos un 5 por ciento llamamos al setter subesueldo
		 * 
		 * empleado1.subeSueldo(5); empleado2.subeSueldo(5);
		 * empleado3.subeSueldo(5);
		 * 
		 * System.out.println("nombre: " + empleado1.dameNombre() + " Sueldo " +
		 * empleado1.dameSueldo() + " fecha alta :" +
		 * empleado1.dameFechaContrato()); System.out.println("nombre: " +
		 * empleado2.dameNombre() + " Sueldo " + empleado2.dameSueldo() +
		 * " fecha alta :" + empleado2.dameFechaContrato());
		 * System.out.println("nombre: " + empleado3.dameNombre() + " Sueldo " +
		 * empleado3.dameSueldo() + " fecha alta :" +
		 * empleado3.dameFechaContrato());
		 */
		Jefatura jefe_RRHH = new Jefatura("juan", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);
		Empleado[] misEmpleados = new Empleado[6];
		// estamos haciendo un array para decir lo mismo que arriba de manera
		// mas resumida
		misEmpleados[0] = new Empleado("paco gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("ana lopez", 95000, 1995, 6, 2);
		misEmpleados[2] = new Empleado("maria Martin", 105000, 2002, 3, 15);
		// en funcion de la cantidad de paramentros que le pidamos ira a un
		// contructor o a otros
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		// esto es un polimorfismo estamos definiendo un jefe como empleado
		misEmpleados[4] = jefe_RRHH;
		misEmpleados[5] = new Jefatura("maria", 95000, 1999, 5, 26);
		/*
		 * asi se hace un casting de tipo es decir cambiar el tipo doubel a
		 * entero double num1 =7.5; int num2 =(int) num1;
		 */
		// de esta manera estamos indicando que el array numero 5 ha pasado a
		// ser jfatura
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
		// por lo que podemos establecer una subida de incentivos ya que el
		// metodo pertence a Jefatura
		jefa_Finanzas.estableceIncentivo(55000);

		// de esta manera subimos el sueldo
		// for (int i=0;i<3;i++) {
		// misEmpleados[i].subeSueldo(5);
		// }
		/*
		 * ahora hacemos bucle "for" mejorado
		 */
		for (Empleado e : misEmpleados) {
			e.subeSueldo(5);
		}

		// de esta manera imprimimos los datos del array

		// for (int i=0;i<3;i++) {
		// System.out.println("nombre :"+misEmpleados[i].dameNombre()+"sueldo
		// :"+misEmpleados[i].dameSueldo()+"fecha alta
		// :"+misEmpleados[i].dameFechaContrato());
		/*
		 * ahora hacemo un bucle for mejorado para imprimir pantalla donde no
		 * temos que identifcar el numero de cossa solo pasara por todas la
		 * variable hasta que no haya mas o se lo hayamos infdicaco
		 */
		for (Empleado e : misEmpleados) {
			System.out.println("nombre: " + e.dameNombre() + "\n sueldo :"
					+ e.dameSueldo() + " fecha alta :" + e.dameFechaContrato());

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
		 * vamos a importar una clase ya hecha en la api para fechas donde le
		 * daremos los datos teniendo en cuenta que los meses se cuentan desde 0
		 * = enero entonces restamos 1 a lo que usamos habitalmente entonces
		 * diciembre es 12-1 osea 11
		 */
		GregorianCalendar calendario = new GregorianCalendar(año, mes - 1, dia);
		// de esta manera se optine ela fecha que le hemos dado
		altaContrato = calendario.getTime();
		++IdSiguiente;
		IdSiguiente = Id;

	}
	// esto es una sobrecarga de constructores puede haber varios
	public Empleado(String nom) {
		// usando this llamamos al otro contructor
		// pero en el caso de usar solo el atriubuto nom usara por defecto los
		// datos que le hemos asignado
		this(nom, 30000, 2000, 01, 01);

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
	// contruimos getter static
	public static String dameIdSiguiente() {
		return "el Id sguiente es : " + IdSiguiente;
	}

	// setter
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
}// vamos a crear una clase que hereda los datos de empleado

class Jefatura extends Empleado {
	// creamos un contructor
	public Jefatura(String nom, double sue, int año, int mes, int dia) {
		// en funcion de la cantidad de parametro que demos a super llamara a un
		// contructor y otro
		super(nom, sue, año, mes, dia);

	}
	public void estableceIncentivo(double b) {
		incentivo = b;
	}
	@Override
	public double dameSueldo() {
		// con este metodo estamos diciendo que llame a la clase padre en su
		// metodo
		double sueldoJefe = super.dameSueldo();

		return sueldoJefe + incentivo;
	}

	private double incentivo;

}
// creamos una clase con herencia que sea final osea que no podar heredar nadie
// mas
final class Director extends Jefatura {
	// creamos contrutor
	public Director(String nom, double sue, int año, int mes, int dia) {
		super(nom, sue, año, mes, dia);
	}

}