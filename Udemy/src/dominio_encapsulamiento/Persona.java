package dominio_encapsulamiento;

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
	public boolean isElinado() {
		return this.eliminado;
	}
	//Setter 
	public void setEliminado(boolean eliminado) {
		this.eliminado=eliminado;
}
	//getter toString es metodo para imprimir valores de variables 
	public String toString() {
		return "Persona [Nombre :"+this.nombre+" "+"Sueldo "+this.sueldo +" "+"Eliminado "+this.eliminado+"]";
	}
}
