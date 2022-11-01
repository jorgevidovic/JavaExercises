package privateExercises;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Hangman {
	public static void main(String[] args) {
		try {
			String word = null, option = null;
			char o = 0;
			do { // Bucle con interfaz para el usurario
				option = JOptionPane.showInputDialog(null,
						"Ejercicio extra - Juego del ahorcado" + "\n----------------------------------------------------"
								+ "\n(a) Jugar.\n" + "\n(" + "" + "x) Salir.\n");
				o = option.toLowerCase().charAt(0); //Almacena la opcion introducida por el usuario
				switch (o) {
	
				case 'a': // Comienza el juego!
					word = Methods.chooseWord(word); //Se escoje una plabra aleatoria del metodo creado en la clase "Methods".
					int x = 0;
					System.out.println("\n -- Zona con la palabra para facilitar el trabajo del corrector del ejercicio -- \n");
					System.out.println(word);//Se imprime la palabtra en el terminal para facilitar la correcion. ;)
					for (int i = 0; i < word.length(); i++) {
						x++; //Bucle para contar la longitud de la palabra, es decir cuantas letras tiene.
					}
	
					char word_2[] = new char[x]; //Array donde se almacenara letra por letra la palabra escogida.
					for (int i = 0; i < word_2.length; i++) {
						word_2[i] = word.toUpperCase().charAt(i);
					}
					System.out.println(Arrays.toString(word_2)); //Se imprimen las letras en el terminal para facilitar la correcion corregir. ;)
	
					char word_3[] = new char[x]; //Array donde almacenara los espacios vacios equivalentes a cada letra de la palabra.
					for (int i = 0; i < word_3.length; i++) {
						word_3[i] = '_';
					}
	
					for (int i = 6; i > 0; i--) { //Bucle que se ejecutara hasta que no se acaben las vidas, o hasta que se rompa con un condicional que esta mas abajo.
						char attempts = JOptionPane.showInputDialog(null,
								Arrays.toString(word_3) 
								+ "\nIntroduce una letra:" 
								+ "\nTe quedan " + i + " vidas.\n")
								.toUpperCase().charAt(0);
						
						for (int j = 0; j < word.length(); j++) { // Si la letra introducida por el usuario pertenece al Array 2 con las letras correspondientes a 
							if (word_2[j] == attempts) {		 // la palabra escogida se sobre escribe el Array 3
								word_3[j] = attempts;
							}
						}
						
						for (int j = 0; j < word.length(); j++) { // Si el usuario acierta, se mantiene la misma cantidad de vidas
							if (word_2[j] == attempts) {
								i++;
								break;
							}
						}
						
						if(Arrays.equals(word_2, word_3)) { // Se comprueba en cada intento si el Array 2 y el Array 3 son iguales, y de cumplirse la condicion
							JOptionPane.showMessageDialog(null, //Se rompe el bucle, y le da la victoria al usuario.
									 	"Palabra: "+word
									+ "\nHas ganado la partida!" + "\n¡Hasta pronto!");
							break;
						}
					}
					if(Arrays.equals(word_2, word_3)==false) { //Al acabarse todas las vidas y salir del bucle
						JOptionPane.showMessageDialog(null, //comprueba que ambos Arrays son distintos, y anuncia que el usuario perdio.
							 	"Palabra: "+word
							+ "\nHas perdido." + "\n¡Hasta pronto!");
					}
					break;
	
				case 'x':
					JOptionPane.showMessageDialog(null, "Has seleccionado la opción 'Salir.'" + "\n¡Hasta pronto!"); //opcion para salir.
					break;
				// -- Fin del caso x --
	
				default:
					JOptionPane.showMessageDialog(null, "El caracter introducido no es valido, intentalo de nuevo."); //Mensaje si el usuario introduce una letra invalida en la interfaz
					break;
				} // Fin del switch
			} while (o != 'x');
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo ha ido mal, intentalo de nuevo.");
		}
	}
}
