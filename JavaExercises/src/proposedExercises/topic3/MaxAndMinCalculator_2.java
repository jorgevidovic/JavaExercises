package proposedExercises.topic3;
import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class MaxAndMinCalculator_2 {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		JOptionPane.showMessageDialog(null, "Programa para calcular el máximo y mínimo de 3 números introducidos por teclado.");
		
		float d[] = new float[3];
		
		d[0] = Float.parseFloat(JOptionPane.showInputDialog("Introduce el 1er valor:"));
		d[1] = Float.parseFloat(JOptionPane.showInputDialog("Introduce el 2do valor:"));
		d[2] = Float.parseFloat(JOptionPane.showInputDialog("Introduce el 3er valor:"));
		
		Arrays.sort(d);
		float m = d[0];
		float M = d[2];
		
		JOptionPane.showMessageDialog(null, "El valor mínimo es: " +m+"\nEl valor máximo es: "+M);

	}

}
