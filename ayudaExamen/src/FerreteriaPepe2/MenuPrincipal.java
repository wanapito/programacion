 
package FerreteriaPepe2;

import CarniceriaManolo2._Productos;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.text.html.HTML;

 
public class MenuPrincipal {
    
 
    public static ArrayList<Productos> _Productos = new ArrayList<Productos>();
    public static final String FICHERO = "FerreteriaPepe.dat";
    public static final String FICHERO_GANANCIA = "FacturaDeCompra.dat";
	
   //public static   String Tablaganancia;  

   public static String HtmlTabla="";
   
   
        public static void main(String[] args) {        
        AbrirYLeerFichero();
        int op = menuPrincipal();
        
        while (op!=3)
        {
            switch (op)
            {
       
                case 1: RegistrarProducto(); break;
                 case 2: RealizarCompra(); break;
       
            }
            
            op = menuPrincipal();
        }
        
        CerrarYGuardarFichero();
    }
     

   public static int menuPrincipal()
    {
        int op = 0;
        while (op<1 ||  op>8)
        {
            if (op==3){
                return op;
            }
            System.out.println("1. registrar Producto..:");
            System.out.println("2. Reaizar Compra..:");
            System.out.println("3. Salir del Programa");
            op = leerIntTeclado();
        }
        return op;
    }
      
            
   
