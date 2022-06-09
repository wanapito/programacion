/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CentroSalud2;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EstructuraPaciente extends Paciente{

    public EstructuraPaciente() {
    }

    public EstructuraPaciente(String Nombre, String Apellidos, String Telefono, String TipoVacuna, String Fecha,int Cantidad) {
        super(Nombre, Apellidos, Telefono, TipoVacuna, Fecha,Cantidad);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

 
 
    
}
