package examen;

public class Estrella extends ObjetoEspacial {
	private float luminosidad;
	private int temperatura;
	private char tipo;

	public Estrella(float masa, float velocidad, String nombre, float luminosidad, int temperatura) {
		super(masa, velocidad, nombre);
		setLuminosidad(luminosidad);
		setTemperatura(temperatura);
		if (this.luminosidad > 0.5 && this.temperatura > 5) {
			this.tipo = 'K';
		}

		else if (this.luminosidad > 0.5 && this.temperatura < 5) {
			this.tipo = 'F';
		}

		else if (this.luminosidad < 0.5 && this.temperatura > 5) {
			this.tipo = 'G';
		}

		else if (this.luminosidad < 0.5 && this.temperatura < 5) {
			this.tipo = 'M';
		}
	}

	public float getLuminosidad() {
		return luminosidad;
	}

	public void setLuminosidad(float luminosidad) {
		if (luminosidad > 0 && luminosidad < 1)
			this.luminosidad = luminosidad;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		if (temperatura >= 1 && temperatura <= 10)
			this.temperatura = temperatura;
	}

	public char getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "\nLuminosidad: " + luminosidad + "\nTemperatura: " + temperatura + "\nTipo: " + tipo;
	}

}
