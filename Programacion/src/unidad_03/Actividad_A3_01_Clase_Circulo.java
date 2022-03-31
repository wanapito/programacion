package unidad_03;
//creamos la clase con sus atributos 
public class Actividad_A3_01_Clase_Circulo {
	private double radio;
//creamos contrusctor con atributos iniializados
	public Actividad_A3_01_Clase_Circulo() {
		radio=1;
	}
	//creamos contrustos con atributos en argumetno
	public Actividad_A3_01_Clase_Circulo(double radio) {
		this.radio=radio;
	}
	//getter
	public double getRadio() {
		return radio;
	}
		//shetter	
	public void setRadio(double radio) {
		this.radio=radio;
	}
	//getter
	public double perimetro() {
		double perimetro = (Math.PI*Math.pow(radio, 2));
				return perimetro;
				
	}
	//getter
	public double area () {
		double area =((2*radio)*Math.PI);
		return area ;
	}
	//cramos metodo main 
	public static void main(String[] args) {
		//creamos los objetos el primero ira al contructor que tiene en argumento 
		//el segundo contructor ira al que esta inicializados
		Actividad_A3_01_Clase_Circulo circulo1= new Actividad_A3_01_Clase_Circulo();
		Actividad_A3_01_Clase_Circulo circulo2= new Actividad_A3_01_Clase_Circulo();
		circulo1.setRadio(3);
		System.out.println("el area de circulo 1 con radio "+circulo1.getRadio()+" es "+circulo1.area()+" y el perimetro "+circulo1.perimetro());
		System.out.println("el area de circulo 2 con radio "+circulo2.getRadio()+" es "+circulo2.area()+" y el perimetro "+circulo2.perimetro());

	}
}

