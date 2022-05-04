package dominio.enumeraciones;

public enum Continentes {
	// a la misma enumeraci�n se le puede a�adir atributos
	AFRICA(53), // se podrian a�adir mas atributos a la enumeracion
	EUROPA(46), ASIA(44), AMERICA(34), OCEANIA(14);
	// A�adimos ; a la enumeraci�n para seguir trabajando en la clase
	private final int paises;

	Continentes(int paises) {
		this.paises = paises;
	}
	public int getPaises() {
		return this.paises;
	}
}
