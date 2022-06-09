/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FerreteriaPepe2;

/**
 *
 * @author siste
 */
public class PrecioKilo extends  Prod implements IAlPeso{

    public PrecioKilo() {
    }

    public PrecioKilo(int Codigo, String Descripcion, double Precio, boolean TipoPrecio) {
        super(Codigo, Descripcion, Precio, TipoPrecio);
    }

    @Override
    public double CalcularPrecio(int PesoGramos) {
        return super.CalcularPrecio(PesoGramos); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
