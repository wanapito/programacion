package Test.modificadoresAcceso;
//Importamos 
import dominio.modificadoresAcceso.Clase1;

//Hacemos a hacer una herencia de otra clase con la palabra extendeds
public class ClaseHija extends Clase1 {
	public ClaseHija() {
		// con super llamamos a los atributos de la clase de la que se hereda
		super();
		// llamamos a atributo protegido
		this.atributoProtected = "Modificación atributo protected";
		// imprimimos atributo protegido
		System.out.println("atributo protegido " + this.atributoProtected);
		// llamamos a metodo protegido
		this.metodoProtegido();
	}

}
