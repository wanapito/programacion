package unidad_07.actividad_7_2_Cuenta_Bancaria;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class CCuentaCorriente extends CCuenta {


	public int transacciones=0;
	protected double importePorTrans;
	protected int transExentas;
	public CCuentaCorriente(String nombreTitular, String numCuenta,double Saldo,double tipoDeInteres, double importePorTrans, int transExentas) {
		super(nombreTitular,numCuenta,Saldo,tipoDeInteres);
		this.importePorTrans=importePorTrans;
		this.transExentas=transExentas;

	}
	protected void setImportePorTrans(double importePorTrans) {
		this.importePorTrans = importePorTrans;
	}
	protected double getImportePorTrans() {
		return importePorTrans;
	}
	protected void setTransExentas(int transExentas) {
		this.transExentas=transExentas;
	}
	protected int getTransExentas() {
		return transExentas;
	}

	protected void drementarTransacciones() {				
		transacciones--;
	}

	protected void  ingreso (double cantidad) {
		super.ingreso(cantidad);
		transacciones++;
	}
	protected void  reintegro (double cantidad) {
		super.reintegro(cantidad);
		transacciones++;
	}
	//abstractos
	@Override

	protected double intereses() {
		int diaDelMes;
		double gananciasInteresAcumulado=0.0;
		GregorianCalendar gCalendario=new GregorianCalendar();
		diaDelMes=gCalendario.get(Calendar.DAY_OF_MONTH);
		if 	(diaDelMes==1) {
			if (Saldo<3000) {
				gananciasInteresAcumulado=Saldo*0.005;
			}
			else {
				gananciasInteresAcumulado=(3000*0.0005)+((Saldo-3000)*(TipoDeInteres/100));
			}
			Saldo+=gananciasInteresAcumulado;
			return Saldo;
		}
		else return 0.0; 
	}
	protected void comisiones() {
		int diaDelMes;
		GregorianCalendar gCalendario=new GregorianCalendar();
		diaDelMes=gCalendario.get(Calendar.DAY_OF_MONTH);
		if (diaDelMes==1) {
			Saldo -=(importePorTrans*(transacciones-transExentas));


		}}}








