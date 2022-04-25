
package Examen.Baneuro;

import java.io.Serializable;

/**
 *
 * @author brc-9
 */
public abstract class Cuenta implements Serializable {
	protected CCC numeroCuentaCCC;
	protected String nombre;
	protected String apellidos;
	protected double saldo;
	// Getter y setter
	public CCC getNumeroCuentaCCC() {
		return numeroCuentaCCC;
	}
	public void setNumeroCuentaCCC(CCC numeroCuentaCCC) {
		this.numeroCuentaCCC = numeroCuentaCCC;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Constructor

	public Cuenta(CCC numeroCuentaCCC, String nombre, String apellidos,
			double saldo) {
		this.numeroCuentaCCC = numeroCuentaCCC;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.saldo = saldo;
	}

	public void ingresarSaldo(double ingresoSaldo) {
		saldo += ingresoSaldo;
	}

	public void retirarEfectivo(double retiradaSaldo) {
		saldo -= retiradaSaldo;
	}

	public String mostrarDatosCuenta() {
		return "Cuenta{" + "numeroCuentaCCC=" + numeroCuentaCCC.getCodigoCCC()
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", saldo="
				+ saldo + '}';

	}

	public boolean comprobarCuentasIguales(CCC cuenta1, CCC cuenta2) {
		if (cuenta1.toStringCCCSinEspacios() == cuenta2
				.toStringCCCSinEspacios()) {
			return true;
		}
		return false;
	}

	public int getInteres() {
		return 0;
	}
}
