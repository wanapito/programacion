package dominio_palabraFinal;

public final class persona {

	// Al se final static se le llamara constante que se indicara en mayusculas
	public final static int MI_CONSTANTE = 1;
	// M�todo de tipo final no se podr� modificar el m�todo
	private String nombre;
	/**
	 * Getter
	 * 
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Setter
	 * 
	 * @param nombre
	 *            El nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public final void imprimir() {
		System.out.println("M�todo imprimir");
	}

}
