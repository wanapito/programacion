/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CarniceriaManolo2;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

 
public abstract  class Usuarios implements Serializable{

 
    
        private String Nombre;
        private String Clave;        
        private int Perfil;

           public Usuarios() {
                
           }
           
           
    public Usuarios(String Nombre, String Clave, int Perfil) {
        this.Nombre = Nombre.trim();
        this.Clave = Clave.trim();
        this.Perfil = Perfil;
    }
        
        
        

    /**
     * Get the value of Perfil
     *
     * @return the value of Perfil
     */
    public int getPerfil() {
        return Perfil;
    }

    /**
     * Set the value of Perfil
     *
     * @param Perfil new value of Perfil
     */
    public void setPerfil(int Perfil) {
        this.Perfil = Perfil;
    }

        

    /**
     * Get the value of Clave
     *
     * @return the value of Clave
     */
    public String getClave() {
        return Clave;
    }

    /**
     * Set the value of Clave
     *
     * @param Clave new value of Clave
     */
    public void setClave(String Clave) {
        this.Clave = Clave;
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
