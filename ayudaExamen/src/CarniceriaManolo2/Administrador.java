/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarniceriaManolo2;

/**
 *
 * @author siste
 */
public class Administrador extends Usuarios{

    public Administrador() {
    }

    public Administrador(String Nombre, String Clave, int Perfil) {
        super(Nombre, Clave, Perfil);
    }

    @Override
    public String toString() {
        String Info;
        Info =getNombre() +"\t"+ getClave() +"\t"+ getPerfil() + "Usuario Administrador";
        //-return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return Info;
    }
    
}
