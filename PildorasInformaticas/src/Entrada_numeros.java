
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Entrada_numeros {

    public static void main(String[] args) {
        //double x=10000.0;
        //con esta tecnica se acortan los decimales 
        //donde .2 serian los decimales a mostrar
        //ademas de poner printf
        //System.out.printf("%1.2f",x/3);
        String num1 = JOptionPane.showInputDialog("introduce un numero");
        //convertimos a double decimal con parse doublepara hacer la raiz
        double num2 = Double.parseDouble(num1);
        System.out.print("la raiz de " + num2 + " es ");
        System.out.printf("%1.2f", Math.sqrt(num2));
    }

}
