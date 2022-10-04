package proposedExercises.topic4;
import java.math.*;
import javax.swing.JOptionPane;
public class QuadraticFormulaCalculator {
	
	public static void main(String[] args) {
		try {
			JOptionPane.showMessageDialog(null, "Programa para calcular una raíz cuadrada.");
			
			float a = Float.parseFloat(JOptionPane.showInputDialog("Introduce la variable A: "));
			float b = Float.parseFloat(JOptionPane.showInputDialog("Introduce la variable B: "));
			float c = Float.parseFloat(JOptionPane.showInputDialog("Introduce la variable C: "));
			
			float x;
			float x1;
			float x2;
			
			if(a==0){
				x = -(c/b);
				JOptionPane.showMessageDialog(null, "Valores introducidos: "
					    +"\na: "+a
						+"\nb: "+b
						+"\nc: "+c
						+"\nx1: "+x
						+"\nx2: "+x);
			}
			
			else if(b==0){
				x = (float)Math.sqrt(-(c/b));
				JOptionPane.showMessageDialog(null, "Valores introducidos: "
                        +"\na: "+a
                        +"\nb: "+b
                        +"\nc: "+c
                        +"\nx1: "+x
                        +"\nx2: "+x);
			}
			
			else if(c==0){
				x1 = 0;
				x2 = -(b/a);
				
				JOptionPane.showMessageDialog(null, "Valores introducidos: "
                        +"\na: "+a
                        +"\nb: "+b
                        +"\nc: "+c
                        +"\nx1: "+x1
                        +"\nx2: "+x2);
			}
			
			else {
				float isReal =(float)Math.sqrt(Math.pow(b, 2)-4*a*c);
				x1 = (-b+isReal)/2*a;	
				x2 = (-b-isReal)/2*a;
				
				JOptionPane.showMessageDialog(null, "Valores introducidos: "
                        +"\na: "+a
                        +"\nb: "+b
                        +"\nc: "+c
                        +"\nx1: "+x1
                        +"\nx2: "+x2);
				
				if(isReal<0){
					JOptionPane.showMessageDialog(null, "No existe solución real.");
				}
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Algo ha ido mal, intentalo de nuevo.");
		}
	}
}
