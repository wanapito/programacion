import java.util.Scanner;

public class capitulo20_sentencia_control_if {

	public static void main(String[] args) {
		// TODO Esbozo de m?todo generado autom?ticamente
		boolean condicion = false;

//va implicito el ==
		if (condicion) {
			System.out.println("condcion  verdadera");
		}

		else {
			System.out.println("condicon falsa");
		}
		//se inicianlizan la variables 
		var numero=2;
		var numeroTexto="numero deonocido";
		//si
		if (numero==1) {
			numeroTexto="numero uno";
		}
		// si no si
		else if (numero==2){
			numeroTexto="numero dos ";
		}
		//si no si
		else if (numero==3) {
			numeroTexto="numero tres";
		}
		//si no si
		else if (numero==4) {
			numeroTexto="numero cuatro";
		}
		//si no entonces
		else {
			numeroTexto="numero no encontrado";
		}
			System.out.println(numeroTexto);
			Scanner teclado=new Scanner (System.in);
			System.out.println("introduzca una mes");
			// con integer parse int cambiaos el tipo de dato de int a string
			int mes =Integer.parseInt(teclado.next());
			var estacion= "estacion desconocida";
			//concatenamos valores on ||
			//si
			if (mes==1||mes==2||mes==12) {
				estacion = "invierno";
				
			}
			//si no 
			else if (mes==3||mes==4||mes==5) {
				estacion= "primavera";
				
			}//si no 
			else if (mes==6|| mes == 7 ||mes==8) {
				estacion = "verano";
				
			}//si no
			else if (mes==9||mes==10||mes==11) {
				estacion ="oto?o";
				
			}
			else {
				System.out.println("estacion no encontrada");
			}
			System.out.println(estacion);
			teclado.close();
		}
			
			
		
	}


