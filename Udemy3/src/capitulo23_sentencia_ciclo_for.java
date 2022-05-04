
public class capitulo23_sentencia_ciclo_for {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//diclo for (variable;condicion;ciclo){codigo}
//la variable se declaran dentro del ciclo for llamada local
		//seguido condicion 
		//seguido incremento
	//cada ciclo es una iteracion
		for (var contador=0;contador<3;contador++) {
			//establecemos una condicion de que sea par
			if (contador%2==0) {
				//continue se salta la condicion y va a la siguiente iteraccion
			continue;	
			}
			System.out.println("contador "+contador);
			//break rompe el ciclo y solo saca el primer valor que encunetre true en la condicion
			break;
			
		}
	
	}

}
