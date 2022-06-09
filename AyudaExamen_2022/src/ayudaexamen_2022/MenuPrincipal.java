 
package ayudaexamen_2022;

import java.sql.Date;  
import java.time.LocalDate;  
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


 
public class MenuPrincipal {
    
 
    public static ArrayList<IMadrid> _objArray = new ArrayList<IMadrid>();
    public static final String FICHERO = "fichero.dat";
    public static final String FICHERO_GANANCIA = "ficheroGanancia.dat";
	
   public static   String Tablaganancia;  

   
        public static void main(String[] args) {        
        _AbrirYLeerFichero();
        int op = menuPrincipal();
        
        while (op!=8)
        {
            switch (op)
            {
        /*        
                case 1: anadirAnimal(); break;
        */
            }
            
            op = menuPrincipal();
        }
        
        _CerrarYGuardarFichero();
    }
     
   public static int menuPrincipal()
    {
        int op = 0;
        while (op<1 ||  op>8)
        {
            if (op==9){
                return op;
            }
            System.out.println("1. SOY NUEVO..:");
            System.out.println("9. Salir");
            op = _leerIntTeclado();
        }
        return op;
    }
      
            

 



public  static void SOY_EL_NUEVO_METODO_PRUEBA(){
 
}
























			
                            
                            
                      public static  IMadrid  _buscarEnFichero(int id)
    {
      Iterator <IMadrid> it = _objArray.iterator();
        while (it.hasNext())
        {
            IMadrid a = it.next();
         //   if (a.getId() == id)
                return a;
        }
        
        return null;
       
        
    }
                                                                                                  
                                                       
                            

    
 public static int _leerIntTeclado()
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
    

        
    public static void _ListarFichero()
    {
        Iterator <IMadrid> it = _objArray.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
    
	
	        public static void _ListarYGuardarFichero()
    {
        Iterator <IMadrid> it = _objArray.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        /*
        int op = 0;
        while (op!=1 && op!=2)
        {
            System.out.println("¿Desea volcar el listado a un fichero de texto? \n1. Sí\n2. No");
            op = leerIntTeclado();
        }
        if (op==1){
             GuardarEnFicheroTexto();
        }
        */
    }
	
	
	
	
	
	
	
	
	
	
	
	

            public static void _InsertarEnFicheroBinario_Clase()
    {
        Scanner sc = new Scanner(System.in);
        int tipo = 0;
        while (tipo!=1 && tipo!=2)
        {
            System.out.println("¿Qué animal desea añadir?\n1. Perro\n2. Gato");
            tipo = _leerIntTeclado();
        }
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad (en meses): ");
        int edad = _leerIntTeclado();
        /*
        if (tipo==1)
            IMadrid.add(new Perro(nombre,edad));
        else
            IMadrid.add( new Gato(nombre,edad));
        */
    }
    

    

            
                public static void _BuscarEnFichero_YListar()
    {
     /*   Iterator <IMadrid> it = _objArray.iterator();
        while (it.hasNext())
        {
            IMadrid a = it.next();
            if (a instanceof Perro && !a.isReservado())
                System.out.println(a);
        }
*/
    }
    


    
            
                public static void _ModificarValores_EnFichero()
    {
  /*     System.out.print("Identificador: ");
        int id = leerIntTeclado();
        IMadrid tabla = buscarEnFichero(id);
        if (tabla == null)
            System.out.println("Animal no encontrado");
        else if (tabla.isReservado()) //campo
            System.out.println("No se puede reservar un animal ya reservado");
        else
        {
            tabla.Reservar(); //Reservar metodo de la tabla
            System.out.println("Animal reservado correctamente");
        }
   */      
    }
                   
                
                    public static void _EliminarRegistroEnFichero()
    {
        System.out.print("Identificador: ");
        int id = _leerIntTeclado();
  /*      IMadrid a = buscarEnFichero(id);
        if (a == null)
            System.out.println("Animal no encontrado");
        else if (a.isReservado()) //campo
        {
            _objArray.remove(a);
            System.out.println("El animal ha sido adoptado");
        }
        else
            System.out.println("El animal no está reservado y no se puede adoptar");
        */
    }

    
        public static void _AbrirYLeerFichero()
    {
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(FICHERO));
            _objArray = (ArrayList<IMadrid>) ois.readObject();
           // IMadrid.setContador(ois.readInt());
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
       
    
        public static void _CerrarYGuardarFichero()
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(FICHERO));
            oos.writeObject(_objArray);
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

        
              public static void _GuardarEnFicheroTexto()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del fichero: ");
        String fichero = sc.nextLine();
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(fichero));
            Iterator <IMadrid> it = _objArray.iterator();
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
      
	          
         public static void _GuardarEnFicheroTexto_String()         
   {
                                
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(FICHERO_GANANCIA));
            bw.write(String.valueOf(Tablaganancia)); // STRING
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
	  
	  
	  
	  public static void _ListarFichero_TXT(){
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
	  
	  
	  
	  
	 
    public static    void _encriptar()
    {
      /*  String tEncriptado = "";
        for (int i = 0;i<getMensaje().length();i++)
        {
            tEncriptado+=(char)(getMensaje().charAt(i)+1);
        }
        setMensaje(tEncriptado);*/
        
    }
    
    public static void _desencriptar()
    {
    /*    String tDesencriptado = "";
        for (int i = 0;i<getMensaje().length();i++)
        {
            tDesencriptado+=(char)(getMensaje().charAt(i)-1);
        }
        setMensaje(tDesencriptado);*/
    }  
	 
	  
	  
	  
	   
 
   
	public boolean _ValidarFechas(int dia,int mes,int anio){
        boolean validoFecha=false;

        if (dia>=1  &&  dia<=31) {
            validoFecha=true;
        }

        if (validoFecha==true && mes>=1 && mes<=12) {
            validoFecha=true;
        }else{
            validoFecha=false;
        }

        if (mes==2 && dia==29 && anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0) ) {
            validoFecha=true;
            }



        return validoFecha;
        }
	 
    
public static    String _SumaDias(int d,int m,int a,int dias){

String Fech=a+ "-" + (m+1)+ "-" + d;     
Date fecha=Date.valueOf(Fech);
GregorianCalendar cal=new GregorianCalendar();      
cal.setTime(fecha);
cal.add(Calendar.DATE, dias);
int dia=cal.get(Calendar.DAY_OF_MONTH);
int mes=cal.get(Calendar.MONTH);
int anio=cal.get(Calendar.YEAR);

 return dia + "/" + mes + "/" + anio;
}


 
                    
}
    
    
    
 
