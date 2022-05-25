package Test.ApiColleciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class testColecciones {

	public static void main(String[] args) {
		List miLista = new ArrayList();
		// se van a añadir en orden tal cual se van a mostrar
		// se pueden añadir cualquier tipo de objeto
		// se pueden duplicar y mantiene orden
		miLista.add("lunes");
		miLista.add(2);
		miLista.add("miercoles");
		miLista.add(4);
		miLista.add("viernes");
		miLista.add(6);
		miLista.add("domingo");
		// bucle for each de tipo obejct llamando elemento (sera cada dia de la
		// semana) de la lista miLista
		for (Object elemento : miLista) {
			System.out.println("elemento =" + elemento);
		}
		// con bucle for each lambda tambien se puede recoorer un arraylist
		miLista.forEach(elemento1 -> {
			System.out.println("elemento1 =" + elemento1);
		});
		imprimir(miLista);
		// lo stipo set no se pueden duplicar elementos no guardan el orden solo
		// en el que se escribe
		Set miSet = new HashSet();
		miSet.add(1);
		miSet.add("martes");
		miSet.add(3);
		miSet.add("jueves");
		miSet.add(5);

		imprimir(miSet);
		// con map es una lista solo que hay que asignar a cada valor una llave
		// o clave
		Map miMapa = new HashMap();
		miMapa.put("valor1", "juan");
		miMapa.put("valor2", "karla");
		miMapa.put("valor3", "rosario");
		// imprimos ubicacion valor1
		String elemento = (String) miMapa.get("valor1");
		System.out.println("elemento" + elemento);
		// imprimos la llaves
		imprimir(miMapa.keySet());
		// imprimimos los valores
		imprimir(miMapa.values());

	}
	// creamos un metodo imprimir que recorra el bucle for
	public static void imprimir(Collection<Object> collection) {
		// for (Object elemento : coleccion) {
		// System.out.println("elemento =" + elemento);
		// }
		collection.forEach(elemento -> {
			System.out.println("elemento=" + elemento);
		});
	}

}
