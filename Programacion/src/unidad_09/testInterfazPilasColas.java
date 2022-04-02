package unidad_09;

public class testInterfazPilasColas {
	public static void main(String[] args) {
		colaDinamica cola  = new colaDinamica();
		pilaDinamica pila = new pilaDinamica();
		System.out.println("Cola");
		System.out.println("Esta vacia: " + cola.vacia());
		
		for (int i = 0; i <= 3; i++) {
			cola.insertar(i);
		}
		System.out.println("Esta vacia: " + cola.vacia());
		System.out.println("Indice eliminado: " + cola.eliminar());
		System.out.println("Indice eliminado: " + cola.eliminar());
		System.out.println("Indice eliminado: " + cola.eliminar());
		System.out.println("Indice eliminado: " + cola.eliminar());
		System.out.println("Esta vacia: " + cola.vacia());
		System.out.println("Indice eliminado: " + cola.eliminar());
		System.out.println("Pila");
		System.out.println("Esta vacia: " + pila.vacia());
		
		for (int i = 0; i <= 3; i++) {
			pila.insertar(i);
		}
		System.out.println("Esta vacia: " + pila.vacia());
		System.out.println("Indice eliminado: " + pila.eliminar());
		System.out.println("Indice eliminado: " + pila.eliminar());
		System.out.println("Indice eliminado: " + pila.eliminar());
		System.out.println("Indice eliminado: " + pila.eliminar());
		System.out.println("Esta vacia: " + pila.vacia());
		System.out.println("Indice eliminado: " + pila.eliminar());
			
	}
}


