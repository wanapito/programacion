package dominio.enumeraciones;

public enum Continentes {
	// a la misma enumeración se le puede añadir atributos
	AFRICA(53), // se podrian añadir mas atributos a la enumeracion
	EUROPA(46), ASIA(44), AMERICA(34), OCEANIA(14);
	// Añadimos ; a la enumeración para seguir trabajando en la clase
	private final int paises;

	Continentes(int paises) {
		this.paises = paises;
	}
	public int getPaises() {
		return this.paises;
	}
}
