package test_sobrecargametodos;

import dominio_sobrecargametodos.Operaciones;

public class Pruebas_sobrecarga_metodos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//Se crea variable de tipo entero se autoasigan por el método
var resultado1 =Operaciones.sumar(5, 3);
System.out.println("Resultado ="+resultado1);
//Se crea variable de tipo double  se autoasignan por el método
var resultado2=Operaciones.sumar(5.0, 9);
System.out.println("Resultado ="+resultado2);
//Se crea variable de tipo double  se autoasignan por el método
//La variable es tipo long 
var resultado3=Operaciones.sumar(3, 9L);
System.out.println("Resultado ="+resultado3);
	}

}
