package unidad_05;

import java.util.Locale;
import java.util.Scanner;

/*
 * Haz una clase llamada Persona que siga las siguientes condiciones:
Miembros dato o atributos:
-   Sus atributos son: nombre, edad, DNI, sexo (H para hombre y M para mujer), 
peso (en kilogramos, admitiéndose decimales) y altura (en metros, admitiéndose decimales).
 Dichos atributos no serán accedidos directamente, por lo que deber tener en cuenta cuál 
 será el modificador de acceso es el más apropiado, así como su tipo.
Miembros método u operaciones:
-   Se incorporarán varios constructores:
Un constructor por defecto.
Un constructor con el nombre, DNI, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como parámetro.
-   Método que devolverá el índice de masa corporal, que vendrá dado por el cálculo:
(peso en kg)/(altura^2  en m)
-   Método que devolverá una valoración acerca del peso teniendo en cuenta el índice de masa 
corporal obtenido anteriormente. Devolverá una cadena que indicará si está por debajo del peso normal 
(IMC<20), por encima del peso normal (IMC>=25), o con el peso dentro de lo considerado normal
(los demás casos).
-   Método booleano que indica si es mayor de edad.
-   Método con retorno void para comprobar el sexo recibiendo como parámetro un carácter. 
Comprobará  que el sexo introducido es correcto ('H' o 'M'). 
Si no es correcto, lo pondrá a 'H'. No será visible al exterior.
-   toString(): devuelve toda la información del objeto (sobreescribiremos el método).
Mostrará entre otras cosas el IMC y la valoración de peso.
Además, crea una clase ejecutable PruebaPersona que haga lo siguiente:
Pide por teclado el nombre, la edad, DNI, sexo, peso y altura.
Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables 
pedidas por teclado, el segundo objeto obtendrá 
todos los anteriores menos el peso y la altura y el último por defecto, para este último 
utiliza los métodos set para darle a los atributos un valor.
Indicar para cada objeto si es mayor de edad. Para ello crearemos dentro de la clase
 PruebaPersona un método estático que reciba como parámetro un objeto de la clase Persona.
Por último, mostrar la información de cada objeto, mediante el método toString() mencionado 
anteriormente.
 */
//Nota: Adaptación de ejercicio de www.discoduroderoer.es/

public class Actividad_5_3_ClasePersona {

	// Atributos
	/**
	 * Nombre de la persona
	 */
	private String nombre;

	/**
	 * Edad de la persona
	 */
	private int edad;

	/**
	 * DNI de la persona, se genera al construir el objeto
	 */
	private String dni;

	/**
	 * Sexo de la persona, H hombre M mujer
	 */
	private char sexo;

	/**
	 * Peso de la persona
	 */
	private double peso;

	/**
	 * Altura de la persona
	 */
	private double altura;

	// Contructores
	/**
	 * Constructor por defecto
	 */
	public Actividad_5_3_ClasePersona() {
		this("", "", 0, 'V', 0, 0);
	}

	/**
	 * Constructor con 3 parametroe
	 *
	 * @param nombre
	 *            de la persona
	 * @param edad
	 *            de la persona
	 * @param sexo
	 *            de la persona
	 */
	public Actividad_5_3_ClasePersona(String nombre, String dni, int edad,
			char sexo) {
		this(nombre, dni, edad, sexo, 0, 0);
	}

	/**
	 * Constructor con 5 parametros
	 *
	 * @param nombre
	 *            de la persona
	 * @param edad
	 *            de la persona
	 * @param sexo
	 *            de la persona
	 * @param peso
	 *            de la persona
	 * @param altura
	 *            de la persona
	 */
	public Actividad_5_3_ClasePersona(String nombre, String dni, int edad,
			char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
		comprobarSexo();
	}

	// Métodos privados
	private void comprobarSexo() {

		// Si el sexo no es una H o una M, por defecto es H
		if (sexo != 'H' && sexo != 'M') {
			this.sexo = 'H';
		}
	}

