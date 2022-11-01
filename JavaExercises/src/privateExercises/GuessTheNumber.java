package privateExercises;

import javax.swing.JOptionPane;

public class GuessTheNumber {
	public static void main(String[] args) {
		try {
			String option = null; // Variable para almacenar el valor introducido en la interfaz por el usuario.
			int option_2 = 0;
			int number;
			int points = 0;
			char o = 0;
			do {
				option = JOptionPane.showInputDialog(null,
						"Ejercicio 3 - !Juego de adivina el número!"
								+ "\n------------------------------------------------------------------------------"
								+ "\na) Nivel 1: Número generado entre (1 - 15) - 3 intentos.\n"
								+ "\nb) Nivel 2: Número generado entre (1 - 30) - 4 intentos.\n"
								+ "\nc) Nivel 3: Número generado entre (1 - 50) - 5 intentos.\n" + "\nx) Salir.\n"
								+ "\n-- Puntos acumulados: " + points);
				o = option.toLowerCase().charAt(0);
				switch (o) {

				case 'a':
					number = (int) (Math.random() * 15 + 1); // Se genera un número aleatorio entre 1 y 15.
					for (int i = 3; i > 0; i--) {
						option_2 = Integer.parseInt(JOptionPane.showInputDialog(null,
								"Intenta adivinar el número:" + "\nTe quedan " + i + " vidas."));
						if (option_2 == number) {
							JOptionPane.showMessageDialog(null, "Número introducido: " + option_2
									+ "\n¡Felicidades! has acertado el número correspondiente");
							if (i == 3) {
								points += 10;
							}
							if (i == 2) {
								points += 7;
							}
							if (i == 1) {
								points += 5;
							}
							break;
						} else if (option_2 < number) {
							JOptionPane.showMessageDialog(null,
									"Número introducido: " + option_2 + "\nNúmero incorrecto, intentalo de nuevo."
											+ "\nPista: El número introducido es menor al número correspondiente.");
						}

						else if (option_2 > number) {
							JOptionPane.showMessageDialog(null,
									"Número introducido: " + option_2 + "\nNúmero incorrecto, intentalo de nuevo.\n"
											+ "\nPista: El número introducido es mayor al número correspondiente.");
						}
					}
					break;
				// -- Fin del caso a --

				case 'b':
					number = (int) (Math.random() * 30 + 1); // Se genera un número aleatorio entre 1 y 30.
					for (int i = 4; i > 0; i--) {
						option_2 = Integer.parseInt(JOptionPane.showInputDialog(null,
								"Intenta adivinar el número:" + "\nTe quedan " + i + " vidas."));
						if (option_2 == number) {
							JOptionPane.showMessageDialog(null, "Número introducido: " + option_2
									+ "\n¡Felicidades! has acertado el número correspondiente");
							if (i == 4) {
								points += 30;
							}
							if (i == 3) {
								points += 20;
							}
							if (i == 2) {
								points += 10;
							}
							if (i == 1) {
								points += 7;
							}
							break;
						} else if (option_2 < number) {
							JOptionPane.showMessageDialog(null,
									"Número introducido: " + option_2 + "\nNúmero incorrecto, intentalo de nuevo."
											+ "\nPista: El número introducido es menor al número correspondiente.");
						} else if (option_2 > number) {
							JOptionPane.showMessageDialog(null,
									"Número introducido: " + option_2 + "\nNúmero incorrecto, intentalo de nuevo.\n"
											+ "\nPista: El número introducido es mayor al número correspondiente.");
						}
					}
					break;
				// -- Fin del caso b --

				case 'c':
					// number =7;
					number = (int) (Math.random() * 50 + 1); // Se genera un número aleatorio entre 1 y 50.
					for (int i = 5; i > 0; i--) {
						option_2 = Integer.parseInt(JOptionPane.showInputDialog(null,
								"Intenta adivinar el número:" + "\nTe quedan " + i + " vidas."));

						if (option_2 == number) {
							JOptionPane.showMessageDialog(null, "Número introducido: " + option_2
									+ "\n¡Felicidades! has acertado el número correspondiente");
							if (i == 5) {
								points += 50;
							}
							if (i == 4) {
								points += 35;
							}

							if (i == 3) {
								points += 20;
							}
							if (i == 2) {
								points += 15;
							}
							if (i == 1) {
								points += 7;
							}
							break;
						} else if (option_2 < number) {
							JOptionPane.showMessageDialog(null,
									"Número introducido: " + option_2 + "\nNúmero incorrecto, intentalo de nuevo."
											+ "\nPista: El número introducido es menor al número correspondiente.");
						}

						else if (option_2 > number) {
							JOptionPane.showMessageDialog(null,
									"Número introducido: " + option_2 + "\nNúmero incorrecto, intentalo de nuevo.\n"
											+ "\nPista: El número introducido es mayor al número correspondiente.");
						}
					}
					break;// -- Fin del caso c --

				case 'e':
					JOptionPane.showMessageDialog(null, "Has seleccionado la opción 'Salir.'" + "\n¡Hasta pronto!");
					break;
				// -- Fin del caso e --
				default:
					JOptionPane.showMessageDialog(null, "El caracter introducido no es valido, intentalo de nuevo.");
					break;
				} // Fin del switch
			} while (o != 'x');
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo ha ido mal, intentalo de nuevo.");
		}
	}
}
