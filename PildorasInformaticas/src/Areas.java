
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Ivan
 */
public class Areas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // con \n saltamos una linea tantos saltos se indica con mumeros 
        System.out.println("Elige una opcion:\n" + "1: Cuadrado\n" + "2: Rectangulo\n" + "3: Triangulo\n" + "4: Circulo");
        int figura = entrada.nextInt();
        switch (figura) {
            // si figura es igual a "1" se hara la siguiente instruccion 
            case 1:
                //con parse int se convierte un string en int
                // con joptionpane.showinputdialog se abre un panel para introdcir los datos 
                int lado = Integer.parseInt(JOptionPane.showInputDialog("introduce el lado"));
                //con math.pow lo que hacemos es poner un aexponent a un numero 
                // en el caso del area de cuadrado es lado al cuadrado se indica el 2
                System.out.println("el area del cuadrado es " + Math.pow(lado, 2));
                // hay que finalizar swith con break
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
                System.out.println("el area del rectangulo es  " + base * altura);
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base "));
                altura = Integer.parseInt(JOptionPane.showInputDialog("intruduce la altura"));
                System.out.println("el area del triangulo es " + (base * altura) / 2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("introduce el radio"));
                System.out.print("el area del circulo es ");
                //con %1.2f indicamos cuantos decimales queremos dando formato 

                // con math.pi damos que valor del pi 
                // con math. pow damos indicamos numero y exponente 
                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
                break;
                // con default si no se cumple ninguna opcion sera esa la que salga 
            default:
                System.out.println("la opcion no es correcta ");

        }
        entrada.close();
    }

}
