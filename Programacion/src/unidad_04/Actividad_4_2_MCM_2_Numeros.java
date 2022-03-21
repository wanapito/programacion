package unidad_04;


import java.util.Scanner;
/**
 *
 * @author Ivan
 */
public class Actividad_4_2_MCM_2_Numeros {
 
 
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Introduce primer numero");
        int num1 = teclado.nextInt();
 
        System.out.println("Introduce segundo numero");
        int num2 = teclado.nextInt();
 
        int resultado = mcm(num1, num2);
 
        System.out.println("Minimo Comun Multiplo es: " + resultado);
 teclado.close();
    }
 
    public static int mcm(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
 
        int resultado = (a / mcd(num1, num2)) * b;
         
        return resultado;
 
    }
 
    public static int mcd(int num1, int num2) {
 
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
 
        int resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;
 
        } while (b != 0);
 
        return resultado;
 
    }
}
    

