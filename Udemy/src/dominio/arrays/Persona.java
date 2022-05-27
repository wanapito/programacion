package dominio.arrays;

public class Persona {
	// Creamos clase
	private String nombre;
	// Creamos constructor
	public Persona(String nombre) {
		this.nombre = nombre;
	}
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
	// ejecutamos un to string para imprimir los datos
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]" + super.toString();
	}

}
