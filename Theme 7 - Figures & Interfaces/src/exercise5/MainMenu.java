package exercise5;

public class MainMenu {

	public static void main(String[] args) {
		// Creamos varios objetos de tipo Linea2D
		Linea2D l1 = new Linea2D(2, 4, 1, 3);
		Linea2D l2 = new Linea2D(new Punto2D(1, 5), new Punto2D(0, 10));

		// Creamos dos círculos
		Circulo c1 = new Circulo(2);
		Circulo c2 = new Circulo(3);
		
		System.out.println("Distancia Linea 1: "+l1.getDistancia());
		System.out.println("Distancia Linea 2: "+l2.getDistancia());
		System.out.println("¿Linea 1 es mayor que linea 2?: "+l1.isMayorQue(l2));
		System.out.println("¿Linea 1 es igual que linea 2?: "+l1.isIgualA(l2));
		System.out.println("¿Linea 1 es menor que linea 2?: "+l1.isMenorQue(l2));
	}
}
