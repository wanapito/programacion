package mx.com.gm.ventas;

public class orden {
	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;
	public orden() {
		this.idOrden = ++contadorOrdenes;
		// Como tenemos un valor asignado a max productos sería un array de 10
		this.productos = new Producto[orden.MAX_PRODUCTOS];
	}

	public void agregarProducto(Producto producto) {
		// Hacemos un if el cual incrementara contador productos hasta que sea
		// Menor que maxproductos
		if (this.contadorProductos < orden.MAX_PRODUCTOS) {
			this.productos[this.contadorProductos++] = producto;
		} else {
			System.out.println("Se ha superado el máximo de productos "
					+ orden.MAX_PRODUCTOS);
		}

	}
	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < this.contadorProductos; i++) {
			Producto producto = this.productos[i];
			// Esto es igual total +producto.getprecio()
			// total += producto.getPrecio();
			// También se puede hacer así
			total += this.productos[i].getPrecio();
		}
		return total;

	}
	public void mostraOrden() {
		System.out.println("idOrden : " + this.idOrden);
		// Llamamos al método anterior
		double totalOrden = this.calcularTotal();
		System.out.println("El total de la orden es : $" + totalOrden);
		System.out.println("Productos de la orden : ");
		for (int i = 0; i < this.contadorProductos; i++) {
			// Imprimimos la lista de productos y como tiene hecho un tostring
			// Imprimiría los valores que le dimos
			System.out.println(this.productos[i]);

		}

	}
}
