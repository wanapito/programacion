package pasoPorValor;

public class PasoPorValor {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
int x =10;
System.out.println("x ="+x);
//Estamos pasando una copia del valor a otra variable 
cambioValor(x);

	}
	//Los m�todos que est�n en el main deben se ser tambi�n est�ticos 
public static void cambioValor(int arg1) {
	System.out.println("Arg1 "+arg1);
}
}
