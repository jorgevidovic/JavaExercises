package singleton;

public final class Singleton {
	private static Singleton instancia;
	private String valor;

	private Singleton(String valor) {
		this.valor = valor;
	}

	public static Singleton getInstancia(String valor) {
		if (instancia == null) {
			instancia = new Singleton(valor);
		}

		return instancia;
	}

	public String getValor() {
		return valor;
	}
}
