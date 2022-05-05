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
	// Al ser publico se puede acceder desde cualquier sitio

	public Clase1() {
		System.out.println("Constructor publico");
	}
	// al ser construtos tipo protected no se puede utilzar fuera de esta clase
	protected Clase1(char a) {
		System.out.println("Constructor protected");
	}
	// Al ser publico se puede acceder desde cualquier sitio
	public void metodoPublico() {
		System.out.println("metodo publico");
	}
	// al ser un metodo de clase protected no se puede utilzar fuera de la clase
	protected void metodoProtegido() {
		System.out.println("metodo protected");
	}

}
