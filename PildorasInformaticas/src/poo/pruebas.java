package poo;

public class pruebas {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		//creamos objetos de la clase Empleados 
		
		Empleados trabajador1=new Empleados("Paco");
		Empleados trabajador2 =new Empleados("ana");
		
		//vamos a cambiar seccion atraves del setter 
		trabajador1.cambiaSeccion("RRHH");
		//vamos a sacar los datos con el getter
		System.out.println(trabajador1.devuleveDatos());
		System.out.println(trabajador2.devuleveDatos());

	}

}

//creamos una clase 
class Empleados {
	//creamos el contructor 
	public Empleados (String nom) {
		nombre =nom;
		seccion ="administracion";
		
	}
	//contruimos shetter 
	public void cambiaSeccion (String seccion) {
		this.seccion=seccion;
	}
	//contruimos getter
	public String devuleveDatos(){
		return "el nombre es: "+  nombre + " y la seccion es "+ seccion;
	}
	//cremaos los atributos
	private String nombre;
	private String seccion;
	
	
	
}