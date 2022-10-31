package proposedExercises.topic2;
import java.util.*;
public class PriceCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa para calcular el precio de un piso.");
		float IMPUESTOREVEAL = 3.4f;
		float importe;
		float antiguedad;
		float precioCatastral;
	
		System.out.print("Introduce el importe: ");
		importe = sc.nextFloat();
		float ci = importe * 0.3f;
		
		System.out.print("Introduce la antiguedad en anos: ");
		antiguedad = sc.nextFloat();
		
		System.out.print("Introduce el precio catastral del inmueble: ");
		precioCatastral = sc.nextFloat();
		
		float precioVenta = importe + ci + (IMPUESTOREVEAL*antiguedad/100)*precioCatastral;
		System.out.printf("El precio de venta total es: %.2f $",precioVenta);
		sc.close();
	}
}
