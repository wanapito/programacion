package examen.vacunas;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class VacunaMultidosis extends Vacuna{
	private int semanasSegundaVacuna;
	private String fechaSegundaVacunaString = "";

	// Constructor
	public VacunaMultidosis(String nombre, String fecha, int semanasSegundaVacuna) {
		super(nombre, fecha);
		this.semanasSegundaVacuna= semanasSegundaVacuna; 
		// TODO Auto-generated constructor stub
	}

	public boolean comprobarFechaSegundaDosis() {
		// Comprobamos si se ha pasado la fecha de la segunda dosis
		int dia = extraerDiaStringFecha(fecha);
		int mes = extraerMesStringFecha(fecha);
		int year = extraerYearStringFecha(fecha);
		int diasParaSegundaVacuna = semanasSegundaVacuna * 7;
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		Fecha.sumarDias(dia, mes, year, diasParaSegundaVacuna);
		fechaSegundaVacunaString = format1.format(Fecha.sumarDias(dia, mes, year, diasParaSegundaVacuna));
		if(Fecha.cal.after(Fecha.fecha2)) {
			System.out.println(Fecha.cal.after(Fecha.fecha2));
			return true;
		}else {
			System.out.println(Fecha.cal.after(Fecha.fecha2));
			return false;
		}

	}
	
	public boolean comprobarFechaSegundaDos() {
		// Comprobamos si se ha pasado la fecha de la segunda dosis
		int dia = extraerDiaStringFecha(fecha);
		int mes = extraerMesStringFecha(fecha);
		int year = extraerYearStringFecha(fecha);
		int diasParaSegundaVacuna = semanasSegundaVacuna * 7;
		
		Calendar fechaSegundaVacuna = Fecha.sumarDias(dia, mes, year, diasParaSegundaVacuna);
		int diaSegundaVacuna = fechaSegundaVacuna.get(Calendar.DAY_OF_MONTH);
		int mesSegundaVacuna = fechaSegundaVacuna.get(Calendar.MONTH);
		int yearSegundaVacuna = fechaSegundaVacuna.get(Calendar.YEAR);
		fechaSegundaVacunaString = diaSegundaVacuna + "/" + mesSegundaVacuna + "/" + yearSegundaVacuna;
		if(Fecha.cal.after(fechaSegundaVacuna)) {
			return true;
		}else {
			return false;
		}
	}
	
	private int extraerDiaStringFecha(String fecha) {
		String dia = fecha.substring(0, 2);
		int diaNumero = Integer.parseInt(dia);
		return diaNumero;
	}
	
	private int extraerMesStringFecha(String fecha) {
		String mes = fecha.substring(3, 5);
		int mesNumero = Integer.parseInt(mes);
		return mesNumero;
	}
	
	private int extraerYearStringFecha(String fecha) {
		String year = fecha.substring(6, 10);
		int yearNumero = Integer.parseInt(year);
		return yearNumero;
	}

	public int getSemanasSegundaVacuna() {
		return semanasSegundaVacuna;
	}

	public void setSemanasSegundaVacuna(int semanasSegundaVacuna) {
		this.semanasSegundaVacuna = semanasSegundaVacuna;
	}

	public String getFechaSegundaVacunaString() {
		return fechaSegundaVacunaString;
	}

	public void setFechaSegundaVacunaString(String fechaSegundaVacunaString) {
		this.fechaSegundaVacunaString = fechaSegundaVacunaString;
	}
	
}
