package dominio.JavaBeans;

import java.io.Serializable;

public class personaBean implements Serializable {
	//en una clase seriable es obligatorio sea privado
	private String nombre,apellido;
	//es obligatorio tener un contructor vacio
public personaBean() {
	
}
	/**
	 * @param nombre
	 * @param apellido
	 */
	public personaBean(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre 
	 * el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido 
	 * el apellido a establecer
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
