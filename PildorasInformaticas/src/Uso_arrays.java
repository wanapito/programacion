
/**
 *
 * @author Ivan
 */
public class Uso_arrays {

    public static void main(String[] args) {
        /*  int[] mi_matriz = new int[5];
        //  int mi_matriz []=new int[5];
        //se empeiza a contar desde 0 
        mi_matriz[0] = 5;
        mi_matriz[1] = 38;
        mi_matriz[2] = -15;
        mi_matriz[3] = 92;
        mi_matriz[4] = 71;
        //para imprimir valor de una variable
        //System.out.println(mi_matriz[3] );
       el entero i imprimira todo hasta llegar a mi matriz 5 sumadno 1 cada vez
         */
        //esta es otra manera de nombra arrays
        int[] mi_matriz = {5, 38, -15, 92, 72,85,65};
        //si no sabemos cuantos valores tiene el array con legth ira hasta el limite
        for (int i = 0; i < mi_matriz.length; i++) {
// for (int i = 0; i < 5; i++) {
            System.out.println("valor de indice " + i + " m " + mi_matriz[i]);
        }
    }

}
