package privateExercises;

import javax.swing.JOptionPane;

public class Methods {
	// ---------------------- Función para calcular sin un numero es primo.
	// ---------------------------------------------

	static boolean isPrime(int n) {
		// Revisa si el numero introducido es multiplo de 2 y de ser el caso, devuelve
		// false.
		if (n % 2 == 0)
			return false;
		// Si no es multiplo de 2, verifica dividiendo por todos los numeros impares de
		// n hasta llegar a su raiz cuadrada.
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true; // Si no se cumplen ninguna de las condiciones anteriores, se entiende que el
						// numero interpretado es primo.
	}

	// ---------------------- Función para validar un email.
	// ------------------------------------------------------------

	static boolean isValidMail(String email) {
		if (email.matches("[-\\w\\.]+@\\w+\\.\\w+")) {
			return true;
		}
		JOptionPane.showMessageDialog(null, "El correo introducido no es valido. Intentalo de nuevo.");
		return false;
	}
	// Se verifica si el array introducido inicia con caracteres alfanumericos antes
	// y despues del '@' tanto como del '.'
	// Si no se cumple la condicion se retorna false

	// ------------------------ Función para escoger una palabra aleatoria.
	// --------------------------------------------------------------

	static String chooseWord(String word) {
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

}
