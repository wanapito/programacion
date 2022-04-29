package unidad_03;

import java.util.Scanner;

/*
 * Haz una clase llamada Persona que siga las siguientes condiciones:

Sus atributos son: nombre, edad, DNI (ser� un objeto de la clase 
DNI creada en el ejercicio A4.4), sexo (H hombre, M mujer), peso y altura. 
No queremos que se accedan directamente a ellos. Piensa que modificador 
de acceso es el m�s adecuado, tambi�n su tipo. Si quieres a�adir alg�n 
atributo puedes hacerlo.
Por defecto, todos los atributos menos el DNI ser�n valores por defecto 
seg�n su tipo (0 n�meros, cadena vac�a para String, etc.). Sexo sera 
hombre por defecto, usa una constante para ello.
Se implantaran varios constructores:
Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como par�metro.
Los m�todos que se implementaran son:
calcularIMC(): calculara si la persona esta en su peso ideal 
(peso en kg/(altura^2  en m)), devuelve un -1 si esta por debajo de su 
peso ideal, un 0 si esta en su peso ideal y un 1 si tiene sobrepeso .
Te recomiendo que uses constantes para devolver estos valores.
esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. 
Si es correcto el m�todo devuelve el sexo indicado, si no devuelve el sexo 
por defecto. No sera visible al exterior.
toString(): devuelve toda la informaci�n del objeto.
generaDNI(): genera un numero aleatorio de 8 cifras, genera a partir de 
este su n�mero su letra correspondiente. Este m�todo sera invocado cuando 
se construya el objeto. 
M�todos get y set de cada par�metro, excepto de DNI.
Ahora, crea una clase ejecutable que haga lo siguiente:

Pide por teclado el nombre, la edad, sexo, peso y altura de diferentes 
personas hasta que recibamos el nombre "salir", en cuyo caso terminar� el programa.
Crea un objeto de la clase anterior y as�gnale los valores le�dos.
Comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su 
peso ideal con un mensaje.
Indicar para cada objeto si es mayor de edad.
Por �ltimo, mostrar la informaci�n de cada objeto.
 */
public class Actividad_A3_05_ElPesoIdeal {
	Scanner teclado = new Scanner(System.in);
	private String nombre;
	private int edad;
	private Actividad_A3_04_NIF nif;
	private char sexo;
	private double peso;
	private double altura;
	private static int numero_personas = 0;
	private static final char SEXO_POR_DEFECTO = 'H';
	public Actividad_A3_05_ElPesoIdeal() {
		nombre = "";
		edad = 0;
		nif = generaDNI();
		sexo = SEXO_POR_DEFECTO;
		peso = 0;
		altura = 0;
		numero_personas++;
	}
	public Actividad_A3_05_ElPesoIdeal(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		nif = generaDNI();
		this.sexo = comprobarSexo(sexo);
		peso = 0;
		altura = 0;
		this.edad = edad;
		numero_personas++;

	}
	public Actividad_A3_05_ElPesoIdeal(String nombre, int edad, char sexo,
			double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		nif = generaDNI();
		this.peso = peso;
		this.altura = altura;
		this.sexo = comprobarSexo(sexo);
		numero_personas++;

	}
	public int calcularIMC() {

		final double min = 18.5;
		final double max = 24.9;
		double imc = (peso / Math.pow(altura, 2));

		if (imc < min)
			return -1;
		else if (imc > max)
			return 1;
		else
			return 0;

	}
	public boolean esMayorDeEdad() {

		return edad >= 18;

	}
	public char comprobarSexo(char s) {
		if (s == 'H' || s == 'M')
			return s;
		else
			return SEXO_POR_DEFECTO;

	}

	public static int getNumPersonas() {
		return numero_personas;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre
	 *            el nombre a establecer
	 */
	public void setNombre(String nombre) {

		this.nombre = nombre;
	}
	/**
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad
	 *            el edad a establecer
	 */
	public void setEdad(int edad) {

		this.edad = edad;
	}
	/**
	 * @return el peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso
	 *            el peso a establecer
	 */
	public void setPeso(double peso) {

		this.peso = peso;
	}
	/**
	 * @return el altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura
	 *            el altura a establecer
	 */
	public void setAltura(double altura) {

		this.altura = altura;
	}
	/**
	 * @return el sexo
	 */
	public char getSexo() {
		return sexo;
	}
	public static Actividad_A3_04_NIF generaDNI() {
		int numero = (int) (Math.random() * 100000000);
		Actividad_A3_04_NIF nif = new Actividad_A3_04_NIF(numero);

		return nif;
	}

	@Override
	public String toString() {
		return "ElPesoIdeal [nombre=" + nombre + ", edad=" + edad + ", dni="
				+ nif + ", sexo=" + sexo + ", peso=" + peso + ", altura="
				+ altura + "]";
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el nombre");
		String nombre = teclado.nextLine();
		while (!nombre.equalsIgnoreCase("salir")) {
			System.out.println("Escribe la edad");
			int edad = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Escribe el sexo");
			char sexo = teclado.nextLine().charAt(0);
			System.out.println("Escribe el peso en kg");
			double peso = teclado.nextDouble();
			System.out.println("Escribe la altura en metros");
			double altura = teclado.nextDouble();
			teclado.nextLine();
			Actividad_A3_05_ElPesoIdeal p = new Actividad_A3_05_ElPesoIdeal(
					nombre, edad, sexo, peso, altura);

			int peso_ideal = p.calcularIMC();
			switch (peso_ideal) {
				case -1 :
					System.out.println("Est�s por debajo del peso ideal");
					break;
				case 0 :
					System.out.println("Est�s en el peso ideal");
					break;
				case 1 :
					System.out.println("Est�s por encima del peso ideal");
					break;
			}
			System.out.println(p);
			System.out.println("Escribe otro nombre");
			nombre = teclado.nextLine();

		}
	}
}
