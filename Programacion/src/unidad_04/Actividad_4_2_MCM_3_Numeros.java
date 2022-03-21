package unidad_04;


import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Actividad_4_2_MCM_3_Numeros {

 public static void main(String[] args) {
 
   Scanner teclado = new Scanner(System.in);
   
   System.out.println("Introduce primer numero ");
   int num1 = teclado.nextInt();
   System.out.println("Introduce segundo numero ");
   int num2 = teclado.nextInt();
   System.out.println("Introduce tercer numero ");
   int num3 = teclado.nextInt();
   
   int numMax = num1;
   
         if ( num2 > numMax )
             numMax = num2;
  
         if ( num3 > numMax )
             numMax = num3;
         
   int resultado = numMax;
         while ((resultado % num1 != 0) || (resultado % num2 != 0) || (resultado % num3 != 0))
             resultado++;
  
          System.out.println("Minimo Comun Multiplo es: "+ resultado );
teclado.close();
 }

}
