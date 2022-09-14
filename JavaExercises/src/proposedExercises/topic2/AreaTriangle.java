package proposedExercises.topic2;
import java.util.Scanner;
public class AreaTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa para calcular el area de un triangulo.\n");
		
		System.out.print("Introduce el valor de la base del triangulo: ");
		int base = sc.next().charAt(0);
		
		System.out.print("Introduce el valor de la altura del triangulo: ");
		int height = sc.next().charAt(0);
		
		int area = (base*height)/2;
		System.out.println("El area del triangulo es igual a: "+area);
		
	}
}
