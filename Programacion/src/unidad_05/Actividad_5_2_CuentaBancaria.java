package unidad_05;


/**
 *
 * @author Ivan
 */
public class Actividad_5_2_CuentaBancaria {

    private String nombreTitular;
    private int numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public Actividad_5_2_CuentaBancaria(String nombreTitular, int numeroCuenta, double tipoInteres, double saldo) {
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        ingreso(saldo);
    }
    public String obtenerNombreTitular() {
        return this.nombreTitular;
    }
    public int obtenerNumeroCuenta() {
        return this.numeroCuenta;
    }
    public double obtenerTipoInteres() {
        return this.tipoInteres;
    }
    public double obtenerSaldo() {
        return this.saldo;
    }
    public void establecerNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void establecerNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void establecerTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public void establecerSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double dineroIngresado) {
        try {
            if (dineroIngresado < 0) {
                throw new Exception("Error: El saldo es menor a 0");
            }
            saldo += dineroIngresado;
        } catch (Exception exception) {
            System.out.println("Error " + exception.getMessage());
        }

    }

    public void reintegro(double dineroRetirado) throws Exception {
        try {
            if (dineroRetirado < 0) {
                throw new Exception("El importe es menor a 0");
            }
            if (dineroRetirado > this.saldo) {
                throw new Exception("El importe es mayor que el saldo");
            }
            saldo -= dineroRetirado;
        } catch (Exception exception) {
            System.out.println("Error " + exception.getMessage());
        }
    }
}
