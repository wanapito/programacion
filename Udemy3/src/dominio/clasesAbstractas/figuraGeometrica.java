package dominio.clasesAbstractas;

public abstract class figuraGeometrica {
	protected String tipoFigura;
	protected figuraGeometrica(String tipoFigura) {
		this.tipoFigura = tipoFigura;

	}
	// creamos metodo abstracto
	public abstract void dibujar();
	/**
	 * @return el tipoFigura
	 */
	public String getTipoFigura() {
		return tipoFigura;
	}
	/**
	 * @param tipoFigura
	 *            el tipoFigura a establecer
	 */
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	@Override
	public String toString() {
		return "figuraGeometrica [tipoFigura=" + tipoFigura + "]";
	}

}
