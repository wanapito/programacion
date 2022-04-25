package examen.vacunas;
import java.io.Serializable;

public class Vacuna implements Serializable{
	protected String nombre;
	protected String fecha;
	
	public Vacuna(String nombre, String fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	// Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
