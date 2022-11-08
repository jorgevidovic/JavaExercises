package enhancedExercises;

import javax.swing.JOptionPane;

public class emailManager {
	public static void main(String[] args) {
		try {
			String emails[] = new String[100]; // Array capaz de almacenar hasta 100 correos.
			String email = null, domain = null;

			int x = 0;
			emails[0] = "jorge@gmail.com";
			emails[1] = "ramon@gmail.com";
			emails[2] = "pepe@outlook.com";
			emails[3] = "juan@yahoo.es";
			emails[4] = "daya@yahoo.es";

			// Se asignan correos de ejemplo a los primeros 5 valores.

			String option = null; // Variables para almacenar el valor introducido por el usuario.
			char o = 0;

			// Interfaz para el usuario.
			do {
				option = (JOptionPane.showInputDialog(null, "Ejercicio 2 - Programa para gestionar correos"
						+ "\n-------------------------------------------------------------------------------------------------"
						+ "\na) Guardar correo.\n" + "\nb) Buscar correo.\n" + "\nc) Contar correos.\n"
						+ "\nd) Mostrar el porcentaje de correos de cada uno de los 3 dominios: " + "\n   1) Gmail."
						+ "\n   2) Hotmail." + "\n   3) Outlook." + "\n   4) Yahoo.\n" + "\ne) Salir."));
				o = option.toLowerCase().charAt(0);
				switch (o) {

				case 'a':
					email = JOptionPane.showInputDialog(null, "Introduce un correo:");
					if (Methods.isValidMail(email)) {
						// Bucle para buscar el primer espacio en blanco que se encuentre y
						// posteriormente almacenar el siguiente email.
						for (int i = 0; i < emails.length; i++) {
							if (emails[i] == null) {
								emails[i] = email;
								break;
							}
						}
					}
					break;
				// -- Fin del caso a --

				case 'b':
					email = JOptionPane.showInputDialog(null, "Introduce un correo:");
					// Bucle que valido si el correo es valido, y si se cunple la condición busca su
					// posición en el array original
					if (Methods.isValidMail(email)) {
						x = -1;
						for (int i = 0; i < emails.length; i++) {
							if (email.equals(emails[i])) {
								x = i;
							}
						}
						if (x != -1) { // Si encuentra la posicion la imprime por pantalla
							JOptionPane.showMessageDialog(null, "El correo introducido es: " + "[" + email + "]"
									+ "\nSu posición es: " + "[" + x + "]");
						} else { // Sino, se le notifica al usuario
							JOptionPane.showMessageDialog(null,
									"El correo introducido no fue encontrado. Intentalo de nuevo.");
							break;
						}
					}
					break;
				// -- Fin del caso b --

				case 'c':
					domain = JOptionPane.showInputDialog(null, "Introduce un dominio:");
					domain.toLowerCase();
					x = 0;
					// Bucle para contar los emails que contengan el dominio indicado.
					for (int i = 0; i < emails.length; i++) {
						if (emails[i] != null) {
							if (emails[i].contains(domain)) {
								x++;
							}
						}
					}
					JOptionPane.showMessageDialog(null, "Dominio introducido: " + "[ " + domain + " ]"
							+ "\nCantidad de correos que coinciden: " + "[" + x + "]");
					break;
				// -- Fin del caso c --

				case 'd':
					int z = 0, a = 0, b = 0, c = 0, d = 0;

					for (int i = 0; i < emails.length; i++) {
						if (emails[i] != null) {
							z++; // Variale para contar la cantidad de correos

							if (emails[i].contains("gmail")) { // Condicionales para captar casos especificos de dominio
																// indicados:
								a++;
							}

							if (emails[i].contains("hotmail")) {
								b++;
							}

							if (emails[i].contains("outlook")) {
								c++;
							}

							if (emails[i].contains("yahoo")) {
								d++;
							}

						}

					}

					float aPercentage = (a * 100 / z);
					float bPercentage = (b * 100 / z);
					float cPercentage = (c * 100 / z);
					float dPercentage = (d * 100 / z);
					float ePercentage = ((z - (a + b + c + d)) * 100) / z; // Aqui se calculan los dominios que sean
																			// validos, pero que sean distintos de los 4
																			// dominios principales

					JOptionPane.showMessageDialog(null,
							"Dominio: [ Gmail ]" + "\nPorcentaje: " + aPercentage + "%" + "\nDominio: [ Hotmail ]"
									+ "\nPorcentaje: " + bPercentage + "%" + "\nDominio: [ Outlook ]" + "\nPorcentaje: "
									+ cPercentage + "%" + "\nDominio: [ Yahoo ]" + "\nPorcentaje: " + dPercentage + "%"
									+ "\nDominio: [ Otro ]" + "\nPorcentaje: " + ePercentage + "%");

					break;
				// -- Fin del caso d --
				case 'e':
					JOptionPane.showMessageDialog(null, "Has seleccionado la opción 'Salir.'" + "\n¡Hasta pronto!");
					break;
				// -- Fin del caso e--

				default:
					JOptionPane.showMessageDialog(null, "El caracter introducido no es valido, intentalo de nuevo.");
					break;
				}// Fin del switch.
			} while (o != 'e');
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo ha ido mal, intentalo de nuevo.");
		}
	}
}
