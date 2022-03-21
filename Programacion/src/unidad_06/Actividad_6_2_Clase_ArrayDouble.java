package unidad_06;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_6_2_Clase_ArrayDouble {

    Scanner sc = new Scanner(System.in);

    private double array[];
    private int dimensionArray;
    private int numeroElementos;

    public Actividad_6_2_Clase_ArrayDouble() {
        System.out.println("Introduce el tamaño del array: ");
        dimensionArray = sc.nextInt();
        array = new double[dimensionArray];
        numeroElementos = 0;
    }

    public Actividad_6_2_Clase_ArrayDouble(int dimensionArray) {
        this.dimensionArray = dimensionArray;
        array = new double[dimensionArray];
        numeroElementos = 0;
    }

    public Actividad_6_2_Clase_ArrayDouble(Actividad_6_2_Clase_ArrayDouble copia) {
        numeroElementos = copia.numeroElementos;
        dimensionArray = copia.dimensionArray;
        array = new double[dimensionArray];

        for (int i = 0; i < numeroElementos; i++) {
            array[i] = copia.array[i];
        }
    }

    public void leerArray() {
        for (int i = 0; i < dimensionArray; i++) {
            System.out.println("Posicion " + i + " del array " + array[i]);
        }
    }

    public void escribirArray() {
        double contenidoArray;
        System.out.println("Introduce los elementos del Array. Para finalizar introduce 999");
        for (int i = 0; i < dimensionArray; i++) {
            contenidoArray = sc.nextDouble();
            if (contenidoArray == 999) {
                break;
            }
            array[numeroElementos] = contenidoArray;
            numeroElementos++;
        }
    }

    public void insertar() {
        int posicionArray;
        double numeroInsertado;
        do {
            System.out.println("Introduce la posicion del numero que quieres insertar: ");
            posicionArray = sc.nextInt();
            if (posicionArray < 0 || posicionArray > dimensionArray) {
                System.out.println("Error, la posicion introducida no es valida");
            }
        } while (posicionArray <= 0 && posicionArray > dimensionArray);
        System.out.println("Introduce el numero que quieres insertar: ");
        numeroInsertado = sc.nextDouble();
        array[posicionArray] = numeroInsertado;
        numeroElementos++;
    }

    public void eliminar() {
        int posicionAEliminar;
        do {
            System.out.println("Introduce la posicion que quieres eliminar: ");
            posicionAEliminar = sc.nextInt();
            if (posicionAEliminar < 0 || posicionAEliminar > dimensionArray) {
                System.out.println("Error, la posicion introducida no es valida");
            }
            array[posicionAEliminar] = 0.0;
            numeroElementos--;
        } while (posicionAEliminar <= 0 && posicionAEliminar > dimensionArray);
    }

    public int busquedaSecuencial(int numeroBuscado) {
        for (int i = 0; i < dimensionArray; i++) {
            if (array[i] == numeroBuscado) {
                return i;
            }
        }
        return -1;
    }

    public boolean busquedaBinaria(double numeroBuscado) {
        double arrayCopia[] = Arrays.copyOf(array, dimensionArray);
        Arrays.sort(arrayCopia);
        int inicio = 0;
        int fin = dimensionArray - 1;
        while (inicio <= fin) {
            int mitad = inicio + (fin - inicio) / 2;
            if (arrayCopia[mitad] == numeroBuscado) {
                return true;
            }
            if (arrayCopia[mitad] < numeroBuscado) {
                inicio = mitad + 1;
            } else {
                fin = mitad - 1;
            }
        }
        return false;
    }

    public void maximo() {
        double numeroMayor;
        int posicionNumeroMayor = 0;
        numeroMayor = array[0];
        for (int i = 0; i < dimensionArray; i++) {
            if (array[i] > numeroMayor) {
                numeroMayor = array[i];
                posicionNumeroMayor = i;
            }
        }
        System.out.println("Maximo -> Posicion: " + posicionNumeroMayor + " Numero: " + numeroMayor);
    }

    public void minimo() {
        double numeroMenor;
        int posicionNumeroMenor = 0;
        numeroMenor = array[0];
        for (int i = 0; i < dimensionArray; i++) {
            if (array[i] < numeroMenor) {
                numeroMenor = array[i];
                posicionNumeroMenor = i;
            }
        }
        System.out.println("Minimo -> Posicion: " + posicionNumeroMenor + " Numero: " + numeroMenor);
    }

    public void ordenaBurbuja() {
        double auxiliar;
        for (int i = 0; i < dimensionArray - 1; i++) {
            for (int j = 0; j < dimensionArray - 1; j++) {
                if (array[j] > array[j + 1]) {
                    auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                }
            }
        }
    }

    public void fusion() {
        double array1[] = Arrays.copyOf(array, dimensionArray);
        Arrays.sort(array1);
        double array2[] = {2, 5, 6, 9};
        int dimensionArrayFusionado = array1.length + array2.length;
        double arrayFusionado[] = new double[dimensionArrayFusionado];

        int indiceArray1 = 0;
        int indiceArray2 = 0;
        int indiceArrayFusionado = 0;

        while (indiceArray1 < array1.length && indiceArray2 < array2.length) {
            if (array1[indiceArray1] < array2[indiceArray2]) {
                arrayFusionado[indiceArrayFusionado] = array1[indiceArray1];
                indiceArrayFusionado++;
                indiceArray1++;
            } else {
                arrayFusionado[indiceArrayFusionado] = array2[indiceArray2];
                indiceArrayFusionado++;
                indiceArray2++;
            }
        }
        while (indiceArray1 < array1.length) {
            arrayFusionado[indiceArrayFusionado] = array1[indiceArray1];
            indiceArray1++;
        }

        while (indiceArray2 < array2.length) {
            arrayFusionado[indiceArrayFusionado] = array2[indiceArray2];
            indiceArray2++;
        }
        System.out.println("Fusionado con [2, 5, 6, 9]");
        for (int i = 0; i < arrayFusionado.length; i++) {
            System.out.println("Posicion " + i + " del array " + arrayFusionado[i]);
        }

    }

    public void media() {
        double media = 0;
        for (int i = 0; i < dimensionArray; i++) {
            media += array[i];
        }
        media = media / numeroElementos;
        System.out.println("Media " + media);
    }
}
