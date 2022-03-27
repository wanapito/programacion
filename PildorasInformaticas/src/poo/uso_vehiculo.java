package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class uso_vehiculo {

	public static void main(String[] args) {
		/*/**instancias una clase 
    	crear un ejemplar de coche 
		/** Coche renault = new Coche();
		/**asi responde el getter llamando al metodo realizado anteriormente 
    	 llamado  dime_largo
    	System.out.println(renault.dime_largo());

		/**como hemos nombrado renault preguntamos el valor de ruedas que esta ubicado en coche 
    	pero como renault pertence a ese tipo de clase dara ese resultado 
    	System.out.println("este coche tiene " + renault.ruedas + " ruedas");
		Coche miCoche= new Coche();
		/*
		 * llamando al metodo estable color micoche se le da esa propiedad 
		 
		miCoche.establece_color(JOptionPane.showInputDialog("introduce el color"));
		System.out.println(miCoche.dime_datos_generale());
		
		System.out.println(miCoche.dime_color());
		//como es boolean el getter depende si l dato es si o no dara una respueta u otra 
		miCoche.configura_asientos(JOptionPane.showInputDialog("tiene asientos de cuero"));
		System.out.println(miCoche.dime_asientos());
	miCoche.configura_climatizador(JOptionPane.showInputDialog("tiene climatizador"));
	System.out.println(miCoche.dime_climatizador());
	System.out.println(miCoche.dime_peso_coche());
	System.out.println("el precio del coche es "+miCoche.dime_precio());*/
		
		
		//le damos un estado incial a los objetos 
	Coche miCoche1=new Coche();
	miCoche1.establece_color("rojo");
	//furgoneta tiene dos datos por lo que hay que estableces esos datos 
	Furgoneta mifurgoneta1=new Furgoneta(7,580);
	mifurgoneta1.establece_color("azul");
	mifurgoneta1.configura_asientos("si");
	mifurgoneta1.configura_climatizador("si");
	System.out.println(miCoche1.dime_datos_generales()+miCoche1.dime_color());
	System.out.println(mifurgoneta1.dime_datos_generales()+mifurgoneta1.dimeDatosFurgoneta());
	
			
	
	}
}
