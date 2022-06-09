 
package CentroSalud2;

import java.sql.Date;  
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

 
public class MenuPrincipal {
    
 
    public static ArrayList<Paciente> _Paciente = new ArrayList<Paciente>();
    public static final String FICHERO = "vacunas.dat";
    public static final String FICHERO_GANANCIA = "ficheroGanancia.dat";
	
   public static   String Tablaganancia;  

   
        public static void main(String[] args) {        
        AbrirYLeerFichero();
        int op = menuPrincipal();
        


        while (op!=4)
        {
            switch (op)
            {
        
                case 1: RegistrarPacientes(); break;
                case 2: ListarPacienteDosisCompletas(); break;
                
                case 3: ListarPacientePendientesVacunasMultidosis(); break;
        
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
            if (op==4){
                return op;
            }
            System.out.println("1.Resgistrar Paciente..:");
            System.out.println("2.Mostrar Paciente con dosis completas ..:");
            System.out.println("3.Mostrar Paciente pendientes de segunda dosis ..:");
            System.out.println("4. Salir");
            op = leerIntTeclado();
        }
        return op;
    }
      
            
public static void ListarPacientes(){
        ListarFichero();
}
   


public static  void RegistrarPacientes(){
       ListarFichero();
        Fechas objFech=new Fechas();
       System.out.println("Registro de Paciente");
         Scanner sc = new Scanner(System.in);
         boolean bFechaCorrecta=false;
         
        int tipo = 0;
        while (tipo!=1 && tipo!=2)
        {
            System.out.println("Seleccione el Tipo de vacuna para el paciente");
            System.out.println("1. Monodosis   2. Multidosis ");
            tipo = leerIntTeclado();
        }
        String Nombre;
        String Apellidos;
        String Telefono;
        String TipoVacuna;
        String FechaVacuna;
               
        
        System.out.print("Nombre: ");        
        Nombre=sc.nextLine();
        System.out.print("Apellidos: ");
        Apellidos=sc.nextLine();
        System.out.print("Telefono: ");
        Telefono=sc.nextLine();

        System.out.print("Fecha Vacuna (dd/mm/yyyy): ");
        FechaVacuna=sc.nextLine();
        
     if (FechaVacuna.length()<10){
        System.out.println("El formato de la fecha no es el correcto");
       
     }else{
        
        int dia=Integer.parseInt(FechaVacuna.split("/")[0]);
        int mes=Integer.parseInt(FechaVacuna.split("/")[1]);
        int anio=Integer.parseInt( FechaVacuna.split("/")[2]);
        
        bFechaCorrecta=objFech.ValidarFechas(dia, mes, anio);
        
   if ( bFechaCorrecta==true){                              
        if (tipo==2){          
            String ProximaDosis;
            ProximaDosis= objFech.SumaDias(dia,mes,anio,25);
            
            String Cadena;
            Cadena= FechaVacuna  + " Proxima Fecha Vacuna es : " + ProximaDosis;
            
           _Paciente.add(new EstructuraPaciente(Nombre,Apellidos,Telefono,"1",Cadena ,1)) ;             
        }else{
        _Paciente.add(new EstructuraPaciente(Nombre,Apellidos,Telefono,"2",FechaVacuna + " Dosis Completa",1));
        }
        
        CerrarYGuardarFichero();
        
        ListarPacientes();
        
          }else{
   
       System.out.println("El formato de la fecha no es el correcto");
       
        }
   
     }
        
 
}

public static void ListarPacientePendientesVacunasMultidosis(){
    
       Iterator <Paciente> it = _Paciente.iterator();
        while (it.hasNext())
        {
            Paciente a = it.next();
            if (a instanceof EstructuraPaciente &&  a.getTipoVacuna().equals("1") && a.getCantidadVacuna()==1) {
                System.out.println(a);
            }
        }
    
    
}


public static void ListarPacienteDosisCompletas(){
    
       Iterator <Paciente> it = _Paciente.iterator();
        while (it.hasNext())
        {
            Paciente a = it.next();
            if (a instanceof EstructuraPaciente &&  a.getTipoVacuna().equals("2") && a.getCantidadVacuna()==1) {
                System.out.println(a);
            }
        }
    
    
}


























			
                            
                            
                      public static Paciente  buscarEnFichero(String id)
    {
       Iterator <Paciente> it = _Paciente.iterator();
        while (it.hasNext())
        {
            Paciente a = it.next();
            if (a.getTelefono()== id)
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
        System.out.println("");
        Iterator <Paciente> it = _Paciente.iterator();
        while (it.hasNext())
        {                        
            System.out.println(it.next());
        }
System.out.println("");
    }
    
	
	        public static void ListarYGuardarFichero()
    {
        Iterator <Paciente> it = _Paciente.iterator();
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
            Paciente.add(new Perro(nombre,edad));
        else
            Paciente.add( new Gato(nombre,edad));
        */
    }
    

    

            
                public static void BuscarEnFichero_YListar()
    {
     /*   Iterator <Paciente> it = _Paciente.iterator();
        while (it.hasNext())
        {
            Paciente a = it.next();
            if (a instanceof Perro && !a.isReservado())
                System.out.println(a);
        }
*/
    }
    


    
            
                public static void ModificarValores_EnFichero()
    {
  /*     System.out.print("Identificador: ");
        int id = leerIntTeclado();
        Paciente tabla = buscarEnFichero(id);
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
  /*      Paciente a = buscarEnFichero(id);
        if (a == null)
            System.out.println("Animal no encontrado");
        else if (a.isReservado()) //campo
        {
            _Paciente.remove(a);
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
            _Paciente = (ArrayList<Paciente>) ois.readObject();
           // Paciente.setContador(ois.readInt());
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
            oos.writeObject(_Paciente);
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
            Iterator <Paciente> it = _Paciente.iterator();
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
	  
	  
	  
	  /*
	  public boolean ValidarFechas(int dia,int mes,int año){
        boolean validoFecha=false;

        if (dia<1 || dia>31) {
            validoFecha=true;
        }

        if (mes<1 || mes>12) {
            validoFecha=true;
        }

        if (mes==2 && dia==29 && anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0) ) {
            validoFecha=true;
            }



        return validoFecha;
        }
	  */
                    
}
    
    
    
 
