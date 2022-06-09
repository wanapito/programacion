 
package CarniceriaManolo2;
 
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

 
public class MenuPrincipal {
    
 
    public static ArrayList<Usuarios> _usuarios = new ArrayList<Usuarios>();
    public static final String FICHERO_USUARIO = "usuarios.bin";
        
    public static ArrayList<Productos> _productos = new ArrayList<Productos>();
    public static final String FICHERO_PRODUCTO = "productos.bin";           
    
   public static final String FICHERO_GANANCIA = "ganancia.txt";    

   public static   String Tablaganancia;  



//    public static final String FICHERO_PRODUCTO = "productos.bin";
       
    /* 0  administrador  
        1 Cliente
        2 Invitado
    */
public static int Perfil_Administrador=0;
public static int Perfil_Cliente=1;
public static int Perfil_Invitado=2;
    
public static boolean  bCargaPorPrimeraVez=false;

        public static void main(String[] args) {        
  Scanner sc = new Scanner(System.in);
                    
        AbrirYLeerFicheroUsuario();
        AbrirYLeerFicheroProductos();
        
        
        
        
        if (bCargaPorPrimeraVez==true){
          AltaUsuario(Perfil_Administrador);        
          MenuLoad_Perfiles(Perfil_Administrador);
            
        }else {
   int _Perfil;
            System.out.println("   Ingrese el Nombre del Usuario.:");
        String    Nombre=sc.nextLine();
            System.out.println("   Ingrese  la clave del usuairo.:");
        String     Clave=sc.nextLine();
        
       Usuarios tabla=  BuscarUsuario(Nombre,Clave);              
       _Perfil=tabla.getPerfil();
        if (tabla==null){
            
        }else{
                        
                MenuLoad_Perfiles( _Perfil);
        }
       
        
  
        }
        
        
       
        
        

        CerrarYGuardarFicheroUsuarios();
        CerrarYGuardarFicheroProductos();
        GuardarEnFicheroTexto_String();
    }
     
                 public static void AltaUsuario(int Parametro)
    {
 
        
                 Scanner sc = new Scanner(System.in);
            String Nombre;
            String Clave;
            System.out.println("**Gestion de Usuarios** ");                                    
            System.out.println("   Ingrese el Nombre del Usuario.:");
            Nombre=sc.nextLine();
            System.out.println("   Ingrese  la clave del usuairo.:");
            Clave=sc.nextLine();                        
            if (Parametro==0){
            _usuarios.add(new Administrador(Nombre,Clave,Perfil_Administrador));
            }else{            
            int Perfil;
            Perfil=leerIntTeclado();    
            
            System.out.println("  Ingrese el Perfil -> 0  Administrador , 1-> Cliente , 2-> Invitado .:");
            _usuarios.add(new Administrador(Nombre,Clave,Perfil));             
                  
      
            }
              System.out.println("****************************");
    }
                 

       public static void MenuLoad_Perfiles(int Perfil){                              
            //henry
            if(Perfil==Perfil_Administrador){
                       int op = menuPrincipalPerfiles(Perfil);        
                                while (op!=7)
                                {
                                    switch (op)
                                    {

                                        case 1: ListarProductos(); break;
                                        case 2: BuscarProducto_y_Listar(); break;
                                        case 3: AltaProducto_ModificarStock(); break;
                                        case 4: MostrarGanancia(); break;
                                        case 5: AltaUsuario(999); break;                                        
                                        case 6: Desconectar(Perfil_Invitado); break;//
                                    }            

                                    op = menuPrincipalPerfiles(Perfil);
                                }                        
            }
            
                       if(Perfil==Perfil_Cliente){
                       int op = menuPrincipalPerfiles(Perfil);        
                                while (op!=5)
                                {
                                    switch (op)
                                    {

                                        case 1: ListarProductos(); break;
                                        case 2: BuscarProducto_y_Listar(); break;
                                        case 3: Comprar(); break;
                                        case 4: Desconectar(Perfil_Invitado); break;//

                                    }            
                                    op = menuPrincipalPerfiles(Perfil);
                                }                        
            }
            
                                     if(Perfil== Perfil_Invitado){
                       int op = menuPrincipalPerfiles(Perfil);        
                                while (op!=5)
                                {
                                    switch (op)
                                    {

                                        case 1: ListarProductos(); break;
                                        case 2: BuscarProducto_y_Listar(); break;
                                        case 3: AltaUsuario(Perfil_Cliente); break;

                                    }            
                                    op = menuPrincipalPerfiles(Perfil);
                                }                        
            }
        
        
        }
        
       public static void Desconectar(int Perfil){
       menuPrincipalPerfiles(Perfil);
       MenuLoad_Perfiles(Perfil);
       }
               
       
       
