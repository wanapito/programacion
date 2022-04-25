
package Examen.Baneuro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Baneuro {
	static String rutaFichero = "cuentas.dat";
	static String rutaFicheroTexto = "cuentas.txt";
	static ArrayList<Cuenta> arrayCuentas = null;
	static String listado = "";

	public static void main(String[] args) {

		leerArchivoBinario();
		if (!arrayCuentas.isEmpty()) {
			salvarNumeroCuenta();
		}

		int opcionMenu = menu();

		while (opcionMenu != 6) {
			switch (opcionMenu) {
				case 1 :
					nuevaCuenta();
					break;
				case 2 :
					ingresar();
					break;
				case 3 :
					reintegro();
					break;
				case 4 :
					listar();
					break;
				case 5 :
					exportarCuentas();
					break;
			}
			opcionMenu = menu();
		}
		escribirArchivoBinario();
	}

	private static void leerArchivoBinario() {
		File fichero = new File(rutaFichero);
		if (fichero.exists()) {
			ObjectInputStream objInputStream = null;
			try {
				objInputStream = new ObjectInputStream(
						new FileInputStream(fichero));
				arrayCuentas = (ArrayList<Cuenta>) objInputStream.readObject();
			} catch (IOException e) {
				System.err.println("Error abriendo el fichero");
			} catch (ClassNotFoundException e) {
				System.err.println("Formato incorrecto de fichero");
			} finally {
				try {
					if (objInputStream != null)
						objInputStream.close();
				} catch (IOException e) {
					System.err.println("Error cerrando el fichero");
				}
			}
		} else {
			arrayCuentas = new ArrayList<Cuenta>();
		}

	}

	private static void escribirArchivoBinario() {
		File fichero = new File(rutaFichero);
		ObjectOutputStream objOutputStream = null;
		try {
			objOutputStream = new ObjectOutputStream(
					new FileOutputStream(fichero));
			objOutputStream.writeObject(arrayCuentas);
		} catch (IOException e) {
			System.err.println("Error en la escritura del fichero");
		} finally {
			try {
				if (objOutputStream != null)
					objOutputStream.close();
			} catch (IOException e) {
				System.err.println("Error cerrando el fichero");
			}
		}
	}

	private static int menu() {
		String textoMenu = "" + "1. Nueva cuenta \n" + "2. Ingresar \n"
				+ "3. Reintegro \n" + "4. Lista \n" + "5. Exportar cuentas \n"
				+ "6. Salir \n";
		int opcionSeleccionada = 0;
		opcionSeleccionada = Teclado.leerEntero(textoMenu, 1, 6);
		return opcionSeleccionada;
	}

	private static void nuevaCuenta() {
		String entidad;
		String oficina;
		String tipoCuenta = "";
		String nombre;
		String apellidos;
		double saldo;
		boolean validarTipoCuenta = false;

		entidad = Teclado.leerTexto("Introduce numero de entidad, 4 digitos");
		oficina = Teclado.leerTexto("Introduce numero de oficina, 4 digitos");

		while (!validarTipoCuenta) {
			tipoCuenta = Teclado.leerTexto(
					"Introduce 'c' para crear una cuenta corriente o 'a' para crear una cuenta de ahorro");
			if (tipoCuenta.equalsIgnoreCase("c")
					|| tipoCuenta.equalsIgnoreCase("a")) {
				validarTipoCuenta = true;
			}
		}
		// do{
		// tipoCuenta = Teclado.leerTexto("Introduce 'c' para crear una cuenta
		// corriente o 'a' para crear una cuenta de ahorro");
		// }while(tipoCuenta.equalsIgnoreCase("c") ||
		// tipoCuenta.equalsIgnoreCase("a"));

		nombre = Teclado.leerTexto("Introduce tu nombre");
		apellidos = Teclado.leerTexto("Introduce tus apellidos");
		saldo = Teclado.leerDouble("Introduce saldo incial");

		Cuenta cuentaCreada;
		if (tipoCuenta.equalsIgnoreCase("c")) {
			cuentaCreada = new CuentaCorriente(new CCC(entidad, oficina),
					nombre, apellidos, saldo);
			arrayCuentas.add(cuentaCreada);
		} else if (tipoCuenta.equalsIgnoreCase("a")) {
			cuentaCreada = new CuentaAhorro(new CCC(entidad, oficina), nombre,
					apellidos, saldo);
			arrayCuentas.add(cuentaCreada);
		}
	}

	private static void ingresar() {
		String numeroCuentaIngresado;
		// boolean cuentaCorrecta = false;
		double ingreso = 0;
		numeroCuentaIngresado = Teclado.leerTexto(
				"Introduce el numero de cuenta en el que realizar el ingreso");
		for (int i = 0; i < arrayCuentas.size(); i++) {
			System.out.println(arrayCuentas.get(i).getNumeroCuentaCCC()
					.toStringCCCSinEspacios().equals(numeroCuentaIngresado));

			if (arrayCuentas.get(i).getNumeroCuentaCCC()
					.toStringCCCSinEspacios().equals(numeroCuentaIngresado)) {
				System.out.println("Cuenta correcta");
				ingreso = Teclado.leerDouble("Introduce el saldo a ingresar");
				arrayCuentas.get(i).ingresarSaldo(ingreso);
				break;
			}
		}

	}

	private static void reintegro() {
		String numeroCuentaIngresado;
		// boolean cuentaCorrecta = false;
		double retirado = 0;
		numeroCuentaIngresado = Teclado.leerTexto(
				"Introduce el numero de cuenta en el que realizar el ingreso");
		for (int i = 0; i < arrayCuentas.size(); i++) {
			if (arrayCuentas.get(i).getNumeroCuentaCCC()
					.toStringCCCSinEspacios().equals(numeroCuentaIngresado)) {
				System.out.println("Cuenta correcta");
				do {
					retirado = Teclado
							.leerDouble("Introduce el saldo a retirar");
				} while (retirado <= 0
						|| arrayCuentas.get(i).getSaldo() < retirado);
				arrayCuentas.get(i).retirarEfectivo(retirado);
				break;
			}
		}
	}

	private static void listar() {

		for (int i = 0; i < arrayCuentas.size(); i++) {
			listado += "Cuenta: " + i + "\n";
			listado += "CCC: "
					+ arrayCuentas.get(i).getNumeroCuentaCCC().toStringCCC()
					+ "\n";
			listado += "Nombre: " + arrayCuentas.get(i).getNombre() + "\n";
			listado += "Apellidos: " + arrayCuentas.get(i).getApellidos()
					+ "\n";
			listado += "Saldo: " + arrayCuentas.get(i).getSaldo() + "\n";
			System.out.println("Cuenta: " + i);
			System.out.println("CCC: "
					+ arrayCuentas.get(i).getNumeroCuentaCCC().toStringCCC());
			System.out.println("Nombre: " + arrayCuentas.get(i).getNombre());
			System.out.println(
					"Apellidos: " + arrayCuentas.get(i).getApellidos());
			System.out.println("Saldo: " + arrayCuentas.get(i).getSaldo());
			if (arrayCuentas.get(i) instanceof CuentaAhorro) {
				listado += "Interes: " + arrayCuentas.get(i).getInteres()
						+ "\n";
				System.out.println(
						"Interes: " + arrayCuentas.get(i).getInteres());
			}
		}
	}

	private static void exportarCuentas() {
		File ficheroTexto = new File(rutaFicheroTexto);
		BufferedWriter buffWriter = null;
		try {
			buffWriter = new BufferedWriter(new FileWriter(ficheroTexto));
			buffWriter.write(listado);
			System.out.println("Fichero creado");

		} catch (IOException e) {
			System.err.println("Error escribiendo el fichero " + rutaFichero);
		} finally {
			try {
				if (buffWriter != null)
					buffWriter.close();
			} catch (IOException e) {
				System.err.println("Error cerrando el fichero.");
			}
		}
	}

	private static void salvarNumeroCuenta() {

		CCC.setContador(
				Integer.parseInt(arrayCuentas.get(arrayCuentas.size() - 1)
						.getNumeroCuentaCCC().getNumeroCuenta()));
	}

}