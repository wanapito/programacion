package unidad_07.actividad_7_2_Cuenta_Bancaria;

public abstract class CCuenta {


//se declaran los atributos
	protected String nombreTitular;
	protected String numCuenta;
	protected double Saldo;
	protected double TipoDeInteres;
	//se declara el constructor
	public CCuenta (String nombreTitular,String numCuenta,double Saldo,double tipoInteres) {
	this.nombreTitular=nombreTitular;
	this.numCuenta=numCuenta;
	this.Saldo=Saldo;
	this.TipoDeInteres=tipoInteres;
	}
	//contructor por defecto
	public CCuenta() {}
	

	protected void setNombre(String nombreTitular) {

		this.nombreTitular=nombreTitular;

	}
	protected String getNombre() {
		return nombreTitular;

	}
	protected void setCuenta(String numCuenta) {

		this.numCuenta=numCuenta;
	}
	protected String getCuenta() {
		return numCuenta;

	}
	protected double getSaldo() {
		return Saldo;
	}
	protected void setSaldo(double saldo) {
		this.Saldo=saldo;

	}
	protected void setTipoInteres(double TipoDeInteres) {
		this.TipoDeInteres=TipoDeInteres;
	}
	protected double getTipoInteres() {
		return TipoDeInteres;
	}
		
		//abstractos 
	
	protected abstract void comisiones() ;
	protected abstract double intereses();

	
	protected void ingreso (double cantidad) {

		Saldo+=cantidad;

	}
	protected void reintegro (double cantidad) {

		Saldo-=cantidad;

	}}

