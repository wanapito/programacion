public class respuesta {
	String texto;
	boolean correcto;

	/**
	 * @param texto
	 * @param correcto
	 */
	public respuesta(String texto, boolean correcto) {
		super();
		this.texto = texto;
		this.correcto = correcto;
	}

	/**
	 * @return el texto
	 */
	public final String getTexto() {
		return texto;
	}

	/**
	 * @param texto
	 *            el texto a establecer
	 */
	public final void setTexto(String texto) {
		this.texto = texto;
	}

	/**
	 * @return el correcto
	 */
	public final boolean isCorrecto() {
		return correcto;
	}

	/**
	 * @param correcto
	 *            el correcto a establecer
	 */
	public final void setCorrecto(boolean correcto) {
		this.correcto = correcto;
	}

}
