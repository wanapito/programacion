 
package CarniceriaManolo2;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

 
public class _Productos extends Productos{

  
        
    public _Productos(String Descripcion, int Stock, double Precio) {
        super(Descripcion, Stock, Precio);
    }
         
    
    @Override
    public String toString() {
        String Informacion;
        Informacion="Codigo->" + getCodigo() +"  \t Nombre Producto->  "+ getDescripcion() +"  \t Stock Producto -> "+ getStock() +"  \t -> Precio producto"+ getPrecio();        
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return Informacion;
    }
      

    

}
