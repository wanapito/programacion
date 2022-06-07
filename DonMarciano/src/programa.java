import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class programa {
	Scanner teclado = new Scanner(System.in);
	public static final String FICHERO = "examenes.txt";
	public static ArrayList<prueba> pruebas = new ArrayList<prueba>();
	public static ArrayList<Test> tests = new ArrayList<Test>();
	public static ArrayList<practico> practicos = new ArrayList<practico>();

	public static void añadirTest() {
		Scanner teclado = new Scanner(System.in);
		String fecha = null;
		int NPreguntas = 0;

		System.out.println("introduzca una fecha ");
		fecha = teclado.next();
		System.out.println("introduzca el numero de preguntas");
		NPreguntas = teclado.nextInt();
		pruebas.add(new Test(NPreguntas, fecha));

	}

	public static void añadirExamenPractico() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca una fecha ");
		String fecha = teclado.next();
		System.out.println("introduzca el nombre del fichero");
		String enunciado = teclado.next();

		pruebas.add(new practico(fecha, enunciado));

	}

	public static void MostrarExamenesTipoTest() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca la fecha actual");
		String fecha = teclado.next();

		Iterator<Test> it = Test.Iterator();
		while (it.hasNext()) {
			Test r = it.next();
			if (r instanceof Test)
				System.out.println(r);
		}
	}

	public static void MostrarExamenesPracticos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca la fecha actual");
		String fecha = teclado.next();

		Iterator<practico> it = practico.iterator();
		while (it.hasNext()) {
			practico r = it.next();
			if (r instanceof practico)
				System.out.println(r);
		}
	}

	public static void MostrarExamenesPorFecha() {

	}
	public static void guardarDatos() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FICHERO));
			oos.writeObject(pruebas);
		} catch (IOException e) {
			System.out.println("Error guardando datos");

		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException e) {
				System.out.println("Error cerrando el fichero");
			}
		}

	}
	@SuppressWarnings("unchecked")
	public static void recuperarDatos() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(FICHERO));
			pruebas = (ArrayList<prueba>) ois.readObject();
		} catch (FileNotFoundException e) {

		} catch (ClassNotFoundException e) {
			System.out.println("Error en  datos");
		} catch (IOException e) {
			System.out.println("Error leyendo ");
		} catch (Exception e) {
			System.out.println("Error en  datos");
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {
				System.out.println("Error cerrando ");
			}
		}
	}

	public static int menu() {
		try (Scanner teclado = new Scanner(System.in)) {
			int op = 0;
			while (op < 1 || op > 6) {
				System.out.println("1. Añadir Test ");

				System.out.println("2. Añadir Examen practico");
				System.out.println("3. Mostrar examenes tipo Test");
				System.out.println("4. Mostrar examenes practicos");
				System.out.println("5. Mostrar examenes por fecha ");
				System.out.println("6. Salir");
				op = teclado.nextInt();
			}
			return op;
		}
	}

	public static void main(String[] args) {

		recuperarDatos();
		int op = menu();
		while (op != 5) {
			switch (op) {
				case 1 :
					añadirTest();
					break;
				case 2 :
					añadirExamenPractico();
					break;
				case 3 :
					MostrarExamenesTipoTest();
					break;
				case 4 :
					MostrarExamenesPracticos();
					break;
				case 5 :
					MostrarExamenesPorFecha();
					break;
				case 6 :

					break;

			}
			op = menu();
		}
		guardarDatos();
	}

}