package unidad_07.actividad_7_2_Cuenta_Bancaria;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CCuentaAhorro extends CCuenta {
//atibutos
protected double cuotaMantenimiento;
//contructor
public CCuentaAhorro(String nombreTitular,String numCuenta, double Saldo,double tipoInteres,double cuotaMantenimiento){
	super(nombreTitular,numCuenta,Saldo,tipoInteres);
	this.cuotaMantenimiento=cuotaMantenimiento;
	}



	protected void setCuotaManten(double cuotaMantenimiento) {
		this.cuotaMantenimiento=cuotaMantenimiento;

	}
	protected double getCuotaManten() {
		return cuotaMantenimiento;
	}
	//abstractos
	@Override
	protected void comisiones() {
		int diaDelMes;
		GregorianCalendar gCalendario=new GregorianCalendar();
		diaDelMes=gCalendario.get(Calendar.DAY_OF_MONTH);
		if (diaDelMes==1) {
			Saldo=-cuotaMantenimiento;

		}}
	@Override
	protected double intereses() {
		int diaDelMes;
		double gananciaInteresAcumulado=0.0;
		GregorianCalendar gCalendario=new GregorianCalendar();
		diaDelMes=gCalendario.get(Calendar.DAY_OF_MONTH);
		if (diaDelMes==1) {
			gananciaInteresAcumulado=Saldo*(TipoDeInteres/100);
			System.out.println(gananciaInteresAcumulado);
			Saldo+=gananciaInteresAcumulado;
			return Saldo;
		}
	else return 0.0;
		
		}

	}
	