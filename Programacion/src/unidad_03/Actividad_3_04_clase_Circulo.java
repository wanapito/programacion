package unidad_03;


//creamos clase con atributos
public class Actividad_3_04_clase_Circulo {
	
		private double  radio;
		private double area;
		
	//creamos contructor con atributo en argumento
	public Actividad_3_04_clase_Circulo ( double radio) {
		this.radio=radio;
	
	}
	//cremos contructor con atributo 
	public Actividad_3_04_clase_Circulo () {
		radio=2;
		
	}
	//shetter
	public void asignaRadio(double radio) {
		this.radio=radio;
	}
	//shtetter
	public void calcularSuperfcie() {
		area=(Math.pow(radio, 2)*Math.PI);
		
	}

//creamos metodo main 
	public static void main(String[] args) {
		//creamos los tipos de objetos 
		
		Actividad_3_04_clase_Circulo circulo1= new Actividad_3_04_clase_Circulo();
		Actividad_3_04_clase_Circulo circulo2 = new Actividad_3_04_clase_Circulo();
		//asiganmos valor a ciruclo 1 el otro como no tiene valos acudira al contructor con valor
		circulo1.asignaRadio(10);
		//llamamos a los metodos 
		circulo1.calcularSuperfcie();
		circulo2.calcularSuperfcie();
		//imprimimos los metodos
		System.out.println("el aera de un circulo con radio "+circulo1.radio+" es "+circulo1.area);
		System.out.println("el aera de un circulo con radio "+circulo2.radio+" es "+circulo2.area);
		
		
		
	}
}

