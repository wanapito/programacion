package unidad_03;

import java.util.Scanner;

public class Actividad_3_2_Clase_Persona1 {

    private String nombre;
    private int edad;
    private float altura;

    	String consulta_Nombre() {
        return nombre;
    }
  
    	void cambia_Nombre(String nom) {
        nombre = nom;
    }

    	public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);  
        System.out.println("Introduzca el nombre de una persona: ");
        String persona = teclado.nextLine();

        Actividad_3_2_Clase_Persona1 objPersona1 = new Actividad_3_2_Clase_Persona1();
      
        objPersona1.cambia_Nombre(persona);
        System.out.println("\nEl nombre de la persona introducida es: ");
        System.out.println(objPersona1.consulta_Nombre());
teclado.close();
    }

}
