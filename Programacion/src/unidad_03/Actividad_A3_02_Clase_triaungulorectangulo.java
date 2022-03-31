package unidad_03;

public class Actividad_A3_02_Clase_triaungulorectangulo {
	
		private double base;
		private double altura;
		public Actividad_A3_02_Clase_triaungulorectangulo(){
			base=1;
			altura=1;
		}
		public Actividad_A3_02_Clase_triaungulorectangulo(double base , double altura) {
			
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
				return (base+altura+Math.sqrt(Math.pow(base, 2)+Math.pow(altura,2)));
			
			}
			//getter
			public double area ( ) {
				return (base* altura)/2;
				
			}
	}






