/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesHerencia;

/**
 *
 * @author siste
 */
public class CCuentaCorrienteConIn extends CCuentaCorriente{

    public CCuentaCorrienteConIn() {
    }

    public CCuentaCorrienteConIn(String nombreTitular, String numCuenta, double Saldo, double TipoDeInteres, double importeTransaccion) {
        super(nombreTitular, numCuenta, Saldo, TipoDeInteres, importeTransaccion);
    }

public double intereses(){
  double importeInteresesGanado= (getSaldo() *  (getTipoDeInteres()/12));
  
  if (getSaldo() >=3000){
      ingreso(importeInteresesGanado);
  }else {
          ingreso(0);
          importeInteresesGanado=0;
  }
  return importeInteresesGanado;
}
    
    
    
    
}
