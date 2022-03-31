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

}

