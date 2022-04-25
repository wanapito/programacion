package Examen.QuienNoCorreVuela;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {

	public static String fDatos = "datos.bin";
	public static QuienNoCorreVuela gestor = new QuienNoCorreVuela();

	public static void recuperarDatos() {
		ObjectInputStream ois = null;
		File f = new File(fDatos);
		if (f.exists()) {
			try {
				ois = new ObjectInputStream(new FileInputStream(fDatos));
				gestor = (QuienNoCorreVuela) ois.readObject();
			} catch (IOException e) {
				System.err.println("Error leyendo el fichero");
			} catch (ClassNotFoundException e) {
				System.err.println("Error leyendo los datos");
			} finally {
				try {
					if (ois != null)
						ois.close();

				} catch (IOException e) {
					System.err.println("Error cerrando el fichero");
				}
			}

		} else {
			gestor.altaAdmin();
			System.out.println("Ahora debe escribir su usuario y contraseña");
		}
		gestor.cambiarUsuario();
		gestor.menu();
	}

	public static void guardarDatos() {
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream(fDatos));
			oos.writeObject(gestor);
		} catch (IOException e) {
			System.err.println("Error escribiendo en el fichero");
		}

		finally {
			try {
				if (oos != null)
					oos.close();

			} catch (IOException e) {
				System.err.println("Error cerrando el fichero");
			}
		}

	}

	public static void main(String[] args) {

		recuperarDatos();
		guardarDatos();

	}

}
