package proposedExercises.topic2;
import java.util.Scanner;
public class MoneyDiscounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Programa para realizar un descuento del 15% al precio introducido. \n");
		float price;
		float discountedPrice;
		
		System.out.print("Introduce el precio del producto: ");
		price = sc.nextFloat();
		discountedPrice = (float)(price*(0.85));

		
		System.out.printf("\nPrecio original del producto: %.2f$",price);
		System.out.printf("\nPrecio con el descuento aplicado: %.2f$",discountedPrice);
		sc.close();
	}
}
