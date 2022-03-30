
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Bucle_indeterminado_While_Acceso_aplicacion {

    public static void main(String[] args) {

        String clave = "ivan";
        // al declara variable vacia sera rellenada mas tarde
        String pass = "";
        //while significa mientras 
        //esta diciendo que la clave introducida en pass tiene 
        // que ser igual a lo escrito en pass con referencia a clave
        while (clave.equals(pass) == false) {
            //mienra que la variable pass sea diferente aparecera la ventana
            pass = JOptionPane.showInputDialog("introduce contraseña");
            
            if (clave.equals(pass) == false) {
                System.out.println("conraseña incorrecta  ");
            }
        }
        System.out.println("contraseña correcta.\n "+"Acceso permitido  ");
    }

}
