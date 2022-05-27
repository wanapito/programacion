package dominio.modificadoresAcceso;

//Al ser publico se tiene acceso desde cualquier sitio 
public class Clase1 {
	// una clase no puede ser protected
	// protected class CLase1() {

	// Al ser publico se pude acceder desde cualqui sitio
	public String atributopublico = "valor atributo publico";
	// al ser tipo protected no se pude acceder desde cualquier sitio solo desde
	// extends y super()
	protected String atributoProtected = "varlos atributo protected";
	// Al ser default se puede acceder desde cualquier sitio
	String atributoDefault = "valor de atributo default";
	// al ser private no se puede acceder desde otra clase
	private String atributoprivate = "atributo privado ";

	// Al ser publico se pude acceder desde cualqui sitio
	public Clase1(String argumento) {
		this(12);
		System.out.println("Constructor publico");
	}
	// al ser construtos tipo protected no se puede utilzar fuera de esta clase
	protected Clase1(char a) {
		System.out.println("Constructor protected");
	}
	// al ser privado no se puede utilizar fuera desde la clase
	private Clase1(int b) {
		System.out.println("constructor private ");
	}
	// al ser una clase tipo default no hay que especificar nada
	Clase1(long b) {
		System.out.println("Constructor default");
	}
	// Al ser publico se puede acceder desde cualquier sitio
	public void metodoPublico() {
		System.out.println("metodo publico");
	}
	// al ser un metodo de clase protected no se puede utilzar fuera de la clase
	protected void metodoProtegido() {
		System.out.println("metodo protected");
	}
	// al ser un metodo default no hay que especificar el tipo del metodo
	void metododefault() {
		System.out.println("metodo default");
	}
	// al ser pirvado no se puede acceder desde fuera de la clase
	private void metodoPrivado() {
		System.out.println("metodo private ");
	}
	// para modificar el atributo privado
	/**
	 * @return el atributoprivate
	 */
	public String getAtributoprivate() {
		return atributoprivate;
	}
	/**
	 * @param atributoprivate
	 *            el atributoprivate a establecer
	 */
	public void setAtributoprivate(String atributoprivate) {
		this.atributoprivate = atributoprivate;
	}

}
