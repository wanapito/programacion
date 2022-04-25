package Examen.electrodomesticos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Tienda {// creo que ok

	static ArrayList<Tienda> ventas = null;
	static String nFichero = "ventas.dat";

	public static void leerFicheroBinario() {
		File f = new File(nFichero);
		if (f.exists()) {
			ObjectInputStream ois = null;
			try {
				ois = new ObjectInputStream(new FileInputStream(f));
				ventas = (ArrayList<Tienda>) ois.readObject();
			}

			catch (IOException e) {
				System.err.println("Error abriendo el fichero");
			} catch (ClassNotFoundException e) {
				System.err.println("Formato incorrecto de fichero");
			} finally {
				try {
					if (ois != null)
						ois.close();
				} catch (IOException e) {
					System.err.println("Error cerrando el fichero");
				}
			}
		} else
			ventas = new ArrayList<Tienda>();

	}

	public static void escribirFicheroBinario() {
		File f = new File(nFichero);

		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(ventas);
		}

		catch (IOException e) {
			System.err.println("Error en la escritura del fichero");
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException e) {
				System.err.println("Error cerrando el fichero");
			}
		}
	}

	public static int menu() // ok
	{
		int op = 0;
		Scanner sc = new Scanner(System.in);
		while (op < 1 || op > 6) {
			System.out.println("1. Añadir producto");
			System.out.println("2. Vender producto");
			System.out.println("3. Eliminar producto");
			System.out.println("4. Salir");
			try {
				op = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Escriba un número");
			}
		}
		return op;
	}

	public static int menuTipoProducto() {
		int op = 0;
		Scanner sc = new Scanner(System.in);
		while (op < 1 || op > 2) {
			System.out.println("1. Grandes Electrodomésticos");
			System.out.println("2. Pequeños Electrodomésticos");

			try {
				op = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Escriba un número");
			}
		}
		return op;
	}

	public static void anadirProducto() {
		Scanner sc = new Scanner(System.in);
		int op = menuTipoProducto();
		Tienda t = null;
		System.out.println("Escribe la descripción");
		String d = sc.nextLine();

		switch (op) {
			// case 1: t = new GranElectrodomestico(d); break;
			// case 2: t = new PequeñoElectro(d); break;

		}

		ventas.add((Tienda) t);

	}

	public static void listarVentas() {
		Iterator<Tienda> it = ventas.iterator();
		while (it.hasNext())
			System.out.println(it.next() + "\n");
	}

	public static Tienda buscar(String id) {
		Tienda t = null;
		Iterator<Tienda> it = ventas.iterator();
		while (it.hasNext()) {
			t = it.next();
			// if (t.getId().equals(id))
			return t;
		}
		return t;
	}

	public static void main(String[] args) {
		leerFicheroBinario();

		int op = menu();
		while (op != 4) {
			switch (op) {
				case 1 :
					anadirProducto();
					break;
				// case 2: venderProducto(); break;
				// case 3: EliminarProducto(); break;
			}
			op = menu();
		}
		escribirFicheroBinario();
	}

}
