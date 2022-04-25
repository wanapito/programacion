package com.mycompany.examen_2018_baneuro;

import java.io.Serializable;

/**
 *
 * @author brc-9
 */
public class CCC implements Serializable{
    
    private String codigoCCC;
    private String entidad;
    private String oficina;
    private String digitosControl;
    private String numeroCuenta;
    static int contador;
    int[] primerDigitoControl = {4, 8, 5, 10, 9, 7, 3, 6};
    int[] segundoDigitoControl = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
    
// Getter y setter
    public String getCodigoCCC() {
        return codigoCCC;
    }
    public void setCodigoCCC(String codigoCCC) {
        this.codigoCCC = codigoCCC;
    }
    public String getEntidad() {
        return entidad;
    }
    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }
    public String getOficiona() {
        return oficina;
    }
    public void setOficiona(String oficina) {
        this.oficina = oficina;
    }
    public String getDigitosControl() {
        return digitosControl;
    }
    public void setDigitosControl(String digitosControl) {
        this.digitosControl = digitosControl;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        CCC.contador = contador;
    }
    // Constructor

    public CCC(String entidad, String oficiona) {
        this.entidad = entidad;
        this.oficina = oficiona;
        this.numeroCuenta = generarNumeroCuenta();
        this.digitosControl = obtenerDigitosControl(entidad, oficiona, numeroCuenta);
        this.codigoCCC = toStringCCC();
    }

    private String obtenerDigitosControl(String entidad, String oficina, String numeroCuenta) {
        String dControl;
        dControl = primerDigitoControl(entidad, oficina) + segundoDigitoControl(numeroCuenta);
        return dControl;
    }
    
    private String primerDigitoControl(String entidad, String oficina){
        String entidadOficina = entidad + oficina;
        String[] entidadOficinaArray = entidadOficina.split("");
        int sumado = 0;
        int numeroFinal;
        String digitoControl;
        for (int i=0; i < primerDigitoControl.length; i++) {
            sumado += Integer.parseInt(entidadOficinaArray[i]) * primerDigitoControl[i];
        }
        numeroFinal = 11 - (sumado%11);
        if(numeroFinal == 10){
            digitoControl = String.valueOf(1);
        }else if(numeroFinal == 11){
            digitoControl = String.valueOf(0);
        }else{
            digitoControl = String.valueOf(numeroFinal);
        }
        return digitoControl;
    }
    
    
    
    private String segundoDigitoControl(String numeroCuenta){
        
        String[] numeroCuentaArray = numeroCuenta.split("");
        int sumado = 0;
        int numeroFinal;
        String digitoControl;
        for (int i=0; i < segundoDigitoControl.length; i++) {
            sumado += Integer.parseInt(numeroCuentaArray[i]) * segundoDigitoControl[i];
        }
        numeroFinal = 11 - (sumado%11);
        if(numeroFinal == 10){
            digitoControl = String.valueOf(1);
        }else if(numeroFinal == 11){
            digitoControl = String.valueOf(0);
        }else{
            digitoControl = String.valueOf(numeroFinal);
        }
        return digitoControl;
    }
    

    private String generarNumeroCuenta() {
        CCC.contador++; 
        String numCuenta = "";
        int tamanoRestanteNumeroCuenta = 10 - String.valueOf(contador).length();
        for (int i=0; i < tamanoRestanteNumeroCuenta; i++) {
            numCuenta += "0";
        }
        numCuenta += String.valueOf(contador);
        return numCuenta;
    }

    String toStringCCC() {
        return entidad + " " + oficina + " " + digitosControl + " " + numeroCuenta;
    }
    
    String toStringCCCSinEspacios() {
        return entidad + oficina + digitosControl + numeroCuenta;
    }

    
}
