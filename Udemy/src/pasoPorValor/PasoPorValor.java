package pasoPorValor;

public class PasoPorValor {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
int x =10;
System.out.println("x ="+x);
//Estamos pasando una copia del valor a otra variable 
cambioValor(x);

	}
	//Los métodos que estén en el main deben se ser también estáticos 
public static void cambioValor(int arg1) {
	System.out.println("Arg1 "+arg1);
}
}
