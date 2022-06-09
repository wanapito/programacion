/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CentroSalud2;

import java.util.Date;
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

public abstract class  Paciente implements  Serializable{

    public Paciente() {
    }

    public Paciente(String Nombre, String Apellidos, String Telefono, String TipoVacuna, String Fecha,int Cantidad) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.TipoVacuna = TipoVacuna;
        this.Fecha = Fecha;
        setNomVACU(NombreVacuna(TipoVacuna));
        setCantidadVacuna(Cantidad);
        
    }
    
        private String Nombre;        
        private String Apellidos;       
        private String Telefono;        
        private String TipoVacuna;        
        private String Fecha;

            private int CantidadVacuna;

    /**
     * Get the value of CantidadVacuna
     *
     * @return the value of CantidadVacuna
     */
    public int getCantidadVacuna() {
        return CantidadVacuna;
    }

    /**
     * Set the value of CantidadVacuna
     *
     * @param CantidadVacuna new value of CantidadVacuna
     */
    public void setCantidadVacuna(int CantidadVacuna) {
        this.CantidadVacuna = CantidadVacuna;
    }

            private String NomVACU;

    /**
     * Get the value of NomVACU
     *
     * @return the value of NomVACU
     */
    public String getNomVACU() {
        return NomVACU;
    }

    /**
     * Set the value of NomVACU
     *
     * @param NomVACU new value of NomVACU
     */
    public void setNomVACU(String NomVACU) {
        this.NomVACU = NomVACU;
    }

        
    @Override
    public String toString() {
        return "Paciente{" + "Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Telefono=" + Telefono +
                ", TipoVacuna=" + getNomVACU() + ", Fecha Primera Dosis=" + Fecha + ", Numero de Vacunas= " + getCantidadVacuna() +
                '}';
    }
        
        
      public   String  NombreVacuna(String TipoVacuna){
        String NombreVacuna="";
        if (TipoVacuna=="1"){
         NombreVacuna ="Monodosis" ;
        }else{
        NombreVacuna ="MultiDosis" ;
        }
        
    return NombreVacuna;
        
    }
            
 
      
      

    /**
     * Get the value of Fecha
     *
     * @return the value of Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * Set the value of Fecha
     *
     * @param Fecha new value of Fecha
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

        
        

    /**
     * Get the value of TipoVacuna
     *
     * @return the value of TipoVacuna
     */
    public String getTipoVacuna() {
        return TipoVacuna;
    }

    /**
     * Set the value of TipoVacuna
     *
     * @param TipoVacuna new value of TipoVacuna
     */
    public void setTipoVacuna(String TipoVacuna) {
        this.TipoVacuna = TipoVacuna;
    }

        
        

    /**
     * Get the value of Telefono
     *
     * @return the value of Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * Set the value of Telefono
     *
     * @param Telefono new value of Telefono
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

        
        

    /**
     * Get the value of Apellidos
     *
     * @return the value of Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * Set the value of Apellidos
     *
     * @param Apellidos new value of Apellidos
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
}
