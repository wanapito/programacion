package dominio.clasesAbstractas;

public class Rectangulo extends figuraGeometrica {

	public Rectangulo(String tipoFigura) {
		super(tipoFigura);
	}
	// cuando se implementa el metodo abstracto ya no se pone abstracr
	public void dibujar() {
		// se imprime el nombre de la clase
		System.out.println("se imprime un " + this.getClass().getSimpleName());

	}
}