           public static int menuPrincipalPerfiles(int Perfil)
    {
        int op = 0;
        if (Perfil==Perfil_Administrador){                
        while (op<1 ||  op>8)
        {
            if (op==7){
                return op;            
            }
            System.out.println("** Menu Perfil Administrador**");
            System.out.println("** Seleccione las Opciones Numericas**");
            System.out.println("1. Mostrar Todos los productos..:");
            System.out.println("2. Mostrar un producto por codigo/descripcion..:");
            System.out.println("3. Añadir Producto/Modificar stock..:");
            System.out.println("4. Mostrar Ganancias..:");
            System.out.println("5. Dar de alta a un usuario..:");
            System.out.println("6. Desconectar");
            System.out.println("7. Salir");
            System.out.println("**********************************");
            op = leerIntTeclado();
            
            
        }
        
              }
  
                if (Perfil==Perfil_Cliente){                
        while (op<1 ||  op>6)
        {
            if (op==5){
                return op;            
            }
            System.out.println("** Menu Perfil Cliente**");
            System.out.println("** Seleccione las Opciones Numericas**");
            System.out.println("1. Mostrar Todos los productos..:");
            System.out.println("2. Mostrar un producto por codigo/descripcion..:");
            System.out.println("3. comprar..:");
            System.out.println("4. Desconectar..:");
            System.out.println("5. Salir..:");
            
            System.out.println("**********************************");
            op = leerIntTeclado();
        }
        
              }
                
                        if (Perfil==Perfil_Invitado){                
        while (op<1 ||  op>6)
        {
            if (op==5){
                return op;            
            }
            System.out.println("** Menu Perfil Invitado**");
            System.out.println("** Seleccione las Opciones Numericas**");
            System.out.println("1. Mostrar Todos los productos..:");
            System.out.println("2. Mostrar un producto por codigo/descripcion..:");
            System.out.println("3. registrar..:");
            System.out.println("4. Login ..:");
            System.out.println("5. salir..:");            
            System.out.println("**********************************");
            op = leerIntTeclado();
        }
        
              }
                        
                        
        
        return op;
    }

    
    public  static void Comprar(){
    ListarProductos();
        
    int codproducto;
    int cantidad;
        System.out.println("Ingrese el codigo del prducto a comprar..:");        
        codproducto=leerIntTeclado();
        System.out.println("Ingrese la cantidad a comprar..:");
        cantidad=leerIntTeclado();
        
       Productos tablaprod= BuscarProductoPorCodigo(codproducto);
       
       if (tablaprod==null){
           System.out.println("No Existen Productos");
           return;
       }else{
       
       int stockActua=tablaprod.getStock();
       
       if (stockActua<cantidad){
           System.out.println("No hay stock disponible para este producto");
           
       }else{
       tablaprod.RestaStock(cantidad);
       double GananciaVentas;
       GananciaVentas=tablaprod.calcularGanancia(cantidad);
       Tablaganancia=String.valueOf(GananciaVentas);
           
       }
       
       }
       
        
    }
        
 
            
           
           
     public static Productos  BuscarProducto_y_Listar()
    {
     Scanner  teclado=new Scanner(System.in);
       int codigo;
       String Nombre;
        System.out.println(" Ingrese codigo: ");
        codigo=teclado.nextInt();
        System.out.println(" Ingrese nombre Producto: ");
        Nombre=teclado.nextLine();
        
        Iterator <Productos> it = _productos.iterator();
        while (it.hasNext())
        {
            Productos a = it.next();
            if (a.getCodigo()== codigo ||  a.getDescripcion()==Nombre )
                return a;
        }
        return null;
 
        
          
    }       
           
                public static  Productos  __BuscarProducto_y_Listar()
    {
     Scanner  teclado=new Scanner(System.in);
       int codigo;
       String Nombre;
        System.out.println(" Ingrese codigo: ");
        codigo=teclado.nextInt();
        
        Iterator <Productos> it = _productos.iterator();
        while (it.hasNext())
        {
            Productos a = it.next();
            if (a.getCodigo()== codigo )
                return a;
        }
        return null;                   
    }    
           
           
           
           
           
           
           
           
           
           
        
   public static int menuPrincipal()
    {
        int op = 0;
        while (op<1 ||  op>8)
        {
            if (op==9){
                return op;
            }
            System.out.println("1. Añadir animal..:");
            System.out.println("9. Salir");
            op = leerIntTeclado();
        }
        return op;
    }
      
         
                              
