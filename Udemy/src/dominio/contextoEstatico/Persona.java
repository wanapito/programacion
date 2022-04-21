package dominio_contextoEstatico;

public class Persona {
	private int idPersona;
	private static int contadorPersonas;
	private String nombre;
	public Persona(String nombre) {
		this.nombre=nombre;
		//Al ser estático no es this.... se llaman al nombre de la clase 
		Persona.contadorPersonas++;
		//Al sumar uno con contador personas el idpersona sumara 1 en valor
		this.idPersona=Persona.contadorPersonas;
		
	}
	//Introducimos getter y setter desde la click derecho 
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public static int getContadorPersonas() {
		return contadorPersonas;
	}
	public static void setContadorPersonas(int contadorPersonas) {
		Persona.contadorPersonas = contadorPersonas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Mensaje por defecto cuando hacemos auto toString
	@Override
	//Método to string desde click derecho
	//No agrega el método estático pero se puede agregar
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", Nombre=" + nombre + "]";
	}
}
