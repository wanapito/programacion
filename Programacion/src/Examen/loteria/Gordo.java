
public class Gordo extends Boleto{
	
	int numeroAdicionalGordo;
	
	public Gordo(String fecha) {
		super(fecha);
		System.out.println("¿Quieres generar el boleto del Gordo aleatoriamente? (S/N)");
		if(Teclado.leerSiNo()) {
			generarBoletoAleatorio(5, 54);
			
		}else {
			generarBoletoManual(5, 54);
		}
		System.out.println("Introduce reintegro:");
		numeroAdicionalGordo = Teclado.leerNumero(0, 9);

	}
	
	public String boletoImpreso() {
		String boletoImpreso = "";
		boletoImpreso = boletoImpreso + "Euromillones" + "\n";
		boletoImpreso = boletoImpreso + "Numero del boleto: " + codigoBoleto + "\n";
		boletoImpreso = boletoImpreso + "Fecha del sorteo: " + fecha + "\n";
		boletoImpreso = boletoImpreso + "Apuesta: ";
		for (int i=0; i < apuesta.length; i++) {
			
			if(i == apuesta.length -1) {
				boletoImpreso = boletoImpreso + apuesta[i] + "\n";
			}else {
				boletoImpreso = boletoImpreso + i + ", ";
			}
		}
		boletoImpreso = boletoImpreso + "Reintegro: " + numeroAdicionalGordo;
		return boletoImpreso;
	}
}
