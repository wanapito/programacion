package palabrathis;

public class Palabrathis {

	public static void main(String[] args) {
	
		// Creamos objeto
		Persona persona =new Persona("Juan" , "Pérez");
		//Imprimimos el objeto y nos dará su ubicación de memoria
System.out.println("Persona ="+persona);
System.out.println("Persona nombre "+persona.nombre);
System.out.println("Persona apellido "+persona.apellido);
	}

}
//Creamos clase 
class Persona {
	String nombre;
	String apellido;
	//Creamos constructor
public Persona(String nombre , String apellido) {
	//Se llama a la clase padre la clase object
	super();
	//Instancia de las variables 
this.nombre=nombre;
this.apellido=apellido;
//Se imprime el objeto ubicado en la memoria
System.out.println("El objeto persona es  "+ this);
new Imprimir().imprimir (this);
}
}
class Imprimir {
	public Imprimir() {
		super();
	}
	public void imprimir (Persona persona) {
		//Imprime ubicación en la memoria
		System.out.println("Persona desde imprimir "+ persona);
		System.out.println("Impresión del objeto actual this "+this);
	}
}