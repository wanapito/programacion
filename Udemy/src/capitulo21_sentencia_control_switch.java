import java.util.Scanner;


public class capitulo21_sentencia_control_switch {

	public static void main(String[] args) {
		// TODO Esbozo de m?todo generado autom?ticamente
		//se inicializan la variables 
var numero= 2;
var numeroTexto="valor desconocido";
//en funcion del valor de la variable numero ira al caso concreto y ejecutara el codigo 

switch (numero) {
case 1 :
numeroTexto="numero uno";
//si no se a?ande break seguira analizando el sguiente caso hasta encontrar el break
break ;
case 2 :
	numeroTexto="numero dos";
	break;
case 3:
	numeroTexto="numero tres ";
	break;
case 4 :
	numeroTexto ="numero cuatro";
	break;
	// es opcional 
	//si no encuentra el caso dara este mensaje o codigo 
default :
 numeroTexto="caso no encontrado";
}
System.out.println("el numero texto es "+numeroTexto);
Scanner teclado=new Scanner (System.in);

//convertimos un varible tipo string en una int 
var mes =Integer.parseInt(teclado.next()) ;
var estacion="estacion desconocida";
		switch (mes) {
		//podemos poner varios caso para la ejecucion de un mismo codigo
		case 1 :case 2: case 12:
		estacion = "invierno";
		break ;
		case 3: case 4: case 5: 
			estacion ="primavera";
			break;
		case 6: case 7: case 8:
			estacion ="verano";
			break;
		case 9 : case 10 : case 11:
			estacion = "otonio";
			break;
			
		default :
			System.out.println(estacion);
		}
		System.out.println("la estacion del a?o es "+estacion);
		teclado.close();
	}

}
