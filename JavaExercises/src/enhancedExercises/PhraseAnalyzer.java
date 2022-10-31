package enhancedExercises;
import javax.swing.JOptionPane;
public class PhraseAnalyzer {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Ejercicio 3 - Programa para analizar una frase.");
		String phrase = JOptionPane.showInputDialog("Introduce tu frase: ");
		String words[] = phrase.split(" "); //Subdivide el String con la frase en subcadenas con cada palabra
		
		JOptionPane.showMessageDialog(null,
				  "Frase introducida: "+phrase //Imprime por pantalla la frase introducida
				  
				+ "\n- ¿Cuantas palabras tiene la frase?: "+words.length //Imprime la cantidad de palabras de la frase
				
				//Se eliminan los epsacios en blanco y se calculan todos los caracteres introducidos
				+ "\n- Número de caracteres sin contar espacios: "+phrase.replaceAll(" ","").length()
				
				//Se verifica si el primer valor introducido es un digito
				+ "\n- ¿El primer carcater es un digito?: "+Character.isDigit(phrase.charAt(0))
				
				//Busca la posición del primer espacio en blanco de la frase
				+ "\n- Posición del primer espacio: "+phrase.indexOf(" "));
		
		//Frase de pruebas: Sin locura no hay felicidad
	}
}
