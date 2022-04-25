package com.mycompany.examen_2019_mensajes;

import java.io.Serializable;

/**
 *
 * @author brc-9
 */
public  abstract class Mensaje implements Serializable{
    protected int codigoNumerico;
    protected String mensaje;
    static int contador;

    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Mensaje(String mensaje) {
        contador++;
        this.codigoNumerico = contador;
        this.mensaje = mensaje;
        
    }




    
    
}
