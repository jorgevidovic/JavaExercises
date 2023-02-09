package exercise1;

import java.time.LocalDate;

public class Directivo extends Empleado{
	String numTelf;

	public Directivo(String nombre, String dni, LocalDate fechaNacimiento, LocalDate fechaContratacion, String numTelf) {
		super(nombre, dni, fechaNacimiento, fechaContratacion);
		this.numTelf = numTelf;
	}

	public String getNumTelf() {
		return numTelf;
	}

	public void setNumTelf(String numTelf) {
		this.numTelf = numTelf;
	}
	
	@Override
	public void setSalario(float salario) {
		int antiguedad = calcularAntiguedad();
		this.salario = salarioBase + (antiguedad / 3) * salarioBase * 0.2f;
	}

}
