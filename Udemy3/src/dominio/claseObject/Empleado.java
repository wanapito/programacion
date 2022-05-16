package dominio.claseObject;

import java.util.Objects;

public class Empleado {
	// al ser de tipo protected se puede entrar desde clase hija o heredadas
	protected String nombre;
	protected double sueldo;
	/**
	 * @param nombre
	 * @param sueldo
	 */
	public Empleado(String nombre, double sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String getDetalles() {
		return "nombre " + this.nombre + " sueldo " + this.sueldo;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo
	 *            el sueldo a establecer
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	// comprara referencia de cada objeto
	@Override
	public int hashCode() {
		return Objects.hash(nombre, sueldo);
	}
	// compara contenido de objetos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(sueldo) == Double
						.doubleToLongBits(other.sueldo);
	}

}
