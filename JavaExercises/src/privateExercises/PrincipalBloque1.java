package privateExercises;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class PrincipalBloque1 {
	public static void main(String[] args) {
		try {
			String option = null;
			int testArray[] = { 6, 8, 7, 6, 5, -3, 7, 0, 4, 7 }; // 50/10 = 5 --> Media
			double testArray2[] = { 7.5, 9.9, 10.1, 7.8, 1.4, 6.6 };
			float testArray3[] = { 7.5f, 9.9f, 10.1f, 7.8f, 1.4f, 6.6f };

			int testArray4[][] = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 9, 8, 7, 6, 5, 4, 3, 2, 1 } };

			float testArray5[][] = { { 1.2f, 2.4f, 3.5f, 4.6f, 5.2f, 6.3f, 7.5f, 8.2f },
					{ 9.5f, 8.3f, 7.2f, 6.9f, 5.2f, 4.3f, 3.3f, 2.8f, 1.9f } };

			String buttons[] = { "Si", "No" };
			String buttons2[] = { "Float", "Int" };
			String buttons3[] = { "True", "False" };

			char o = 0;
			int number1 = 0, number2 = 0, number3 = 0, confirmation = 0;
			float number4 = 0, number5 = 0;
			do {
				option = JOptionPane.showInputDialog(null, "Tarea 3 - Bloque 1  |  Escoje una opción\n"
						+ "--------------------------------------------------------"
						+ "--------------------------------------------------------"
						+ "--------------------------------------------------------"
						+ "\nA) Saber si un número entero es perfecto."
						+ "\nB) Calcular el Minimo Común Multiplo de 3 numeros positivos inferiores a 100."
						+ "\nC) Calcular la resistencia equivalente [Req] de 2 resistencias."
						+ "\n      - Si el 3er parametro es igual a 1, el resultado se expresará en microOhmnios [µΩ]."
						+ "\n      - Si el 3er parametro es igual a 2, el resultado se expresará en Kiloohmnios [kΩ]."
						+ "\n      - Si el 3er parametro es o nulo, el resultado se expresará en Ohmnios [Ω]."
						+ "\nD) Modificar una matriz eliminando los valores negativos, cambiandolos por el valor medio de los valores positivos."
						+ "\nE) Calcular la media de una matriz" + "\n      - Funciona con flotantes."
						+ "\n      - Funciona con enteros."
						+ "\nF) Redondear una matriz de flotantes hacia abajo o hacia arriba."
						+ "\n      - Si el 3er parametro es igual a 'true' se redondea hacia abajo."
						+ "\n      - Si el 3er parametro es igual a 'false' se redondea hacia abajo."
						+ "\nG) Modificar una los valores de una matriz 2D en base a la siguiente formula:"
						+ "\n      - Valor = (i x j)^3 / 2 x (i + j)." + "\n      - i = Indice de fila."
						+ "\n      - j = Indice de columnna."
						+ "\nH) Calcular la media de cada fila de una matriz 2D de enteros e indique la fila con la media mas alta."
						+ "\n I)  Saber si una matriz 2D contiene filas repetidas." + "\nJ) Salir.");
				o = option.toUpperCase().charAt(0);
				switch (o) {
				case 'A':
					number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número:"));
					if (number1 == 0) {
						JOptionPane.showMessageDialog(null,
								"El número " + number1 + " no es válido.\nIntentalo de nuevo.");
						break;
					}

					if (MTDNumeros.isPerfectNumber(number1)) {
						JOptionPane.showMessageDialog(null, "El número " + number1 + " es perfecto.");
					} else {
						JOptionPane.showMessageDialog(null, "El número " + number1 + " no es perfecto.");
					}
					break;

				case 'B':
					number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el 1er número:"));
					if ((number1 < 1 || number1 > 100)) {
						JOptionPane.showMessageDialog(null,
								"El 1er valor introducido no es válido.\nIntentalo de nuevo.");
						break;
					}
					number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el 2do número:"));
					if ((number2 < 1 || number2 > 100)) {
						JOptionPane.showMessageDialog(null,
								"El 2do valor introducido no es válido.\nIntentalo de nuevo.");
						break;
					}
					number3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el 3er número:"));
					if ((number3 < 1 || number3 > 100)) {
						JOptionPane.showMessageDialog(null,
								"El 3er valor introducido no es válido.\nIntentalo de nuevo.");
						break;
					}
					int lcm = MTDNumeros.leastCommonMultiple(number1, number2, number3);
					JOptionPane.showMessageDialog(null, "El 'mínimo común multiplo' de los numeros " + number1 + ", "
							+ number2 + ", " + number3 + " es igual a " + lcm + ".");
					break;

				case 'C':
					number4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la 1era resistencia:"));
					number5 = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la 2da resistencia:"));
					confirmation = JOptionPane.showOptionDialog(null,
							"¿Quieres introducir una firma?" + "\n  1) El resultado se expresará en microOhmnios [µΩ]."
									+ "\n  2) El resultado se expresará en Kiloohmnios [kΩ].",
							"Firma", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buttons,
							buttons[0]);
					if (confirmation == 0) {
						number3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la firma:"));

						if (number3 == 1) {
							JOptionPane.showMessageDialog(null, "La resistencia equivalente [Req] es: "
									+ MTDNumeros.equivalentResistance(number4, number5, number3) + " µΩ.");
						}

						if (number3 == 2) {
							JOptionPane.showMessageDialog(null, "La resistencia equivalente [Req] es: "
									+ MTDNumeros.equivalentResistance(number4, number5, number3) + " kΩ.");
						}
						if (number3 != 1 && number3 != 2) {
							JOptionPane.showMessageDialog(null,
									"La firma introducida no es válida.\nIntentalo de nuevo.");
							break;
						}
					}
					if (confirmation == 1) {
						JOptionPane.showMessageDialog(null, "La resistencia equivalente [Req] es: "
								+ MTDNumeros.equivalentResistance(number4, number5) + " Ω.");
					}
					break;

				case 'D':

					int x[] = MTDNumeros.changeNegatives(testArray);
					JOptionPane.showMessageDialog(null, "Array inicial:           " + Arrays.toString(testArray)
							+ "\nArray modificada:  " + Arrays.toString(x));
					break;

				case 'E':

					confirmation = JOptionPane.showOptionDialog(null, "Quieres probar:", "¿Int o Float?",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buttons2,
							buttons2[0]);

					if (confirmation == 0) {
						JOptionPane.showMessageDialog(null, "Array: " + Arrays.toString(testArray3)
								+ "\nMedia del Array: " + MTDNumeros.arrayMean(testArray3));

					}

					if (confirmation == 1) {
						JOptionPane.showMessageDialog(null, "Array: " + Arrays.toString(testArray)
								+ "\nMedia del Array: " + MTDNumeros.arrayMean(testArray3));
					}

					break;

				case 'F':
					confirmation = JOptionPane.showOptionDialog(null,
							"¿Quieres redondedar hacia abajo o hacia arriba?" + "\nTrue - Hacia abajo."
									+ "\nFalse - Hacia arriba.\n",
							"¿True o False?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
							buttons3, buttons3[0]);

					if (confirmation == 0) {
						JOptionPane.showMessageDialog(null, "Array original: " + Arrays.toString(testArray3)
								+ "\nArray redondeado: " + Arrays.toString(MTDNumeros.floatRounder(testArray3, true)));

					}
					if (confirmation == 1) {
						JOptionPane.showMessageDialog(null, "Array original: " + Arrays.toString(testArray3)
								+ "\nArray redondeado: " + Arrays.toString(MTDNumeros.floatRounder(testArray3, false)));

					}
					break;

				case 'G':
					JOptionPane.showMessageDialog(null, "Array original: " + Arrays.deepToString(testArray4)
							+ "\nArray modificado: " + Arrays.deepToString(MTDNumeros.arrayModifier(testArray4)));

					break;

				case 'H':
					JOptionPane.showMessageDialog(null, MTDNumeros.calculateRowsMean(testArray4));
					break;

				case 'I':
					JOptionPane.showMessageDialog(null, "Array original: " + Arrays.deepToString(testArray5)
							+ "\n ¿El Array contiene filas repetidas?: " + MTDNumeros.checkRepeatedRows(testArray5));
					break;

				case 'J':
					JOptionPane.showMessageDialog(null, "Has introducido la opción Salir.\nHasta pronto.");
					break;

				default:
					JOptionPane.showMessageDialog(null, "La opción introducida no es válida.\nIntentalo de nuevo.");
					break;
				}
			} while (o != 'J');
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo ha ido mal, intentalo de nuevo.");
		}
	}
}