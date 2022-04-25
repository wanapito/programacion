package examen.tiendaRopa;

import java.io.Serializable;

/**
 *
 * @author brc-9
 */
public class Referencia implements Serializable {

	String referencia;
	String referenciaConFormato;
	static int contador;

	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getReferenciaConFormato() {
		return referenciaConFormato;
	}
	public void setReferenciaConFormato(String referenciaConFormato) {
		this.referenciaConFormato = referenciaConFormato;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Referencia.contador = contador;
	}

	public Referencia(String referencia) {
		this.referencia = referencia;
		this.referenciaConFormato = generarReferenciaConFormato(referencia);
	}

	private String generarReferenciaConFormato(String referencia) {
		String[] referenciaArray = referencia.split("");
		String referenciaConFormato;
		referenciaConFormato = referenciaArray[0] + referenciaArray[1] + "-"
				+ referenciaArray[2] + referenciaArray[3] + referenciaArray[4]
				+ "-" + referenciaArray[5] + referenciaArray[6]
				+ referenciaArray[7];

		return referenciaConFormato;
	}

	static public boolean comprobarReferencia(String referencia) {
		if (referencia.matches("[0-9]{8}")) {
			System.out.println("Referencia correcta");
			return true;
		} else {
			System.out.println("Referencia incorrecta");
			return false;
		}

	}

}
