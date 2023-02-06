package exercise1;

import java.time.LocalDate;

public class Operario extends Empleado {
	String seguroAccidentes;
	String responsabilidadCivil;

	public Operario(String nombre, String dni, LocalDate fechaNacimiento, LocalDate fechaContratacion,
			String seguroAccidentes, String responsabilidadCivil) {
		super(nombre, dni, fechaNacimiento, fechaContratacion);
		this.seguroAccidentes = seguroAccidentes;
		this.responsabilidadCivil = responsabilidadCivil;
	}

	public String getSeguroAccidentes() {
		return seguroAccidentes;
	}

	public void setSeguroAccidentes(String seguroAccidentes) {
		this.seguroAccidentes = seguroAccidentes;
	}

	public String getResponsabilidadCivil() {
		return responsabilidadCivil;
	}

	public void setResponsabilidadCivil(String responsabilidadCivil) {
		this.responsabilidadCivil = responsabilidadCivil;
	}

	@Override
	public void setSalario(float salario) {
		int antiguedad = calcularAntiguedad();
		this.salario = salarioBase + (antiguedad / 3) * salarioBase * 0.05f;
	}

	@Override
	public String toString() {
		return super.toString() + "seguroAccidentes=" + seguroAccidentes + ", responsabilidadCivil="
				+ responsabilidadCivil + ", salario=" + salario + "]";
	}

}
