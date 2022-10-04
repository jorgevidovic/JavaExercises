package proposedExercises.topic4;
import javax.swing.JOptionPane;
public class QuadraticFormulaCalculator {
	
	public static void main(String[] args) {
		try {
			JOptionPane.showMessageDialog(null, "Programa para calcular una raíz cuadrada.");
			
			float a = Float.parseFloat(JOptionPane.showInputDialog("Introduce la variable A: "));
			float b = Float.parseFloat(JOptionPane.showInputDialog("Introduce la variable B: "));
			float c = Float.parseFloat(JOptionPane.showInputDialog("Introduce la variable C: "));
			
			float x = 0;
			float x1 = 0;
			float x2 = 0;
			
			float isReal =(float)Math.sqrt(Math.pow(b, 2)-4*a*c);
			
			if(Float.compare(a,0) == 0){
				x = -(c/b);
				JOptionPane.showMessageDialog(null, "Valores introducidos: "
					    +"\na: "+a
						+"\nb: "+b
						+"\nc: "+c
						+"\n----------"
						+"\nx1: "+x
						+"\nx2: "+x);
			}
			
			else if(Float.compare(b,0) == 0){
				x1 = (float)Math.sqrt(-(c/b));
				x2 = -(x1); 
				JOptionPane.showMessageDialog(null, "Valores introducidos: "
                        +"\na: "+a
                        +"\nb: "+b
                        +"\nc: "+c
                        +"\n----------"
                        +"\nx1: "+x1
                        +"\nx2: "+x2);
			}
			
			else if(Float.compare(c,0) == 0){
				x1 = 0;
				x2 = -(b/a);
				
				JOptionPane.showMessageDialog(null, "Valores introducidos: "
                        +"\na: "+a
                        +"\nb: "+b
                        +"\nc: "+c
                        +"\n----------"
                        +"\nx1: "+x1
                        +"\nx2: "+x2);
			}
			
			else if(isReal<0){
				JOptionPane.showMessageDialog(null, "No existe solución real.");
			}
			
			else {
				x1 = (-b+isReal)/2*a;	
				x2 = (-b-isReal)/2*a;
				
				JOptionPane.showMessageDialog(null, "Valores introducidos: "
                        +"\na: "+a
                        +"\nb: "+b
                        +"\nc: "+c
                        +"\n----------"
                        +"\nx1: "+x1
                        +"\nx2: "+x2);
				
				//Existe un error --> Apunta directamente a este segmento de código
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Algo ha ido mal, intentalo de nuevo.");
		}
	}
}
