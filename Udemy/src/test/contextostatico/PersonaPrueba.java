package test.contextostatico;
import dominio.contextoEstatico.*;
//Creamos clase
public class PersonaPrueba {
	//Creamos variable clase
private int contador;
//Creamos m�todo main 
	public static void main(String[] args) {
		Persona persona1 = new Persona("Juan");
		Persona persona2 = new Persona("Karla");
		//Utilizamos m�todo imprimir que debe ser est�tico
		imprimir (persona1);
		imprimir(persona2);

	}
	//Tenemos que crear un m�todo est�tico para acceder a los datos 
public static void imprimir(Persona persona) {
	System.out.println("Persona "+persona);
}
public int getcontador () {
	imprimir(new Persona("Carlos"));
	return this.contador;
}
}
