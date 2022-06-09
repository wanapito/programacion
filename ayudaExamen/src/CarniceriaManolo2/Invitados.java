/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarniceriaManolo2;

/**
 *
 * @author siste
 */
public class Invitados  extends Usuarios{

    public Invitados() {
    }

    public Invitados(String Nombre, String Clave, int TipoUsuario) {
        super(Nombre, Clave, TipoUsuario);
    }

    @Override
    public String toString() {
        String info;
        info=getNombre() +"\t"+ getClave() +"\t"+ getPerfil() +"\t Usuario Invitado";
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return info;
    }
    
}
