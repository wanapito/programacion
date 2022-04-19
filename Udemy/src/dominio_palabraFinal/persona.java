package dominio_palabraFinal;

public final class persona {

	//al se final static se le llamara constante que se indicara en mayusculas
	public final static int  MI_CONSTANTE =1;
	//Método de tipo final no se podrá modificar el método 
	private String nombre;
	/**
	 *Getter
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 *Setter
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public final void imprimir () {
		System.out.println("Método imprimir");
	}

}
