package leaseManager;

import java.io.Serializable;
import java.util.Objects;

public abstract class Producto implements Alquilable, Serializable, Comparable<Producto>{
	private static final long serialVersionUID = 4117293273107009191L;
	String codigo;
	String titulo;
	boolean alquilado;
	int diasPrestamo;

	// - Métodos constructores -

	public Producto() {
		super();
	}

	public Producto(String codigo, String titulo) {
		super();
		setCodigo(codigo);
		this.titulo = titulo;
		this.alquilado = false;
		this.diasPrestamo = 0;
	}

	// - Getters y setters -

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		if (codigo.matches("^[A-Z]{2}[0-9]{2}$"))
			this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	public int getDiasPrestamo() {
		return diasPrestamo;
	}

	public void setDiasPrestamo(int diasPrestamo) {
		this.diasPrestamo = diasPrestamo;
	}

	// - Metodos auxiliares para el funcionamiento del programa -

	@Override
	public void devolver() {
		setAlquilado(false);
		setDiasPrestamo(0);
	}

	public static boolean validarCodigo(String codigo) {
		if (codigo.matches("^[A-Z]{2}[0-9]{2}$")) {
			return true;
		}
		return false;
	}

	public static boolean validarMatricula(String codigo) {
		if (codigo.matches("^[0-9]{4}[A-Z]{3}$")) {
			return true;
		}
		return false;
	}
	// - Metodo toString

	@Override
	public String toString() {
		return "***************************************\nCodigo = " + codigo + "\nTitulo = " + "'" + titulo + "'";
	}

	// - Sobreescribiendo el HashCode para que 2 productos sean iguales si tienen el
	// mismo código

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(codigo, other.codigo);
	}

	// - Metodo toStringFichero
	public String toStringFichero() {
		return codigo + "," + titulo;
	}

}
