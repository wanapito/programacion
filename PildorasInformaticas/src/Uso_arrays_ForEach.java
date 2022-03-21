


/**
 *
 * @author Ivan
 */
public class Uso_arrays_ForEach {

    public static void main(String[] args) {
        /*String[] paises = new String[8];
        paises[0] = "españa";
        paises[1] = "mexico";
        paises[2] = "colombia";
        paises[3] = "peru";
        paises[4] = "chile";
        paises[5] = "argentina";
        paises[6] = "ecuador";
        paises[7] = "venezuela";
         */
        //String[] paises ={"españa","mexico","colombia","peru"};
        //  for ( int i=0; i<paises.length;i++){
        //     System.out.println("pais " + (i+1)+" " + paises[i]);
        /*String[] paises = new String[8];
        for (int i = 0; i < 8; i++) {
            paises[i] = JOptionPane.showInputDialog("introduce pais " + (i + 1));

        }
        for (String elemento : paises) {
            System.out.println("pais: " + elemento);
        }

    }
        */
        //declaramos 150 elementos en una array 
int []matriz_aleatorio =new int [150];
//decimos que enseñe numero hasta llegar al final de 1 en 1 
for (int  i =0; i<matriz_aleatorio.length;i++){
    //indicamos que los numero van a ser redondos y aleatorios hasta el numero 100 
    matriz_aleatorio[i]=(int)Math.round(Math.random() * 100);
}
//decimos que van a ser numero y se sacan dede matriz aleatorio 
for (int numeros:matriz_aleatorio){
    //print se puede imprimir en linea 
    System.out.print(numeros+" ");
}
}}
