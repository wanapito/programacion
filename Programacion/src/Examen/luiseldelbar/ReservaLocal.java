package Examen.luiseldelbar;

public class ReservaLocal extends Reserva {

	private static final double PRECIO = 250;

	public ReservaLocal(int año, int semana, String cliente) {
		super(año, semana, cliente);
	}

	@Override
	public double calcularPrecio() {
		return PRECIO;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + calcularPrecio() + " €";
	}
}
