package unidad_03;


	/*
	 * Comprueba que la clase siguiente funciona correctamente. Sin embargo, es
	 * mejorable en su dise�o: no dispone de un constructor expl�cito, el m�todo
	 * main est� codificado en el mismo fichero fuente, no se especifican
	 * modificadores de acceso a los miembros de la clase, etc.. Modifica la
	 * aplicaci�n subsanando los inconvenientes antes indicados.
	 */
	//se crea la clase 
	public class Actividad_A3_03_clase_Racional {
		private int numerador=0;
		private int denominador=0;
//se crea el contrustor
		public  Actividad_A3_03_clase_Racional(int numerador, int denominador) {
			this.numerador = numerador;
			if (denominador == 0)
				denominador = 1; // el denominador no puede ser cero
			this.denominador = denominador;
		}
		//getter
		public int getNumerador() {
			return numerador;
		}
		//getter
		public int getdDenominador() {
			return denominador;
		}
		//shetter le damos valor a las variables 
		public void asignarDatos(int numerador, int denominador) {
			this.numerador=numerador;
			this.denominador=denominador;
		}
		
//shetter
		public void visualizarRacional() {
			System.out.println(numerador + "/" + denominador);
		}
//creamos el metodo main 
		public static void main(String[] args) {
			// Punto de entrada a la aplicaci�n
			Actividad_A3_03_clase_Racional r1 = new Actividad_A3_03_clase_Racional('0','0'); // crear un objeto CRacional
			r1.asignarDatos(2, 5);
			r1.visualizarRacional();

		}

	}


