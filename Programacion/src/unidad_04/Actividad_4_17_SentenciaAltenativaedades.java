package unidad_04;

/*
 * Se cuenta con la siguiente informaci�n:

Las edades de 50 estudiantes del turno ma�ana. (entre 16 y 28 a�os ambos inclusive)
Las edades de 60 estudiantes del turno tarde. (entre 16 y 35 a�os ambos inclusive)
Las edades de 110 estudiantes del turno noche. (entre 18 y 45 a�os ambos inclusive)
Las edades de cada estudiante deben  calcularse de forma aleatoria usando el m�todo random de la clase Math.

Para cada uno de los turnos se pide:
a) Obtener la m�nima, la m�xima y el promedio de las edades de cada turno
b) Mostrar por pantalla un mensaje que indique cual de los tres turnos tiene un promedio de edades mayor
 */

public class Actividad_4_17_SentenciaAltenativaedades {

	public static void main(String[] args) {
		final int TMa�ana = 50;
		final int TTarde = 60;
		final int TNoche = 110;
		final int MenorMa�ana = 16;
		final int MayorMa�ana = 28;
		final int MenorTarde = 16;
		final int MayorTarde = 35;
		final int MenorNoche = 18;
		final int MayorNoche = 45;
		int MinMa�ana = MenorMa�ana;
		int MaxMa�ana = MayorMa�ana;
		int SumaMa�ana = 0;
		int MinTarde = MenorTarde;
		int MaxTarde = MayorTarde;
		int SumaTarde = 0;
		int MinNoche = MenorNoche;
		int MaxNoche = MayorNoche;
		int SumaNoche = 0;

		for (int i = 1; i <= TMa�ana; i++) {
			int e = (int) (Math.random() * (MayorMa�ana - MenorMa�ana + 1)
					+ MenorMa�ana);
			if (e < MinMa�ana) {
				MinMa�ana = e;
			}
			if (e > MaxMa�ana) {
				MaxMa�ana = e;
			}
			SumaMa�ana += e;
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
		int promedioMa�ana = SumaMa�ana / TMa�ana;
		int promedioTarde = SumaTarde / TTarde;
		int promedioNoche = SumaNoche / TNoche;
		System.out.println("TURNO DE MA�ANA:");
		System.out.println("EDAD M�NIMA:" + MinMa�ana);
		System.out.println("EDAD M�XIMA:" + MaxMa�ana);
		System.out.println("PROMEDIO:" + promedioMa�ana);
		System.out.println("\nTURNO DE TARDE:");
		System.out.println("EDAD M�NIMA:" + MinTarde);
		System.out.println("EDAD M�XIMA:" + MaxTarde);
		System.out.println("PROMEDIO:" + promedioTarde);
		System.out.println("\nTURNO DE NOCHE:");
		System.out.println("EDAD M�NIMA:" + MinNoche);
		System.out.println("EDAD M�XIMA:" + MaxNoche);
		System.out.println("PROMEDIO:" + promedioNoche);

		if (promedioMa�ana == promedioTarde
				&& promedioMa�ana == promedioNoche) {
			System.out.println(
					"Los tres turnos tienen el promedio " + promedioMa�ana);
		} else if (promedioMa�ana == promedioTarde
				&& promedioMa�ana > promedioNoche) {
			System.out
					.println("Los turnos de ma�ana y tarde tienen el promedio "
							+ promedioMa�ana);
		} else if (promedioMa�ana == promedioNoche
				&& promedioMa�ana > promedioTarde) {
			System.out
					.println("Los turnos de ma�ana y noche tienen el promedio "
							+ promedioMa�ana);
		} else if (promedioTarde == promedioNoche
				&& promedioTarde > promedioMa�ana) {
			System.out.println("Los turnos de tarde y noche tienen el promedio "
					+ promedioMa�ana);
		} else if (promedioMa�ana > promedioTarde
				&& promedioMa�ana > promedioNoche) {
			System.out.println(
					"El turno de ma�ana tiene el promedio " + promedioMa�ana);
		} else if (promedioTarde > promedioMa�ana
				&& promedioTarde > promedioNoche) {
			System.out.println(
					"El turno de tarde tiene el promedio " + promedioTarde);
		} else {
			System.out.println(
					"El turno de noche tiene el promedio " + promedioNoche);
		}

	}

}
