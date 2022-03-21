 import javax.swing.JOptionPane;

public class Factorial{
public static void main(String[] args) {
     
        int resultado = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
        //el entero i es igual a la variable numero hasta que no sea
        //menor que 0 restara numero hasta llegar a 0 
        for (int i = numero; i > 0; i--) {
            resultado = resultado * i;
        }
        System.out.println("El factorial de " + numero + " es " + resultado);
    }

}



