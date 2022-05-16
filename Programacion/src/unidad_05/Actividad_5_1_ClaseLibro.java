package unidad_05;

import java.util.Scanner;

/*
 * Desarrolla una clase denominada Libro con los siguientes datos:
Miembros dato u atributos:
-   Título, autor, código (por ejemplo de tipo numérico) y prestado (booleano).
Miembros método u operaciones:
-   Dos constructores, uno con argumentos y otro por defecto.
-   Métodos getters y setters
-   Método prestar (devuelve true en caso de préstamo exitoso y false en caso de estar ya prestado)
-   Método devolver (devuelve true en caso de poder devolverse, por estar prestado, y false en
 caso de no poder devolverse por no estar aún prestado)
Incorpora una clase llamada PruebaLibro, en la que se instancien 2 libros usando los 2 
posibles constructores. Para el libro instanciado con el constructor por defecto, 
incorpora sus atributos, leyéndolos de teclado y usando métodos setters.
-   Haz pruebas de préstamos y devoluciones de libros.
-   Muestra los atributos de los libros con métodos getters.
 */
public class Actividad_5_1_ClaseLibro {
	private String titulo;
	private String autor;
	private int codigo;
	private boolean prestado;
	/**
	 * @param titulo
	 * @param autor
	 * @param codigo
	 * @param prestado
	 */
	public Actividad_5_1_ClaseLibro(String titulo, String autor, int codigo,
			boolean prestado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.codigo = codigo;
		this.prestado = prestado;
	}
	/**
	 * 
	 */
	public Actividad_5_1_ClaseLibro() {
		super();
		// TODO Esbozo de constructor generado automáticamente
	}
	public boolean prestar() {
		if (prestado == true) {
			System.out.println("no se puede prestar");
			return false;
		}
		System.out.println("se ha prestado");
		return true;

	}

	public boolean devolver() {
		if (prestado == false) {
			System.out.println("ha sido devuelto");
			return true;
		}
		System.out.println("no se puede devolver");
		return false;
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
	 * @return el prestado
	 */
	public boolean isPrestado() {
		return prestado;
	}
	/**
	 * @param prestado
	 *            el prestado a establecer
	 */
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Actividad_5_1_ClaseLibro [titulo=" + titulo + ", autor=" + autor
				+ ", codigo=" + codigo + ", prestado=" + prestado + "]";
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Actividad_5_1_ClaseLibro libro1 = new Actividad_5_1_ClaseLibro();
		System.out.println("introduce el titulo");
		libro1.setAutor(teclado.next());
		System.out.println("introduce el autor");
		libro1.setTitulo(teclado.next());
		System.out.println("introduce el codigo en numeros");
		libro1.setCodigo(teclado.nextInt());
		System.out.println("introduce si esta prestado ");
		libro1.setPrestado(teclado.nextBoolean());
		System.out.println(libro1.toString());

		Actividad_5_1_ClaseLibro libro2 = new Actividad_5_1_ClaseLibro(
				"quijote", "cervantes", 2, false);
		System.out.println(libro2.toString());
		libro2.prestar();
		System.out.println(libro1.isPrestado());
		libro1.devolver();
		System.out.println(libro2.isPrestado());

	}
}
