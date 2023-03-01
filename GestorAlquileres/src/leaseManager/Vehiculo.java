package leaseManager;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vehiculo extends Producto {
	private static final long serialVersionUID = 2639767607164062589L;
	String codigo, matricula, marca, modelo;
	Boolean alquilado;
	LocalDate fechaPrestamo;
	LocalDate fechaDevolucion;

	public Vehiculo() {
		super();
	}

	public Vehiculo(String codigo, String matricula, String marca, String modelo) {
		setCodigo(codigo);
		setMatricula(matricula);
		this.marca = marca;
		this.modelo = modelo;
		this.alquilado = false;
		if (alquilado) {
			setFechaPrestamo(fechaPrestamo);
			setFechaDevolucion(fechaDevolucion);
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		if (codigo.matches("^[A-Z]{2}[0-9]{2}$"))
			this.codigo = codigo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula.matches("^[0-9]{4}[A-Z]{3}$"))
			this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Boolean getAlquilado() {
		return alquilado;
	}

	public void setAlquilado(Boolean alquilado) {
		this.alquilado = alquilado;
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	@Override
	public int compareTo(Producto o) {
		return 0;
	}

	@Override
	public boolean alquilar() {
		if (this.isAlquilado() == true) {
			return false;
		}
		setFechaPrestamo(fechaPrestamo);
		setFechaDevolucion(fechaDevolucion);
		setAlquilado(true);
		return true;
	}

	public static LocalDate validarFecha(String fecha) throws ParseException {
		LocalDate fechaFormateada = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return fechaFormateada;
	}

	public String toString() {
		return "***************************************\nCodigo: " + codigo + "\nMatricula: " + matricula + "\nMarca: "
				+ marca + "\nModelo: " + modelo;
	}

	public String toStringFichero() {
		return codigo + "," + matricula + "," + marca + "," + modelo + "," + isAlquilado() + "," + fechaPrestamo + ","
				+ fechaDevolucion;
	}

}
