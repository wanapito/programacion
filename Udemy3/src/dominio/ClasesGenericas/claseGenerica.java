package dominio.ClasesGenericas;
//con T decimos que es tipo generico 
public class claseGenerica<T> {
	T objeto;
	// creamos constructo generico
	public claseGenerica(T objeto) {
		this.objeto = objeto;
	}
	// creamos metodo generico
	public void obtenerTipo() {
		// con getclass.getsimplename sabemos a que clase pertenece
		System.out
				.println("el tipo T es :" + objeto.getClass().getSimpleName());
	}
}
