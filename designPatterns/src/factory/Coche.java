package factory;

public class Coche implements VehiculoMotor {
	private int numeroRuedas;
	private int potencia;
	private int capacidadCombustible;
	private String tipoCombustibleString;

	@Override
	public int getCapacidadDeposito() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPotenciaCv() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTipoCombustible() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCapacidadDeposito(int capacidadDeposito) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTipoCombustible(String tipoCombustible) {
		// TODO Auto-generated method stub

	}

	@Override
	public String arrancar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String frenar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumeroRuedas() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNumeroRuedas(int numeroRuedas) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPotencia(int potencia) {
		// TODO Auto-generated method stub

	}

}
