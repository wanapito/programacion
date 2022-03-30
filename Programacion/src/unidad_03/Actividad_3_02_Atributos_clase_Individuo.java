package unidad_03;




	/*
	 * Crear una clase Individuo con atributos DNI (de tipo cadena), 
	 * nombre y otro relativo al a�o de nacimiento (de tipo num�rico). 
	 * Incorpora un constructor general que reciba como par�metros los 3 
	 * atributos anteriores. Incorporar m�todos getter() y setter() a trav�s
	 *  de la utilidad que tendr�n los IDE�s como Eclipse o Netbeans para 
	 *  automatizar dicho proceso (investiga para ver c�mo hacerlo). Incorporar 
	 *  un atributo est�tico o de clase que controle la poblaci�n 
	 *  (cantidad de individuos)  y que llamaremos poblacion. Posteriormente, 
	 *  en el m�todo principal, instanciaremos una serie de elementos Individuo, 
	 *  comprobando que el valor del atributo de clase poblacion se actualiza, 
	 *  efectivamente, con el n�mero de individuos instanciados.
	 */
	//creamos la clase
public class Actividad_3_02_Atributos_clase_Individuo{
	private String  DNI;
	private String nombre;
	private int f_nacimiento;
	private static int poblacion;
	//creamos el constructor y se inicialiazan valores 
	public Actividad_3_02_Atributos_clase_Individuo(String DNI,String nombre,int f_nacimiento) {
		super();
		this.DNI=DNI;
		this.f_nacimiento=f_nacimiento;
		this.nombre=nombre;
		//con ++ vamos a ir sumando +1 a poblacion
		poblacion++;
		
	}
	//getter
	public String getDNI() {
		return DNI;
		
		
	}
	//shetter
	public void setDNI() {
		this.DNI=DNI;
		
	}
	//getter
	public String getNombre() {
		return nombre;
	}
//shetter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
//getter
	public int getFechaNacimiento() {
		return f_nacimiento;
	}
//shetterr
	public void setFechaNacimiento(int f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}
//getter
	public static int getPoblacion() {
		return poblacion;
}
	//shetter
	public static void setPoblacion(int poblacion) {
		Actividad_3_02_Atributos_clase_Individuo.poblacion = poblacion;
	}

//creamos metodo main 
	public static void main(String[] args) {
		// se genera individuos con los datos necesarios
		Actividad_3_02_Atributos_clase_Individuo i1=new Actividad_3_02_Atributos_clase_Individuo("02345219R", "Jos� Nogales", 1978);
		Actividad_3_02_Atributos_clase_Individuo i2=new Actividad_3_02_Atributos_clase_Individuo("32344401R", "Ana L�pez", 1973);
		Actividad_3_02_Atributos_clase_Individuo i3=new Actividad_3_02_Atributos_clase_Individuo("01345420R", "Mario Carrascosa", 1988);
		Actividad_3_02_Atributos_clase_Individuo i4=new Actividad_3_02_Atributos_clase_Individuo("07257219R", "Jose Luis Ram�rez",1999 );

		System.out.println("Tenemos una poblaci�n de: " + Actividad_3_02_Atributos_clase_Individuo.getPoblacion() + " personas");
	}
	
}
