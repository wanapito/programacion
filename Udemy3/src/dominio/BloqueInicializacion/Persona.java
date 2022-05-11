package dominio.BloqueInicializacion;

public class Persona {
	// Definimos atributos
	private final int idPersona;
	private static int contadorPersona;

	// Bloque de inicializaci�n est�tico
	// Esto hara que la variable est�tica se inicialice
	static {
		System.out.println("Ejecuci�n bloque est�tico");
		++Persona.contadorPersona;
	}
	// { } Se inicializan la variable no est�ticas
	{
		System.out.println("Inicializaci�n de bloque no est�tico");
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
