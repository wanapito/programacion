package unidad_03;

import java.util.Scanner;

public class Actividad_A3_02_clase_main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//cramos metodo main 
				//creamos los objetos el primero ira al contructor que tiene en argumento 
			//el segundo contructor ira al que esta inicializados
		 Scanner teclado = new Scanner(System.in);
	        
	        System.out.println("Especifique el tipo de figura:");
	        System.out.println("1. Triángulo rectángulo");
	        System.out.println("2. Rectángulo");
	        System.out.println("3. Círculo");
	        int tipo = teclado.nextInt();
	        
	        //metodo if en funcion del valo que le demos a tipo en este caso le damos mismo valor a 1 y2 
	        if (tipo == 1 || tipo == 2)
	        {
	            System.out.println("Escribe la base");
	            double base = teclado.nextDouble();
	            System.out.println("Escribe la altura");
	            double altura = teclado.nextDouble();
	            //metodo if activamos la variables para 1 
	            if (tipo == 1)
	            {
	            	//creamos objeto con contructor argumentado
	               Actividad_A3_02_Clase_triaungulorectangulo t = new Actividad_A3_02_Clase_triaungulorectangulo(base,altura);
	                System.out.println("El perímetro es "+t.perimetro());
	                System.out.println("El área es "+t.area());
	            }
	            //metodo if si no es 1 sera 2 por lo que se activa el valor 2
	            else
	            {
	              	//creamos objeto con contructor argumentado
	                Actividad_A3_02_Clase_rectangulo r = new Actividad_A3_02_Clase_rectangulo(base,altura);
	               //lamammos a los metodos 
	                System.out.println("El perímetro es "+r.perimetro());
	                System.out.println("El área es "+r.area());
	            }
	        }
	        //metodo if activamos variable para 3 
	        else if (tipo==3)
	        {
	            System.out.println("Escribe el radio");
	            double radio = teclado.nextDouble();
	            Actividad_A3_01_Clase_Circulo c = new Actividad_A3_01_Clase_Circulo(radio);
	            
	            System.out.println("El perímetro es "+c.perimetro());
	            System.out.println("El área es "+c.area());
	        }
	        //metodo if si no es ningun valor entre 1 2 3 dara este mensaje 
	        else
	        {
	            System.out.println("La elección no es correcta");
	        }
	        teclado.close();
	    }
	    
	}
