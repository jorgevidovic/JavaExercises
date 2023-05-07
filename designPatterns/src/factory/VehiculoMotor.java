package factory;

public interface VehiculoMotor {

	int getNumeroRuedas();

	int getCapacidadDeposito();

	int getPotenciaCv();

	String getTipoCombustible();

	void setNumeroRuedas(int numeroRuedas);

	void setCapacidadDeposito(int capacidadDeposito);

	void setPotencia(int potencia);

	void setTipoCombustible(String tipoCombustible);

	String arrancar();

	String acelerar();

	String frenar();
}
