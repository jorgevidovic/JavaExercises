package exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Exercise_1 {
	// A) Método que reciba un Collection<Integer> un entero n y un entero límite y
	// rellene la colección con N números aleatorios entre 0 y el límite.

	public static void generateRandomNumbers(Collection<Integer> collection, int numero, int limite) {
		Random random = new Random();
		for (int i = 0; i < numero; i++) {
			collection.add(random.nextInt(limite));
		}
	}

	// B) Método que reciba un Collection<Integer> y muestre por pantallas sus
	// valores.
	public static void showCollection(Collection<Integer> collection) {
		for (Integer i : collection) {
			System.out.print(i + " ");
		}
	}

	// C) Método que recibe un Set<Double> y lo llena con 100 números double
	// aleatorios.
	public static void generateRandomNumbers(Set<Double> s) {
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			s.add(random.nextDouble() * 10);
		}
	}

	// D) Método que recibe un Set<Double> y muestra sus valores con una cifra
	// decimal.

	public static void showSet(Set<Double> s) {
		for (Double number : s) {
			System.out.printf("%.1f ", number);
		}
	}

	public static void main(String[] args) {
		// E) Crear un ArrayList con el método del apartado A.
		// A partir de este ArrayList cread un HashSet y un TreeSet utilizando el método
		// addAll

		ArrayList<Integer> eArrayList = new ArrayList<Integer>();
		HashSet<Integer> eHashSet = new HashSet<Integer>();
		TreeSet<Integer> eTreeSet = new TreeSet<Integer>();

		generateRandomNumbers(eArrayList, 50, 100);
		eHashSet.addAll(eArrayList);
		eTreeSet.addAll(eArrayList);
		
		System.out.println("Elementos almacenados en el ArrayList");
		showCollection(eArrayList);
		System.out.println("\n");
		System.out.println("Elementos almacenados en el TreeSet");
		showCollection(eTreeSet);
		System.out.println("\n");
		System.out.println("Elementos almacenados en el HashSet");
		showCollection(eHashSet);

	}
}
