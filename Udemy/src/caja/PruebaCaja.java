package caja;

public class PruebaCaja {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//creamos objeto
		Caja caja1 =new Caja(3,2,6);
		//creamos objeto de contructor sin argumentos 
		Caja caja2 = new Caja();
		//definimos la variables 
		int ancho =2;
		int alto=2;
		int profundo= 2;
		caja2.alto=alto;
		caja2.ancho=ancho;
		caja2.profundo=profundo;
				
		System.out.println("el volumen de la caja 1 es "+caja1.calculaVolumen());
		System.out.println("el volumen de la caja 2 es "+caja2.calculaVolumen());
	}

}
