package proposedExercises.topic2;
import java.util.Scanner;
public class EscaleTransformation {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Variable zone
		float f;
		float c;
		
		System.out.println("Programa para transformar los grados en escala Fahrenheit a Celcius: ");
		System.out.print("Introduce la cantidad de grados en Fahrenheit: ");
		f = sc.nextFloat();
		c = ((f-32)*5)/9;
		System.out.printf("El equivalente en grados celcius de la cantidad introducida es: %.2f",c);
		sc.close();
	}
}
