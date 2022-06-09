/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MensajeEncriptado_2;


import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public   abstract  class Mensajeria implements Serializable{

    public Mensajeria() {
    }

    public Mensajeria(int Codigo, String Mensaje, boolean Encriptado) {
        this.Codigo = Codigo;
        this.Mensaje = Mensaje;
        this.Encriptado = Encriptado;
    }
    
      private int Codigo;
      private String Mensaje;    
      private boolean Encriptado;

    
    public String toString() {
        String mensaje;        
        mensaje="Codigo-> " + getCodigo() + "  Mensaje-> " +  getMensaje() + 
               "   Mensaje -> " + ((isEncriptado())?"Encriptado":"No Encriptado")  ;
        return mensaje;
    }

        
 
    
    public   void Encriptar()
    {
        String tEncriptado = "";
        for (int i = 0;i<getMensaje().length();i++)
        {
            tEncriptado+=(char)(getMensaje().charAt(i)+1);
        }
        setMensaje(tEncriptado);
    }
    
    public void Desencriptar()
    {
        String tDesencriptado = "";
        for (int i = 0;i<getMensaje().length();i++)
        {
            tDesencriptado+=(char)(getMensaje().charAt(i)-1);
        }
        setMensaje(tDesencriptado);
    }  
      
    public void ReorganizarCodigos(int codigo){
        setCodigo(codigo);        
    }
    
      
      
    /**
     * Get the value of Encriptado
     *
     * @return the value of Encriptado
     */
    public boolean isEncriptado() {
        return Encriptado;
    }

    /**
     * Set the value of Encriptado
     *
     * @param Encriptado new value of Encriptado
     */
    public void setEncriptado(boolean Encriptado) {
        this.Encriptado = Encriptado;
    }

    

    /**
     * Get the value of Mensaje
     *
     * @return the value of Mensaje
     */
    public String getMensaje() {
        return Mensaje;
    }

    /**
     * Set the value of Mensaje
     *
     * @param Mensaje new value of Mensaje
     */
    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    /**
     * Get the value of Codigo
     *
     * @return the value of Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * Set the value of Codigo
     *
     * @param Codigo new value of Codigo
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
  
    
    
}





















