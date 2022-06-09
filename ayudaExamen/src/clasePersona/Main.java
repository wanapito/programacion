 
package clasePersona;
import java.lang.*;
import java.io.*;
import  java.util.Scanner;

 
public class Main {
    
    public static void main(String[] args) {
                Persona objPersona =new Persona();
        /*
        Scanner  teclado =new Scanner(System.in);
        
        
        

        System.out.println("  Introduzca el nombre  : " );
        objPersona.setNombre(teclado.nextLine());        
                
        System.out.println("  introduza la edad "  );
        objPersona.setEdad( Integer.parseInt( teclado.nextLine()));
        
        System.out.println("  introduzca altura "  );
        objPersona.setAltura( Float.parseFloat( teclado.nextLine() ) );
        
       System.out.println("  ");
        System.out.println("  ");
       */
        System.out.println("  " +  objPersona.getNombre());
        System.out.println("  " +  objPersona.getEdad());
        System.out.println("  " +  objPersona.getAltura());
   
        
        /*
                System.out.println("  Modificar el nombre  : " );
        objPersona.setNombre(teclado.nextLine());        
        
               System.out.println(" El nombre Modificado es: " +  objPersona.getNombre());
               */
               
    }
    
}
