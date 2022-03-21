
/**
 *
 * @author Ivan
 */
public class Uso_arrays_Bidimensionales {
    
    public static void main(String[] args) {
         //si de dos dimesiones se pone dos[]   
       //indicamos numero de valores de array 
         int [][] matrix= new int [4][5];
        matrix [0][0]=15;
        matrix [0][1]=21;
        matrix [0][2]=18;
        matrix [0][3]=9;
        matrix [0][4]=15;
        
        matrix [1][0]=10;
        matrix [1][1]=52;
        matrix [1][2]=17;
        matrix [1][3]=19;
        matrix [1][4]=7;
        
        matrix [2][0]=19;
        matrix [2][1]=2;
        matrix [2][2]=19;
        matrix [2][3]=17;
        matrix [2][4]=7;
        
        matrix [3][0]=92;
        matrix [3][1]=13;
        matrix [3][2]=13;
        matrix [3][3]=32;
        matrix [3][4]=41;
        
   // se empieza a contar desde 0 por lo que 4;5 sera de 0 a 3 y 0 a 4   
  // no es una obligacion el que estan ordenados 
  //poniendo la matriz que queremos ver llamamos a es variable 
 //       System.out.println(matrix[2][3] );
 for (int i =0 ; i<4;i++){
     
     System.out.println( );
     //con este for anidado va ir leyendo variables hasta contar 5 
     //una vez pase por todos vamos a anidacion superior 
     //y otra vez ira abajo
     //como hara eso podemos hacer un salto de linea por cada recorrido con soutv vacio
     for ( int j =0 ; j<5;j++){
         System.out.print(matrix[i][j]+" " );
     }
 }
     
    }
}
