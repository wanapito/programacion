package test.herencia;


import java.util.Date;

import dominio.herencia.cliente;
import dominio.herencia.empleado;

public class TestHerencia {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		empleado empleado1=new empleado("Juan",5000);
		//De manera implícita haciendo esto estamos haciendo un tostring
		System.out.println("Empleado1 "+empleado1);
		//Creamos objeto que contiene dato de la clase padre 
		//Creamos tipo date 
		var fecha =new Date();
		cliente cliente1 =new cliente("Karla", 'f', 28, "Saturno 15", fecha, true);
		//Hacemos un toString
		System.out.println("Cliente1 "+cliente1);
		System.out.println("Cliente1 "+cliente1.toString());

	}

}
