
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Bucle_Determinado_For_CompruebaMail {

    public static void main(String[] args) {
        // con bolean solo comprobara si hay arrobas pero un numero determinado
        //boolean arroba = false;
        //  con int si queremos comprobar varias arrobas el mejor paso es decir que cuente 
        // cuantas hay y el valor correcto solo sera 1
        int arroba = 0;
        boolean punto = false;
        String mail = JOptionPane.showInputDialog("introduce un mail");

        for (int i = 0; i < mail.length(); i++) {
            //la variable de tipo char van con comilla simple
            if (mail.charAt(i) == '@') {
                //arroba = true;
                arroba++;
            }
            // analimazo si tiene punto el mail
            if (mail.charAt(i) == '.') {
                punto = true;
            }
        }
        //if (arroba == true) {
        if (arroba == 1) {
            System.out.println("el mail es correcto  ");
        } 
        else {
            System.out.println("el mail no es correcto  ");
        }
        //el metodo .leght cuenta caracteres 
        System.out.println(mail.length());
    }

}
