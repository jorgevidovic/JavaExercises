package leaseManager;

public class Libro extends Producto {
	private static final long serialVersionUID = 6344121112345984127L;
	String autor;
	int numPaginas;

	// - Métodos constructores -

	public Libro() {
		super();
	}

	public Libro(String codigo, String titulo, String autor, int numPaginas) {
		super(codigo, titulo);
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	// - Getters y setters -

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	// - Metodos auxiliares para el funcionamiento del programa -

	@Override
	public boolean alquilar() {
		if (this.isAlquilado() == true) {
			return false;
		}
		setAlquilado(true);
		setDiasPrestamo(10);
		return true;
	}

	@Override
	public int compareTo(Producto o) {
		return this.codigo.compareTo(o.getCodigo());
	}

	// - Metodo ToString -

	@Override
	public String toString() {
		return super.toString() + "\nAutor = " + autor + "\nNumero de paginas = " + numPaginas;
	}

	// - Metodo toStringFichero

	public String toStringFichero() {
		return super.toStringFichero() + "," + autor + "," + numPaginas + "," + alquilado + "," + diasPrestamo;
	}

}
