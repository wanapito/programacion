package unidad_03;

import java.util.Scanner;

/*
 * Crea una clase Empleado que tenga los siguientes atributos privados:
Nif. (utilizar la clase NIF creada anteriormente)
Nombre.
Sueldo base.
Horas extra realizadas en el mes.
Tipo de IRPF (%).
Casado o no. (Será de tipo boolean)
Número de hijos.
Importe de la hora extra. Este será un atributo static o atributo de clase.
Los objetos Empleado se podrán crear con un constructor por defecto o 
con un constructor con un solo parámetro correspondiente al número de 
 DNI (sin letra, la letra será calculada automáticamente por la clase nif).
Además de los métodos getter/setter la clase Empleado tendrá estos métodos:
Método para el cálculo del complemento correspondiente a las horas extra realizadas.
Método para calcular el sueldo bruto (sueldo base + complemento por horas extras)
Método para calcular las retenciones por IRPF. El porcentaje de IRPF se 
aplica sobre el sueldo bruto, teniendo en cuenta que el porcentaje que 
hay que aplicar es el tipo menos 2 puntos si el empleado está casado y 
menos 1 punto adicional por cada hijo que tenga.
Método toString() para mostrar los datos de los empleados de la siguiente forma:
12345678-A Lucas Guerrero Arjona
Sueldo Base: 1150.0
Horas Extras: 4
tipo IRPF: 15.0
Casado: S
Número de Hijos: 2

Esta parte no se puede hacer de momento 
Una vez creada la clase Empleado, la utilizaremos en un
 programa que lea empleados y los guarde en un array estático. 
 El número total de empleados se pide por teclado. El número
  máximo de empleados es de 20.
Después de leer los datos de los empleados se pedirá que se 
introduzca el importe correspondiente al pago por hora extra asignándoselo al atributo estático de la clase.
A continuación el programa mostrará:
El empleado que más cobra y el que menos
El empleado que cobra más por horas extra y el que menos.
Todos los empleados ordenados por salario de menor a mayor.
 */
public class Actividad_A3_11_Clase_empleado {
	Scanner teclado = new Scanner(System.in);
	private String nombre;
	private double sueldoBase;
	private double horasExtras;
	private double IRPF;
	private boolean casado;
	private int nHijos;
	private static double importeHExtra = 8;
	private String dni;
	public Actividad_A3_11_Clase_empleado() {

	}
	public Actividad_A3_11_Clase_empleado(int numero) {
		numero = teclado.nextInt();
		Actividad_A3_04_NIF dni = new Actividad_A3_04_NIF(numero);
		dni.toString();
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
	 * @return el sueldoBase
	 */
	public double getSueldoBase() {
		return sueldoBase;
	}
	/**
	 * @param sueldoBase
	 *            el sueldoBase a establecer
	 */
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	/**
	 * @return el horasExtras
	 */
	public double getHorasExtras() {
		return horasExtras;
	}
	/**
	 * @param horasExtras
	 *            el horasExtras a establecer
	 */
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	/**
	 * @return el iRPF
	 */
	public double getIRPF() {
		return IRPF;
	}
	/**
	 * @param iRPF
	 *            el iRPF a establecer
	 */
	public void setIRPF(double IRPF) {
		this.IRPF = IRPF;
	}
	/**
	 * @return el casado
	 */
	public boolean isCasado() {
		return casado;
	}
	/**
	 * @param casado
	 *            el casado a establecer
	 */
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	/**
	 * @return el nHijos
	 */
	public int getnHijos() {
		return nHijos;
	}
	/**
	 * @param nHijos
	 *            el nHijos a establecer
	 */
	public void setnHijos(int nHijos) {
		this.nHijos = nHijos;
	}
	/**
	 * @return el importeHExtra
	 */
	public static double getImporteHExtra() {
		return importeHExtra;
	}
	/**
	 * @param importeHExtra
	 *            el importeHExtra a establecer
	 */
	public static void setImporteHExtra(double importeHExtra) {
		Actividad_A3_11_Clase_empleado.importeHExtra = importeHExtra;
	}
	/**
	 * @return el dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni
	 *            el dni a establecer
	 */
	public String setDni(int numero) {
		System.out.println("introduzca dni");
		numero = teclado.nextInt();
		Actividad_A3_04_NIF empleado1 = new Actividad_A3_04_NIF(numero);
		dni = empleado1.toString();
		return dni;

	}
	public double calculoHExtra(double horasExtras) {
		this.horasExtras = horasExtras;
		double totalHExtras = horasExtras * importeHExtra;
		return totalHExtras;
	}
	public double sueldoBruto() {

		double totalBruto = sueldoBase + calculoHExtra(horasExtras);
		return totalBruto;
	}
	public double rentecionIRPF(double IRPF) {
		double totalIRPF;

		if (casado == false && nHijos == 0) {
			return IRPF;
		} else if (casado == false && nHijos > 0) {
			totalIRPF = IRPF - 1;
			return totalIRPF;
		}
		if (casado == true && nHijos > 0) {
			totalIRPF = IRPF - 3;
			return totalIRPF;
		}
		if (casado == true && nHijos <= 0) {
			totalIRPF = IRPF - 2;
			return totalIRPF;
		} else {
			return IRPF;
		}
	}

	@Override
	public String toString() {
		return dni + " " + nombre + "\n" + " sueldo base " + sueldoBase + "\n"
				+ " horas extras " + horasExtras + "\n" + " tipo IRPF" + IRPF
				+ "\n" + " casado " + casado + "\n" + " numero hijos " + nHijos;

	}
	public static void main(String[] args) {

		Actividad_A3_11_Clase_empleado empleado1 = new Actividad_A3_11_Clase_empleado();
		empleado1.setCasado(true);
		empleado1.setnHijos(2);
		empleado1.setIRPF(15.0);
		empleado1.setHorasExtras(4);
		empleado1.setSueldoBase(1150.0);
		empleado1.setNombre("Lucas guerrero arjona");
		empleado1.setDni(12345678);
		System.out.println(empleado1.toString());
		System.out.println(
				"el sueldo bruto del empleado es " + empleado1.sueldoBruto());
		System.out.println("el IRPF del empleado es "
				+ empleado1.rentecionIRPF(empleado1.getIRPF()));
	}

}