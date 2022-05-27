package dominio.claseObject;

public class Gerente extends Empleado {
	// al ser tipo private solo se puede leer desde esa clase
	private String departamento;

	public Gerente(String nombre, double sueldo, String departamento) {
		// con super se van a heredar los valores del constcutor padre
		super(nombre, sueldo);
		// TODO Esbozo de constructor generado automáticamente
		// se inicaliza la variable
		this.departamento = departamento;
	}
	// creamos un metodo sobrescrito para poder obtener el metodo desde otra
	// clase
	@Override
	public String getDetalles() {
		// TODO Esbozo de método generado automáticamente
		// de esta manera accedemos a los detallle s de la clase padre +las
		// clase hija
		return super.getDetalles() + " ,departamentos " + this.departamento;
	}
	/**
	 * @return el departamento
	 */
	public String getDepartamento() {
		return departamento;
	}
	/**
	 * @param departamento
	 *            el departamento a establecer
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
