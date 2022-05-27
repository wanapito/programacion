
public class capitulo17_operadores_condicionales {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
int  a = 8;
int valorMinimo=0;
int valorMaximo=10;
//estamos pregunatdo si el valor esta entre valores con && incluimos dos consultas y es boolean
boolean resultado=a>=0&&a<=10;
if (resultado==true) {
	System.out.println("dentro de rango");
	
}
else {
	System.out.println("fuera de rango");
}
//con "|| "signica o por loq eu si alguno de los dos es true devolvera un true si son dos false devolvera false
boolean vacaciones=true;
boolean diaDescanso=false;
if (vacaciones|| diaDescanso) {
	System.out.println("padre puede asistir ");
	
}
else {
	System.out.println("el padre esta ocupado");
}
}

	}


