package Examen.vacunas;
import java.io.Serializable;

public class Paciente implements Serializable {
	private String nombreApellidos;
	private String telefono;
	private Vacuna vacuna;

	public Paciente(String nombreApellidos, String telefono, Vacuna vacuna) {
		this.nombreApellidos = nombreApellidos;
		this.telefono = telefono;
		this.vacuna = vacuna;
	}

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Vacuna getVacuna() {
		return vacuna;
	}

	public void setVacuna(Vacuna vacuna) {
		this.vacuna = vacuna;
	}

	@Override
	public String toString() {
		String toString = "\nPaciente" + "\n------------------------------"
				+ "\n Nombre Apellidos: " + getNombreApellidos()
				+ "\n Telefono:  " + getTelefono() + "\n Nombre Vacuna: "
				+ getVacuna().getNombre() + "\n Fecha primera dosis  "
				+ getVacuna().getFecha() + "\n-------------------------------";
		return toString;
	}

}
