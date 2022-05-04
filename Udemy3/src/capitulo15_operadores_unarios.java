
public class capitulo15_operadores_unarios {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
int a= 3;
int b =-a;
System.out.println("a= "+a);
System.out.println("b="+b);


//invertimos valor de la variable c solo vale para tipo boolean
boolean c= true;
boolean d=!c;
System.out.println("c ="+c);
System.out.println("d ="+d);

//incremeto
//preincremento(simbolo antes de la variable )
int e=3;
//en funcino del orden cuando le demos a mostrar en pantalla ya habra sumado la variabel 
int f=++e;
System.out.println("e = "+e);
System.out.println("f = "+f);
//postincremeno
//de esta manera el ++ esta despues de la varibale se leera despues de leer por primera vez
int g=5;
int h =g++;
System.out.println("g = "+g);
System.out.println("h = "+h);
//decremto
int i =2;
int j = --i;
//restara 1 al estar delante predecremta la variable 
System.out.println("i ="+i);
System.out.println("j ="+j);
//postdecremento resta despuede de leer la variable por lo que l tendra el valor en origen de 
//k y k sera restado al aparecer en pantalla
int k =2;
int l =k--;
System.out.println("k ="+k);
System.out.println("l="+l);

	}

}
