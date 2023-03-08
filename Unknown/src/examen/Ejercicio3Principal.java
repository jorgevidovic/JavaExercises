package examen;

public class Ejercicio3Principal {
	public static void main(String[] args) {
		ObjetoEspacial[] bdd = new ObjetoEspacial[5];
		bdd[0] = new OVNI(100, 8000, "Thanos");
		bdd[1] = new ObjetoEspacial(100, 1000, "Satelite");
		bdd[2] = new ObjetoEspacial(100, 1000, "Pluton");
		bdd[3] = new Estrella(100, 1000, "Belen", 0.5f, 7);
		bdd[4] = new OVNI(100, 1000, "ET");

		int contadorOVNIS = 0;

		for (int i = 0; i < bdd.length; i++) {
			System.out.println(bdd[i]);
			if (bdd[i] instanceof OVNI) {
				contadorOVNIS++;
			}
		}
		System.out.println("\nNumero de OVNIS en la base de datos: " + contadorOVNIS);
	}
}
