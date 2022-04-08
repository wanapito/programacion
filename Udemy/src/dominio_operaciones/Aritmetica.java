package dominio_operaciones;

public class Aritmetica {
	//Creamos atributos 
public int a;
public int b;
//Constructor vacio
public Aritmetica () {
	System.out.println("Ejecutando constructor vaci�");
}
public Aritmetica(int a , int b ) {
	this.a =a;
	this.b=b;
	System.out.println("Ejecutando constructor con argumentos ");
}
//Definimos m�todos
//Setter
public void sumar() {
	int resultado=a+b;
	System.out.println("Resultado = "+resultado);

}
//Getter
public int sumarConRetorno() {
	return a+b ;
}
//Creamos m�todo
public int sumarArgumetos(int a, int b) {
	//Reasignamos los atributos
	//Con this estamos definiendo que es un atributo de la clase
	this.a=a;
	this.b=b;
	//Llamamos al m�todo que realmente sea la suma
	return this.a+this.b;
}}

