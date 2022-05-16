package unidad_05;

import java.util.Scanner;

/*
 * Desarrolla una clase denominada Libro con los siguientes datos:
Miembros dato o atributos:
-   T�tulo, autor, c�digo (por ejemplo de tipo num�rico), n�mero de ejemplares 
y n�mero de ejemplares prestados.
Nota: en este caso, con respecto al ejercicio anterior,  
consideramos que de un mismo c�digo de libro, puede haber  
m�s de un ejemplar de libro. Por ello, ya no tiene sentido utilizar 
un boleano, para ver si se ha prestado (ya que tendr�amos que tener 
una array de booleanos de pr�stamos, uno para cada ejemplar) un libro. 
Simplemente llevaremos el control de pr�stamos de un determinado c�digo 
de libro, mediante una variable num�rica que indique el n�mero de libros 
prestados. Cuando todos los libros de un mismo c�digo est�n prestados, 
entonces el n�mero de ejemplares y el de ejemplares prestados ser� el mismo.
Miembros m�todo u operaciones:
-   Dos constructores, uno con argumentos y otro por defecto.
-   M�todos getters y setters
-   M�todo prestar (devuelve true en caso de pr�stamo exitoso y false en caso de 
estar ya prestados todos los libros), que actualiza el n�mero de ejemplares prestados.
-   M�todo devolver (devuelve true en caso de poder devolverse, por estar prestado
 alg�n libro, y false en caso de no poder devolverse por no estar a�n prestado ning�n libro), 
 que actualiza el n�mero de ejemplares prestados.
         
Incorpora una clase llamada PruebaLibro, en la que se instancien 2 libros usando los 2 posibles constructores. Para el libro instanciado con el constructor por defecto, incorpora sus atributos, ley�ndolos de teclado y usando m�todos setters.
Haz pruebas de pr�stamos y devoluciones de libros.
Muestra los atributos de los libros con m�todos getters.


 */
public class Actividad_5_2_ClaseLibro {
	private String autor;
	private String titulo;
	private int codigo;
	private int NEjmplares = 0;
	private int NEjemplaresPrestados = 0;
	/**
	 * 
	 */
	public Actividad_5_2_ClaseLibro() {
		super();

		// TODO Esbozo de constructor generado autom�ticamente
	}
	/**
	 * @param autor
	 * @param titulo
	 * @param codigo
	 */
	public Actividad_5_2_ClaseLibro(String autor, String titulo, int codigo,
			int NEjmplares) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.codigo = codigo;
		this.NEjmplares = NEjmplares;

	}
	public boolean prestar() {
		if (NEjmplares == 0) {
			System.out.println("no se puede prestar");
			return false;
		}
		NEjmplares--;
		NEjemplaresPrestados++;
		System.out.println("se ha prestado");
		return true;

	}

	public boolean devolver() {
		if (NEjemplaresPrestados != 0) {
			System.out.println("ha sido devuelto");
			NEjmplares++;
			NEjemplaresPrestados--;
			return true;
		}
		System.out.println("no se puede devolver");
		return false;
	}
	/**
	 * @return el autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor
	 *            el autor a establecer
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo
	 *            el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return el codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo
	 *            el codigo a establecer
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return el nEjmplares
	 */
	public int getNEjmplares() {
		return NEjmplares;
	}
	/**
	 * @param nEjmplares
	 *            el nEjmplares a establecer
	 */
	public void setNEjmplares(int nEjmplares) {
		NEjmplares = nEjmplares;
	}
	/**
	 * @return el nEjemplaresPrestados
	 */
	public int getNEjemplaresPrestados() {
		return NEjemplaresPrestados;
	}
	/**
	 * @param nEjemplaresPrestados
	 *            el nEjemplaresPrestados a establecer
	 */
	public void setNEjemplaresPrestados(int nEjemplaresPrestados) {
		NEjemplaresPrestados = nEjemplaresPrestados;
	}

	@Override
	public String toString() {
		return "Actividad_5_2_ClaseLibro [autor=" + autor + ", titulo=" + titulo
				+ ", codigo=" + codigo + ", NEjmplares=" + NEjmplares
				+ ", NEjemplaresPrestados=" + NEjemplaresPrestados + "]";
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Actividad_5_2_ClaseLibro libro1 = new Actividad_5_2_ClaseLibro();
		System.out.println("introduce el titulo");
		libro1.setAutor(teclado.next());
		System.out.println("introduce el autor");
		libro1.setTitulo(teclado.next());
		System.out.println("introduce el codigo en numeros");
		libro1.setCodigo(teclado.nextInt());
		System.out.println("introudce el numero ejemplares ");
		libro1.setNEjmplares(teclado.nextInt());

		Actividad_5_2_ClaseLibro libro2 = new Actividad_5_2_ClaseLibro(
				"quijote", "cervantes", 2, 5);
		System.out.println(libro2.toString());
		libro2.prestar();
		System.out.println("situacion actual libro 2");
		System.out.println("numero ejemplares" + libro2.getNEjmplares());
		System.out.println(
				"numero de prestado" + libro2.getNEjemplaresPrestados());
		System.out.println(libro1.toString());
		libro1.prestar();
		System.out.println("sistuacion actual libro1");
		System.out.println("numero ejemplares" + libro1.getNEjmplares());
		System.out.println(
				"numero de prestado" + libro1.getNEjemplaresPrestados());
		libro2.devolver();
		System.out.println("situacion actual libro 2");
		System.out.println("numero ejemplares" + libro2.getNEjmplares());
		System.out.println(
				"numero de prestado" + libro2.getNEjemplaresPrestados());
		libro1.devolver();
		System.out.println("sistuacion actual libro1");
		System.out.println("numero ejemplares" + libro1.getNEjmplares());
		System.out.println(
				"numero de prestado" + libro1.getNEjemplaresPrestados());

	}

}
