package unidad_09;

class pilaDinamica {

	private nodo cima;

	public pilaDinamica() {
		cima = null;
	}

	public boolean vacia() {
		return (cima == null);
	}

	public void insertar(Object obj) {
		nodo nuevo = new nodo(obj, cima);
		cima = nuevo;
	}

	public Object eliminar() {
		try {
			if (vacia())
				throw new pilaVacia();
			else {
				Object aux = cima.inf;
				cima = cima.enlace;
				return aux;
			}
		}

		catch (pilaVacia error) {
			System.out.println("Error pila vacia");
			return null;
		}
	}
}

class pilaVacia extends Exception {
	public pilaVacia() {
		super();
	}
}