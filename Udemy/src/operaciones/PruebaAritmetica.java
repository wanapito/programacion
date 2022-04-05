package operaciones;

public class PruebaAritmetica {
public static void main(String[] args) {
	//creamos objeto
	Aritmetica aritmetica1= new Aritmetica();
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
}
