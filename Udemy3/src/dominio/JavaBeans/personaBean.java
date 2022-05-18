package dominio.JavaBeans;

import java.io.Serializable;

public class PersonaBean implements Serializable {
	// en una clase seriable es obligatorio sea privado
	private String nombre, apellido;
	// es obligatorio tener un contructor vacio
	public PersonaBean() {

	}
	/**
	 * @param nombre
	 * @param apellido
	 */
	public PersonaBean(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
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
	@Override
	public String toString() {
		return "personaBean [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
