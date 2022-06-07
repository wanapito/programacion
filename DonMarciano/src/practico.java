import java.util.ArrayList;
import java.util.Iterator;

public class practico extends prueba {
	String enunciado;
	ArrayList<String> prueba = new ArrayList<String>();

	/**
	 * @param fecha
	 * @param enunciado
	 */
	public practico(String fecha, String enunciado) {
		super(fecha);
		this.enunciado = enunciado;
	}

	/**
	 * @return el enunciado
	 */
	public final String getEnunciado() {
		return enunciado;
	}

	/**
	 * @param enunciado
	 *            el enunciado a establecer
	 */
	public final void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	/**
	 * @return el prueba
	 */
	public final ArrayList<String> getPrueba() {
		return prueba;
	}

	/**
	 * @param prueba
	 *            el prueba a establecer
	 */
	public final void setPrueba(ArrayList<String> prueba) {
		this.prueba = prueba;
	}

	@Override
	public String toString() {
		return "practico [enunciado=" + enunciado + ", prueba=" + prueba + "]";
	}

	public static Iterator<practico> iterator() {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

}
