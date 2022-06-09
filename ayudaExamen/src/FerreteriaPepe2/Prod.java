/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FerreteriaPepe2;

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

public class Prod extends Productos{ 

    public Prod() {
    }

    public Prod(int Codigo, String Descripcion, double Precio, boolean TipoPrecio) {
        super(Codigo, Descripcion, Precio, TipoPrecio);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

 
    
 
    
}
