package dominio.encapsulamiento;

public class Persona {
	//Creamos variables tipo private 
	private String nombre;
	private double sueldo;
	private boolean eliminado;
	//Creamos constructor con argumentos
	public Persona (String nombre , double sueldo, boolean eliminado) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.eliminado=eliminado;
	}
	//Getter 
	public String getNombre() {
		
		return this.nombre;
	}
	
	//Setter
	public void setnombre(String nombre) {
		this.nombre=nombre;
		
	}
	//Getter
	public double getSueldo() {
		return this.sueldo;
	}
	//Setter
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
		
	}
	//Getter cuando es boolean en vez de get... es is....
	public boolean isEliminado() {
		return this.eliminado;
	}
	//Setter 
	public void setEliminado(boolean eliminado) {
		this.eliminado=eliminado;
}
	//Getter toString es método para imprimir valores de variables 
	public String toString() {
		return "Persona [Nombre :"+this.nombre+" "+"Sueldo "+this.sueldo +" "+"Eliminado "+this.eliminado+"]";
	}

	}
