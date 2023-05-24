package privateExercises;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MTDCadenas {
	// Metodo 1 - Bloque 2 -- Calcular letra del DNI
	public static char dniCalculator(String dni) {
		char[] letters = { 'T', 'R', 'W', 'A','G','M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		char letter = 0;
		if (dni.length() == 8 && dni.matches("[0-9]+")) {
			int x = Integer.parseInt(dni) % 23;
			letter = letters[x];
		} else {
			letter = ' ';
		}
		return letter;
	}

	// -------------------------------------------------------------------------------------------------------------------------------
	// Metodo 2 - Bloque 2 -- Adivinar palabra.
	public static String chooseWord(String word) {
		String words[] = { "Ver", "Veces", "Embargo", "Partido", "Personas", "Grupo", "Cuenta", "Nueva", "Programa",
				"Internacional", "Empresa", "Puesto", "Total", "Dios", "Fuerza", "Anna", "Puerta", "Zona", "Calle",
				"Vista", "Campo", "Estados", "Nadie", "Obra", "Jorge", "Vidovic", "Horas", "Ley", "Guerra",
				"Desarrollo", "Proceso", "Realidad", "Servicio", "Sentido", "Cambio", "Tiempo", "Ahora", "Fondo",
				"Sociedad", "Centro", "Padre", "Madre", "Obra", "Gobierno", "Siempre", "Menos", "Año", "Caso", "Nada",
				"Hacer", "Problema", "Mayor", "Derecho", "Personal", "Julio", "Ayer", "Hoy", "España", "Hombre",
				"Mujer", "Trabajo", "Cosa", "Primero", "Posibilidad", "Seguridad", "Resultado", "Pasado", "Medio",
				"Calidad", "Gabriela", "Convergente", "Divergente", "Comida" };

		word = words[(int) (Math.random() * words.length)];
		return word;
	}

	public static String guessWord(String phrase, char letter) {

		int x = 0;
		for (int i = 0; i < phrase.length(); i++) {
			x++; // Bucle para contar la longitud de la palabra, es decir cuantas letras tiene.
		}

		char phrase2[] = new char[x]; // Array donde se almacenara letra por letra la palabra escogida.
		for (int i = 0; i < phrase2.length; i++) {
			phrase2[i] = phrase.toUpperCase().charAt(i);
		}

		char phrase3[] = new char[x];
		for (int i = 0; i < phrase3.length; i++) {
			phrase3[i] = '_';
		}

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase2[i] == letter) {
				phrase3[i] = letter;
			}
		}
		return Arrays.toString(phrase3);

	}

	// -------------------------------------------------------------------------------------------------------------------------------
	// Metodo 3 - Bloque 2 -- Adivinar palabra modificado.
	public static String guessWord(String phrase, char... letter) {

		int x = 0;
		for (int i = 0; i < phrase.length(); i++) {
			x++; // Bucle para contar la longitud de la palabra, es decir cuantas letras tiene.
		}

		char phrase2[] = new char[x]; // Array donde se almacenara letra por letra la palabra escogida.
		for (int i = 0; i < phrase2.length; i++) {
			phrase2[i] = phrase.toUpperCase().charAt(i);
		}

		char phrase3[] = new char[x];
		for (int i = 0; i < phrase3.length; i++) {
			phrase3[i] = '_';
		}

		for (int i = 0; i < phrase.length(); i++) {
			for (int j = 0; j < letter.length; j++) {
				if (phrase2[i] == letter[j]) {
					phrase3[i] = letter[j];
				}
			}
		}
		return Arrays.toString(phrase3);
	}

	// -------------------------------------------------------------------------------------------------------------------------------
	// Metodo 4 - Bloque 2 -- Analizar String introducido.
	public static boolean stringAnalyzer(String string) {
		Pattern pat = Pattern.compile("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8}$"); //Expresion regular para gestionar que el string cumpla las condiciones propuestas
		Matcher mat = pat.matcher(string);

		if (mat.matches()) {
			return true;
		}
		return false;
	}

	// -------------------------------------------------------------------------------------------------------------------------------
	// Metodo 5 - Bloque 2 -- Codificar un String introducido.
	public static String stringEncryptor(String string) {
		String parts[] = string.split(" ");
		
		string = string.replace('i', '1');
		string = string.replace('I', '1');
		string = string.replace('o', '0');
		string = string.replace('O', '0');
		string = string.replace('a', '*');
		string = string.replace('A', '*');
		
		String parts2[] = string.split(" ");
		
		for (int i = 0; i < parts.length; i++) {
			parts[i] = Integer.toBinaryString(parts2[i].length()) + parts2[i] + parts[i].hashCode();
		}
		return Arrays.toString(parts);
	}
}