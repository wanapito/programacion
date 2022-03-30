
import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Entrada_Ejemplo_1 {

    public static void main(String[] args) {
        //hay que declarar una scanner a la variable eimportar java util 
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce tu nombre por favor = ");
        //con nexline pedimos que a la variabe entrada recoja el dato texto para 
        //almacenar la variable 
        String nombre_usuario = entrada.nextLine();
        System.out.println("introduce edad , por favor ");
        // con nextint recojemos un entero para almacenar en la variable
        int edad = entrada.nextInt();
        System.out.println("hola " + nombre_usuario+ " el año que viene tendras "
        +(edad+1)+ " años");
        entrada.close();
    }

}
