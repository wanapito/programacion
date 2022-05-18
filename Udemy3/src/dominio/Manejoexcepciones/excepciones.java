package dominio.Manejoexcepciones;
import static dominio.Manejoexcepciones.aritmetica.division;
public class excepciones {
	public static void main(String[] args) {
		int resultado = 0;
		try {
			// se inlcuye lo que causa excepcion
			resultado = division(10, 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ocurrio un error:");
			// imprime las excepciones en consola
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Resultado " + resultado);
	}

}
