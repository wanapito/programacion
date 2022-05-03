package unidad_03;
/*
 * Escribe una clase para representar fracciones. La clase tendrá dos 
 * atributos de tipo int: num (numerador) y den (denominador). 
 * La clase debe contener los constructores y métodos adecuados
 *  para que este método main funcione de forma correcta:
 */
public class Actividad_A3_09_Clase_fracciones {
	private int num = 0;
	private int den = 1;

	public Actividad_A3_09_Clase_fracciones(int num, int den) {
		this.num = num;
		this.den = den;
	}
	public Actividad_A3_09_Clase_fracciones() {

	}
	public Actividad_A3_09_Clase_fracciones(int num) {
		this.num = num;

	}

	/**
	 * @return el num
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num
	 *            el num a establecer
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * @return el den
	 */
	public int getDen() {
		return den;
	}
	/**
	 * @param den
	 *            el den a establecer
	 */
	public void setDen(int den) {
		this.den = den;
	}
	public Actividad_A3_09_Clase_fracciones sumar(
			Actividad_A3_09_Clase_fracciones f) {
		Actividad_A3_09_Clase_fracciones sumar = new Actividad_A3_09_Clase_fracciones(
				num * f.den + den * f.num, den * f.den);
		return sumar;

	}
	public Actividad_A3_09_Clase_fracciones restar(
			Actividad_A3_09_Clase_fracciones f) {
		return new Actividad_A3_09_Clase_fracciones(num * f.den - den * f.num,
				den * f.den);
	}

	public Actividad_A3_09_Clase_fracciones multiplicar(
			Actividad_A3_09_Clase_fracciones f) {
		return new Actividad_A3_09_Clase_fracciones(num * f.num, den * f.den);
	}

	public Actividad_A3_09_Clase_fracciones dividir(
			Actividad_A3_09_Clase_fracciones f) {
		return new Actividad_A3_09_Clase_fracciones(num * f.den, den * f.num);
	}

	public String toString() {
		simplificar();
		return num + "/" + den;
	}
	public void simplificar() {

		int m_c_d = mcd();
		num = num / m_c_d;
		den = den / m_c_d;

	}
	private int mcd() {
		int u = Math.abs(num);
		int v = Math.abs(den);
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}
	public static void main(String[] args) {
		// Se crean 4 fracciones
		Actividad_A3_09_Clase_fracciones f1 = new Actividad_A3_09_Clase_fracciones(
				1, 4); // Fracción 1/4
		Actividad_A3_09_Clase_fracciones f2 = new Actividad_A3_09_Clase_fracciones(
				1, 2); // Fracción 1/2
		Actividad_A3_09_Clase_fracciones f3 = new Actividad_A3_09_Clase_fracciones(); // Fracción
																						// 0/1
		Actividad_A3_09_Clase_fracciones f4 = new Actividad_A3_09_Clase_fracciones(
				4); // Fracción 4/1
		// operaciones aritméticas con esas fracciones
		Actividad_A3_09_Clase_fracciones suma = f1.sumar(f2);
		Actividad_A3_09_Clase_fracciones resta = f1.restar(f3);
		Actividad_A3_09_Clase_fracciones producto = f1.multiplicar(f4);
		Actividad_A3_09_Clase_fracciones cociente = f1.dividir(f2);
		// mostrar resultados
		System.out.println(f1 + " + " + f2 + " = " + suma);
		System.out.println(f1 + " - " + f3 + " = " + resta);
		System.out.println(f1 + " * " + f4 + " = " + producto);
		System.out.println(f1 + " / " + f2 + " = " + cociente);
	}
}
