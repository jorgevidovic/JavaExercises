package enhancedExercises;
import java.util.Scanner;
public class IbanAnalyzer {
	public static void main(String[] args) {
		System.out.println("Ejercicio 2 - Programa para analizar un IBAN introducido.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu IBAN: ");
		String iban = sc.nextLine(); //Creación del Scanner y posterior almacenamiento en la variable 'iban'.
		iban = iban.replaceAll(" ",""); //Función para eliminar los espacios vacios por si el usuario introduce espacios.
		sc.close(); //Cierre del Scanner
		
		if (iban.length() == 24) { //Condicional. Si el IBAN no tiene 24 Caracteres, se le indicará al usuario que ha cometido un error.
			
			//Se crean diferentes substrings categorizando la información introducida.
			String contryCode = iban.substring(0, 2); 
			String controlDigit = iban.substring(2, 4);			
			String boxCode = iban.substring(4,8);
			String office = iban.substring(8,12);
			String controlDigit_2 = iban.substring(12,14);
			String accountNumber = iban.substring(14);
			
			//Se transforma el 1er digito de control mediante 2 variables auxiliares.
			//primero transformando a entero y posteriormente a binario.
			int binaryControlDigit = Integer.parseInt(controlDigit); 
			String binaryControlDigit_2 = Integer.toBinaryString(binaryControlDigit);
			
			//Se imprime por pantalla la información indicada.
			System.out.println("-----------------------------------------------------");
			System.out.println("El codigo de pais es: "+contryCode);
			System.out.println("El digito de control es: "+controlDigit);
			System.out.println("El codigo de la caja es: "+boxCode);
			System.out.println("Son iguales ambos digitos de control?: "+ controlDigit.equals(controlDigit_2));
			System.out.println("Numero de cuenta: "+accountNumber);
			System.out.println("Longitud del IBAN: "+iban.length()+" caracteres");
			System.out.println("La cuenta comienza con ES?: "+contryCode.contentEquals("ES"));
			System.out.println("El digito de control "+controlDigit+" en binario es: " + binaryControlDigit_2);
			System.out.println("-----------------------------------------------------");
			
			// 	IBAN de pruebas  --> ES2114650100722030876293
			
		} else {
			System.out.println("El IBAN introducido no es correcto.");
		}
	}
}
