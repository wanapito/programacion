package poo;
//con extendes de esta manera vamos a heredar los datos de coche (superclase) a furgoneta (subclase)
public class Furgoneta extends Coche{
	//creamos las caracteristicas propias
	private int capacidaCarga;
	private int plazasExtra;
	//vamos a crear el constructor aunque ya tiene heredado el de coche 
	public Furgoneta(int plazasExtra,int capacidaCarga) {
		//super llamamos al contrustor padre en este caso coche para que nos de los valores ya definidos
		super();
		//estamos dando un valor a los atributos con los de la clase furgonta 
		this.capacidaCarga=capacidaCarga;
		this.plazasExtra=plazasExtra;
			
		
	}
	//getter
	public String dimeDatosFurgoneta() {
		return "la capacida de carga es : "+capacidaCarga+" y la plazas son: " +plazasExtra;
	}

}
