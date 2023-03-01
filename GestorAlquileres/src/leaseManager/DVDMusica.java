package leaseManager;

public class DVDMusica extends DVD {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8684205400359410345L;
	String grupo;

	// - Métodos constructores -

	public DVDMusica() {
		super();
	}

	public DVDMusica(String codigo, String titulo, int duracion, String grupo) {
		super(codigo, titulo, duracion);
		this.grupo = grupo;
	}

	// - Getters y setters -

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	// - Metodos auxiliares para el funcionamiento del programa -

	@Override
	public boolean alquilar() {
		if (this.isAlquilado() == true) {
			return false;
		}
		setAlquilado(true);
		setDiasPrestamo(5);
		return true;
	}

	@Override
	public int compareTo(Producto o) {
		return this.codigo.compareTo(o.getCodigo());
	}

	// - Metodo ToString -

	@Override
	public String toString() {
		return super.toString() + "\nGrupo = " + grupo;
	}

	// - Metodo toStringFichero
	public String toStringFichero() {
		return super.toStringFichero() + "," + grupo + "," + alquilado + "," + diasPrestamo;
	}
}
