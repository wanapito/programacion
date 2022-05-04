package poo;

/**
 *
 * @author Ivan
 */
public class Coche {

	/*
	 * al crear una clase vamos declarado variables
	 */
	// con la opcion private impedimos que pueda modificar la varibale
	// en otro metodo
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	/*
	 * vamos a contruir un constructor
	 */
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 3000;
		peso_plataforma = 500;

	}
	// esto es un metodo getter devuelve un dato
	// public tipodedato nombre que le damos (){
	// return devolvera el dato que elijamos
	public String dime_largo() {
		return "el largo del coche es " + largo;
	}
	/**
	 * es en un metodo setter nos permite modifica el dato public void nombre
	 * que elijamos entre parentesis el cato de como sera
	 * 
	 */
	public void establece_color(String color_coche) {
		// color="azul";
		color = color_coche;
	}
	/**
	 * esto es un metodo getter
	 */
	public String dime_color() {
		return "el color del coche es " + color;
	}
	// con el getter solictamos todos los datos que queramos en una sola frase
	public String dime_datos_generales() {
		return "la plataforma del vehiculo tiene " + ruedas + " ruedas"
				+ "\n mide " + largo / 1000 + " metros \ncon un ancho de "
				+ ancho + " cm y un peso de plataforma de " + peso_plataforma
				+ " kg ";
	}
	// setter para un boolean
	public void configura_asientos(String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}
	// getter
	public String dime_asientos() {
		if (asientos_cuero == true) {
			return "el coche tiene asientos de cuero";
		} else {
			return "el coche tiene asiento de serie";
		}
	}
	// setter
	public void configura_climatizador(String climatizdador) {
		if (climatizdador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}
	// getter
	public String dime_climatizador() {
		if (climatizador == true) {
			return "el coche incorpora climatizador";
		} else {
			return "el coche lleva aire acondicionado";
		}
	}

	// estamos haciendo un setter y getter
	// por que establece datos y devuelve datos
	// en este caso vamos modificando el dato a medida que vamos pasando por el
	// codigo
	public String dime_peso_coche() {
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria;
		if (asientos_cuero == true) {
			peso_total = peso_total + 50;
		}
		if (climatizador == true) {
			peso_total = peso_total + 20;
		}
		return "el peso del coche es " + peso_total;
	}
	// con += incrementamos el dato precio final si se cumple pero no se
	// modifica el paramentro
	public int dime_precio() {
		int precio_final = 10000;
		if (asientos_cuero == true) {
			precio_final += 2000;
		}
		if (climatizador == true) {
			precio_final += 1500;
		}
		return precio_final;
	}
}
