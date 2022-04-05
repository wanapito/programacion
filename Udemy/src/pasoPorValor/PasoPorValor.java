package pasoPorValor;

public class PasoPorValor {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
int x =10;
System.out.println("x ="+x);
//estamos pasando una copia del valor a otra variable 
cambioValor(x);

	}
	//los metodos que esten en el main deben se ser tambien estaticos 
public static void cambioValor(int arg1) {
	System.out.println("arg1 "+arg1);
}
}
