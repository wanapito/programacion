package Test.utileria;
import static com.globalmentoring.Utileria.imprimir;

import com.globalmentoring.Utileria;
public class prueba_Utileria {

	public static void main(String[] args) {
		// Importamos la clase que hemos creado en otro paquete
		Utileria.imprimir("Saludos");
		// Importamos la clase que hemos creado pero la estática
		imprimir("Adiós");
		// Importamos nombre completamente calificado
		com.globalmentoring.Utileria.imprimir("Adiós");

	}
}
