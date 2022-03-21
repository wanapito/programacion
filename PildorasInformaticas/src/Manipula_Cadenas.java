
/**
 *
 * @author Ivan
 */
public class Manipula_Cadenas {

    public static void main(String[] args) {
        //lavariable se declara con comillas 
        String nombre = "Ivan";
        System.out.println("Mi nombre es : " + nombre);
        //length e indica el numero de letras de la variable
        System.out.println("Mi nombre tine: " + nombre.length() + " letras.");
        //charat devuelve la letra que indiquemos en el parentesis empieza a contar desde 0
        System.out.println("La primera letra de mi nombre " + nombre + " es la " + nombre.charAt(0));
        int ultima_letra;
        //podemos declara una variable con otra variable 
        ultima_letra = nombre.length();
        //a la variable le podemos restar una posicion 
        System.out.println("y la ultima letra es la " + nombre.charAt(ultima_letra - 1));
   
    }
    
}
