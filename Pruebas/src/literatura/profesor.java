package literatura;

public class profesor {
	String dni;
	String nombre;
	String apellido;
	String contraseña;
	/**
	 * 
	 */
	public profesor() {
		super();
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param contraseña
	 */
	public profesor(String dni, String nombre, String apellido,
			String contraseña) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contraseña = contraseña;
	}

	/**
	 * @return el dni
	 */
	public final String getDni() {
		return dni;
	}

	/**
	 * @param dni
	 *            el dni a establecer
	 */
	public final void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return el nombre
	 */
	public final String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            el nombre a establecer
	 */
	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el apellido
	 */
	public final String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 *            el apellido a establecer
	 */
	public final void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return el contraseña
	 */
	public final String getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña
	 *            el contraseña a establecer
	 */
	public final void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}
