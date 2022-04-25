import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Loteria {
	static ArrayList<Boleto> boletos = null;
	static String rutaFichero = "loteria.bin";
	
	public static void leerFicheroBinario() {
		File ficheroBinario = new File(rutaFichero);
		if (ficheroBinario.exists()) {
			ObjectInputStream objInputStream = null;
			try {
				objInputStream = new ObjectInputStream(new FileInputStream(ficheroBinario));
				boletos = (ArrayList<Boleto>)objInputStream.readObject();
			}catch(IOException e){
				System.err.println("Error abriendo el fichero");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.err.println("Error insertando dartos en boletos");
			}finally {
				try {
					if(objInputStream != null) {
						objInputStream.close();
					}
				}catch(IOException e) {
					System.err.println("Error cerrando el fichero");
				}
			}
		}else {
			boletos = new ArrayList<Boleto>();
		}
	}
	
	public static void escribirFicheroBinario() {
		File ficheroBinario = new File(rutaFichero);
		ObjectOutputStream objOutputStream = null;
		try {
			objOutputStream = new ObjectOutputStream(new FileOutputStream(ficheroBinario));
			objOutputStream.writeObject(boletos);
		}catch(IOException e){
			System.err.println("Error escribiendo el fichero");
		}finally {
			try {
				if(objOutputStream != null) {
					objOutputStream.close();
				}
			}catch(IOException e) {
				System.err.println("Error cerrando el fichero");
			}
		}
	}
	public static int menu() {
		int opcion = 0;
		boolean correcto = false;
		while (!correcto) {
			System.out.println("Selecciona una opción del menu");
			System.out.println("1. Generar boleto");
			System.out.println("2. Buscar boleto");
			System.out.println("3. Salir");
			
			opcion = Teclado.leerNumero(1, 3);
			correcto = true;
		}
		return opcion;
	}
	
	public static void salir() {
		System.exit(0);
	}
	public static void generarBoleto() {
		int opcionMenuBoleto = menuBoleto();
		String fecha = "";
		Boleto boleto = null;
		switch(opcionMenuBoleto) {
			case 1:
				fecha = Fecha.leerFecha();
				boleto = new Primitiva(fecha);
				System.out.println(boleto.boletoImpreso());
				boletos.add(boleto);
				System.out.println(boleto);
				System.out.println(boleto.getCodigoBoleto());
				System.out.println("¿Quiere generar un fichero de texto con el boleto? (S/N)");
				Teclado.leerSiNo();
				break;
			case 2:
				fecha = Fecha.leerFecha();
				boleto = new Gordo(fecha);
				System.out.println(boleto.boletoImpreso());
				boletos.add(boleto);
				System.out.println("¿Quiere generar un fichero de texto con el boleto? (S/N)");
				Teclado.leerSiNo();
				break;
			case 3:
				fecha = Fecha.leerFecha();
				boleto = new Euromillones(fecha);
				System.out.println(boleto.boletoImpreso());
				boletos.add(boleto);
				System.out.println("¿Quiere generar un fichero de texto con el boleto? (S/N)");
				Teclado.leerSiNo();
				break;
			case 4:
				break;
		}
		
	}
	
	private static int menuBoleto() {
		int opcion = 0;
		boolean correcto = false;
		while (!correcto) {
			System.out.println("1. Primitiva");
			System.out.println("2. El Gordo");
			System.out.println("3. Euromillones");
			System.out.println("4. Volver al menú anterior");
			
			opcion = Teclado.leerNumero(1, 4);
			correcto = true;
		}
		return opcion;
	}

	private static void buscarBoleto() {
		
	}

	public static void main(String[] args) {
		leerFicheroBinario();
	
		for (int i = 0; i < boletos.size(); i++) {
		    System.out.println(boletos.get(boletos.size() - 1).getCodigoBoleto());
		    System.out.println(boletos.get(boletos.size() - 1).getFecha());
		}
		int opcion = menu();
		// boolean completado = false;
		while(opcion != 3) {
			switch(opcion) {
				case 1: 
					generarBoleto(); 
					//completado = true;
					break;
				case 2: 
					buscarBoleto(); 
					//completado = true;
					break;
			}
			
			opcion = menu();
		}
		escribirFicheroBinario();
	}



}
