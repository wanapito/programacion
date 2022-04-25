import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class Boleto implements Serializable{
	protected int codigoBoleto;
	protected String fecha;
	protected int[] apuesta;
	
	private static int posicion = 0;
	
	public Boleto(String fecha) {
		super();
		this.fecha = fecha;
		posicion++;
		codigoBoleto = posicion;
	}
	
    public  int getCodigoBoleto() {
        return codigoBoleto;
    }
    
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	protected int numeroAleatorio(int min, int max) {
		int numeroAleatorio;
		numeroAleatorio = (int)(Math.random()*(max-min+1))+min;
		return numeroAleatorio;
	}
	
	protected int[] generarBoletoAleatorio(int cantidadNumeros, int max) {
		apuesta = new int[cantidadNumeros];
		int aux;
		for (int i=0; i < apuesta.length; i++) {
			aux = numeroAleatorio(1, max);
			if(!comprobarRepetidos(apuesta, aux)) {
				apuesta[i] = aux;
			}
		}
		Arrays.sort(apuesta);
		return apuesta;
	}
	
	protected int[] generarBoletoManual(int cantidadNumeros, int max){
		System.out.println("Introduce " + cantidadNumeros + " numeros. (Sin repetidos):");
		apuesta = new int[cantidadNumeros];
		int aux;
		for (int i=0; i < apuesta.length; i++) {
			aux = Teclado.leerNumero(1, max);
			if(!comprobarRepetidos(apuesta, aux)) {
				apuesta[i] = aux;
				
			}else {
				System.err.println("Has introducido un numero repetido");
				i--;
			}
		}
		Arrays.sort(apuesta);
		return apuesta;
	}

	private boolean comprobarRepetidos(int[] array, int valor) {
		for (int i=0; i < apuesta.length; i++) {
			if(array[i] == valor) {
				return true;
			}
		}
		return false;
	}
	
    protected abstract String boletoImpreso();

	public static int getPosicion() {
		return posicion;
	}

	public static void setPosicion(int posicion) {
		Boleto.posicion = posicion;
	}

}
