package test_operaciones;

import dominio_operaciones.*;

public class PruebaAritmetica {
public static void main(String[] args) {
	//Creamos variable locales solo se podr�n utilizar dentro del m�todo
	int a =10;
	int b=2;
	//Llamamos al m�todo static

mimetodo();
	
	
	//Creamos objeto sin argumentos
	Aritmetica aritmetica1= new Aritmetica();
	System.out.println("Aritmetica1 a "+aritmetica1.a);
	System.out.println("Aritmetica1 b "+aritmetica1.b);
	//Creamos objeto de constructor con argumentos 
	Aritmetica aritmetica2=new Aritmetica(5, 8);
	System.out.println("Aritmetica2 a "+aritmetica2.a);
	System.out.println("Aritmetica2 b "+aritmetica2.b);
	//Se llama al contenedor de basura para borrar la memoria 
	//system.gc
	
	//Modificamos atributos 
	aritmetica1.a=3;
	aritmetica1.b=2;
	//Lamamos m�todo
	aritmetica1.sumar();
	//Definimos variable con un m�todo 
	int resultado=aritmetica1.sumarConRetorno();
	System.out.println("Resultado desde clase prueba "+resultado);
	//Llamamos m�todos y definimos los par�metros del argumento
	resultado=aritmetica1.sumarArgumetos(5, 8);
	System.out.println("Resultado usando argumentos "+resultado);

}
//Creamos un m�todo este m�todo debe ser static para poder estar en en el m�todo main 
public static void mimetodo() {
	System.out.println("Otro m�todo");
}
}
