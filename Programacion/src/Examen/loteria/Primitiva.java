
public class Primitiva extends Boleto{
	
	int reintegro;

	public Primitiva(String fecha) {
		super(fecha);
		System.out.println("¿Quieres generar el boleto de la primitiva aleatoriamente? (S/N)");
		if(Teclado.leerSiNo()) {
			generarBoletoAleatorio(6, 49);
			
		}else {
			generarBoletoManual(6, 49);
		}
		reintegro = numeroAleatorio(0, 9);
		
	}
	
	public String boletoImpreso() {
		String boletoImpreso = "";
		boletoImpreso = boletoImpreso + "PRIMITIVA" + "\n";
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
		boletoImpreso = boletoImpreso + "Reintegro: " + reintegro;
		return boletoImpreso;
	}
	

}
