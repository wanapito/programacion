package unidad_03;



public class Actividad_A3_02_Clase_rectangulo {
		private double base ;
		private double altura;
		//constructor con atributos inicados
		public Actividad_A3_02_Clase_rectangulo() {
	base=0;
	altura=0;
		}
		//contructor con atributos en argumeto
		public Actividad_A3_02_Clase_rectangulo(double base,double altura) {
			this.altura=altura;
			this.base=base;
		}
		//getter
		public double  getbase	() {
			return base;
					}
		//getter
		public double getaltura() {
			return altura;
		}
		//setter
		public void setbase(double base) {
			this.base=base;
		}
		//setter
			public void setaltura(double altura) {
				this.altura=altura;
			}
			//setter
			public void setlados (double base,double altura) {
				this.base=base;
				this.altura=altura;
			}
			//getter
			public double perimetro(  ) {
				return (base*2+altura*2);
				
			}
			//getter
			public double area ( ) {
				return base* altura;
			
			}
}