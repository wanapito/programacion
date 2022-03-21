package unidad_05;



/**
 *
 * @author Ivan
 */
public class Actividad_5_2_CuentaBancaria_Main {
	public static void main(String[] args) throws Exception {
		Actividad_5_2_CuentaBancaria cuentaIvan = new Actividad_5_2_CuentaBancaria("ivan nuñez", 123456789, 10, 100);
		System.out.println(cuentaIvan.obtenerSaldo());
		cuentaIvan.reintegro(50);
		cuentaIvan.ingreso(100);
		System.out.println(cuentaIvan.obtenerSaldo());
	}
}


