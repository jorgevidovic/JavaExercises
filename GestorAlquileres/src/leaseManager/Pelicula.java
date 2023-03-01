package leaseManager;

public class Pelicula extends DVD {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4117293273107009191L;
	String director;
	String genero;

	// - Métodos constructores -

	public Pelicula() {
		super();
	}

	public Pelicula(String codigo, String titulo, int duracion, String director, String genero) {
		super(codigo, titulo, duracion);
		this.director = director;
		this.genero = genero;
	}

	// - Getters y setters -

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	// - Metodos auxiliares para el funcionamiento del programa -

	@Override
	public boolean alquilar() {
		if (this.isAlquilado() == true) {
			return false;
		}
		setAlquilado(true);
		setDiasPrestamo(3);
		return true;
	}

	@Override
	public int compareTo(Producto o) {
		return this.codigo.compareTo(o.getCodigo());
	}

	// - Metodo ToString -

	@Override
	public String toString() {
		return super.toString() + "\nDirector = " + director + "\nGenero = " + genero;
	}

	// - Metodo toStringFichero
	public String toStringFichero() {
		return super.toStringFichero() + "," + director + "," + genero + "," + alquilado + "," + diasPrestamo;
	}
}
