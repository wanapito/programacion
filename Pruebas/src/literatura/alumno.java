package literatura;

public class alumno {
	String dni;
	String nombre;
	String apellido;
	String contraseña;
	/**
	 * 
	 */
	public alumno() {
		super();
	}
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param contraseña
	 */
	public alumno(String dni, String nombre, String apellido,
			String contraseña) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contraseña = contraseña;
	}

}