package test_sobrecargametodos;

import dominio_sobrecargametodos.Operaciones;

public class Pruebas_sobrecarga_metodos {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		//Se crea variable de tipo entero se autoasigan por el m�todo
var resultado1 =Operaciones.sumar(5, 3);
System.out.println("Resultado ="+resultado1);
//Se crea variable de tipo double  se autoasignan por el m�todo
var resultado2=Operaciones.sumar(5.0, 9);
System.out.println("Resultado ="+resultado2);
//Se crea variable de tipo double  se autoasignan por el m�todo
//La variable es tipo long 
var resultado3=Operaciones.sumar(3, 9L);
System.out.println("Resultado ="+resultado3);
	}

}
