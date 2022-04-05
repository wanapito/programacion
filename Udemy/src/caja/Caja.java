package caja;
//creamos clase 
public class Caja {
	int ancho;
	int profundo;
	int alto;
	//creamos constructor
public Caja () {
		
	}
//creamos constructor con argumentos
public Caja (int ancho,int alto, int profundo) {
this.ancho=ancho;
this.alto=alto;
this.profundo=profundo;
	
}
//creamos metodo getter
public int calculaVolumen() {
	int vol ;
	vol =(ancho*alto*profundo);
	return vol;
}
}
