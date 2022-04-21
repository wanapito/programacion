package caja;

public class PruebaCaja {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//Creamos objeto
		Caja caja1 =new Caja(3,2,6);
		//Creamos objeto de constructor sin argumentos 
		Caja caja2 = new Caja();
		//Definimos la variables 
		int ancho =2;
		int alto=2;
		int profundo= 2;
		caja2.alto=alto;
		caja2.ancho=ancho;
		caja2.profundo=profundo;
				
		System.out.println("El volumen de la caja 1 es "+caja1.calculaVolumen());
		System.out.println("El volumen de la caja 2 es "+caja2.calculaVolumen());
	}

}
