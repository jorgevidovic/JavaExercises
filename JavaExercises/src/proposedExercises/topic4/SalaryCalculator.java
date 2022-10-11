package proposedExercises.topic4;
import javax.swing.JOptionPane;

public class SalaryCalculator {

	public static void main(String[] args) {
		try {
		JOptionPane.showMessageDialog(null, "Programa para calcular el salario neto y bruto semanal y mensual de un trabajador semanalmente.");
		
		float pricePerHour = Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio por hora trabajada: "));
		float hoursWorked = Float.parseFloat(JOptionPane.showInputDialog("Introduce la cantidad de horas trabajadas: "));

		float extraHoursSalary = (float)((hoursWorked-38)*pricePerHour*1.5);
		float bruteSalary = 0;
		float netSalary = 0;
		
		// -- Posibles errores --
		
		if(pricePerHour<=0 && hoursWorked<=0){
			JOptionPane.showMessageDialog(null, "La cantidad de horas trabajas tanto precio por horas trabajadas no son valores validos, intentalo de nuevo.");
		}
		else if(hoursWorked<=0){
			JOptionPane.showMessageDialog(null, "La cantidad de horas trabajadas no es valida, intentalo de nuevo.");
		}
		else if(pricePerHour<=0){
			JOptionPane.showMessageDialog(null, "El precio por horas trabajadas no es valido, intentalo de nuevo.");
		}
		
		// -- Algoritmo --
		
		if(hoursWorked <= 38){
			bruteSalary = (float) hoursWorked*pricePerHour;
			}
		
		else if(hoursWorked > 38) {
			bruteSalary = (float)(pricePerHour*38)+(pricePerHour*extraHoursSalary);
		}
		
		if (bruteSalary<=300){
			netSalary = bruteSalary;
		}
		
		else if(bruteSalary>300) {
			netSalary = (float)(bruteSalary *0.9);
		}
		
		// -- Impresion por pantalla del resultado --
		
		while(pricePerHour>0 && hoursWorked>0) {
			JOptionPane.showMessageDialog(null, "El salario bruto es igual a: "+bruteSalary+"€"
											   +"\nEl salario neto es igual a: "+netSalary+"€");
			break;
		}
		
		

		

		

		


		} catch(Exception e){
			JOptionPane.showMessageDialog(null, "Algo ha ido mal, intentalo de nuevo.");}
	}
}
