package proposedExercises.topic2;
import java.util.*;
public class AverageCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x1;
		float x2;
		float x3;
		float x4;
		float x5;
		
		System.out.println("Programa para calcular la media númerica de 5 valores. \n");
		System.out.print("Introduce el primer valor: ");
		x1= sc.nextFloat();
		System.out.print("Introduce el segundo valor: ");
		x2= sc.nextFloat();
		System.out.print("Introduce el tercer valor: ");
		x3= sc.nextFloat();
		System.out.print("Introduce el cuarto valor: ");
		x4= sc.nextFloat();
		System.out.print("Introduce el quinto valor: ");
		x5= sc.nextFloat();
		
		float x6 = (x1+x2+x3+x4+x5)/5;
		System.out.printf("\nLa media de los 5 valores introducidos es: %.2f",x6);
		sc.close();
	}
}
