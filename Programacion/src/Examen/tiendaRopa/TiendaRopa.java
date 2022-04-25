/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.tiendaRopa;

import static Examen.tiendaRopa.iDevolucion.diasDevolucion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author brc-9
 */
public class TiendaRopa {

	static String rutaFichero = "articulos.dat";
	static ArrayList<Articulos> listaArticulos = null;

	public static void main(String[] args) {
		leerArchivoBinario();

		int opcionMenu = menu();

		while (opcionMenu != 4) {
			switch (opcionMenu) {
				case 1 :
					anadirArticulo();
					break;
				case 2 :
					comprarArticulo();
					break;
				case 3 :
					devolverArticulo();
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
				listaArticulos = (ArrayList<Articulos>) objInputStream
						.readObject();
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
			listaArticulos = new ArrayList<Articulos>();
		}

	}

	private static void escribirArchivoBinario() {
		File fichero = new File(rutaFichero);
		ObjectOutputStream objOutputStream = null;
		try {
			objOutputStream = new ObjectOutputStream(
					new FileOutputStream(fichero));
			objOutputStream.writeObject(listaArticulos);
		} catch (IOException e) {
			System.err.println("Error en la escritura el fichero");
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
		int opcionSeleccionada;
		String textoMenu = "1. Añadir \n" + "2. Comprar \n" + "3. Devolver \n"
				+ "4. Salir";
		opcionSeleccionada = Teclado.leerInt(textoMenu, 0, 4);
		return opcionSeleccionada;
	}

	private static void anadirArticulo() {
		String tipoArticulo = "";
		String referencia = "";
		boolean referenciaValida = false;
		boolean referenciaNoExiste = false;
		while (!referenciaValida) {
			referencia = Teclado.leerTexto(
					"Introduce una referencia valida, 8 digitos consecutivos");
			if (Referencia.comprobarReferencia(referencia)) {
				referenciaValida = true;
			}
		}

		for (int i = 0; i < listaArticulos.size(); i++) {
			if (listaArticulos.get(i).getReferencia().getReferencia()
					.equals(referencia)) {
				int cantidadArticulos;
				System.out.println("Referencia encontrada.");
				cantidadArticulos = Teclado.leerInt(
						"Indica la cantidad de articulos que quieres añadir");
				listaArticulos.get(i).amumentarCantidad(cantidadArticulos);
				break;
			} else {
				System.out.println(
						"Referencia no encontrada, creamos un articulo");
				referenciaNoExiste = true;
			}
		}

		if (referenciaNoExiste || listaArticulos.isEmpty()) {
			Articulos nuevoArticulo = null;
			String talla;
			String descripcion;
			boolean ropaInterior;
			int cantidad;
			double precio;
			boolean tipoArticuloCorrecto = false;
			while (!tipoArticuloCorrecto) {
				tipoArticulo = Teclado
						.leerTexto("Indica el tipo de articulo: \n "
								+ "'p' si es una prenda de vestir \n "
								+ "'a' si es un accesorio");
				if (tipoArticulo.equalsIgnoreCase("p")) {
					tipoArticuloCorrecto = true;
				} else if (tipoArticulo.equalsIgnoreCase("a")) {
					tipoArticuloCorrecto = true;
				} else {
					System.err.println("Incorrecto");
				}
			}

			descripcion = Teclado.leerTexto("Introduce la descripcion");
			cantidad = Teclado.leerInt("Introduce cantidad");
			precio = Teclado.leerDouble("Introduce el precio");
			if (tipoArticulo.equalsIgnoreCase("p")) {
				do {
					talla = Teclado.leerTexto("Introduce la talla");
				} while (!PrendaVestir.comprobarTalla(talla));
				do {
					ropaInterior = Teclado
							.leerSiNo("Es ropa interior: Si / No");
				} while (!PrendaVestir.comprobarTalla(talla));
				nuevoArticulo = new PrendaVestir(talla, referencia, descripcion,
						cantidad, precio, ropaInterior);
				listaArticulos.add(nuevoArticulo);
			} else if (tipoArticulo.equalsIgnoreCase("a")) {
				nuevoArticulo = new Accesorios(referencia, descripcion,
						cantidad, precio);
				listaArticulos.add(nuevoArticulo);
			}
		}
	}

	private static void comprarArticulo() {
		System.out.println(listarArticulos());
		String referencia;
		boolean referenciaValida = false;
		while (!referenciaValida) {
			referencia = Teclado.leerTexto(
					"Introduce una referencia valida, 8 digitos consecutivos");
			if (Referencia.comprobarReferencia(referencia)) {
				//
				for (int i = 0; i < listaArticulos.size(); i++) {
					if (listaArticulos.get(i).getReferencia().getReferencia()
							.equals(referencia)) {
						int cantidadArticulos;
						System.out.println("Referencia encontrada.");
						cantidadArticulos = Teclado.leerInt(
								"Indica la cantidad de articulos que quieres comprar");
						listaArticulos.get(i)
								.decrementarCantidad(cantidadArticulos);
						referenciaValida = true;
						break;
					} else {
						System.out.println("Referencia no encontrada.");
					}
				}
			}
		}
	}

	private static void devolverArticulo() {
		String referencia;
		boolean referenciaValida = false;
		while (!referenciaValida) {
			referencia = Teclado.leerTexto(
					"Introduce una referencia valida, 8 digitos consecutivos");
			if (Referencia.comprobarReferencia(referencia)) {
				for (int i = 0; i < listaArticulos.size(); i++) {
					if (listaArticulos.get(i).getReferencia().getReferencia()
							.equals(referencia)) {
						double diasTranscurridos;
						System.out.println("Referencia encontrada.");
						diasTranscurridos = Teclado.leerDouble(
								"Indica la cantidad de dias transcurridos");
						if (diasTranscurridos > diasDevolucion) {
							System.out.println(
									"Se ha superado el plazo de devolucion");
							referenciaValida = true;
							break;
						} else {
							System.out.println("Importe de devolucion: "
									+ listaArticulos.get(i)
											.devolver(diasTranscurridos));
							listaArticulos.get(i).decrementarCantidad(1);
							System.out.println("Cantidad actual:"
									+ listaArticulos.get(i).getCantidad());
							referenciaValida = true;
							break;
						}
					}

				}

			}
		}
	}

	private static String listarArticulos() {
		String listaArt = "";
		for (int i = 0; i < listaArticulos.size(); i++) {
			listaArt += "************************ \n" + "Referencia: "
					+ listaArticulos.get(i).getReferencia()
							.getReferenciaConFormato()
					+ "\n" + "Descripcion: "
					+ listaArticulos.get(i).getDescripcion() + "\n"
					+ "Cantidad: " + listaArticulos.get(i).getCantidad() + "\n"
					+ "Precio: " + listaArticulos.get(i).getPrecio() + "\n";
		}
		return listaArt;
	}

}
