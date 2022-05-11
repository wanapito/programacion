package dominio.BloqueInicializacion;

public class Persona {
	// Definimos atributos
	private final int idPersona;
	private static int contadorPersona;

	// Bloque de inicialización estático
	// Esto hara que la variable estática se inicialice
	static {
		System.out.println("Ejecución bloque estático");
		++Persona.contadorPersona;
	}
	// { } Se inicializan la variable no estáticas
	{
		System.out.println("Inicialización de bloque no estático");
		this.idPersona = Persona.contadorPersona++;
	}
	public Persona() {
		System.out.println("ejecucion del constructor");
	}

	/**
	 * @return el idPersona
	 */
	public int getIdPersona() {
		return idPersona;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + "]";
	}

}
