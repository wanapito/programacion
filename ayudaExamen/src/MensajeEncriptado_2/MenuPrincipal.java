 
package MensajeEncriptado_2;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

 
public class MenuPrincipal {
    
 
    public static ArrayList<Mensajeria> _mensajeria = new ArrayList<Mensajeria>();
    public static final String FICHERO = "fichero.dat";
    public static final String FICHERO_GANANCIA = "ficheroGanancia.dat";
	
   public static   String Tablaganancia;  

   
        public static void main(String[] args) {        
        AbrirYLeerFichero();
        int op = menuPrincipal();
        
        while (op!=8)
        {
            switch (op)
            {
               
                case 1: ListarTodosMensajes(); break;
                case 2: ListarMensajesNormales(); break;
                case 3: ListarMensajesEncriptados() ; break;
                case 4: BuscarMensaje() ; break;                
                case 5: AñadirMensajes(); break;
                case 6: Method_DesencriptarMensaje(); break;
                case 7: EliminarMensaje(); break;                
                
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
            if (op==8){
                return op;
            }
            System.out.println("1.Listar todos los mensajes ..:");
            System.out.println("2.Mostrar Mensajes Normales ..:");                        
            System.out.println("3.Mostrar mensajes encriptados ..:");
            System.out.println("4.Buscar Mensajes ..:");
            System.out.println("5.Añadir Mensajes ..:");
            System.out.println("6.Desencriptar Mensajes ..:");
            System.out.println("7.Eliminar Mensajes ..:");
            System.out.println("8. Salir");
            op = leerIntTeclado();
        }
        return op;
    }
      
            
public static void   AñadirMensajes(){
  Scanner sc = new Scanner(System.in);
        int tipo = 0;
        while (tipo!=1 && tipo!=2)
        {
            System.out.println("¿ Seleccione el tipo del Mensajes  -> 1 Encriptado   2-> Normal ?");
            tipo = leerIntTeclado();
        }
        System.out.print("---Ingrese los valores--- \n");
        System.out.print("Codigo: ");
        int codigo  = leerIntTeclado();
        System.out.print("Mensaje: ");
        String mensaje = sc.nextLine();
        
        if (tipo==1){
        _mensajeria.add(new Mensaje(codigo,mensaje,true));
        
        Mensajeria tabla=buscarEnFichero(codigo);
        tabla.Encriptar();
        }else {
        _mensajeria.add(new Mensaje(codigo,mensaje,false));
         Mensajeria tabla=buscarEnFichero(codigo);
   //    tabla.Desencriptar();
        }
        
       CerrarYGuardarFichero();
}

public static void ListarTodosMensajes(){
    
    System.out.println("1 .->  Listar los mensajes por pantalla  \n ");
    System.out.println("2 .->  Guardar Los mensajes en un fichero \n");
    
    int codigo =leerIntTeclado();
    if (codigo==1){
    Iterator <Mensajeria> it = _mensajeria.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
     
    }else{
   Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del fichero: ");
        String fichero = sc.nextLine();
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(fichero));
            Iterator <Mensajeria> it = _mensajeria.iterator();
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
    
    
        
        
}


public static void ListarMensajesNormales(){
        Iterator <Mensajeria> it = _mensajeria.iterator();
        while (it.hasNext())
        {
            Mensajeria a = it.next();
            if (a instanceof Mensaje && !a.isEncriptado())
                System.out.println(a);
        }

}

public static void ListarMensajesEncriptados(){
        Iterator <Mensajeria> it = _mensajeria.iterator();
        while (it.hasNext())
        {
            Mensajeria a = it.next();
            if (a instanceof Mensaje && a.isEncriptado())
                System.out.println(a);
        }

}


public static void BuscarMensaje(){
    System.out.println("\n");
    System.out.println("Ingrese el codigo a buscar");
    int codigo=leerIntTeclado();
    
    Mensajeria tabla= buscarEnFichero(codigo);
    
    if  (tabla==null){
         System.out.println("El codigo no Existe");
    }        else{        
        
      Iterator <Mensajeria> it = _mensajeria.iterator();
        while (it.hasNext())
        {
            Mensajeria a = it.next();
            if (a.getCodigo()==codigo)
                System.out.println(a);
        }
}
        System.out.println("\n");
    
    
}




public static void Method_DesencriptarMensaje(){
    ListarTodosMensajes();
    System.out.println("Ingrese el codigo del mensaje");
    int codigo=leerIntTeclado();
         Mensajeria tabla =  buscarEnFichero(codigo);
            if (tabla==null){
                System.out.println("No eixste el mensaje");
            }else{
            tabla.Desencriptar();
            }
   CerrarYGuardarFichero();
    
}


public static  void EliminarMensaje(){
    ListarTodosMensajes();
        System.out.print("Borrar Mensajes..: \n");
        System.out.print("Codigo: ");
        int id = leerIntTeclado();
       Mensajeria tabla = buscarEnFichero(id);
        if (tabla == null){
            System.out.println(" No Existe el mensaje");
        }else{
                        _mensajeria.remove(id);
            System.out.println("El mensaje se ha eliminado correctamente");
            CerrarYGuardarFichero();
 
        
            
            int cont=1;
            
                    Iterator <Mensajeria> it = _mensajeria.iterator();
                      while (it.hasNext())
                      {                              
                              Mensajeria a = it.next();                                
                         tabla.ReorganizarCodigos(cont);
                        cont=cont + 1;
                                                                                                         
                      }            
                      
        }
        
        
        
        
        
            CerrarYGuardarFichero();
 
}





















			
                            
                            
                      public static Mensajeria  buscarEnFichero(int id)
    {
    Iterator <Mensajeria> it = _mensajeria.iterator();
        while (it.hasNext())
        {
            Mensajeria a = it.next();
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
    

        
    public static void ListarFichero()
    {
        Iterator <Mensajeria> it = _mensajeria.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
    
	
	        public static void ListarYGuardarFichero()
    {
        Iterator <Mensajeria> it = _mensajeria.iterator();
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
	
	
	
	
	
	
	
	
	
	
	
	

            public static void InsertarEnFicheroBinario_Clase()
    {
        Scanner sc = new Scanner(System.in);
        int tipo = 0;
        while (tipo!=1 && tipo!=2)
        {
            System.out.println("¿Qué animal desea añadir?\n1. Perro\n2. Gato");
            tipo = leerIntTeclado();
        }
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad (en meses): ");
        int edad = leerIntTeclado();
        /*
        if (tipo==1)
            Mensajeria.add(new Perro(nombre,edad));
        else
            Mensajeria.add( new Gato(nombre,edad));
        */
    }
    

    

            
                public static void BuscarEnFichero_YListar()
    {
     /*   Iterator <Mensajeria> it = _mensajeria.iterator();
        while (it.hasNext())
        {
            Mensajeria a = it.next();
            if (a instanceof Perro && !a.isReservado())
                System.out.println(a);
        }
*/
    }
    


    
            
                public static void ModificarValores_EnFichero()
    {
  /*     System.out.print("Identificador: ");
        int id = leerIntTeclado();
        Mensajeria tabla = buscarEnFichero(id);
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
                   
                
                    public static void EliminarRegistroEnFichero()
    {
        System.out.print("Identificador: ");
        int id = leerIntTeclado();
  /*      Mensajeria a = buscarEnFichero(id);
        if (a == null)
            System.out.println("Animal no encontrado");
        else if (a.isReservado()) //campo
        {
            _mensajeria.remove(a);
            System.out.println("El animal ha sido adoptado");
        }
        else
            System.out.println("El animal no está reservado y no se puede adoptar");
        */
    }

    
        public static void AbrirYLeerFichero()
    {
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(FICHERO));
            _mensajeria = (ArrayList<Mensajeria>) ois.readObject();
           // Mensajeria.setContador(ois.readInt());
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
            oos.writeObject(_mensajeria);
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
            Iterator <Mensajeria> it = _mensajeria.iterator();
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
	  
	  
	  
	  
	 /* 
	        
    public   void encriptar()
    {
        String tEncriptado = "";
        for (int i = 0;i<getMensaje().length();i++)
        {
            tEncriptado+=(char)(getMensaje().charAt(i)+1);
        }
        setMensaje(tEncriptado);
    }
    
    public void desencriptar()
    {
        String tDesencriptado = "";
        for (int i = 0;i<getMensaje().length();i++)
        {
            tDesencriptado+=(char)(getMensaje().charAt(i)-1);
        }
        setMensaje(tDesencriptado);
    }  
	  */
	  
	  
	  
                    
}
    
    
    
 