	// Métodos publicos getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Otros métodos públicos
	/**
	 * Calcula el indice de masa corporal
	 */
	public double calcularIMC() {
		// Calculamos el peso de la persona
		double imc = peso / (Math.pow(altura, 2));
		return imc;

	}

	/**
	 * Valoración de IMC()
	 */
	public static String valoracionIMC(double imc) {
		String valoracion = "";
		if (imc < 20)
			valoracion = "Peso por debajo de lo normal";
		else if (imc >= 25)
			valoracion = "Peso por encima de lo normal";
		else
			valoracion = "Peso normal";
		return valoracion;
	}

	/**
	 * Indica si la persona es mayor de edad
	 *
	 * @return true si es mayor de edad y false es menor de edad
	 */
	public boolean esMayorDeEdad() {
		boolean mayor = false;
		if (edad >= 18) {
			mayor = true;
		}
		return mayor;
	}

	/**
	 * Devuelve informacion del objeto
	 *
	 * @return cadena con toda la informacion
	 */
	@Override
	public String toString() {
		String sexo;
		if (this.sexo == 'H') {
			sexo = "hombre";
		} else {
			sexo = "mujer";
		}
		return "Informacion de la persona:\n" + "Nombre: " + nombre + "\n"
				+ "DNI: " + dni + "\n" + "Sexo: " + sexo + "\n" + "Edad: "
				+ edad + " años\n" + "Peso: " + peso + " kg\n" + "Altura: "
				+ altura + " metros\n" + "IMC: " + calcularIMC() + "\n"
				+ "Valoración de peso: " + valoracionIMC(calcularIMC());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); // Para que escribamos el separador de los
									// enteros con los decimales con ".". Si no
									// lo ponemos tendremos que escribirlo con
									// ","

		// Introducimos los datos de la primera persona
		System.out.println("Introduce el nombre: ");
		String nombre = sc.nextLine();

		System.out.println("Introduce el dni: ");
		String dni = sc.nextLine();

		System.out.println("Introduce la edad: ");
		int edad = sc.nextInt();

		System.out.println("Introduce el sexo: ");
		char sexo = sc.next().charAt(0);

		System.out.println("Introduce el peso (en kilogramos): ");
		double peso = sc.nextDouble();

		System.out.println("Introduce la altura (en metros): ");
		double altura = sc.nextDouble();

		// Creamos objetos con los diferentes constructores
		Actividad_5_3_ClasePersona persona1 = new Actividad_5_3_ClasePersona(); // Usamos
																				// constructor
																				// por
																				// defecto
		Actividad_5_3_ClasePersona persona2 = new Actividad_5_3_ClasePersona(
				nombre, dni, edad, sexo); // Usamos constructor que no incorpora
											// peso ni altura
		Actividad_5_3_ClasePersona persona3 = new Actividad_5_3_ClasePersona(
				nombre, dni, edad, sexo, peso, altura); // Usamos constructor
														// que incorpora todos
														// los campos

		// Los datos que no esten completos los insertamos con los metodos set
		persona1.setNombre("Laura");
		persona1.setEdad(30);
		persona1.setSexo('M');
		persona1.setPeso(60);
		persona1.setAltura(1.60);

		persona2.setPeso(90.5);
		persona2.setAltura(1.80);

		// Mostramos los datos
		System.out.println("=========================================");
		System.out.println("Persona1");
		MuestraMayorDeEdad(persona1);
		System.out.println(persona1.toString());

		System.out.println("=========================================");
		System.out.println("Persona2");
		MuestraMayorDeEdad(persona2);
		System.out.println(persona2.toString());

		System.out.println("=========================================");
		System.out.println("Persona3");
		MuestraMayorDeEdad(persona3);
		System.out.println(persona3.toString());
	}

	public static void MuestraMayorDeEdad(Actividad_5_3_ClasePersona p) {

		if (p.esMayorDeEdad()) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona no es mayor de edad");
		}
	}

}
