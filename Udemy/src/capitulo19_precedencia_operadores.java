
public class capitulo19_precedencia_operadores {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
var x = 5;
var y=10;
var z= ++x+y--;
//va hacer un preincremtno suma 1 a x
System.out.println("x= "+x);
//va hacer un posdecremento resta 1 a x
System.out.println("y = "+y);
//con el dremento ya se utilizo al mostar en panatlla vuelve a tener como valor y= 10 
System.out.println("z ="+z);

//el operado de multiplicacion y division tienen prioridad sobre la suma 
//por lo que quedaria asi 4+((5*6)/3) sin tener parentesis
var resultado = 4+5*6/3;
System.out.println("resultado ="+resultado);
//el orden los parentesis influye en cmo se realiza la operacion
resultado = (4+5)*6/3;
System.out.println("resultado ="+resultado);

	}

}
