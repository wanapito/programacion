
/**
 *
 * @author Ivan
 */
public class Manipula_Cadenas_2 {

    public static void main(String[] args) {
        //substring extrae un determinadonumero de caracteres de una cadena
        String frase = "Hoy es un estupendo dia para aprender a programar en Java";
        //tenemos que indicar desde donde se comienza a leer hasta donde se termina
        String frase_resumen = frase.substring(0, 29) + " irnos a la playa "
                + "y olvidarnos de todo " + "y " + frase.substring(29, 57);
        System.out.println("frase_resumen = " + frase_resumen);

    }

}
