import java.io.Serializable;

public class prueba implements Serializable {
	String fecha;
	public prueba(String fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return el fecha
	 */
	public final String getFecha() {
		return fecha;
	}
	/**
	 * @param fecha
	 *            el fecha a establecer
	 */
	public final void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "prueba [fecha=" + fecha + "]";
	}

}
