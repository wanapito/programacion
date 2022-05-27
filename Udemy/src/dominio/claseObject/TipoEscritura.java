package dominio.claseObject;

public enum TipoEscritura {
	// declaramos los tipos de variable enumerados
	CLASICO("escritura a mano"), MODERNO("escritura digital");
	// declaramos variable
	private final String descripcion;
	// creamos constructor
	private TipoEscritura(String descripcion) {
		this.descripcion = descripcion;
	}
	// creamos metodo
	public String getDescripcion() {
		return this.descripcion;
	}

}
