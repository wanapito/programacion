package unidad_03;

import java.util.Scanner;

public class Actividad_3_2_Clase_Persona4 {

    private String nombre;
    private int edad;
    private float altura;

    	public Actividad_3_2_Clase_Persona4(String nombre, int edad, float altura) { 
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    	String consulta_Nombre() { 
        return nombre;
    }

    	int consulta_Edad() { 
        return edad;
    }

    	float consulta_Altura() { 
        return altura;
    }

    	void cambia_Nombre(String nom) { 
        nombre = nom;
    }

    	void cambia_Edad(int edad) { 
        this.edad = edad; 
    }

    	void cambia_Altura(float altura) { 
        this.altura = altura; 
    }

    	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

       
        System.out.println("Introduzca el nombre de una persona: ");
        String nomPersona = teclado.nextLine();

        System.out.println("Introduzca la edad de una persona: ");
        int edadPersona = teclado.nextInt();

        System.out.println("Introduzca la altura de una persona: ");
        String alturaPersona = teclado.next(); 
        String alturaPersona1 = alturaPersona.replace(",", "."); 
        float alturaFinal = Float.parseFloat(alturaPersona1); 

        Actividad_3_2_Clase_Persona4 objPersona1 = new Actividad_3_2_Clase_Persona4(nomPersona, edadPersona, alturaFinal);

        System.out.println("\n--------El valor introducido de las variables es: ----------");
        System.out.println("El nombre de la persona introducida es: " + objPersona1.consulta_Nombre());
        System.out.println("La edad de la persona introducida es: " + objPersona1.consulta_Edad());
        System.out.println("La altura introducida de la persona es: " + objPersona1.consulta_Altura());

        System.out.println("\n--------Cambiamos el valor de las varibles: ---------");
        
        objPersona1.cambia_Nombre("Luisa Perez");
        objPersona1.cambia_Edad(22);
        objPersona1.cambia_Altura(1.70F);

        System.out.println("El nombre de la persona introducida es: " + objPersona1.consulta_Nombre());
        System.out.println("La edad de la persona introducida es: " + objPersona1.consulta_Edad());
        System.out.println("La altura introducida de la persona es: " + objPersona1.consulta_Altura());
        teclado.close();
    }
}
