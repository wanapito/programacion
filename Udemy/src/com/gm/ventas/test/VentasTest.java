package com.gm.ventas.test;

import com.gm.ventas.Producto;
import com.gm.ventas.orden;

public class VentasTest {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Producto producto1 = new Producto("Camisa ", 50.00);
		Producto producto2 = new Producto("Pantalón", 100.00);

		orden orden1 = new orden();
		// Agregamos valor a orden desde producto
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.mostraOrden();
	}

}
