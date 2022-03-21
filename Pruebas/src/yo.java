
public class yo {




    public static void main(String[] args) {
        double acumulado;
        double interes = 0.10;//10%
        double[][] saldo = new double[6][5];
        for (int i = 0; i < 6; i++) {
            //le estamos diciendo que todas las columnas empiezan por 10000
            saldo[i][0] = 10000;
            acumulado = 10000;
      
            for (int j = 1; j < 5; j++) {
                acumulado = (acumulado * interes);
                saldo[i][j] = acumulado;
            }
            interes = interes + 0.01;

        }
      for (int z=0;z<6;z++){
          System.out.println();
          for (int h= 0;h<5;h++){
              System.out.printf("%1.2f", saldo [z][h]);
              //se imprime formato con dos decimales 
              System.out.print(" ");
          }
      }
    }}

