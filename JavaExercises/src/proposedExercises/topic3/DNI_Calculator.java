package proposedExercises.topic3;
import javax.swing.*;
public class DNI_Calculator {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Programa para calcular la letra del DNI en base al resto de sus números.");
		
		char[] letters = {'T','R','W','A','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		String dni = JOptionPane.showInputDialog("Introduce los 8 digitos de tú DNI sin la letra:");
		int l = dni.length();
		
		//Conditionals
		if((l==8)) {
			int x = Integer.parseInt(dni)%23;
			char letter = letters[x];
			JOptionPane.showMessageDialog(null, "Tu DNI junto con la letra calculada es: "+dni+letter);
		} 
		else {
			JOptionPane.showMessageDialog(null, "DNI incorrecto. Intentalo nuevamente");
		}	
	}
}
