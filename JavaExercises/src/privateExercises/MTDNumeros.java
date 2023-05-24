package privateExercises;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;

public class MTDNumeros {

// Metodo 1 - Bloque 1 -- Metodo para calcular si un numero es perfecto.
	public static boolean isPerfectNumber(int number) {
		int addition = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) { // El bucle busca sus divisores desde hasta (number-1)
				addition += i;// En caso de encontrar se agrega a la suma el divisor correspondiente
			}
		}
		if (addition == number) {
			return true; // Si la suma de los divisores es igual al numero, se dice que el numero es
							// perfecto, se retorna true.
		}

		return false; // Si no se cumple la condicion, se retorna false.
	}

// -------------------------------------------------------------------------------------------------------------------------------

// Metodo 2 - Bloque 1	-- Metodo para calcular el minimo comun multiplo de 3 numeros positivos, y menores que 100.
	public static int leastCommonMultiple(int number1, int number2, int number3) {
		int max = 0;
		max = number1;

		while (number1 > 0 && number1 < 100 && number2 > 0 && number2 < 100 && number3 > 0 && number3 < 100) {
			if (number2 > max) {
				max = number2;
			}
			if (number3 > max) {
				max = number3; // Condicional para saber cual de los 3 numeros es el mas alto.
			}
			int lcm = max; // Se iguala el numero mayor al lcm
			while ((lcm % number1 != 0) || (lcm % number2 != 0) || (lcm % number3 != 0)) { // Mientras que el resto de
																							// alguno de los 3 numeros
																							// sea distinto de 0, el lcm
																							// aumenta
				lcm++;
			}
			return lcm; // Se retorna el lcm
		}
		return -1;
	}

	public static double leastCommonMultiple(double number1, double number2, double number3) {
		double max = 0;
		max = number1;

		while (number1 > 0 && number1 < 100 && number2 > 0 && number2 < 100 && number3 > 0 && number3 < 100) {
			if (number2 > max) {
				max = number2;
			}
			if (number3 > max) {
				max = number3; // Condicional para saber cual de los 3 numeros es el mas alto.
			}
			double lcm = max; // Se iguala el numero mayor al lcm
			while ((lcm % number1 != 0) || (lcm % number2 != 0) || (lcm % number3 != 0)) { // Mientras que el resto de
																							// alguno de los 3 numeros
																							// sea distinto de 0, el lcm
																							// aumenta
				lcm++;
			}
			return lcm; // Se retorna el lcm
		}
		return -1;
	}

// -------------------------------------------------------------------------------------------------------------------------------
	// Metodo 3 - Bloque 1 -- Metodo para calcular La resistencia equivalente con
	// los 2 valores necesarios.
	public static float equivalentResistance(float number1, float number2) {
		float rEQ = (number1 * number2) / (number1 + number2); // Si no hay firma , se realiza esta explicacion
		return rEQ;
	}

	public static float equivalentResistance(float number1, float number2, int firm) {
		float rEQ = 0;
		if (firm == 1) {
			rEQ = ((number1 * number2) / (number1 + number2)) * (int) Math.pow(10, 6); // Si la firma es 1, se realiza
																						// esta explicacion
		}

		if (firm == 2) {
			rEQ = ((number1 * number2) / (number1 + number2)) / (int) Math.pow(10, 3); // Si la firma es 2, se realiza
																						// esta explicacion
		}
		return rEQ;
	}

// -------------------------------------------------------------------------------------------------------------------------------
	// Metodo 4 - Bloque 1 -- Metodo para intercambiar los valores 0 de la matriz
	// por el valor medio de los valores positivos.
	public static int[] changeNegatives(int array[]) {
		int array2[] = Arrays.copyOf(array, array.length); // Array auxiliar
		int numericalMean = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				numericalMean += array[i]; // Se cuenta el total de los valores enteros
			}
		}

		numericalMean = numericalMean / array.length; // se calcula la media

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array2[i] = numericalMean; // Se intercambian los valores que sean menores a 0
			}
		}
		return array2;
	}

	public static double[] changeNegatives(double array[]) { // Se sobrecarga el metodo
		double array2[] = Arrays.copyOf(array, array.length);
		double numericalMean = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				numericalMean += array[i];
			}
		}

		numericalMean = numericalMean / array.length;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array2[i] = numericalMean;
			}
		}
		return array2;
	}

// -------------------------------------------------------------------------------------------------------------------------------
	// Metodo 5 - Bloque 1 -- Metodo para calcular la media de una matriz tanto
	// entera como de floats.
	public static float arrayMean(float array[]) { // Para Floats
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("#.##", dfs);

		float total = 0, arrayMean = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		arrayMean = total / array.length;
		return Float.parseFloat(df.format(arrayMean));
	}

	public static int arrayMean(int array[]) { //Sobrecargada para Ints
		int total = 0, arrayMean = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		arrayMean = total / array.length;
		return (int) arrayMean;
	}

// -------------------------------------------------------------------------------------------------------------------------------
	// Metodo 6 - Bloque 1 -- Metodo que devuelve una matriz de int con los valores
	// de la original redondeados al entero más alto o mas bajo.
	public static int[] floatRounder(float array[], boolean option) {
		int array2[] = new int[array.length];
		if (option == true) {
			for (int i = 0; i < array2.length; i++) {
				array2[i] = (int) Math.floor(array[i]);
			}
		}
		if (option == false) {
			for (int i = 0; i < array2.length; i++) {
				array2[i] = (int) Math.ceil(array[i]);
			}
		}
		return array2;
	}

// -------------------------------------------------------------------------------------------------------------------------------

	// Metodo 7 - Bloque 1 -- Metodo para modificar una matriz 2D.
	public static int[][] arrayModifier(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] != 0) { //Si el valor es distinto de 0, se aplica la formula
					array[i][j] = (int) Math.pow((i * j), 3) / 2 * (i + j);
				}
			}
		}
		return array;
	}

// -------------------------------------------------------------------------------------------------------------------------------
	// Metodo 8 - Bloque 1 -- Metodo para calcular la media de las filas de una
	// matriz 2D.
	public static String calculateRowsMean(int array[][]) {
		int array2[] = new int[array.length];
		String array3[] = new String[array.length + 1]; // Se deja el ultimo espacio dispomible para indicar la fila con la media mas alta

		for (int i = 0; i < array.length; i++) {
			int average = 0;
			for (int j = 0; j < array[i].length; j++) {
				average += array[i][j];
				array2[i] = average;
				array3[i] = "- La media de la fila " + i + " es: " + array2[i] + "\n";
			}
		}
		int max = array2[0];
		for (int i = 0; i < array2.length; i++) {
			if (max < array2[i]) {
				max = i;
			}
			array3[array3.length - 1] = "- La fila con la media mas alta es: " + max;
		}
		return Arrays.toString(array3);
	}

// -------------------------------------------------------------------------------------------------------------------------------
	// Metodo 9 - Bloque 1 -- Metodo para saber si una matriz 2D contiene filas
	// repetidas.
	public static boolean checkRepeatedRows(float array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] != null && array[i].equals(array[j])) { //Comprueba fila a fila, y el indice J es igual a i+1 para que la fila no se compare con si misma
					return true;
				}
			}
		}
		return false;
	}
}
