package exercise1;

import java.time.LocalDate;

public class Administrativo extends Empleado {
	String codigoOrdenador;

	public Administrativo(String nombre, String dni, LocalDate fechaNacimiento, LocalDate fechaContratacion,
			String codigoOrdenador) {
		super(nombre, dni, fechaNacimiento, fechaContratacion);
		this.codigoOrdenador = codigoOrdenador;
	}

	public String getCodigoOrdenador() {
		return codigoOrdenador;
	}

	public void setCodigoOrdenador(String codigoOrdenador) {
		this.codigoOrdenador = codigoOrdenador;
	}
	
	@Override
	public void setSalario(float salario) {
		int antiguedad = calcularAntiguedad();
		this.salario = salarioBase + (antiguedad / 3) * salarioBase * 0.09f;
	}

}
