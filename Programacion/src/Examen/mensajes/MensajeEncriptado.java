/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen_2019_mensajes;

public class MensajeEncriptado extends Mensaje implements IEncriptable{

    public MensajeEncriptado(String mensaje) {
        super(mensaje);
        this.mensaje = encriptar(mensaje);
    }

    @Override
    public String encriptar(String mensaje) {
        String mensajeEncrip = "";
        for(int i = 0; i < mensaje.length(); i++){
            mensajeEncrip += Character.toString((char) (mensaje.codePointAt(i) + 1));
        }
        return mensajeEncrip;
    }

    @Override
    public String desEncriptar() {
        String mensajeDesEncrip = "";
        for(int i = 0; i < mensaje.length(); i++){
            mensajeDesEncrip += Character.toString((char) (mensaje.codePointAt(i) - 1));
        }
        return mensajeDesEncrip;    
    }




    
    
}
