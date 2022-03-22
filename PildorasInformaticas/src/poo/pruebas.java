package poo;

public class pruebas {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		// creamos objetos de la clase Empleados

		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("ana");
		Empleados trabajador3 = new Empleados("antonio");
		Empleados trabajador4 = new Empleados("maria");
		// vamos a cambiar seccion atraves del setter
		trabajador1.cambiaSeccion("RRHH");
		trabajador1.cambiaNombre("maria");
		// vamos a sacar los datos con el getter
		System.out.println(trabajador1.devuleveDatos());
		System.out.println(trabajador2.devuleveDatos());
		System.out.println(trabajador3.devuleveDatos());
		System.out.println(trabajador4.devuleveDatos());

	}

}

//creamos una clase 
class Empleados {
	// creamos el contructor
	public Empleados(String nom) {

		nombre = nom;
		seccion = "administracion";
		// de esta manera vamos a incrementar el valor de ID
		Id = IdSiguiente;
		IdSiguiente++;

	}

	// construimos shetter
	public void cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}

	// construimos un setter
	public void cambiaNombre(String nombre) {
		this.nombre = nombre;
	}

	// construimos getter
	public String devuleveDatos() {
		return "el nombre es: " + nombre + " la seccion es " + seccion + "y el id es =" + Id;
	}

	// cremaos los atributos
	// con "final" no podemos modificar la varibale
	private String nombre;
	// private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;

}