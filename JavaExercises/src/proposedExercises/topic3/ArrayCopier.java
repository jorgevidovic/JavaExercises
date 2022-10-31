package proposedExercises.topic3;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArrayCopier {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Programa para ordenar matrices de 5 valores.");
		
		String x[]= new String [5];
		x[0] = JOptionPane.showInputDialog("Introduce el primer valor:");
		x[1] = JOptionPane.showInputDialog("Introduce el segundo valor:");
		x[2] = JOptionPane.showInputDialog("Introduce el tercer valor:");
		x[3] = JOptionPane.showInputDialog("Introduce el cuarto valor:");
		x[4] = JOptionPane.showInputDialog("Introduce el quinto valor:");
		
		String y[] = Arrays.copyOf(x, x.length);
		Arrays.sort(y);
		
		String w = Arrays.toString(x);
		String z = Arrays.toString(y);
		
		JOptionPane.showMessageDialog(null, "El Array introducido inicialmente es: "+w+"\nEl Array ordenado es: "+z);
		
		String i = JOptionPane.showInputDialog("Introduce un valor de la matriz para saber su posición:");
		int b = (Arrays.binarySearch(y,i)+1);
		
		JOptionPane.showMessageDialog(null, "La posición de "+i+" en el Array ordenado es: "+b);
	}
}
