package pasoPorReferencia;



import clases.Persona;

public class PasoPorReferencia {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		//Estamos importando el objeto de otro proyecto 
Persona persona1=new Persona();

//Llamamos al m�todo de otra clase 
persona1.nombre="Juan";
System.out.println("Persona 1 tiene el nombre "+persona1.nombre);
//Llamamos m�todo 
persona1 =cambiarValor(persona1);
System.out.println("Persona 1 cambio nombre "+persona1.nombre);
	}
	//M�todo setter con referencia un objeto
public static Persona cambiarValor(Persona persona) {

	if (persona== null) {
		return null;
		
			}
	persona.nombre="Karla";
	return persona;
}

}
