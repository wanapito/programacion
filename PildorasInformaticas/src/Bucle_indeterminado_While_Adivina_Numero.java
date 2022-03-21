
import java.util.Scanner;


/**
 *
 * @author Ivan
 */
public class Bucle_indeterminado_While_Adivina_Numero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
           //math ramdom crea numeros aleatorios tipo double
             //con (int ) pasamos tipo double a tipo entero 
           // al mutiplicar por 100 ... podemos mover la coma 
        int aleatorio = (int)(Math.random()*100);
        int numero = 0;
        int intentos = 0;
        //mientra numero diferente de aleatorio
        while (numero!=aleatorio){
            //con ++ vamos sumando 1 tantas  veces se utilice el metodo
            intentos ++;
            System.out.println("introduce un numero por favor " );
            numero = teclado.nextInt();
            //si aleatorio es mas bajo que numero
            if (aleatorio < numero){
                System.out.println("mas bajo" );
                
            }
            // como en "aleatorio" hay un numero almacenado hasta que no se acierte
            // el numero no saldra correcto
            else if (aleatorio>numero){
                System.out.println("mas alto ");
            }
        }
     
    
        System.out.println("correcto\n"+" los has conseguido en "+intentos+" intentos");  
       teclado.close();
    }
}
