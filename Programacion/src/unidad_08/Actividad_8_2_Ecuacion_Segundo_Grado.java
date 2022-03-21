package unidad_08;

import java.util.Scanner;

public class Actividad_8_2_Ecuacion_Segundo_Grado {

		
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
    	System.out.println("Introduce el coeficiente 'a': ");
        double coefiA = teclado.nextDouble();
    	System.out.println("Introduce el coeficiente 'b': ");
        double coefiB = teclado.nextDouble();
    	System.out.println("Introduce el coeficiente 'c': ");
        double coefiC = teclado.nextDouble();
        double discriminante;
        double resul1;
        double resul2;
        teclado.close();
        
   
        if(coefiA == 0 && coefiB == 0) {
        	throw new ErrorEcuacionDegenerada();
        }
       
        
           if (coefiB != 0 && coefiC != 0) {
        	discriminante = (coefiB * coefiB) - 4 * coefiA * coefiC;
        	if(discriminante > 0) {
        		resul1 = ((-coefiB) + Math.sqrt(discriminante)) / (2 * coefiA);
        		resul2 = ((-coefiB) - Math.sqrt(discriminante)) / (2 * coefiA);
        		System.out.printf("Resultado: Dos soluciones reales distintas x = %f, x = %f", resul1, resul2);
        	} else if (discriminante == 0) {
        		resul1 = (-coefiB) / (2 * coefiA);
        		System.out.printf("Resultado: Dos soluciones reales iguales x = %f", resul1);
        	} else {
        		
        		throw new ErrorRaizCompleja();
        	
        	}
        }
        
        // Caso 2 b = 0
        if (coefiB == 0 && coefiC != 0) {
        	resul1 = Math.sqrt( (-coefiC / coefiA));
        	resul2 = -Math.sqrt( (-coefiC / coefiA));
        	if(resul1 < 0 || resul2 < 0) {
        		System.out.printf("Dos soluciones reales distintas x = %f, x = %f", resul1, resul2);
        	} else {
        		System.out.printf("No hay soluciones reales (dos soluciones complejas distintas).");
        	}
        }
        
        // Caso 3 c = 0
        if (coefiC == 0 && coefiB != 0) {
        	resul1 = -coefiB / coefiA;
        	System.out.printf("Dos soluciones reales distintas x = 0, x = %f", resul1);
        }
        
        // Caso 4 b = c = 0
        if (coefiB == 0 && coefiC == 0 ) {

        	System.out.print("Solucion unica x = 0");
        }
    
        }
        catch(ErrorEcuacionDegenerada e){
        	System.out.println("Error, ecuacion degenerada");
        }
        catch(ErrorRaizCompleja e){
    		System.out.println("No hay soluciones reales (dos soluciones complejas distintas).");
    	}
    
      
    }
	
}

class ErrorEcuacionDegenerada extends Exception
{
	public ErrorEcuacionDegenerada()
	{
		super();
	}
}

class ErrorRaizCompleja extends Exception
{
	public ErrorRaizCompleja()
	{
		super();
	}
}