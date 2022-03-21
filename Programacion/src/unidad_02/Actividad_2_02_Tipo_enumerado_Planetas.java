package unidad_02;

public class Actividad_2_02_Tipo_enumerado_Planetas {

		// TODO Auto-generated method stub
		/*
		 * Crear un tipo enumerado llamado Planetas que contenga los 8 planetas del Sistema Solar. 
		 * Muestra el texto relativo al nombre del primer planeta, intenta mostrar la posición que 
		 * ocupan en ese listado (método ordinal()) e intenta mostrar también el número de planetas
		 *  existentes(con values() sacarás el array de componentes que tiene, y a dicho array le podrás
		 *   aplicar la propiedad length para mostrar el tamaño de dicho array).
		 */

		public enum Planetas {Mercurio, Venus, Tierra, Marte, Jupiter, Saturno, Urano, Neptuno};
			    
		    public static void main(String[] args) {
		 
		        Planetas primerPlaneta = Planetas.Mercurio;
		        Planetas ultimoPlaneta = Planetas.Neptuno;
		        
		        System.out.println("El primer planeta es: " + primerPlaneta);
		        System.out.println("El ultimo planeta es: " + ultimoPlaneta);
		        System.out.println("La posición del primer planeta es " + primerPlaneta.ordinal());  
		        System.out.println("La posición del ultimo planeta es " + ultimoPlaneta.ordinal());
		        
		        System.out.println("El número de planetas es " + Planetas.values().length);

		    
		    } 

		

		
		
	}


