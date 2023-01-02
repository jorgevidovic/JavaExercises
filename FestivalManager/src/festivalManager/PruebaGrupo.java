package festivalManager;

public class PruebaGrupo {

	public static void main(String[] args) {
		Grupo grupos[] = new Grupo[10];
		grupos[1] = new Grupo("Bad Bunny", 60, 10, 30000);
		grupos[2] = new Grupo("Eladio Carrión", 60, 8, 20000);

		System.out.println(grupos[1]);
		System.out.println(grupos[2]);

	}

}
