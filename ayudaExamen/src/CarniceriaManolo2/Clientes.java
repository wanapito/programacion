/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarniceriaManolo2;

/**
 *
 * @author siste
 */
public class Clientes  extends Usuarios{

    public Clientes() {
    }

    public Clientes(String Nombre, String Clave, int Perfil) {
        super(Nombre, Clave, Perfil);
    }

    @Override
    public String toString() {
        String info;
        info= getNombre() +"\t"+ getClave() +"\t"+ getPerfil()+ "\t Usuario Cliente";        
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return info;
    }
    
}
