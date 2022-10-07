package proposedExercises.topic4;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class LeastValueCalculator {
	
	public static int getSmallest(int[] numbers, int total){  
		Arrays.sort(numbers);  
		return numbers[0];  
		}  
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Programa para calcular el mínimo de 4 números introducidos.");
		
		int numbers[] = new int[4];
		
		 numbers[0] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer valor: "));
		 numbers[1] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo valor: "));
		 numbers[2] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercero valor: "));
		 numbers[3] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el cuarto valor: "));
		 
		 JOptionPane.showMessageDialog(null, "Valores introducidos: "+Arrays.toString(numbers)
		 								  +"\nValor menor introducido: "+getSmallest(numbers,4));
	}
}
