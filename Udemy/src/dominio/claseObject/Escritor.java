package dominio.claseObject;

//creamos clase con herencia de empleado 
public class Escritor extends Empleado {
	// declaramos variable de tipo objeto
	final TipoEscritura tipoEscritura;

	/**
	 * @param nombre
	 * @param sueldo
	 */
	public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
		// con super marcamos la varibales de la clase padre o heredada
		super(nombre, sueldo);
		// inicializamos la variable local
		this.tipoEscritura = tipoEscritura;

	}

	@Override
	public String getDetalles() {

		return super.getDetalles() + ", tipo escritura "
				+ tipoEscritura.getDescripcion();
	}

	@Override
	public String toString() {
		return "Escritor [tipoEscritura=" + tipoEscritura + super.toString();
	}

	/**
	 * @return el tipoEscritura
	 */
	public TipoEscritura getTipoEscritura() {
		return tipoEscritura;
	}

}
