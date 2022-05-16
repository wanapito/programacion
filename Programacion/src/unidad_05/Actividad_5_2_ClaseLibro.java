package unidad_05;

import java.util.Scanner;

/*
 * Desarrolla una clase denominada Libro con los siguientes datos:
Miembros dato o atributos:
-   Título, autor, código (por ejemplo de tipo numérico), número de ejemplares 
y número de ejemplares prestados.
Nota: en este caso, con respecto al ejercicio anterior,  
consideramos que de un mismo código de libro, puede haber  
más de un ejemplar de libro. Por ello, ya no tiene sentido utilizar 
un boleano, para ver si se ha prestado (ya que tendríamos que tener 
una array de booleanos de préstamos, uno para cada ejemplar) un libro. 
Simplemente llevaremos el control de préstamos de un determinado código 
de libro, mediante una variable numérica que indique el número de libros 
prestados. Cuando todos los libros de un mismo código estén prestados, 
entonces el número de ejemplares y el de ejemplares prestados será el mismo.
Miembros método u operaciones:
-   Dos constructores, uno con argumentos y otro por defecto.
-   Métodos getters y setters
-   Método prestar (devuelve true en caso de préstamo exitoso y false en caso de 
estar ya prestados todos los libros), que actualiza el número de ejemplares prestados.
-   Método devolver (devuelve true en caso de poder devolverse, por estar prestado
 algún libro, y false en caso de no poder devolverse por no estar aún prestado ningún libro), 
 que actualiza el número de ejemplares prestados.
         
Incorpora una clase llamada PruebaLibro, en la que se instancien 2 libros usando los 2 posibles constructores. Para el libro instanciado con el constructor por defecto, incorpora sus atributos, leyéndolos de teclado y usando métodos setters.
Haz pruebas de préstamos y devoluciones de libros.
Muestra los atributos de los libros con métodos getters.


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

		// TODO Esbozo de constructor generado automáticamente
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
