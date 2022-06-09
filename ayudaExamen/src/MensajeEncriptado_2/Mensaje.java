/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MensajeEncriptado_2;

public class Mensaje extends Mensajeria implements  Iserializable{

    public Mensaje() {
    }

    public Mensaje(int Codigo, String Mensaje, boolean Encriptado) {
        super(Codigo, Mensaje, Encriptado);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Desencriptar() {
        super.Desencriptar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Encriptar() {
        super.Encriptar(); //To change body of generated methods, choose Tools | Templates.
    }

 
    
    
}






















