package operaciones;

public class Aritmetica {
	//creamos atributos 
int a;
int b;
//contructor vacio
public Aritmetica () {
	System.out.println("ejecuntando constructor vacio");
}
public Aritmetica(int a , int b ) {
	this.a =a;
	this.b=b;
	System.out.println("ejecutando contructor con argumentos ");
}
//definimos metodos
//shetter
public void sumar() {
	int resultado=a+b;
	System.out.println("resutaldo = "+resultado);

}
//getter
public int sumarConRetorno() {
	return a+b ;
}
//creamos metodo
public int sumarArgumetos(int a, int b) {
	//reasignamos los atributos
	//con this estamos definiendo que es un atributo de la clase
	this.a=a;
	this.b=b;
	//llamos al metodo que realamente sea la suma
	return this.a+this.b;
}}

