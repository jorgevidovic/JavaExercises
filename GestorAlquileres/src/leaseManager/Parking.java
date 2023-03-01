package leaseManager;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Parking extends Producto {
	private static final long serialVersionUID = 4117293273107009191L;
	String codigo;
	int numeroPlaza;
	Boolean alquilado;
	LocalTime horaPrestamo;
	LocalTime horaDevolucion;

	public Parking() {
		super();
	}

	public Parking(String codigo, int numeroPlaza) {
		setCodigo(codigo);
		this.numeroPlaza = numeroPlaza;
		this.alquilado = false;
		if (alquilado) {
			setHoraPrestamo(horaPrestamo);
			setHoraDevolucion(horaDevolucion);
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		if (codigo.matches("^[A-Z]{2}[0-9]{2}$"))
			this.codigo = codigo;
	}

	public int getNumeroPlaza() {
		return numeroPlaza;
	}

	public void setNumeroPlaza(int numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
	}

	public Boolean getAlquilado() {
		return alquilado;
	}

	public void setAlquilado(Boolean alquilado) {
		this.alquilado = alquilado;
	}

	public LocalTime getHoraPrestamo() {
		return horaPrestamo;
	}

	public void setHoraPrestamo(LocalTime horaPrestamo) {
		this.horaPrestamo = horaPrestamo;
	}

	public LocalTime getHoraDevolucion() {
		return horaDevolucion;
	}

	public void setHoraDevolucion(LocalTime horaDevolucion) {
		this.horaDevolucion = horaDevolucion;
	}

	@Override
	public boolean alquilar() {
		if (this.isAlquilado() == true) {
			return false;
		}
		setAlquilado(true);
		setHoraPrestamo(horaPrestamo);
		setHoraDevolucion(horaDevolucion);
		return true;
	}

	@Override
	public int compareTo(Producto o) {
		return 0;
	}

	public static LocalTime validarHora(String hora) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime horaTransformada = LocalTime.parse(hora, dateTimeFormatter);
		return horaTransformada;
	}

	public String toString() {
		if (isAlquilado()) {
			return "***************************************\nCodigo: " + codigo + "\nNúmero de plaza: " + numeroPlaza
					+ "\nHora de prestamo: " + horaPrestamo + "\nHora de devolución: " + horaDevolucion;
		} else {
			return "***************************************\nCodigo: " + codigo + "\nNúmero de plaza: " + numeroPlaza;
		}

	}

	public String toStringFichero() {
		return codigo + "," + numeroPlaza + "," + isAlquilado() + "," + horaPrestamo + "," + horaDevolucion;
	}

}
