package proposedExercises.topic2;
import java.util.Scanner;
public class ValueChanger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que se encarga de intercambiar el valor de 2 variables. \n");
		//Variable zone
		float x;
		float y;
		
		System.out.print("Introduce el primer valor: ");
		x = sc.nextFloat();
		System.out.printf("El primer valor introducido es: %.2f \n",x);
		System.out.print("Introduce el segundo valor: ");
		y = sc.nextFloat();
		System.out.printf("El segundo valor introducido es: %.2f \n",y);
		
		float x2 = y;
		float y2 = x;
		
		System.out.printf("\nAhora el 1er valor es %.2f y el 2do valor es %.2f.",x2,y2);
		sc.close();
	}
}
