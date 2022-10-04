package proposedExercises.topic3;
import javax.swing.JOptionPane;

public class EmailTester {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Programa para identificar el dominio de un correo electronico introducido.");
		
		String email = JOptionPane.showInputDialog("Introduce el email:");
		int a = email.indexOf('@')+1;
		String c = email.substring(a);
		
		JOptionPane.showMessageDialog(null, "El dominio del correo introducido es: "+c);
	}
}
