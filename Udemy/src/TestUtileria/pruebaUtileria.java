package TestUtileria;
 //Importamos los datos de otra clase
import mx.com.globalmentoring.*;
//Importamos un método estático
import static mx.com.globalmentoring.Utileria.imprimir;
public class pruebaUtileria {

public static void main(String[] args) {
	//Importamos la clase que hemos creado en otro paquete 
	Utileria.imprimir("Saludos");
	//Importamos la clase que hemos creado pero la estática
	imprimir("Adiós");
	//Importamos nombre completamente calificado 
	mx.com.globalmentoring.Utileria.imprimir("Adiós");
	
}
}
	


