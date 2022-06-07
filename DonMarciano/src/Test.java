import java.util.ArrayList;
import java.util.Iterator;

public class Test extends prueba {
	int NPreguntas;
	ArrayList<String> test = new ArrayList<String>();
	public Test(int NPreguntas, String fecha) {
		super(fecha);

	}
	/**
	 * @return el nPreguntas
	 */
	public final int getNPreguntas() {
		return NPreguntas;
	}
	/**
	 * @param nPreguntas
	 *            el nPreguntas a establecer
	 */
	public final void setNPreguntas(int nPreguntas) {
		NPreguntas = nPreguntas;
	}
	@Override
	public String toString() {
		return "tipoTest [NPreguntas=" + NPreguntas + "]";
	}
	public static Iterator<Test> Iterator() {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

}
