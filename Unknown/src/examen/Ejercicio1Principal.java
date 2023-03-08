package examen;

public class Ejercicio1Principal {
	public static void main(String[] args) {
		int matrizNumerica[] = { 1, 7, 9, 8, 5, 2, 6, 7, 11, 89, 85, 4, -1 };
		// Ejercicio 1
		System.out.println("Ejercicio 1 - El primer digito negativo esta en la posicion: "
				+ Ejercicio1.devuelveNegativo(matrizNumerica));

		// Ejercicio 2
		String test1 = "Hola esto es 1 test ";
		System.out.println(
				"\nEjercicio 2 - El primer digito esta en la posicion: " + Ejercicio1.devuelvePosicionDigito(test1));

		// Ejercicio 3
		System.out.println(
				"\nEjercicio 3 - Hay " + Ejercicio1.contadorDeNumeros(matrizNumerica) + " numeros entre -5 y 5.");

		// Ejercicio 4
		System.out.println(
				"\nEjercicio 4:\n      Estadisticas examen:\n" + Ejercicio1.estadisticasExamen(matrizNumerica));
	}
}
