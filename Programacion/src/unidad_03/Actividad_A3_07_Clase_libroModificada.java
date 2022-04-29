package unidad_03;

import java.util.Scanner;

/*
 * Crea una clase llamada Libro que guarde la informaci�n de cada uno 
 * de los libros de una biblioteca. La clase debe guardar el t�tulo 
 * del libro, autor, n�mero de ejemplares del libro y n�mero de ejemplares prestados.
Adem�s contar� con dos atributos de clase que almacenar�n el n�mero 
total de libros en la biblioteca y el n�mero total de libros prestados 
de la biblioteca
La clase contendr� los siguientes m�todos:
Constructor por defecto.
Constructor con par�metros.
M�todos set/get
M�todo pr�stamo que incremente el atributo correspondiente cada vez 
que se realice un pr�stamo del libro. No se podr�n prestar libros de 
los que no queden ejemplares disponibles para prestar. Devuelve true 
si se ha podido realizar la operaci�n y false en caso contrario.
M�todo devoluci�n que decremente el atributo correspondiente cuando se 
produzca la devoluci�n de un libro. No se podr�n devolver libros que no 
se hayan prestado. Devuelve true si se ha podido realizar la operaci�n
 y false en caso contrario.
M�todo mostrarLibro para mostrar los datos de los libros por pantalla,
 adem�s nos mostrar� qu� porcentaje de libros hay en relaci�n al n�mero total de libros de la biblioteca y el porcentaje de libros que tiene prestados en relaci�n del n�mero total de libros prestados de la biblioteca.
Para probar el funcionamiento de la clase libro utilizaremos el siguiente programa:
 */
public class Actividad_A3_07_Clase_libroModificada {
	private String titulo, autor;
	private int ejemplares, prestados;
	private static int totalLibros = 0;
	private static int totalPrestados = 0;
	public Actividad_A3_07_Clase_libroModificada() {

	}
	public Actividad_A3_07_Clase_libroModificada(String titulo, String autor,
			int ejemplares, int prestados) {
		this.autor = autor;
		this.titulo = titulo;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
		totalLibros += ejemplares;

	}
	public boolean prestamo() {
		if (prestados < ejemplares) {
			prestados++;
			totalPrestados++;
			return true;
		} else {
			return false;
		}
	}
	public boolean devolucion() {
		if (prestados > 0) {
			prestados--;
			totalPrestados--;
			return true;
		} else {
			return false;
		}
	}
	public void mostrarLibro() {
		System.out.println("el autor " + autor + " titulo del libro " + titulo);
		System.out.println("ejemplares prestado " + prestados + " de un total "
				+ ejemplares);
		System.out.println("Porcentaje ejemplares: "
				+ (double) ejemplares / totalLibros * 100 + "%");
		System.out.println("Porcentaje prestados: "
				+ (double) prestados / totalPrestados * 100 + "%");

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
	 * @return el nEjemplares
	 */
	public int getejemplares() {
		return ejemplares;
	}
	/**
	 * @param nEjemplares
	 *            el nEjemplares a establecer
	 */
	public void setejemplares(int ejemplares) {
		int diferencia = ejemplares - this.ejemplares;
		totalLibros = totalLibros + diferencia;
		this.ejemplares = ejemplares;
	}
	/**
	 * @return el nPrestados
	 */
	public int getprestados() {
		return prestados;
	}
	/**
	 * @param nPrestados
	 *            el nPrestados a establecer
	 */
	public void setprestados(int prestados) {
		this.prestados = prestados;
	}
	/**
	 * @return el totalibros
	 */
	public static int getTotalLibros() {
		return totalLibros;
	}
	/**
	 * @return el totalPrestados
	 */
	public static int getTotalPrestados() {
		return totalPrestados;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String titulo, autor;
		int ejemplares;
		// se crea el objeto libro1 utilizando el constructor con par�metros
		Actividad_A3_07_Clase_libroModificada libro1 = new Actividad_A3_07_Clase_libroModificada(
				"El quijote", "Cervantes", 1, 0);
		// se crea el objeto libro2 utilizando el constructor por defecto
		Actividad_A3_07_Clase_libroModificada libro2 = new Actividad_A3_07_Clase_libroModificada();
		System.out.print("Introduce titulo: ");
		titulo = teclado.nextLine();
		System.out.print("Introduce autor: ");
		autor = teclado.nextLine();
		System.out.print("Numero de ejemplares: ");
		ejemplares = teclado.nextInt();
		// se asigna a libro2 los datos pedidos por teclado.
		// para ello se utilizan los m�todos set
		libro2.setTitulo(titulo);
		libro2.setAutor(autor);
		libro2.setejemplares(ejemplares);
		// se muestran por pantalla los datos del objeto libro1
		// se utilizan los m�todos getters para acceder al valor de los
		// atributos
		System.out.println("Libro 1:");
		System.out.println("Titulo: " + libro1.getTitulo());
		System.out.println("Autor: " + libro1.getAutor());
		System.out.println("Ejemplares: " + libro1.getejemplares());
		System.out.println("Prestados: " + libro1.getprestados());
		System.out.println();
		// se realiza un pr�stamo de libro1. El m�todo devuelve true si se ha
		// podido
		// realizar el pr�stamo y false en caso contrario
		if (libro1.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		} else {
			System.out.println("No quedan ejemplares del libro "
					+ libro1.getTitulo() + " para prestar");
		}
		// se realiza una devoluci�n de libro1. El m�todo devuelve true si se ha
		// podido
		// realizar la devoluci�n y false en caso contrario
		if (libro1.devolucion()) {
			System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
		} else {
			System.out.println("No hay ejemplares del libro "
					+ libro1.getTitulo() + " prestados");
		}
		// se realiza otro pr�stamo de libro1
		if (libro1.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		} else {
			System.out.println("No quedan ejemplares del libro "
					+ libro1.getTitulo() + " para prestar");
		}
		// se realiza otro pr�stamo de libro1. En este caso no se podr� realizar
		// ya que
		// solo hay un ejemplar de este libro y ya est� prestado. Se mostrar�
		// por
		// pantalla el mensaje No quedan ejemplares del libro�
		if (libro1.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		} else {
			System.out.println("No quedan ejemplares del libro "
					+ libro1.getTitulo() + " para prestar");
		}
		// mostrar los datos del objeto libro1
		System.out.println("Libro 1:");
		System.out.println("Titulo: " + libro1.getTitulo());
		System.out.println("Autor: " + libro1.getAutor());
		System.out.println("Ejemplares: " + libro1.getejemplares());
		System.out.println("Prestados: " + libro1.getprestados());
		System.out.println();
		// mostrar los datos del objeto utilizando el m�todo mostrarLibro
		libro2.mostrarLibro();
		// mostrar c�mputo total
		System.out.println("Total de libros: "
				+ Actividad_A3_07_Clase_libroModificada.getTotalLibros());
		System.out.println("Total Prestados: "
				+ Actividad_A3_07_Clase_libroModificada.getTotalPrestados());
		System.out.println();

	}

}
