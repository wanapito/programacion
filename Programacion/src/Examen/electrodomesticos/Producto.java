package examen.electrodomesticos;

import java.io.Serializable;

public class Producto implements Serializable {

	private int codigo;
	private String descripcion;
	private String fabricante;
	private String modelo;
	private int stock;
	private double precio;

	public Producto(int c, String d, String fab, String mo, int s, double p) {
		codigo = c;
		descripcion = d;
		fabricante = fab;
		modelo = mo;
		stock = s;
		precio = p;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String toString() {
		return "Código: " + codigo + "\nDescripción: " + descripcion
				+ "\nFabricante: " + fabricante + "\nModelo: " + modelo
				+ "\nStock: " + stock + "\nPrecio unidad: " + precio;

	}

}
