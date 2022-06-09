/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CentroSalud2;

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


public class Fechas {

    public Fechas() {
    }
    
    
     
public boolean ValidarFechas(int dia,int mes,int anio){
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
	 
    
public static    String SumaDias(int d,int m,int a,int dias){

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
