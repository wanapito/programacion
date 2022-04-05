package operaciones;

public class PruebaAritmetica {
public static void main(String[] args) {
	//creamos varibale locales solo se podran utilizar dentro del metodo
	int a =10;
	int b=2;
	//llamamos al metodo estatic
mimetodo();
	
	
	//creamos objeto sin argumentos
	Aritmetica aritmetica1= new Aritmetica();
	System.out.println("aritmetica1 a "+aritmetica1.a);
	System.out.println("aritmetica1 b "+aritmetica1.b);
	//creamos obejeto de constructor con argumentos 
	Aritmetica aritmetica2=new Aritmetica(5, 8);
	System.out.println("aritmetica2 a "+aritmetica2.a);
	System.out.println("aritmetica2 b "+aritmetica2.b);
	//se llama al contenendor de basura para borrar la memoria 
	//system.gc
	
	//modificamos atributos 
	aritmetica1.a=3;
	aritmetica1.b=2;
	//lamamos metodo
	aritmetica1.sumar();
	//definimos varibale con un metodo 
	int resultado=aritmetica1.sumarConRetorno();
	System.out.println("resultado desde clase prueba "+resultado);
	//llamamos metodos y definimos los parametos del argumento
	resultado=aritmetica1.sumarArgumetos(5, 8);
	System.out.println("resultado usando argumetos "+resultado);

}
//creamos un metodo este metodo debe ser static para poder estar en en el metodo main 
public static void mimetodo() {
	System.out.println("otro metodo");
}
}
