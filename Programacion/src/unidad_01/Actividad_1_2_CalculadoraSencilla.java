package unidad_01;



import java.util.Scanner;



public class Actividad_1_2_CalculadoraSencilla {
	/*
	 * Crea a trav�s de la aplicaci�n PSeInt una calculadora 
	 * de n�meros a la cual se pasen como par�metros 2 operandos, 
	 * y como operador, un s�mbolo correspondiente a la suma, resta, 
	 * multiplicaci�n o divisi�n.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operando1 , operando2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce operador"+"\n1:+"+"\n2:-"+"\n3:*"+"\n4:/");
		int operador =teclado.nextInt();
		System.out.println("introduce el operando1 ");
		operando1=teclado.nextInt();
		System.out.println("introduce el operando2");
		operando2=teclado.nextInt();
		if (operador==1) {
			System.out.println("la suma es "+(operando1+operando2));
		}
		if (operador==2) {
			System.out.println("la resta es "+(operando1-operando2));
		}
		if (operador==3) {
			System.out.println("la multiplicacion es "+(operando1*operando2));
		}
		if (operador==4) {
			System.out.println("la division es "+(operando1/operando2));
		}
		teclado.close();

	}

}
