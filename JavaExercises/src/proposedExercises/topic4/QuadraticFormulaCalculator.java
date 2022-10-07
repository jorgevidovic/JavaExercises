package proposedExercises.topic4;
import javax.swing.JOptionPane;
public class QuadraticFormulaCalculator {
	
	public static void main(String[] args) {
		try {
			JOptionPane.showMessageDialog(null, "Programa para calcular una raíz cuadrada.");
		
			int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce la variable A: "));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce la variable B: "));
			int c = Integer.parseInt(JOptionPane.showInputDialog("Introduce la variable C: "));
			
			double x1 = 0;
			double x2 = 0;
			
			boolean solution = false;
			
			//------------- Inicio del caso A -------------
			if(a==0){
				//bx + c = 0; --> x1 = x2 = -c/b
				
				if(b==0) {
					JOptionPane.showMessageDialog(null, "Error, no existe solución.");
				} else{
					solution = true;
					x1 = x2 = -c/b;
				}
			}
			
			//------------- Inicio del caso B -------------
			else if(b==0){	
				//ax2 + c = 0 --> x1 = Raíz(-c/a) , x2 = -Raíz(-c/a)
			
				double isReal = -c/a;
				if(isReal>0) {
					solution = true;
					x1 = Math.sqrt(isReal);
					x2 = -x1; 
				} else {
					JOptionPane.showMessageDialog(null, "Error, no existe solución.");
				}
			} 
			
			//------------- Inicio del caso C -------------
			
			else if(c==0){
				//ax2 + bx = 0 --> x(ax+b) = 0 --> x1 = 0 , x2 = -b/a;
				solution = true;
				x1 = 0;
				x2 = -b/a;	
			}
			
			//------------- Inicio del caso standard -------------
			
			else {
				//ax2 + bx + c = 0 -->x1 = -b + Raíz(b2 -4ac)/2a ; x2 = -b - Raíz(b2-4ac)/2a
				
				double isReal = Math.sqrt((b*b)-(4*a*c));
				if (isReal>0) {
					solution = true;
					x1 = (-b+isReal)/2*a;	
					x2 = (-b-isReal)/2*a;
					
				} else {
					JOptionPane.showMessageDialog(null, "Error, no existe solución.");
				}
			}
			
			if (solution == true){
				JOptionPane.showMessageDialog(null, "Valores introducidos: "
                        +"\na: "+a
                        +"\nb: "+b
                        +"\nc: "+c
                        +"\n----------"
                        +"\nx1: "+x1
                        +"\nx2: "+x2);
			}
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error, has introducido un caracter incorrecto.");
		}
	}
}
