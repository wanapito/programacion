package literatura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class trabajos {

	public class crearArchivo {
		public static void main(String[] args) {
			try {
				File myObj = new File("filename.txt");
				if (myObj.createNewFile()) {
					System.out.println("archivo creado: " + myObj.getName());
				} else {
					System.out.println("el archivo esta creado.");
				}
			} catch (IOException e) {
				System.out.println("a ocurrido un error.");
				e.printStackTrace();
			}
		}
	}
	public class escribirArchivo {
		public static void main(String[] args) {
			try {
				FileWriter myWriter = new FileWriter("filename.txt");
				myWriter.write();
				myWriter.close();
				System.out.println("el archivo se ha escrito ");
			} catch (IOException e) {
				System.out.println("a ocurrido un error");
				e.printStackTrace();
			}
		}
	}
	public class leerArchivo {
		public static void main(String[] args) {
			try {
				File myObj = new File("filename.txt");
				Scanner lector = new Scanner(myObj);
				while (lector.hasNextLine()) {
					String data = lector.nextLine();
					System.out.println(data);
				}
				lector.close();
			} catch (FileNotFoundException e) {
				System.out.println("a ocurrido un error.");
				e.printStackTrace();
			}
		}
	}
}
