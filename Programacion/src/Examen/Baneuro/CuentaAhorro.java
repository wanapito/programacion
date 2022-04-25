/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.Baneuro;

/**
 *
 * @author brc-9
 */
public class CuentaAhorro extends Cuenta {
	int interes;

	@Override
	public int getInteres() {
		return interes; // To change body of generated methods, choose Tools |
						// Templates.
	}

	public void setInteres(int interes) {
		this.interes = interes;
	}

	public CuentaAhorro(CCC numeroCuentaCCC, String nombre, String apellidos,
			double saldo) {
		super(numeroCuentaCCC, nombre, apellidos, saldo);
		this.interes = calcularInteres();
	}

	@Override
	public void retirarEfectivo(double retiradaSaldo) {
		if (retiradaSaldo % 200 == 0) {
			super.retirarEfectivo(retiradaSaldo);
		} else {
			System.out.println("El saldo no es multiplo de 200. Error.");
		}
	}

	@Override
	public void ingresarSaldo(double ingresoSaldo) {
		if (ingresoSaldo % 50 == 0) {
			super.ingresarSaldo(ingresoSaldo);
		} else {
			System.out.println("El saldo no es multiplo de 50. Error.");
		}
	}

	public int calcularInteres() {
		int saldoCalculado = 0;
		if (saldo < 1000) {
			saldoCalculado = 1;
		} else if (saldo >= 1000 && saldo < 10000) {
			saldoCalculado = 3;
		} else if (saldo >= 10000) {
			saldoCalculado = 5;
		}
		return saldoCalculado;
	}

}
