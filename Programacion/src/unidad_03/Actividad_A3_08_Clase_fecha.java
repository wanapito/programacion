package unidad_03;

import java.util.Scanner;

/*
 * Crear una Clase Fecha en Java. La clase tendrá tres atributos privados 
 * dia, mes y año de tipo int. La clase contendrá los siguientes métodos:
Constructor por defecto.
Constructor con tres parámetros para crear objetos con valores iniciales 
(sólo modificará los valores iniciales si la fecha es correcta)
Métodos set y get para asignar y obtener los valores de los atributos de 
la clase. (sólo modificará los valores si generan una fecha correcta)
Método fechaCorrecta(int dia, int mes, int anio) que comprueba si la fecha 
es correcta. Devuelve un valor de tipo boolean indicando si la fecha es 
correcta o no. Este método a su vez utilizará un método privado de la clase 
llamado esBisiesto(int anio) que calcula si el año es o no bisiesto. 
El método esBisiesto devuelve true si el año es bisiesto y false si no lo es.
Método diaSiguiente() que cambia la fecha actual por la del día siguiente. 
El objeto de la clase Fecha al que se le aplique este método deberá quedar 
siempre en un estado consistente, es decir, la nueva fecha deberá ser correcta.
Modificar el método toString() heredado de Object para mostrar las fechas 
de la forma dd-mm-aaaa. El día y el mes se deben mostrar con dos cifras. 
Si el dia o el mes tienen solo una cifra se escribirá un cero delante. 
Por ejemplo si la fecha es dia=1, mes=6, año= 2015 la fecha que se 
mostrará será: 01-06-2015
Escribe un programa para probar la clase Fecha. El método diaSiguiete() 
pruébalo dentro de un bucle que imprima la fecha durante cada iteración del bucle.
 */
public class Actividad_A3_08_Clase_fecha {
	private int dia;
	private int mes;
	private int año;
	public Actividad_A3_08_Clase_fecha() {

	}
	public Actividad_A3_08_Clase_fecha(int dia, int mes, int año) {
		if (fechaCorrecta(dia, mes, año)) {
			this.dia = dia;
			this.mes = mes;
			this.año = año;
		}

	}
	public static boolean fechaCorrecta(int dia, int mes, int año) {
		if (mes < 1 || mes > 12)
			return false;
		else {
			switch (mes) {
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10 :
				case 12 :
					if (dia < 1 || dia > 31)
						return false;
					break;
				case 4 :
				case 6 :
				case 9 :
				case 11 :
					if (dia < 1 || dia > 30)
						return false;
					break;
				default :
					if (esBisiesto(año) && (dia < 1 || dia > 29))
						return false;
					else if (!esBisiesto(año) && (dia < 1 || dia > 28))
						return false;

			}
			return true;
		}
	}
	public static boolean esBisiesto(int año) {
		if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
			System.out.println("es un año bisieto");
			return true;
		} else {
			System.out.println("no es bisiesto");
			return false;
		}

	}
	public void diaSiguiente() {
		if (fechaCorrecta(dia, mes, año)) {
			{
				if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
						|| mes == 10 || mes == 12) {
					if (dia == 31 && mes != 12) {
						dia = 1;
						mes++;
					} else if (dia == 31 && mes == 12) {
						año++;
						mes = 1;
						dia = 1;
					}

					else {
						dia++;
					}
				} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					if (dia == 30) {
						dia = 1;
						mes++;
					} else {
						dia++;
					}
				} else if (mes == 2) {
					if (esBisiesto(año)) {
						if (dia == 29) {
							mes++;
							dia = 1;
						} else {
							dia++;
						}
					} else {
						if (dia == 28) {
							mes++;
							dia = 1;
						} else {
							dia++;
						}

					}
				}
			}
		}
	}

	/**
	 * @return el dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia
	 *            el dia a establecer
	 */
	public void setDia(int dia) {
		if (fechaCorrecta(dia, this.mes, this.año))
			this.dia = dia;
	}
	/**
	 * @return el mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes
	 *            el mes a establecer
	 */
	public void setMes(int mes) {
		if (fechaCorrecta(this.dia, mes, this.año))
			this.mes = mes;
	}
	/**
	 * @return el año
	 */
	public int getAño() {
		return año;
	}
	/**
	 * @param año
	 *            el año a establecer
	 */
	public void setAño(int año) {
		if (fechaCorrecta(this.dia, this.mes, año))
			this.año = año;
	}
	@Override
	public String toString() {
		String d, m;
		if (dia < 10)
			d = "0" + dia;
		if (dia >= 10)
			d = "" + dia;

		if (mes < 10)
			m = "0" + mes;
		if (mes >= 10)
			m = "" + mes;

		return dia + "-" + mes + "-" + año;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int dia = 0, mes = 0, anio = 0;
		while (!Actividad_A3_08_Clase_fecha.fechaCorrecta(dia, mes, anio)) {
			System.out.println("Escribe el dia");
			dia = teclado.nextInt();
			System.out.println("Escribe el mes");
			mes = teclado.nextInt();
			System.out.println("Escribe el año");
			anio = teclado.nextInt();
		}
		Actividad_A3_08_Clase_fecha miFecha = new Actividad_A3_08_Clase_fecha(
				dia, mes, anio);

		System.out.println("Dia actual: " + miFecha);

		System.out.println("Cuantos días quieres que muestre");
		int n = teclado.nextInt();

		for (int i = 0; i < n; i++) {
			miFecha.diaSiguiente();
			System.out.println("Dia actual+" + i + ": " + miFecha);
		}

	}

}
