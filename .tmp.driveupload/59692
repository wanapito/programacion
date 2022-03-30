package unidad_03;



import java.util.Scanner;



//creamos clase
public class Actividad_3_05_clase_rectangulo {
	private double base ;
	private double altura;
	//creamos constructor con datos iniciados 
	public Actividad_3_05_clase_rectangulo(double base , double altura) {
		this.altura=altura;
		this.base=base;	
	}
	//cremoas conctructor por defecto 
public Actividad_3_05_clase_rectangulo() {
	
}
//creamos constructor que haga copia del objeto
public Actividad_3_05_clase_rectangulo(Actividad_3_05_clase_rectangulo rectangulo1) {
	base=rectangulo1.base;
	altura=rectangulo1.altura;

	
}
//shetter 
public void setBase(double base) {
	this.base=base;
	
}
//getter
public double getBase() {
	return base;
}
//shetter 
public void setAltura(double altura) {
	this.altura=altura;
}
//getter 
public double getAltura() {
	return altura;
}
//getter 
public double getArea() {
	double area = base*altura ;
	return area;
}
//getter 
public double getPerimetro() {
	double perimetro=((base*2)+(altura*2));
	return perimetro;
}

//creamos metodo main 
public static void main(String[] args) {
	//se crean los objetos el primero se dfine valores 
	//el segundo se dfine por metodo
	//el tercero copia el objeto que se indica
	Actividad_3_05_clase_rectangulo rectangulo1=new Actividad_3_05_clase_rectangulo(2,2);
	Actividad_3_05_clase_rectangulo rectangulo2=new Actividad_3_05_clase_rectangulo();
	Actividad_3_05_clase_rectangulo rectangulo3=new Actividad_3_05_clase_rectangulo(rectangulo1);
	Scanner teclado = new Scanner(System.in);
	System.out.println("introduca la base");
	rectangulo2.setBase(teclado.nextDouble());
	System.out.println("introduzca el area");
	rectangulo2.setAltura(teclado.nextDouble());
	System.out.println("el area del rectangulo 1 con altura "+rectangulo1.getAltura()+
	" y base "+rectangulo1.getBase()+" es "+rectangulo1.getArea()+" y su perimetro es "+rectangulo1.getPerimetro());
	System.out.println("el area del rectangulo 2 con altura "+rectangulo2.getAltura()+
	" y base "+rectangulo2.getBase()+" es "+rectangulo2.getArea()+" y su perimetro es "+rectangulo2.getPerimetro());
	teclado.close();
	System.out.println("El Area del Rectangulo 3 es: " + rectangulo3.getArea()+" y el Perimetro del Rectangulo 3 es: " + rectangulo3.getPerimetro());


}}
