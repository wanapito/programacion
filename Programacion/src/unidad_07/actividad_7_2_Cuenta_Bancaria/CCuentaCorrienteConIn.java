package unidad_07.actividad_7_2_Cuenta_Bancaria;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CCuentaCorrienteConIn extends CCuentaCorriente{
	public CCuentaCorrienteConIn(String nombreTitular,String numCuenta, double Saldo, double tipoInteres,double importePorTrans,	int transExentas) {
	

	super(nombreTitular,numCuenta,Saldo,tipoInteres,importePorTrans,transExentas);
}
@Override
protected double intereses () {
	int diaDelMes;
	double gananciasInteresAcumulado=0.0;
	GregorianCalendar gCalendario=new GregorianCalendar();
	diaDelMes=gCalendario.get(Calendar.DAY_OF_MONTH);
	if (diaDelMes==1) {
		if(Saldo>3000) {
			gananciasInteresAcumulado=Saldo*(TipoDeInteres/100);
			return gananciasInteresAcumulado;
		}
		else return 0.0;
		
		}else return 0.0;
	}


	
}
	


