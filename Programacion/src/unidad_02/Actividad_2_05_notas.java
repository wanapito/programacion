package unidad_02;

public class Actividad_2_05_notas {
	/*
	 * Realizar un programa que visualice en pantalla la nota la nota m�s alta y las m�s baja 
	 * de un conjunto de 25 alumnos. La m�s alta puede ser un 10 y la m�s baja un 1. Nota: 
	 * Para hacer este ejercicio ser� interesante disponer de una estructura de almacenamiento
	 *  de tipo array que contenga las notas. Ver Anexo I: Introducci�n a los arrays.
	 */


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//Declaramos y creamos un array de 25 notas con datos generados aleatoriamente (lo hacemos as� por comodidad o vaguer�a, seg�n se mire)  
			int []notas=new int[25];

			//Carga de los datos. Al aplicar el casteo, truncamos la parte decimal generada por Math.random()
			for(int i=0; i<notas.length; i++) {
				notas[i]=(int) (10*(Math.random())) + 1;
			}

			//Mostramos todos los datos
			for(int i=0; i<notas.length; i++) {
				System.out.println("Nota en posicion " + i + ": "+ notas[i]);
			}

			int notaMaxima=1, notaMinima=10;

			//An�lisis de los datos
			for(int i=0; i<notas.length; i++) {
				if (notas[i]<notaMinima)
					notaMinima=notas[i];
				if (notas[i]>notaMaxima)
					notaMaxima=notas[i];

			}

			//Salida tras analisis completado
			System.out.println("Nota m�nima: " + notaMinima);
			System.out.println("Nota m�xima: " + notaMaxima);

		}

	




}


