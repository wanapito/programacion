package unidad_03;

import java.util.Scanner;

/*
 * Escribe una clase Cuenta para representar una cuenta bancaria. 
 * Los datos de la cuenta son: nombre del cliente (String), número 
 * de cuenta (String), tipo de interés (double) y saldo (double).
La clase contendrá los siguientes métodos:
Constructor por defecto
Constructor con todos los parámetros
Constructor copia. (recibe un objeto de la clase cuenta y crea otro
 con los mismos atributos)
Métodos setters/getters para asignar y obtener los datos de la cuenta.
Métodos ingreso y reintegro. Un ingreso consiste en aumentar el saldo 
en la cantidad que se indique. Esa cantidad no puede ser negativa. 
Un reintegro consiste en disminuir el saldo en una cantidad pero 
antes se debe comprobar que hay saldo suficiente. La cantidad no 
puede ser negativa. Los métodos ingreso y reintegro devuelven true 
si la operación se ha podido realizar o false en caso contrario.
Método transferencia que permita pasar dinero de una cuenta a otra 
siempre que en la cuenta de origen haya dinero suficiente para poder 
hacerla. Ejemplo de uso del método transferencia:
cuentaOrigen.transferencia(cuentaDestino, importe);
que indica que queremos hacer una transferencia desde cuentaOrigen a 
cuentaDestino del importe indicado.
 */
public class Actividad_A3_06_Cuentas {
	Scanner teclado = new Scanner(System.in);
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	public Actividad_A3_06_Cuentas() {

	}
	public Actividad_A3_06_Cuentas(String n, String num, double t, double s) {
		this.nombre = n;
		this.numeroCuenta = num;
		this.tipoInteres = t;
		this.saldo = s;
	}
	// contructor copia
	public Actividad_A3_06_Cuentas(Actividad_A3_06_Cuentas c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;

	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre
	 *            el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el ncuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param ncuenta
	 *            el ncuenta a establecer
	 */
	public void setNumeroCuenta(String numero) {
		this.numeroCuenta = numero;
	}
	/**
	 * @return el tinteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * @param tinteres
	 *            el tinteres a establecer
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	/**
	 * @return el saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo
	 *            el saldo a establecer
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean ingreso(double cantidad) {
		if (cantidad >= 0.0) {
			saldo += cantidad;
			System.out.println("La cantidad ha sido ingresada");
			return true;
		} else {
			System.out.println("La cantidad no puede ser negativa");
			return false;
		}

	}
	public boolean reintegro(double cantidad) {
		if (saldo >= cantidad && cantidad >= 0.0) {
			saldo -= cantidad;
			System.out.println("la canridad ha sido retirada");
			return true;
		} else {
			System.out.println("La cantidad no puede ser negativa");
			return false;
		}

	}
	public boolean transferencia(Actividad_A3_06_Cuentas c, double cantidad) {
		// Es lo mismo que poner
		// return reintegro(cantidad) && c.ingreso(cantidad);

		if (reintegro(cantidad)) {
			c.ingreso(cantidad);
			System.out.println("Transferencia recibidad");
			return true;
		} else {
			System.out.println("Transferencia recibida");
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre, numero;
		double tipo, importe;
		// se crea objeto cuenta1 sin parámetros
		// se ejecuta el constructor por defecto
		Actividad_A3_06_Cuentas cuenta1 = new Actividad_A3_06_Cuentas();
		System.out.print("Nombre : ");
		nombre = sc.nextLine();
		System.out.print("Número de cuenta : ");
		numero = sc.nextLine();
		System.out.print("Tipo de interes : ");
		tipo = sc.nextDouble();
		System.out.print("Saldo: ");
		importe = sc.nextDouble();
		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);
		// se crea el objeto cuenta2 con los valores leidos por teclado
		// se ejecuta el constructor con parámetros
		Actividad_A3_06_Cuentas cuenta2 = new Actividad_A3_06_Cuentas(
				"Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
		// se crea cuenta3 como copia de cuenta1
		// se ejecuta el constructor copia
		Actividad_A3_06_Cuentas cuenta3 = new Actividad_A3_06_Cuentas(cuenta1);
		// mostrar los datos de cuenta1
		System.out.println("Datos de la cuenta 1");
		System.out.println("Nombre del titular: " + cuenta1.getNombre());
		System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println();

		// se realiza un ingreso en cuenta1
		cuenta1.ingreso(4000);

		// mostrar el saldo de cuenta1 después del ingreso
		System.out.println("Saldo: " + cuenta1.getSaldo());

		// mostrar los datos de cuenta2
		System.out.println("Datos de la cuenta 2");
		System.out.println("Nombre del titular: " + cuenta2.getNombre());
		System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();

		// mostrar los datos de cuenta3
		System.out.println("Datos de la cuenta 3");
		System.out.println("Nombre del titular: " + cuenta3.getNombre());
		System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();

		// realizar una transferencia de 10€ desde cuenta3 a cuenta2
		cuenta3.transferencia(cuenta2, 10);

		// mostrar el saldo de cuenta2
		System.out.println("Saldo de la cuenta 2");
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();

		// mostrar el saldo de cuenta3
		System.out.println("Saldo de la cuenta 3");
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();
	}
}