   public static void RealizarCompra(){
       System.out.println("Listado de productor Ferreteria Don Pepe");
    ListarProductosFerreteria();
         Scanner sc = new Scanner(System.in);
         int codigoProducto;
         double Factura=0;
         int Peso=0;
        int tipo =1;
        HtmlTabla="Factura don Pepe \n Lista de Productos Comprado \n";
        String Compra="";
        while (tipo!=0)
        {
            System.out.println("Sistema Tienda Don PEPE");

            
            System.out.println("Ingrese el Código del Producto:");
            codigoProducto=leerIntTeclado();            
            Productos  tabla=buscarEnFichero(codigoProducto);
            
            if  (tabla==null){
                System.out.println("El Codigo ingresado no Existe! \n Vuelva a intentarlo.");                
            }else{
                   if (tabla.isTipoPrecio()==true){ //Precio Unitario
                   Compra= tabla.getCodigo() + " "+ tabla.getDescripcion() +" "+ tabla.getPrecio() + "\n";
                   Factura =Factura + tabla.getPrecio();
                   }else{ 
                   //Precio peso al kilo
                       System.out.println("Ingrese el Peso en Gramos:");
                       Peso=leerIntTeclado();
                   Compra= tabla.getCodigo() + " "+ tabla.getDescripcion() +"  Precio en KiloGramos  "+    tabla.CalcularPrecio(Peso) + "\n";
                   Factura =Factura +  tabla.CalcularPrecio(Peso);
                   }                                      
                HtmlTabla=HtmlTabla  +Compra;          
            }
            
            System.out.println("-> 1  Seguir Comprando  , ->0 Terminar Compra");
            tipo = leerIntTeclado();                                            
            
        }
        
        System.out.println(HtmlTabla  +  "\n Importe Total Compra: " + Factura);
    
        
        int Guardar=0;
        System.out.println("Desea Guardar la Factura de Compra ¿1 SI  ,  0 NO ? ");
        Guardar=leerIntTeclado();
                if (Guardar==1){
                    GuardarEnFicheroTexto_String();
                    
                }
        
            
    
   }
   
   
   
   

public static  void ListarProductosFerreteria (){
  Iterator <Productos> it = _Productos.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
}


public static  void RegistrarProducto (){
    System.out.println("Listado de productor Ferreteria Don Pepe");
ListarProductosFerreteria();

       Scanner sc = new Scanner(System.in);
        int tipo = 0;
        while (tipo!=1 && tipo!=2)
        {
            System.out.println("Seleccione El Precio del producto es \n-> 1 (Unitario)  \n-> 2 (Precio Peso)");
            tipo = leerIntTeclado();
        }
        int Codigo;
        String Nombre;
        Double Precio;
        
        System.out.print("Codigo: ");
        Codigo=leerIntTeclado();
        System.out.print("Nombre: ");
        Nombre=sc.nextLine();                       
        System.out.print("Precio: ");
        Precio=Double.parseDouble(sc.nextLine().replace(",","."));
                        
        if (tipo==1){
            _Productos.add(new Prod(Codigo,Nombre,Precio,true));
        }else{
            _Productos.add(new Prod(Codigo,Nombre,Precio,false));
        }

        CerrarYGuardarFichero();
           System.out.println("Listado de productor Ferreteria Don Pepe");
            ListarProductosFerreteria();
}





























			
                            
                            
                      public static Productos  buscarEnFichero(int id)
    {
        Iterator <Productos> it = _Productos.iterator();
        while (it.hasNext())
        {
            Productos a = it.next();
            if (a.getCodigo()== id)
                return a;
        }
        return null;
   
          
    }
                                                                                                  
                                                       
                            

    
 public static int leerIntTeclado()
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            try
            {
                return sc.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Número no válido");
                sc.nextLine();
            }
        }
    }
     
    
	
	 
	
	
	
	
	
	
	
	
	
	
 
        public static void AbrirYLeerFichero()
    {
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(FICHERO));
            _Productos = (ArrayList<Productos>) ois.readObject();
           // Productos.setContador(ois.readInt());
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error en los datos");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Ejecutando por primera vez el programa");
        }
        catch (IOException e)
        {
            System.out.println("Error leyendo los datos");
        }
        catch (Exception e)
        {
            System.out.println("Error en los datos");
        }
        finally
        {
            try
            {
                if (ois!=null)
                    ois.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero");
            }
        }
    }
       
    
        public static void CerrarYGuardarFichero()
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(FICHERO));
            oos.writeObject(_Productos);
            //oos.writeInt(Animal.contador);
        }
        catch (IOException e)
        {
            System.out.println("Error guardando los datos");
        }
        finally
        {
            try
            {
                if (oos!=null)
                    oos.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero");
            }
        }
    }

        
              public static void GuardarEnFicheroTexto()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del fichero: ");
        String fichero = sc.nextLine();
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(fichero));
            Iterator <Productos> it = _Productos.iterator();
            while (it.hasNext())
            {
                bw.write(it.next().toString());
                bw.newLine();                
            }
        }
        catch (IOException e)
        {
            System.out.println("Error escribiendo en el fichero de texto");
        }
        finally
        {
            try
            {
                if (bw!=null)
                    bw.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero");
            }
        }
        
    }
      
	          
         public static void GuardarEnFicheroTexto_String()         
   {
          Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del fichero: ");
        String fichero = sc.nextLine();
         
                                
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(fichero));
            bw.write(String.valueOf(HtmlTabla)); // STRING
        }
        catch (IOException e)
        {
            System.out.println("Error guardando datos");
        }
        finally
        {
            try
            {
                if (bw != null)
                    bw.close();
            }
            catch (IOException e)
            {
                System.out.println("Error cerrando el fichero");
            }
        }
        
    }  
	  
	  
	  
	  public static void ListarFichero_TXT(){
            String linea;
            String eof = null;
            
            BufferedReader br = null;
            try
            {
                br = new BufferedReader(new FileReader(FICHERO_GANANCIA));
                     
                    while ((linea = br.readLine()) != eof){        				
                        System.out.println("" + linea + "\n");
                        }                                           
                //Tablaganancia = Double.valueOf(br.readLine());
            }
            catch (IOException e)
            {
                System.out.println("Error en los datos");
            }
            catch (Exception e)
            {
                System.out.println("Error en los datos");
            }
            finally
            {
                try
                {
                    if (br != null)
                        br.close();
                }
                catch (IOException e)
                {
                    System.out.println("Error cerrando el fichero");
                }
            } 
}
	  
	  
	  
	  
 
                    
}
    
    
    
 
