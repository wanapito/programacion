package examen.vacunas;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
	static Calendar cal = Calendar.getInstance();
	static int dia = cal.get(Calendar.DAY_OF_MONTH);

	static int mes = cal.get(Calendar.MONTH);
	static int year = cal.get(Calendar.YEAR);
	static int diasSegundaFecha;
	static int mesSegundaFecha;
	static int yearSegundaFecha;
	static Calendar fecha2;
	
	public static Calendar sumarDias(int dia, int mes, int anio, int dias) {
		Calendar fechaCalendar = Calendar.getInstance();
		fechaCalendar.set(anio, mes, dia);
		fechaCalendar.add(Calendar.DAY_OF_YEAR, dias);
		return fechaCalendar;
	}

	
}
