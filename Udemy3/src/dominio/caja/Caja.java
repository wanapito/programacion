package dominio.caja;
//Creamos clase 
public class Caja {
	public int ancho;
	public int profundo;
	public int alto;
	// Creamos constructor
	public Caja() {

	}
	// Creamos constructor con argumentos
	public Caja(int ancho, int alto, int profundo) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;

	}
	// Creamos método getter
	public int calculaVolumen() {
		int vol;
		vol = (ancho * alto * profundo);
		return vol;
	}
}
