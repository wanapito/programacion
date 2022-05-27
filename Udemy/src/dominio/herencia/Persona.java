package dominio.herencia;

public class Persona {
	// Indicamos variables tipo protected ya que al estar en herencia se
	// Podrán acceder entre ella pero no desde otras clases
	protected String nombre;
	protected char genero;
	protected int edad;
	protected String direccion;

	// Generamos constructor
	public Persona() {

	}

	// Constructor con argumentos
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	// Constructor con argumentos

	public Persona(String nombre, char genero, int edad, String direccion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getGenero() {
		return this.genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", toString()=");
		//con esto estamos llamando a la ubicacion de la memoria 
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}



}
