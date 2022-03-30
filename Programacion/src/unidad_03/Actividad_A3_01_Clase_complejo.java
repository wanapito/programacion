package unidad_03;


	//se construye la clase
	public class Actividad_A3_01_Clase_complejo{
	double real ;
	double imag;
	//se inicializan los atributos
public Actividad_A3_01_Clase_complejo() {
	real=0.0;
	imag=0.0;
	
}
//creamos el constructor
public Actividad_A3_01_Clase_complejo(double real ,double imag) {
	this.imag=imag;
	this.real=real;
}
//getter
public double consulta_Real() {
	return real;
	
}
//getter
public double consulta_Imag() {
	return imag;
	
}
//shetter
public void cambia_Real(double real) {
	this.real=real;
	
}
//shetter
public void cambia_Imag(double imag) {
	this.imag=imag;
	
}
//getter 
public String toString() {
	return "" +real+" + "+imag+" i";
	
	
}
public void sumar (Actividad_A3_01_Clase_complejo b) {
	this.imag+=b.imag;
	this.real+=b.real;
	
}
//vamo a crear un metodo main para probar los metodos escritos antes
public static void main(String[] args) {
	//a no tiene valor por lo que habra qe llamar al shette 
	//b se inicia con valores en ese orden  2 es real y 3 imaginario
	Actividad_A3_01_Clase_complejo a = new Actividad_A3_01_Clase_complejo();
	Actividad_A3_01_Clase_complejo b = new Actividad_A3_01_Clase_complejo(2,3);
//lamamos al shetter 
    a.cambia_Real(4);
    a.cambia_Imag(7);
//llamamos al getter para convetir en string los datos
    System.out.println("Numero complejo a: " + a.toString());
    System.out.println("Numero complejo b: " + b.toString());
//lamamos al shetter sumar
    a.sumar(b);
    System.out.println("Suma a + b: " + a.toString());

}}
