package unidad_04;

/*
 * Se cuenta con la siguiente información:

Las edades de 50 estudiantes del turno mañana. (entre 16 y 28 años ambos inclusive)
Las edades de 60 estudiantes del turno tarde. (entre 16 y 35 años ambos inclusive)
Las edades de 110 estudiantes del turno noche. (entre 18 y 45 años ambos inclusive)
Las edades de cada estudiante deben  calcularse de forma aleatoria usando el método random de la clase Math.

Para cada uno de los turnos se pide:
a) Obtener la mínima, la máxima y el promedio de las edades de cada turno
b) Mostrar por pantalla un mensaje que indique cual de los tres turnos tiene un promedio de edades mayor
 */

public class Actividad_4_17_SentenciaAltenativaedades {

	public static void main(String[] args) {
		final int TMañana = 50;
		final int TTarde = 60;
		final int TNoche = 110;
		final int MenorMañana = 16;
		final int MayorMañana = 28;
		final int MenorTarde = 16;
		final int MayorTarde = 35;
		final int MenorNoche = 18;
		final int MayorNoche = 45;
		int MinMañana = MenorMañana;
		int MaxMañana = MayorMañana;
		int SumaMañana = 0;
		int MinTarde = MenorTarde;
		int MaxTarde = MayorTarde;
		int SumaTarde = 0;
		int MinNoche = MenorNoche;
		int MaxNoche = MayorNoche;
		int SumaNoche = 0;

		for (int i = 1; i <= TMañana; i++) {
			int e = (int) (Math.random() * (MayorMañana - MenorMañana + 1)
					+ MenorMañana);
			if (e < MinMañana) {
				MinMañana = e;
			}
			if (e > MaxMañana) {
				MaxMañana = e;
			}
			SumaMañana += e;
		}

		for (int i = 1; i <= TTarde; i++) {
			int e = (int) (Math.random() * (MayorTarde - MenorTarde + 1)
					+ MenorTarde);
			if (e < MinTarde) {
				MinTarde = e;
			}
			if (e > MaxTarde) {
				MaxTarde = e;
			}
			SumaTarde += e;
		}

		for (int i = 1; i <= TNoche; i++) {
			int e = (int) (Math.random() * (MayorNoche - MenorNoche + 1)
					+ MenorNoche);
			if (e < MinNoche) {
				MinNoche = e;
			}
			if (e > MaxNoche) {
				MaxNoche = e;
			}
			SumaNoche += e;
		}
		int promedioMañana = SumaMañana / TMañana;
		int promedioTarde = SumaTarde / TTarde;
		int promedioNoche = SumaNoche / TNoche;
		System.out.println("TURNO DE MAÑANA:");
		System.out.println("EDAD MÍNIMA:" + MinMañana);
		System.out.println("EDAD MÁXIMA:" + MaxMañana);
		System.out.println("PROMEDIO:" + promedioMañana);
		System.out.println("\nTURNO DE TARDE:");
		System.out.println("EDAD MÍNIMA:" + MinTarde);
		System.out.println("EDAD MÁXIMA:" + MaxTarde);
		System.out.println("PROMEDIO:" + promedioTarde);
		System.out.println("\nTURNO DE NOCHE:");
		System.out.println("EDAD MÍNIMA:" + MinNoche);
		System.out.println("EDAD MÁXIMA:" + MaxNoche);
		System.out.println("PROMEDIO:" + promedioNoche);

		if (promedioMañana == promedioTarde
				&& promedioMañana == promedioNoche) {
			System.out.println(
					"Los tres turnos tienen el promedio " + promedioMañana);
		} else if (promedioMañana == promedioTarde
				&& promedioMañana > promedioNoche) {
			System.out
					.println("Los turnos de mañana y tarde tienen el promedio "
							+ promedioMañana);
		} else if (promedioMañana == promedioNoche
				&& promedioMañana > promedioTarde) {
			System.out
					.println("Los turnos de mañana y noche tienen el promedio "
							+ promedioMañana);
		} else if (promedioTarde == promedioNoche
				&& promedioTarde > promedioMañana) {
			System.out.println("Los turnos de tarde y noche tienen el promedio "
					+ promedioMañana);
		} else if (promedioMañana > promedioTarde
				&& promedioMañana > promedioNoche) {
			System.out.println(
					"El turno de mañana tiene el promedio " + promedioMañana);
		} else if (promedioTarde > promedioMañana
				&& promedioTarde > promedioNoche) {
			System.out.println(
					"El turno de tarde tiene el promedio " + promedioTarde);
		} else {
			System.out.println(
					"El turno de noche tiene el promedio " + promedioNoche);
		}

	}

}
