package exercise1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;

public class Empleado {
	private String dni;
	private LocalDate fechaNacimiento;
	private String nombre;
	private LocalDate fechaContratacion;
	protected float salario;
	protected static float salarioBase = 1000;

	public Empleado(String nombre, String dni, LocalDate fechaNacimiento, LocalDate fechaContratacion) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaContratacion = fechaContratacion;
		this.calcularSalario();
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	// - Metodos para el desarrollo del programa -

	public static void guardarEmpleado(Empleado empleado, Empleado[] plantilla) {
		for (int i = 0; i < plantilla.length; i++) {
			if (plantilla[i] == null) {
				plantilla[i] = empleado;
				break;
			}
		}
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
