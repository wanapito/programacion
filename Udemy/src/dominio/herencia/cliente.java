package dominio_Herencia;

import java.util.Date;

public class cliente extends Persona {
private int idCliente;
private Date fechaRegistro;
private boolean vip;
//Tipo static por lo que solo se podrá utilizar en la clase 
private static int contadorIdCliente;


/**
 *Constructor
 * @param nombre
 * @param genero
 * @param edad
 * @param direccion
 * @param idCliente
 * @param fechaRegistro
 * @param vip
 */
public cliente(String nombre, char genero, int edad, String direccion,Date fechaRegistro, boolean vip) {
	//Llamamos a los atributos de la clase padre 
	super(nombre, genero, edad, direccion);
	this.fechaRegistro = fechaRegistro;
	this.vip = vip;
	//Es una atributo estático y sumara 1 
	this.idCliente=++cliente.contadorIdCliente;
}


/**
 *Getter
 * @return el fechaRegistro
 */
public Date getFechaRegistro() {
	return fechaRegistro;
}

/**
 *Setter
 * @param fechaRegistro el fechaRegistro a establecer
 */
public void setFechaRegistro(Date fechaRegistro) {
	this.fechaRegistro = fechaRegistro;
}

/**
 *Getter
 * @return el vip
 */
public boolean isVip() {
	return vip;
}

/**
 *Setter
 * @param vip el vip a establecer
 */
public void setVip(boolean vip) {
	this.vip = vip;
}

/**
 *Getter
 * @return el idCliente
 */
public int getIdCliente() {
	return idCliente;
}


@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Cliente [idCliente=");
	builder.append(idCliente);
	builder.append(", fechaRegistro=");
	builder.append(fechaRegistro);
	builder.append(", vip=");
	builder.append(vip);
	builder.append("]");
	//con esto estamos llamando a los detalles de las variables superiores
	builder.append(super.toString());		
	builder.append("]");
	return builder.toString();
}

}