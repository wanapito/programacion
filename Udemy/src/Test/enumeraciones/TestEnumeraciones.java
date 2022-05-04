package Test.enumeraciones;

import dominio.enumeraciones.Continentes;
import dominio.enumeraciones.dias;

public class TestEnumeraciones {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		System.out.println("dia 1 " + dias.LUNES);
		// los valores estan establecidos en una clase enum la cual esta
		// importada en esta clase
		indicarDiaSemana(dias.LUNES);
		System.out.println("continente numero 4 " + Continentes.AMERICA);
		// podemos llamar al metodo que obtendra el atributo de enumerado
		System.out
				.println("numero de paises " + Continentes.AMERICA.getPaises());

	}
	private static void indicarDiaSemana(dias dias) {
		switch (dias) {
			case LUNES :
				System.out.println("primer dia de la semana");
				break;
			case MARTES :
				System.out.println("segundo dia de la semana ");
				break;
			case MIERCOLES :
				System.out.println("tercer dia de la semana");
				break;
			case JUEVES :
				System.out.println("cuarto dia de la semana");
				break;
			case VIERNES :
				System.out.println("quinto dia de la semana ");
				break;
			case SABADO :
				System.out.println("sexto dia de la semana");
				break;
			case DOMINGO :
				System.out.println("septimo dia de la semana");
				break;
			default :
				break;
		}
	}
}
