package proposedExercises.topic4;

import javax.swing.JOptionPane;

public class PrimeNumberCalculator {
	public static void main(String[] args) {
		try {
		JOptionPane.showMessageDialog(null, "Programa para calcular si un número es primo.");
		float x = Float.parseFloat(JOptionPane.showInputDialog("Introduce un número: "));

		
			if (x%2==0) {
				JOptionPane.showMessageDialog(null, "El número introducido es: "+x
												 +"\nEl número introducido es par.");
			} else {
			JOptionPane.showMessageDialog(null, "El número introducido es: "+x
					                         +"\nEl número introducido es impar.");}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "El caracter introducido no es valido, intentalo de nuevo.");}
	}
}
