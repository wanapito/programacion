 
package ProtectoraAnimalesPeluditos_2;

import ProtectoraAnimalesPeluditos_2.Animales;
import ProtectoraAnimalesPeluditos_2.Gatos;
import ProtectoraAnimalesPeluditos_2.Perros;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

 
public class MenuPrincipal {
    
 
    public static ArrayList<Animales> _animales = new ArrayList<Animales>();
    public static final String FICHERO = "fichero.dat";
        
        public static void main(String[] args) {        
        AbrirYLeerFichero();
        int op = menuPrincipal();
        
        while (op!=9)
        {
            switch (op)
            {
                
                case 1: InsertarEnFicheroBinario_Clase(); break;
                case 2: ListarYGuardarFichero(); break;
                case 3: ListarPerrosSinReserva(); break;
                case 4: ListarGatosSinReserva(); break;
                case 5: Reservar(); break;
                case 6: AnularReservar(); break;
                case 7: EliminarRegistroEnFichero(); break;
         
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
            if (op==9){
                return op;
            }
            System.out.println("1..Añadir animal..:");
            System.out.println("2..Mostrar Todos los Animales..:");
            System.out.println("3..Listar Perros sin reserva..:");
            System.out.println("4..Listar Gatos sin Reserva ..:");
            System.out.println("5..Reservar Animal ..:");
            System.out.println("6..Anular Reserva ..:");
            System.out.println("7..Adoptar ..:");
            System.out.println("9..Salir");
            op = leerIntTeclado();
        }
        return op;
    }
      
                            
      
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                         public static Animales  buscarEnFicheroAnimalesRservados(int id)
    {
        Iterator <Animales> it = _animales.iterator();
        while (it.hasNext())
        {
            Animales a = it.next();
            if (a.getCodigo()== id && a.isReservado())
                return a;
        }
        return null;
 
    }                     
                            
                            
                            
               
            public static Animales  buscarEnFichero(int id)
    {
        Iterator <Animales> it = _animales.iterator();
        while (it.hasNext())
        {
            Animales a = it.next();
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
        Iterator <Animales> it = _animales.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
        public static void ListarYGuardarFichero()
    {
        Iterator <Animales> it = _animales.iterator();        
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
  
        int op = 0;
        while (op!=1 && op!=2)
        {
            System.out.println("¿Desea volcar el listado a un fichero de texto? \n1. Sí\n2. No");
            op = leerIntTeclado();
        }
        if (op==1){
            GuardarEnFicheroTexto();
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
        

        if (tipo==1){
            _animales.add(new Perros(nombre,edad));
            
        }else{
            _animales.add( new Gatos(nombre,edad));
        }
        
        
    }
    

            
    

            
                public static void ListarPerrosSinReserva()
    {
       Iterator <Animales> it = _animales.iterator();
        while (it.hasNext())
        {
            Animales a = it.next();
            if (a instanceof Perros && !a.isReservado())
                System.out.println(a);
        }
 
    }
    
                            
                public static void ListarGatosSinReserva()
    {
       Iterator <Animales> it = _animales.iterator();
        while (it.hasNext())
        {
            Animales a = it.next();
            if (a instanceof Gatos && !a.isReservado())
                System.out.println(a);
        }
 
    }


    
            
                public static void Reservar()
    {
       System.out.print("Ingrese el Codigo del Animal para reservarlo..: ");
        int id = leerIntTeclado();
        Animales tabla = buscarEnFichero(id);
        if (tabla == null)
            System.out.println("Animal no encontrado");
        else if (tabla.isReservado()) //campo
            System.out.println("No se puede reservar un animal ya reservado");
        else
        {
            tabla.Reserva();//Reservar metodo de la tabla
            System.out.println("Animal reservado correctamente");
        }
  
    }
                
                                public static void AnularReservar()
    {
       System.out.print("Ingrese el Codigo del Animal para reservarlo..: ");
        int id = leerIntTeclado();
        Animales tabla = buscarEnFichero(id);
        if (tabla == null)
            System.out.println("Animal no encontrado");
        else if (tabla.isReservado()) //campo
            System.out.println("No se puede reservar un animal ya reservado");
        else
        {
            tabla.AnularReserva();//Reservar metodo de la tabla
            System.out.println("Animal reservado correctamente");
        }
  
    }
                   
                
                    public static void EliminarRegistroEnFichero()
    {
        System.out.print("Identificador: ");
        int id = leerIntTeclado();
       Animales a = buscarEnFicheroAnimalesRservados(id);
        if (a == null)
            System.out.println("Animal no encontrado");
        else if (a.isReservado()) //campo
        {
            _animales.remove(a);
            System.out.println("El animal ha sido adoptado");
        }
        else
            System.out.println("El animal no está reservado y no se puede adoptar");
        
    }

    
        public static void AbrirYLeerFichero()
    {
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(FICHERO));
            _animales = (ArrayList<Animales>) ois.readObject();
           // Animales.setContador(ois.readInt());
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
            oos.writeObject(_animales);
            oos.writeInt(Animales.Contador);
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
            Iterator <Animales> it = _animales.iterator();
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
    
    
    
 

