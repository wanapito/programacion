package unidad_03;

import java.util.Scanner;

public class Actividad_A3_03_Clase_libro {
	private String titulo;
	private String autor;
	private int nEjemplares;
	private int nPrestados;

	// contructores en argumetor
	public Actividad_A3_03_Clase_libro(String titulo, String autor, int nEjemplares, int nPrestados) {
		this.autor = autor;
		this.titulo = titulo;
		this.nEjemplares = nEjemplares;
		this.nPrestados = nPrestados;
	}

	// contructor por defecto
	public Actividad_A3_03_Clase_libro() {

	}

	// getter
	public String getTitulo() {
		return this.titulo;
	}

	// getter
	public String getAutor() {
		return this.autor;
	}

	// getter
	public int getEjemplares() {
		return this.nEjemplares;
	}

	// getter
	public int getPrestados() {
		return this.nPrestados;
	}

	// setter
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	// setter
	public void setAutor(String autor) {
		this.autor = autor;
	}

	// setter
	public void setEjemplares(int nEjemplares) {
		this.nEjemplares = nEjemplares;
	}

	// setter
	public void setPrestados(int nPrestados) {
		this.nPrestados = nPrestados;
	}

	// getter tipo boolean si se cumple la condicion devolvera true y sumara si no
	// devolvera false
	public boolean prestamo() {
		if (this.nPrestados < this.nEjemplares) {
			this.nPrestados++;
			return true;
		} else {
			return false;
		}
	}

	// gettter tipo boolean si se cumple la condicion restara y devolvera true
	public boolean devolucion() {
		if (nPrestados > 0) {
			nPrestados--;
			return true;
		} else
			return false;
	}

	// setter
	public void mostrarLibro() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ejemplares: " + nEjemplares);
		System.out.println("Prestados: " + nPrestados);
	}
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;
        //se crea el objeto libro1 utilizando el constructor con parámetros
        Actividad_A3_03_Clase_libro libro1 = new Actividad_A3_03_Clase_libro("El quijote", "Cervantes", 1, 0);
        //se crea el objeto libro2 utilizando el constructor por defecto
        Actividad_A3_03_Clase_libro libro2 = new Actividad_A3_03_Clase_libro();
        System.out.print("Introduce titulo: ");
        titulo = teclado.nextLine();
        System.out.print("Introduce autor: ");
        autor = teclado.nextLine();
        System.out.print("Numero de ejemplares: ");
        ejemplares = teclado.nextInt();
        //se asigna a libro2 los datos pedidos por teclado.
        //para ello se utilizan los métodos set
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);
        //se muestran por pantalla los datos del objeto libro1
        //se utilizan los métodos getters para acceder al valor de los atributos
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();
        //se realiza un préstamo de libro1. El método devuelve true si se ha podido
        //realizar el préstamo y false en caso contrario
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
        //se realiza una devolución de libro1. El método devuelve true si se ha podido
        //realizar la devolución y false en caso contrario
        if (libro1.devolucion()) {
            System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
        }
        //se realiza otro préstamo de libro1
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
        //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
        //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
        //pantalla el mensaje No quedan ejemplares del libro…
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
        //mostrar los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();
        //mostrar los datos del objeto utilizando el método mostrarLibro
        libro2.mostrarLibro();
        teclado.close();
}}
