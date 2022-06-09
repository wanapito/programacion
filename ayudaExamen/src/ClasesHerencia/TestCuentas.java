/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesHerencia;

/**
 *
 * @author siste
 */
public class TestCuentas {
    
    public static void main(String[] args) {
        CCuentaAhorro cliente01=new CCuentaAhorro("Angel Lillo", "111/6666",10000,3.5,30);
                System.out.println(cliente01.getNombreTitular());
                System.out.println(cliente01.getCuotaMantenimiento());
                System.out.println(cliente01.getSaldo());
                System.out.println(cliente01.getTipoDeInteres());
                System.out.println(cliente01.intereses());

                CCuentaCorrienteConIn cliente02=new CCuentaCorrienteConIn();
                cliente02.setNombreTitular("ainhoa");
                cliente02.setNumCuenta("1234567890");
                cliente02.setTipoDeInteres(3.0);
                cliente02.setTransExentas(0);
                cliente02.setImportePorTrans(1.0);
                cliente02.reintegro(20000);
                cliente02.intereses();
                cliente02.comisiones();
                System.out.println(cliente02.getNombreTitular());
                System.out.println(cliente02.getNumCuenta());
                System.out.println(cliente02.getSaldo());
                
    }                         
}
