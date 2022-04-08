package dominio_Herencia;

public class empleado extends Persona {
	//Se declaran variables tipo privado ya que no heredara hacia mas hijos 
private int idEmpleado;
private double sueldo;
//Será de tipo estático por que no queremos que sea para otra clase 
private static int contadorEmpleado;
public empleado() {
	//La variable es estática le vamos a sumar 
		//Se inicializa aquí
	this.idEmpleado = ++empleado.contadorEmpleado;
}

/**
 *Constructor
 * @param nombre
 * @param idEmpleado
 * @param sueldo
 */
//Vamos a recibir un objeto de la clase empleado con "super"
public empleado(String nombre, double sueldo) {
	
	//Estamos llamando al constructor de arriba
	this();
	this.nombre=nombre;
		this.sueldo = sueldo;
}


/**
 *Getter
 * @return el idEmpleado
 */
public int getIdEmpleado() {
	return this.idEmpleado;
}

/**
 *Getter
 * @return el sueldo
 */
public double getSueldo() {
	return this.sueldo;
}
/**
 *Setter
 * @param sueldo el sueldo a establecer
 */
public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}
//Es un modo de tostring 
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Empleado [idEmpleado=");
	builder.append(idEmpleado);
	builder.append(", Sueldo=");
	builder.append(sueldo);
	builder.append("]");
	//con esto estamos llamando a los detalles de las variables superiores
	builder.append(super.toString());
	builder.append("]");
	return builder.toString();
}

}



