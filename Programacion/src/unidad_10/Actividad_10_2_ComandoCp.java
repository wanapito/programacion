/*
 * Simular el comando cp de Unix/Linux. Se va a tener que copiar un 
 * Fichero de texto a otro. La Sintaxis seria: java Copiar nomFichTexto1 nomFichTexto2.
 */
package unidad_10;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Actividad_10_2_ComandoCp {

	public static boolean copiarFicheros(String ficheroDestino, String ficheroOrigen){
        File origen = new File(ficheroDestino);
        File destino = new File(ficheroOrigen);
        if (origen.exists()) {
            try {
                InputStream in = new FileInputStream(origen);
                OutputStream out = new FileOutputStream(destino);
                // Usamos un buffer para copiar los ficheros
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                in.close();
                out.close();
                return true;
            } catch (IOException e) {
            	System.out.println("Error E/S");
                e.getMessage();
                return false;
            }
        } else {
            return false;
        }
	}
    public static void main(String args[]) {
        boolean result = copiarFicheros(args[0], args[1]);
        System.out.println(result ? "Fichero copiado" : "No se ha podido copiar");
    }
}