                            public static Productos  BuscarProductoPorCodigo(int id)
    {
       Iterator <Productos> it = _productos.iterator();
        while (it.hasNext())
        {
            Productos a = it.next();
            if (a.getCodigo()== id)
                return a;
        }
        return null;        
          
    }
          
 
                            
                            
                      public static Usuarios  BuscarUsuario(String Nombre,String Clave)
    {
 
       String _nombre;        
       String _clave;
        Iterator <Usuarios> it = _usuarios.iterator();
        while (it.hasNext())
        {
            Usuarios a = it.next();            
            if (a.getNombre().toUpperCase().equals(Nombre.toUpperCase()) ){
                return a;
            }
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
    

        public static void ListarProductos()
    {
        Iterator <Productos> it = _productos.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
        
        
    public static void ListarFichero()
    {
        Iterator <Productos> it = _productos.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
    
	
	        public static void ListarYGuardarFichero()
    {
        Iterator <Productos> it = _productos.iterator();
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
	
	
	
	
	
         public static void AltaUsuario__borrar()
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
            _Productos.add(new Perro(nombre,edad));
        else
            _Productos.add( new Gato(nombre,edad));
        */
    }
                     public static void MostrarGanancia(){
                     ListarFichero_TXT();
                    // GuardarEnFicheroTexto_String();
                     } 
	
         
                     public static void AltaProducto_ModificarStock()
    {
                ListarProductos();
  Productos tabla=  __BuscarProducto_y_Listar();
  boolean bAlta=false;      
  boolean bModificar=false;
        if (tabla==null){
            System.out.println("---No existe Productos Registrados---");
            bAlta=true;
                }else{
                bModificar=true;               
        }
            
        
        if (bAlta==true){
                    
        Scanner sc = new Scanner(System.in);

        System.out.print("Descripcion Producto.: ");
        String nombre = sc.nextLine();
        System.out.print("Stock..: ");
        int stock = leerIntTeclado();
        System.out.print("Precio..: ");
        double Precio=Double.parseDouble(sc.nextLine().replace(",","."));
        
         _productos.add(new _Productos(nombre,stock,Precio));
       
        ListarProductos();
        }  
        
               if (bModificar==true){
                      tabla=  __BuscarProducto_y_Listar();
                      if (tabla==null){
                          System.out.println("Error el codigo ingresado no existe en la base de datos");
                      }else{
                          ModificarStock();
                      }
                
               }
        
        
        
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
            _Productos.add(new Perro(nombre,edad));
        else
            _Productos.add( new Gato(nombre,edad));
        */
    }
    

                    public static void BuscarProducto_YListar()
    {
     /*   Iterator <Productos> it = _productos.iterator();
        while (it.hasNext())
        {
            _Productos a = it.next();
            if (a instanceof Perro && !a.isReservado())
                System.out.println(a);
        }
*/
    }

            
                            public static void ModificarStock()
    {
        ListarProductos();
       System.out.print(" ngrese el Codigo del Producto: ");
        int id = leerIntTeclado();
        System.out.print(" Ingrese la Nueva Cantidad: ");
        int cantidad = leerIntTeclado();
        Productos tabla = BuscarProductoPorCodigo(id);
         tabla.SumaStock(cantidad);
      System.out.print(" Stock actualizado correctamete ");
    }
            
 
    


    
            
                public static void Modificar_Fichero()
    {
        /*
      System.out.print("Identificador: ");
        int id = leerIntTeclado();
        _Productos tabla = buscarEnFichero(id);
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
  /*      _Productos a = buscarEnFichero(id);
        if (a == null)
            System.out.println("Animal no encontrado");
        else if (a.isReservado()) //campo
        {
            _productos.remove(a);
            System.out.println("El animal ha sido adoptado");
        }
        else
            System.out.println("El animal no está reservado y no se puede adoptar");
        */
    }

                    
          public static void AbrirYLeerFicheroUsuario()
    {
        bCargaPorPrimeraVez=false;
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(FICHERO_USUARIO));
            _usuarios = (ArrayList<Usuarios>) ois.readObject();
           // _Productos.setContador(ois.readInt());
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error en los datos");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Ejecutando por primera vez el programa");
            bCargaPorPrimeraVez=true;
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
       
          
    
        public static void AbrirYLeerFicheroProductos()
    {
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(FICHERO_PRODUCTO));
            _productos = (ArrayList<Productos>) ois.readObject();
                //_productos./  (ois.readInt());
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
       
    
        public static void CerrarYGuardarFicheroUsuarios()
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(FICHERO_USUARIO));
            oos.writeObject(_usuarios);
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
 public static void CerrarYGuardarFicheroProductos()
    {
        ObjectOutputStream oos = null;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(FICHERO_PRODUCTO));
            oos.writeObject(_productos);
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
            Iterator <Productos> it = _productos.iterator();
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
            bw.write(String.valueOf(Tablaganancia));
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
   
              
              
              
              
              
              
              
              
              
                    
}
    
    
    
 
