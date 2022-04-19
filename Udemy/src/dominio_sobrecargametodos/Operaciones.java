package dominio_sobrecargametodos;

public class Operaciones {
	//Creamos método
	public static int sumar(int a,int b ) {
		System.out.println("Suma hecha desde método entero");
		return a+b;

}
	//Creamos método 
	public static double sumar(double a, double b) {
		System.out.println("Suma hecha desde método double ");
		return a+b;
	}
	
}
