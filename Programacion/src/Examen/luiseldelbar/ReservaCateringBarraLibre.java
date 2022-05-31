package Examen.luiseldelbar;

public class ReservaCateringBarraLibre extends Reserva {

	private int nPersonas;
	private int horas;
	private static final double PRECIO_PERSONA = 25;
	private static final int HORAS_MIN = 2;
	private static final double HORA_ADC = 5;
	private static final double PERSONAS_MIN = 15;
	private static final double PERSONAS_MAX = 30;

	public ReservaCateringBarraLibre(int año, int semana, String cliente,
			int nPersonas, int horas) {
		super(año, semana, cliente);
		this.nPersonas = nPersonas;
		if (horas < 2)
			this.horas = 2;
		else
			this.horas = horas;
	}

	public static boolean esPersonasValido(int nPersonas) {
		return nPersonas >= PERSONAS_MIN && nPersonas <= PERSONAS_MAX;
	}

	@Override
	public double calcularPrecio() {
		return nPersonas * PRECIO_PERSONA
				+ (horas - HORAS_MIN) * HORA_ADC * nPersonas;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + nPersonas + " personas\t" + horas
				+ " horas\t" + calcularPrecio() + " €";

	}

}
