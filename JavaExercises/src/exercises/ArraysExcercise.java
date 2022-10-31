package exercises;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArraysExcercise {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Ejercicio 1 - Programa para trabajar con valores 10 enteros.");
		
		int x[] = new int [10];       //Variable donde se almacenará la matriz original.
		int y[] = new int [x.length]; //Variable donde se almacenará la copia de la matriz.
		
		x[0] = (int)((Math.random()*10)+1); //Se genera un número aleatorio entre 1 y 10.
		x[1] = x[0]+ 20; //Se suma 20 al valor generado en x[0].
		x[2] = (int) Math.sqrt(Math.pow(x[0], 3) + Math.pow(x[1], 2)); //Se calcula la raíz cuadrada de x[0]^3 y x[1]^2.
		x[3] = (x[0]+x[1]+x[2])/3; //Se calcula la media de los 3 anteriores valores.
		
		//Los siguientes valores serán introducidos por el usuario.
		x[4] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor para la 4° posición:")); 
		x[5] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor para la 5° posición:"));
		x[6] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor para la 6° posición:"));
		x[7] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor para la 7° posición:"));
		x[8] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor para la 8° posición:"));
		x[9] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor para la 9° posición:"));
		
		y = Arrays.copyOf(x, x.length); //Se copia el Array X en el nueva Array Y.
		Arrays.sort(y); //Se ordena el array Y de menor a mayor.
		
		int i = Arrays.binarySearch(y, x[0]); //Variable auxiliar donde se almacena la posición del número generado en el apartado A
		
		JOptionPane.showMessageDialog(null, 
		"\n- Posicion de "+x[0]+" generado en el apartado (A) en el array original: 0"
	   +"\n- Posicion de "+x[0]+" generado en el apartado (A) en el array ordenado: "+i
	   +"\n- ¿Ambas matrices son iguales?: "+Arrays.equals(x,y)+
		"\n- Matriz inicial: " +Arrays.toString(x)+
		"\n- Matriz ordenada: "+Arrays.toString(y));
	}
}
