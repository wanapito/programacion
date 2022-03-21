
import javax.swing.JOptionPane;




/**
 *
 * @author Ivan
 */
public class Entrada_Ejemplo_2 {

    public static void main(String[] args) {
        //con esta opocion parecera una cuadro de mensaje donde rellenar en vez
        // del cuadro output
        String nombre_usurio = JOptionPane.showInputDialog("introduce tu nombre por favor");

        String edad = JOptionPane.showInputDialog("introduce la edad por favor");
       //integer.parseint pasa de tipo string a tipo entero
        int edad_usuario = Integer.parseInt(edad);
        //podemos sumar con +n o sumar 1 con ++
        //edad_usuario++;
        System.out.println("mi nombre es  " + nombre_usurio + " el año que viene tendras " + (edad_usuario+1) + " años ");

    }

}
