package examen;

import java.util.HashSet;

public class PrincipalEjercicio2 {
	public static void main(String[] args) {
		HashSet<ObjetoEspacial> bdd = new HashSet<>();
		bdd.add(new ObjetoEspacial(20000, 300, "Planeta Tierra"));
		bdd.add(new ObjetoEspacial(2000, 500, "Planeta Tierra"));
		bdd.add(new ObjetoEspacial(8000, 300, "Saturno"));
		bdd.add(new ObjetoEspacial(5000, 300, "Marte"));
		Object[] bdd2 = bdd.toArray();

		System.out.println("- Objetos espaciales -");
		for (int i = 0; i < bdd2.length; i++) {
			System.out.println(bdd2[i]);
		}
		String masivoNombre = null;
		for (int i = 0; i < bdd2.length; i++) {
			for (int j = i + 1; j < bdd2.length; j++) {
				ObjetoEspacial massive = ObjetoEspacial.getObjetoMasivo((ObjetoEspacial) bdd2[i],
						(ObjetoEspacial) bdd2[j]);
				masivoNombre = massive.getNombre();
			}
		}
		System.out.println("\nEl objeto espacial con mas masa es: " + masivoNombre);
	}
}
