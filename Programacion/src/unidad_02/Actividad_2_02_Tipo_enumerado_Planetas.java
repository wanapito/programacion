package unidad_02;

public class Actividad_2_02_Tipo_enumerado_Planetas {

		// TODO Auto-generated method stub
		/*
		 * Crear un tipo enumerado llamado Planetas que contenga los 8 planetas del Sistema Solar. 
		 * Muestra el texto relativo al nombre del primer planeta, intenta mostrar la posici�n que 
		 * ocupan en ese listado (m�todo ordinal()) e intenta mostrar tambi�n el n�mero de planetas
		 *  existentes(con values() sacar�s el array de componentes que tiene, y a dicho array le podr�s
		 *   aplicar la propiedad length para mostrar el tama�o de dicho array).
		 */

		public enum Planetas {Mercurio, Venus, Tierra, Marte, Jupiter, Saturno, Urano, Neptuno};
			    
		    public static void main(String[] args) {
		 
		        Planetas primerPlaneta = Planetas.Mercurio;
		        Planetas ultimoPlaneta = Planetas.Neptuno;
		        
		        System.out.println("El primer planeta es: " + primerPlaneta);
		        System.out.println("El ultimo planeta es: " + ultimoPlaneta);
		        System.out.println("La posici�n del primer planeta es " + primerPlaneta.ordinal());  
		        System.out.println("La posici�n del ultimo planeta es " + ultimoPlaneta.ordinal());
		        
		        System.out.println("El n�mero de planetas es " + Planetas.values().length);

		    
		    } 

		

		
		
	}


