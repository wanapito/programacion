import java.util.Scanner;

public class Teclado {
	static Scanner sc = new Scanner(System.in);
	
	public static int leerNumero(){
		int numero = 0;
		boolean leido = true;
		while(leido) {
			try {
				numero = sc.nextInt();
				leido = false;
			}catch(Exception e) {
				System.err.println("No has introducido un numero entero");
			}
		}
		return numero;
	}
	
	public static int leerNumero(int min, int max){
		int numero = 0;
		boolean leido = true;
		while(leido) {
				System.out.println("Introduce un numero entre " + min + " y " + max);
				numero = sc.nextInt();
				if(numero >= min && numero <= max) {
					leido = false;
				}else {
					System.err.println("El numero introducido no esta entre " + min + "y " + max + " o no has introducido un numero.");
				}

		}
		return numero;
	}
	
	public static boolean leerSiNo() {
		while(true) {
			String respuestaSiNo = sc.nextLine();
			if(respuestaSiNo.equalsIgnoreCase("s")) {
				return true;
			}
			else if(respuestaSiNo.equalsIgnoreCase("n")) {
				return false;
			}
			else {
				System.err.println("Debes contestar S/N");
			}
		}
	}
	
	public static String leerTexto() {
		return sc.nextLine();
	}
	
}
