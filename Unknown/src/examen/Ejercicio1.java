package examen;

public class Ejercicio1 {

	// Método que recibe una matriz de tipo int y devuelve la posición del primer
	// número negativo.
	public static int devuelveNegativo(int matriz[]) {
		int posicion = -1;

		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i] < 0) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}

	// Método que recibe un string y retorna la posición del primer dígito.
	public static int devuelvePosicionDigito(String string) {
		int posicion = -1;

		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}

	// Método que recibe una matriz y cuenta los valores de la matriz que están
	// entre -5 y 5. => 5 y -5 incluidos.
	public static int contadorDeNumeros(int matriz[]) {
		int contador = 0;
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i] >= -5 && matriz[i] <= 5) {
				contador++;
			}
		}
		return contador;
	}

	// Método que recibe una matriz y devuelve un String con la siguiente
	// información:
	public static String estadisticasExamen(int notasEstudiantes[]) {

		int suspensos = 0;
		int aprobados = 0;
		int sobresalientes = 0;
		int errores = 0;

		for (int i = 0; i < notasEstudiantes.length; i++) {

			if (notasEstudiantes[i] < 0 || notasEstudiantes[i] > 10) {
				errores++;
			}

			else if (notasEstudiantes[i] >= 0 && notasEstudiantes[i] < 5) {
				suspensos++;
			}

			else if (notasEstudiantes[i] >= 5 && notasEstudiantes[i] < 7) {
				aprobados++;
			}

			else if (notasEstudiantes[i] >= 7 && notasEstudiantes[i] <= 10) {
				sobresalientes++;
			}

		}
		String estadisticas = "- Numero de sobresalientes: " + sobresalientes + "\n- Numero de aprobados: " + aprobados
				+ "\n- Numero de suspensos: " + suspensos + "\n- Numero de errores: " + errores;
		return estadisticas;
	}
}
