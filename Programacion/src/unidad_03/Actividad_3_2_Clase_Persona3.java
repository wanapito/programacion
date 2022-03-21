package unidad_03;



public class Actividad_3_2_Clase_Persona3 {
 
 private String nombre;
 private int edad;
 private float altura;
  

    	public Actividad_3_2_Clase_Persona3 (){  
    
        nombre = "Luisa Perez"; 
        edad = 22;
        altura = 1.70F;
    }
     
    	String consulta_Nombre(){ 
        return nombre;
    }
  
   		int consulta_Edad(){ 
        return edad;
    }
  
    	float consulta_Altura(){ 
        return altura;
    }
     
    	void cambia_Nombre(String nom){ 
        nombre=nom;
    }
     
    	void cambia_Edad(int age){ 
        edad=age;
    }
     
    	void cambia_Altura(float alt){ 
        altura=alt;
    }
        
    	public static void main(String[] args) {

        
        Actividad_3_2_Clase_Persona3 objPersona1 = new Actividad_3_2_Clase_Persona3();

        System.out.println("El nombre de la persona introducida es: " + objPersona1.consulta_Nombre());
        System.out.println("La edad de " + objPersona1.consulta_Nombre()+ " es de " + objPersona1.consulta_Edad()+ " años");
        System.out.println("La altura de " + objPersona1.consulta_Nombre()+ " es de " + objPersona1.consulta_Altura()+" metros");
    }
}