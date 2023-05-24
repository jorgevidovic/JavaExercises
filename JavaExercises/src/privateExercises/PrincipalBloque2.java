package privateExercises;

import javax.swing.JOptionPane;

public class PrincipalBloque2 {
	public static void main(String[] args) {
		try {
			String option = null, number = null, word = null;
			int confirmation = 0;
			String buttons[] = { "2", "3" };
			char o = 0, letter = 0, letter2 = 0, letter3 = 0;
			do {
				option = JOptionPane.showInputDialog(null, "Tarea 3 - Bloque 2  |  Escoje una opción\n"
						+ "--------------------------------------------------------" + "\nA) Asignar la letra a un DNI."
						+ "\nB) Introducir una letra y ver cuantas conforman la palabra aleatoria."
						+ "\nC) Introducir varias letras y ver cuantas conforman la palabra aleatoria."
						+ "\nD) Introducir un String y comprobar si cumple las siguientes caracteristicas:"
						+ "\n    -Contiene al menos 1 letra mayuscula." + "\n    -Contiene al menos 1 dígito."
						+ "\n    -Contiene al menos 1 letra minuscula." + "\n    -Contiene mínimo 8 caracteres."
						+ "\nE) Introducir un String y ver su versión cifrada." + "\nF) Salir.");
				o = option.toUpperCase().charAt(0);
				switch (o) {

				case 'A':
					number = JOptionPane.showInputDialog(null, "Introduce los 8 digitos de un DNI:");
					JOptionPane.showMessageDialog(null,
							"Digitos introducidos: " + number + "\nLetra generada: " + MTDCadenas.dniCalculator(number)
									+ "\nDNI generado: " + number + MTDCadenas.dniCalculator(number));
					break;

				case 'B':
					word = MTDCadenas.chooseWord(word);
					letter = JOptionPane.showInputDialog("Se ha generado una palabra al azar\nIntroduce una letra:")
							.toUpperCase().charAt(0);
					JOptionPane.showMessageDialog(null,
							"Palabra generada: " + word + "\n" + MTDCadenas.guessWord(word, letter));
					break;

				case 'C':
					word = MTDCadenas.chooseWord(word);
					confirmation = JOptionPane.showOptionDialog(null, "¿Cuantas letras quieres introducir?", "Letras",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buttons,
							buttons[0]);

					if (confirmation == 0) {
						letter = JOptionPane
								.showInputDialog("Se ha generado una palabra al azar\nIntroduce la 1era letra:")
								.toUpperCase().charAt(0);
						letter2 = JOptionPane
								.showInputDialog("Se ha generado una palabra al azar\nIntroduce la 2da letra:")
								.toUpperCase().charAt(0);
						JOptionPane.showMessageDialog(null,
								"Palabra generada: " + word + "\n" + MTDCadenas.guessWord(word, letter, letter2));
					}

					if (confirmation == 1) {
						letter = JOptionPane
								.showInputDialog("Se ha generado una palabra al azar\nIntroduce la 1era letra:")
								.toUpperCase().charAt(0);
						letter2 = JOptionPane
								.showInputDialog("Se ha generado una palabra al azar\nIntroduce la 2da letra:")
								.toUpperCase().charAt(0);
						letter3 = JOptionPane
								.showInputDialog("Se ha generado una palabra al azar\nIntroduce la 3era letra:")
								.toUpperCase().charAt(0);
						JOptionPane.showMessageDialog(null, "Palabra generada: " + word + "\n"
								+ MTDCadenas.guessWord(word, letter, letter2, letter3));
					}
					break;

				case 'D':
					word = JOptionPane.showInputDialog("Introduce un String:");
					if (MTDCadenas.stringAnalyzer(word)) {
						JOptionPane.showMessageDialog(null,
								"String introducido: " + word + "\nEl String introducido es válido.");
					} else {
						JOptionPane.showMessageDialog(null,
								"String introducido: " + word + "\nEl String introducido no es válido.");
					}
					break;

				case 'E':
					word = JOptionPane.showInputDialog("Introduce un String:");
					JOptionPane.showMessageDialog(null,
							"String introducido: " + word + "\nString codificado: " + MTDCadenas.stringEncryptor(word));
					break;
				case 'F':
					JOptionPane.showMessageDialog(null, "Has introducido la opción Salir.\nHasta pronto.");
					break;
				default:
					JOptionPane.showMessageDialog(null, "La opción introducida no es válida.\nIntentalo de nuevo.");
					break;
				}
			} while (o != 'F');
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo ha ido mal, intentalo de nuevo.");
		}
	}
}
