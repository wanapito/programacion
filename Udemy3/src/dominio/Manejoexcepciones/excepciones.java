package dominio.Manejoexcepciones;
import static dominio.Manejoexcepciones.aritmetica.division;
public class excepciones {
	public static void main(String[] args) {
		int resultado = 0;
		try {
			// se inlcuye lo que causa excepcion
			resultado = division(10, 0);
		} catch (operacionExcepcion e) {
			// TODO: handle exception
			System.out.println("ocurrio un erro de tipo operacion exceptcion");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ocurrio un error de tipo exception");
			// imprime las excepciones en consola
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
		// con finally siempre se ejecuta al terminar try catch
		finally {
			System.out.println("se reviso la division entre cero");
		}
		System.out.println("Resultado " + resultado);
	}

}
