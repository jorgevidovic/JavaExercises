package proposedExercices.topic3;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MaxAndMinCalculator_2 {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("#.##");
		JOptionPane.showMessageDialog(null, "Programa para calcular el máximo y mínimo de 2 números introducidos por teclado.");
		
		float a;
		float b;
		
		a = Float.parseFloat(JOptionPane.showInputDialog("Introduce el 1er valor:"));
		b = Float.parseFloat(JOptionPane.showInputDialog("Introduce el 2do valor:"));
		
		float m = Math.min(a, b);
		float M = Math.max(a, b);
		
		JOptionPane.showMessageDialog(null, "El valor mínimo es: " +m +"\nEl valor máximo es: "+M);

	}

}
