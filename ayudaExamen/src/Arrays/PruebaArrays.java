 
package Arrays;

import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PruebaArrays {
public static  double[] ArrayPadre;
    
    public PruebaArrays(int _tamañoArr) {
     ArrayPadre=  new double[_tamañoArr];
     ArrayPadre=    CrearInicializarTamaño();
    }
    
        
   double[] CrearInicializarTamaño(){
        double[] TamañoInicializado=new double[ArrayPadre.length];
       for (int x=0;x<=ArrayPadre.length-1;x++){
       TamañoInicializado[x]=0;
       }                
   return TamañoInicializado;           
  }
    
   public   void  LeerArray (){                 
   Scanner teclado=new Scanner(System.in);
    int valorTeclado;       
   
       for (int x=0;x<=ArrayPadre.length-1;x++){
           System.out.println("Ingrese los valores del array :");
           valorTeclado= teclado.nextInt();
            ArrayPadre[x]=valorTeclado;
       }       
       
   }
    
   
   public static void EscribirArray(){
   for (int x=0;x<= ArrayPadre.length-1;x++){
       System.out.println("Valores del array  posición->  " + x   + " Valores  : " +  ArrayPadre[x]);
        }
   }
   
   public static void Insertar(){
       int posi;
       int  contPos=0;
       int NuevoValor=0;
       Scanner teclado=new Scanner(System.in);
       System.out.println("Introduzca la posicion a insertar del dato: ");
       posi=teclado.nextInt();
       
       System.out.println("Introduzca el nuevo Valor: ");
       NuevoValor=teclado.nextInt();
       
       
       double[] tmpArr=new double[ArrayPadre.length + 1];
       
       boolean bexiste=false;
       int z=0;
       for (int x=0;x<=ArrayPadre.length-1;x++){
           
             if (contPos==posi){
             bexiste=true;
             tmpArr[z]=NuevoValor;
             tmpArr[z+1]=ArrayPadre[x];  
             z=z+2;
             }else{
              tmpArr[z]=ArrayPadre[x];  
              z=z+1;
             }
             contPos=contPos+1;
             
       }
       
       if (bexiste==true){
       ArrayPadre=new double[tmpArr.length];
       ArrayPadre=tmpArr;
       }else {
           System.out.println("La posicion a insertar no es válida, Vuelva a intentarlo");
           return;
       }             
  
   }
   
   
        public static void Eliminar (){
       int Pos=0;
            Scanner teclado=new Scanner(System.in);
            System.out.println("Introduzca la posicion a eliminar: ");       
            Pos=teclado.nextInt();
            boolean bexiste=false;
            
            double[] newArray = new double[ArrayPadre.length-1];
            
            
            for (int x=0;x<=ArrayPadre.length-1;x++){
                   if (x==Pos){
                   ArrayPadre[x]=666;
                    bexiste=true;                   
                   }                
            }
            int cont=0;
            if (bexiste==true){
                              
                for (int x=0;x<=ArrayPadre.length-1;x++){
                    
                    if (ArrayPadre[x]!=666){
                    newArray[cont]=ArrayPadre[x];
                    cont =cont+1;
                    }
                    
                }
                
                ArrayPadre=new double[newArray.length];
                ArrayPadre=newArray;
                
            }
            
            
       }
       
   
   
   
       public static void  busquedaSecuencial(){
           double[] Array;
        Array=ArrayPadre;
        
        double[] NuevoArray=new double[Array.length];
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("busquedaSecuencial Introduce el valor a buscar ");
        int valorBusqueda;
        valorBusqueda=teclado.nextInt();
         boolean bExite=false;
        
        for (int i=0;i<=Array.length-1;i++){
                if (Array[i]==valorBusqueda){                   
                    bExite=true;                
                    System.out.println("La posicion del elemento es : " + i);            
                }
        }
        
        if (bExite==false){
            System.out.println("No existe el valor en el array  -  1");            
         }
                      
        
    }
   
    
     public static void  busquedaBinaria(){
int valorBuscar;
         Scanner teclado=new Scanner(System.in);           
         System.out.println("busquedaBinaria  Introduzca el valor a buscar :");
         valorBuscar=teclado.nextInt();




        double[] Array=ArrayPadre;
                
        
                
        int n = _busquedaBinaria(Array, valorBuscar);
        if (n==-1)
            System.out.println("Valor " + valorBuscar  +   " no encontrado");
        else
            System.out.println("Se ha encontrado tras "+n+" comparaciones");
          
        System.out.println("Introduzca el valor a buscar :");
         valorBuscar=teclado.nextInt();
        
        
        n = _busquedaBinaria(Array, valorBuscar);
        if (n==-1)
            System.out.println("Valor " + valorBuscar +  " no encontrado");
        else
            System.out.println("Se ha encontrado tras "+n+" comparaciones");        
            
        }
    
    public static int _busquedaBinaria(double[] vector, int valor)
    {                                              
                        
        int menor_pos = 0;
        int mayor_pos = vector.length-1;
        int medio_pos = (menor_pos + mayor_pos) / 2;
        int comp = 1;
        while (menor_pos <= mayor_pos && vector[medio_pos] != valor) 
        {
            comp++;
            if (valor < vector[medio_pos])
                mayor_pos = medio_pos -1;
            else
                menor_pos = medio_pos +1;
            medio_pos = (menor_pos + mayor_pos)/2;
        }
        return (vector[medio_pos] == valor)?comp:-1;
    }
    
    
  public static void  maximo(){
      double[] Array=ArrayPadre;
      
      
        double posicion,mayor,valor;
        valor=0;
        mayor=0;
        posicion=0;
        for (int i=0;i<=Array.length-1;i++){
             if (i==0){
             valor=Array[i];
             } else{
                    if (valor > Array[i]){
                         mayor=valor;
                         posicion=i;
                    }else{
                         mayor=Array[i];
                    }
                 valor=mayor;
             }
        }
        
        
            for (int i=0;i<=Array.length-1;i++){
                if (Array[i]==mayor){                                                   
                   posicion=i; 
                }
        }
                    
         System.out.println("El Valor mayor es : " + mayor + " y su posicion es :" + posicion);                             
    } 
     
  
      public static void  minimo(){
        double[] Array=ArrayPadre;
          
        double posicion,menor,valor;
        valor=0;
        menor=0;
        posicion=0;
        for (int i=0;i<=Array.length-1;i++){
             if (i==0){
             valor=Array[i];
             } else{
                    if (valor < Array[i]){
                         menor=valor;
                         posicion=i;
                    }else{
                         menor=Array[i];
                    }
                 valor=menor;
             }
        }
        
        
            for (int i=0;i<=Array.length-1;i++){
                if (Array[i]==menor){                                                   
                   posicion=i; 
                }
        }
                    
         System.out.println("El Valor menor es : " + menor + " y su posicion es :" + posicion);                     
        
    }  
  
  
      public static void Ordenaburbuja()
    {
        double[] v=ArrayPadre;
        for (int i = 1; i <v.length;i++)
        {
            for (int j = 0; j < v.length-i;j++ )
            {
                if (v[j] > v[j+1])
                {
                    double aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
        
        System.out.println("Ordenación Burbuja");
        
      EscribirArray();         
    }   
    
      
         public static void fusion()                 
    {
        double[] v=ArrayPadre;        
        double[]  Array2={36,527,369,456,85};
        double[] A_fusion=new double[v.length + Array2.length];
        int x=0;
        for (int i=0;i<=(v.length) - 1;i++){
                A_fusion[i]=v[i];
            x=i;
        }
        x=x+1;
        
         for (int i=0;i<=(Array2.length) - 1;i++){             
            A_fusion[x + i]=Array2[i];
        }
         
         Ordenaburbuja();
         
    }
         
        public static void media()
    {
        double[] v=ArrayPadre;
        
       double mediaValor;
       mediaValor=0;
       
        for (int i=0;i<=(v.length) - 1;i++){
            mediaValor=mediaValor + v[i]  ;
        }
        
        mediaValor=mediaValor/v.length;
        
        System.out.println(" la Media Aritmetica de los elementos del array es: " + mediaValor);
     
         
    }
     
        
        
}
