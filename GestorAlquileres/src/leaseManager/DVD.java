package leaseManager;

public abstract class DVD extends Producto {
	private static final long serialVersionUID = 485765375300149069L;
	protected int duracion;

	// - Métodos constructores -

	public DVD() {
		super();
	}

	public DVD(String codigo, String titulo, int duracion) {
		super(codigo, titulo);
		this.duracion = duracion;
	}

	// - Getters y setters -

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	// - Metodo ToString -

	@Override
	public String toString() {
		return super.toString() + "\nDuracion = " + duracion + " min";
	}

	// - Metodo toStringFichero
	public String toStringFichero() {
		return super.toStringFichero() + "," + duracion;
	}

}
