package dominio.Manejoexcepciones;

public class operacionExcepcion extends RuntimeException {
	public operacionExcepcion(String mensaje) {
		super(mensaje);
	}

}
