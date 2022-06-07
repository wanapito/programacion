import java.util.ArrayList;

public class pregutaTest extends Test {
	String pregunta;
	ArrayList<respuesta> respuestas = new ArrayList<respuesta>();
	/**
	 * @param NPreguntas
	 * @param fecha
	 * @param pregunta
	 * @param respuestas
	 */
	public pregutaTest(int NPreguntas, String fecha, String pregunta,
			ArrayList<respuesta> respuestas) {
		super(NPreguntas, fecha);
		this.pregunta = pregunta;
		this.respuestas = respuestas;
	}
	/**
	 * @return el pregunta
	 */
	public final String getPregunta() {
		return pregunta;
	}
	/**
	 * @param pregunta
	 *            el pregunta a establecer
	 */
	public final void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	/**
	 * @return el respuestas
	 */
	public final ArrayList<respuesta> getRespuestas() {
		return respuestas;
	}
	/**
	 * @param respuestas
	 *            el respuestas a establecer
	 */
	public final void setRespuestas(ArrayList<respuesta> respuestas) {
		this.respuestas = respuestas;
	}
	@Override
	public String toString() {
		return "pregutaTest [pregunta=" + pregunta + ", respuestas="
				+ respuestas + "]";
	}

}
