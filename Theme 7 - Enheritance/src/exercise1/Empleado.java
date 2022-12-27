package exercise1;

import java.time.LocalDate;
import java.time.Period;

public class Empleado {
	private String dni;
	private LocalDate fechaNacimiento;
	private String nombre;
	private LocalDate fechaContratacion;
	private float salario;
	private static float salarioBase = 1000;

	public Empleado(String dni, LocalDate fechaNacimiento, String nombre, LocalDate fechaContratacion, float salario) {
		super();
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.fechaContratacion = fechaContratacion;
		this.calcularSalario();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(LocalDate fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int calcularAntiguedad() {
		Period periodo = Period.between(fechaContratacion, LocalDate.now());
		return periodo.getYears();
	}

	public void calcularSalario() {
		int antiguedad = calcularAntiguedad();
		salario = salarioBase + (antiguedad / 3) * salarioBase * 0.05f;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre
				+ ", fechaContratacion=" + fechaContratacion + ", salario=" + salario + "]";
	}

}
