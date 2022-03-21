
import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Evalua_edad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce tu edad por favor");
        //con entrada.nextint() 
        // decimos que siguiente dato que se introduzca en el teclado 
        //se lo damoa la variable 
        int edad = entrada.nextInt();
        //con la variable if creamos condiciones 
        //<mennor que 
        //>mayor que 
        //<= menor o igual que 
        //>= mayor o igua que 
        //== igual que 
        //if (edad >= 18) {
        //    System.out.println("eres mayor de edad ");
        // } // hay que abrir y cerrar con llave cada if 
        //if (edad < 18) {
        //     System.out.println("eres menor de edad ");
        // else {
        // con else si la condicion if no se cumple 
        // daria el siguiente resultado 
        //    System.out.println("Esres menor de edad ");
        // }
        if (edad < 18) {
            System.out.println("eres un adolescente ");
        } 
        //con else if vamos pasando por todas la comprobaciones hasta encontrar 
        // la que es verdadera 
        // si no la encuentra haria el else final 
        
        else if (edad < 40) {
            System.out.println("Eres joven ");
        } else if (edad < 65) {
            System.out.println("eres maduro");
        } else {
            System.out.println("cuidate ");
        }
        entrada.close();
    }
}
