/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.tiendaRopa;

/**
 *
 * @author brc-9
 */
public class PrendaVestir extends Articulos {
	static String[] tallasValidas = {"XS", "S", "M", "L", "XL", "34", "36",
			"38", "40", "42", "44"};
	private String talla;
	public boolean esRopaInterior;

	public String[] getTallasValidad() {
		return tallasValidas;
	}
	public void setTallasValidad(String[] tallasValidad) {
		this.tallasValidas = tallasValidad;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public boolean isEsRopaInterior() {
		return esRopaInterior;
	}
	public void setEsRopaInterior(boolean esRopaInterior) {
		this.esRopaInterior = esRopaInterior;
	}

	public PrendaVestir(String talla, String referencia, String descripcion,
			int cantidad, double precio, boolean esRopaInterior) {
		super(referencia, descripcion, cantidad, precio);
		this.talla = talla;
		this.esRopaInterior = esRopaInterior;

	}

	static boolean comprobarTalla(String talla) {
		for (String tallaValida : tallasValidas) {
			if (talla.equals(tallaValida)) {
				return true;
			}
		}
		System.out.println("Talla incorrecta");
		return false;

	}

	@Override
	public double devolver(double diasTranscurridos) {
		double costeDevolucion;
		costeDevolucion = 4 + (diasTranscurridos / 10);
		return costeDevolucion;
	}

}
