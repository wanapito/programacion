
package Arrays;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {            
            
            int tamañoArr;
            Scanner teclado=new Scanner(System.in);           
            System.out.println("Ingrese el tamaño del array:");
            tamañoArr=teclado.nextInt();
            
            PruebaArrays obj=new PruebaArrays(tamañoArr);
            
            obj.LeerArray();
            obj.EscribirArray();
            obj.Insertar();
            obj.EscribirArray();
            obj. Eliminar();
            obj.EscribirArray();                    
            obj.busquedaSecuencial();
            obj.busquedaBinaria();
            obj.maximo();
            obj.minimo();
            obj.Ordenaburbuja();
            obj.fusion();
            obj.media();
    }
}
