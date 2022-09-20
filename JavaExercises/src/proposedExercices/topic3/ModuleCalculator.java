package proposedExercices.topic3;
import javax.swing.*;
import java.text.DecimalFormat;
public class ModuleCalculator {
	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("#.##");
		JOptionPane.showMessageDialog(null, "Programa para calcular el módulo de un vector.");
		
		float a;
		float b;
		float c;
		String m;
		
		a = Float.parseFloat(JOptionPane.showInputDialog("Introduce el 1er valor:"));
		a = (float)Math.pow(a, 2);
		
		b = Float.parseFloat(JOptionPane.showInputDialog("Introduce el 2do valor:"));
		b = (float)Math.pow(b, 2);
		
		c = Float.parseFloat(JOptionPane.showInputDialog("Introduce el 3er valor:"));
		c = (float) Math.pow(c, 2);
		
		m = f.format((float) Math.sqrt(a+b+c));
		
		JOptionPane.showMessageDialog(null, "El valor del módulo calculado es: " + m);
	}
}
