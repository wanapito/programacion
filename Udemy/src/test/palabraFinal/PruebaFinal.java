package test_palabraFinal;


import dominio_palabraFinal.*;
public class PruebaFinal {
public static void main(String[] args) {
	
	final int miVaribale =10;
	System.out.println("miVariable = "+miVaribale);
	//Al marcar una variable como final ya no se puede modificar 
	//miVaribale=5;
	//Al marcar una variable como final y static ya no se puede modificar 
	//persona.MI_CONSTANTE=5;
	//Pero si se puede imprimir
	System.out.println("Mi constante ="+persona.MI_CONSTANTE);
	//Vamos a crear un objeto de tipo final por lo que solo habrá 1
	final persona persona1 = new persona ();
	//Aunque sea final se pude modificar el valor del objeto 
	persona1.setNombre("Juan");
	System.out.println("El nombre sería="+persona1.getNombre());
	
	
	
}
}
