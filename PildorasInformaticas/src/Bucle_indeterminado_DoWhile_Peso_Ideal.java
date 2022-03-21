
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Bucle_indeterminado_DoWhile_Peso_Ideal {

    public static void main(String[] args) {

        String genero = "";
        do {
            //pedimos que se introduzca el genero
            genero = JOptionPane.showInputDialog("introduce genero (H/M)");
            //entonces se analiza si es H o M 
        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
        // por parse int pasamos string a int
        int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce altura en cm"));
        int pesoIdeal = 0;
        //si se introduce h 
        if (genero.equalsIgnoreCase("H")) {
            pesoIdeal = altura - 110;
            // si se introduce m
        } else if (genero.equalsIgnoreCase("M")) {
            pesoIdeal = altura - 120;
        }
        System.out.println("tu peso ideal es "+ pesoIdeal);
    }
}
