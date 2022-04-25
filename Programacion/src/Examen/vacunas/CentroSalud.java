package Examen.vacunas;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CentroSalud {

	static String rutaFichero = "centrosalud.dat";
	static ArrayList<Paciente> pacientes = null;

	public static void main(String[] args) {
		leerArchivoBinario();

		int opcionMenu = menu();

		while (opcionMenu != 4) {
			switch (opcionMenu) {
				// Funciones segun la opcion del menu
				case 1 :
					registrarPaciente();
					break;
				case 2 :
					mostrarPacientesCompleta();
					break;
				case 3 :
					mostrarPacientePendiente();
					break;
			}
			opcionMenu = menu();

		}
		escribirArchivoBinario();
	}

	private static void leerArchivoBinario() {
		// Leemos el arhivo binario
		File fichero = new File(rutaFichero);
		if (fichero.exists()) {
			ObjectInputStream objInputStream = null;
			try {
				objInputStream = new ObjectInputStream(
						new FileInputStream(fichero));
				pacientes = (ArrayList<Paciente>) objInputStream.readObject();
			} catch (ClassNotFoundException e) {
				System.err.println("Error abriendo el fichero");
			} catch (IOException e) {
				System.err.println("Formato del fichero incorrecto");
			} finally {
				try {
					if (objInputStream != null)
						objInputStream.close();
				} catch (IOException e) {
					System.err.println("Error cerrando el fichero");
				}

			}
		} else {
			pacientes = new ArrayList<Paciente>();
		}

	}

	private static void escribirArchivoBinario() {
		// Escribimos el archivo binario
		File fichero = new File(rutaFichero);
		ObjectOutputStream objOutputStream = null;
		try {
			objOutputStream = new ObjectOutputStream(
					new FileOutputStream(fichero));
			objOutputStream.writeObject(pacientes);
		} catch (IOException e) {
			System.err.println("Formato del fichero incorrecto");
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
		// Texto y peticion de opcion del menu
		String textoMenu = "*****MENU*****\n" + "1. Registrar pacientes \n"
				+ "2. Mostrar pacientes con dosis completa \n"
				+ "3. Mostrar pacientes pendiente de segunda dosis \n"
				+ "4. Salir \n";
		int opcionMenu = Teclado.leerEntero(textoMenu, 1, 4);
		return opcionMenu;
	}

	private static void registrarPaciente() {
		// Registramos el paciente, pedimos todos los datos, hay 2 funciones al
		// final para validar telefono y fecha
		String nombreApellidos = "";
		nombreApellidos = Teclado.leerTexto("Indica el nombre del paciente");
		String numeroTelefono = "";
		boolean formatoTelefonoCorrecto = false;
		while (!formatoTelefonoCorrecto) {
			numeroTelefono = Teclado
					.leerTexto("Indica el telefono del paciente");
			if (comprobarFormatoTelefono(numeroTelefono)) {
				formatoTelefonoCorrecto = true;
			}
		}
		String fechaPrimeraDosis = "";
		boolean formatoFechaCorrecto = false;
		while (!formatoFechaCorrecto) {
			fechaPrimeraDosis = Teclado.leerTexto(
					"Indica la fecha de la primera dosis (Formato dd/mm/aaaa)");
			if (comprobarFormatoFecha(fechaPrimeraDosis)) {
				formatoFechaCorrecto = true;
			}
		}
		String nombreVacuna = "";
		nombreVacuna = Teclado.leerTexto("Indica el nombre de la vacuna");
		int opcionVacuna = Teclado.leerEntero("Indica tipo de vacuna \n"
				+ "1 = Vacuna Monodosis\n" + "2 = Vacuna Multidosis", 1, 2);
		Paciente nuevoPaciente = null;
		Vacuna nuevaVacuna = null;
		switch (opcionVacuna) {
			case 1 :

				// Vacuna monodosis
				// Si es monodosis instanciamos Vacuna como monodosis
				nuevaVacuna = new VacunaMonodosis(nombreVacuna,
						fechaPrimeraDosis);
				nuevoPaciente = new Paciente(nombreApellidos, numeroTelefono,
						nuevaVacuna);
				pacientes.add(nuevoPaciente);
				break;
			case 2 :
				// Vacuna multidosis
				// Si es multidosis instanciamos Vacuna como multidosis
				int semanasParaSegundaVacuna = Teclado.leerEntero(
						"Indica el numero de semanas para la siguiente dosis");
				nuevaVacuna = new VacunaMultidosis(nombreVacuna,
						fechaPrimeraDosis, semanasParaSegundaVacuna);
				nuevoPaciente = new Paciente(nombreApellidos, numeroTelefono,
						nuevaVacuna);
				pacientes.add(nuevoPaciente);
				break;
		}

	}

	private static void mostrarPacientesCompleta() {
		// Recorremos el Arraylist y mostramos los que tienen pauta completa
		for (Paciente valor : pacientes) {
			if (valor.getVacuna() instanceof VacunaMonodosis) {
				System.out.println(valor.toString());
			} else if (valor.getVacuna() instanceof VacunaMultidosis
					&& ((VacunaMultidosis) valor.getVacuna())
							.comprobarFechaSegundaDos()) {
				String vacunaMultidosis = valor.toString();
				vacunaMultidosis += "\n Tipo de vacuna: Vacuna Multidosis\n"
						+ "Fecha Segunda Dosis: "
						+ ((VacunaMultidosis) valor.getVacuna())
								.getFechaSegundaVacunaString()
						+ "\n-------------------------------";
				System.out.println(vacunaMultidosis);
			}

		}

	}

	private static void mostrarPacientePendiente() {
		// Recorremos el Arraylist y mostramos los que les falta la segunda
		// dosis
		for (Paciente valor : pacientes) {
			if (valor.getVacuna() instanceof VacunaMultidosis
					&& !((VacunaMultidosis) valor.getVacuna())
							.comprobarFechaSegundaDos()) {
				String vacunaMultidosis = valor.toString();
				vacunaMultidosis += "\n Tipo de vacuna: Vacuna Multidosis\n"
						+ "Fecha Segunda Dosis: "
						+ ((VacunaMultidosis) valor.getVacuna())
								.getFechaSegundaVacunaString()
						+ "\n-------------------------------";
				System.out.println(vacunaMultidosis);
			}
		}

	}

	private static boolean comprobarFormatoTelefono(String telefono) {
		if (telefono.matches("[6-7]{1}[0-9]{8}")) {
			System.out.println("Formato telefono correcto");
			return true;
		} else {
			System.err.println("Formato de telefono incorrecto");
		}
		return false;
	}

	private static boolean comprobarFormatoFecha(String fecha) {
		if (fecha.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
			System.out.println("Formato fecha correcto");
			return true;
		} else {
			System.err.println("Formato de fecha incorrecto");
		}
		return false;
	}

}
