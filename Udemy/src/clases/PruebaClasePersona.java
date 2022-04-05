package clases;

public class PruebaClasePersona {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//creamos objeto o instancia
Persona persona1 =new Persona();


//modifcamos datos de los atributos
persona1.nombre="juan";
persona1.apellido="ramirez";
//lamamos al metodo que mostrarar los datos que le hemos dado antes 
persona1.desplegarInformacion();
Persona persona2 = new Persona();
//de esa manera sabemos que valor ocupa en la memoria
System.out.println(persona1);
System.out.println(persona2);
//modificamos dato e los atributos
persona2.nombre= "karla";
persona2.apellido="lara";
persona2.desplegarInformacion();
	}}


