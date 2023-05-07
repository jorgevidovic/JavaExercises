package singleton;

public class main {
	public static void main(String[] args) {
		
		Singleton instancia1 = Singleton.getInstancia("Jorge");
		System.out.println(instancia1.getValor());
		System.out.println("Hello world!");
		
		Singleton instancia2 = Singleton.getInstancia("Tacio");
		System.out.println(instancia1.getValor());
	}
}
