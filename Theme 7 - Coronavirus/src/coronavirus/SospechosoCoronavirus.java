package coronavirus;

public class SospechosoCoronavirus extends Paciente {
	private boolean infectado;
	private boolean realizadoTest;

	public SospechosoCoronavirus(String dni, String nombre, int edad) {
		super(dni, nombre, edad);
		this.infectado = false;
		this.realizadoTest = false;
	}

	public boolean isInfectado() {
		return infectado;
	}

	public void setInfectado(boolean infectado) {
		this.infectado = infectado;
	}

	public boolean isRealizadoTest() {
		return realizadoTest;
	}

	public void setRealizadoTest(boolean realizadoTest) {
		this.realizadoTest = realizadoTest;
	}

	public void realizarTest() {
		this.realizadoTest = true;
		int num = (int) Math.round(Math.random());
		if (num == 1) {
			this.infectado = true;
			setEnfermedad("Coronavirus");
		}
	}

	public void curar() {
		this.infectado = false;
		setEnfermedad("Ninguna");
	}

	@Override
	public String toString() {
		return super.toString() + ", infectado=" + infectado + ", realizadoTest=" + realizadoTest + "]";
	}

}
