package examen;

import java.util.Objects;

public class ObjetoEspacial {
	private float masa;
	private float velocidad;
	private String nombre;
	private String universo;

	public ObjetoEspacial(float masa, float velocidad, String nombre) {
		super();
		this.masa = masa;
		this.velocidad = velocidad;
		this.nombre = nombre;
	}

	public float getMasa() {
		return masa;
	}

	public void setMasa(float masa) {
		if (masa > 0) {
			this.masa = masa;
		} else {
			this.masa = 0;
		}
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		if (velocidad > 0) {
			this.velocidad = velocidad;
		} else {
			this.velocidad = 0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUniverso() {
		return universo;
	}

	public void setUniverso(String universo, ObjetoEspacial[] bdd) {
		for (int i = 0; i < bdd.length; i++) {
			this.universo = universo;
		}
	}

	public void desintegrar() {
		this.masa = (float) (this.masa * 0.9);
		this.velocidad = (float) (this.velocidad * 1.15);
	}

	public static ObjetoEspacial getObjetoMasivo(ObjetoEspacial ob1, ObjetoEspacial ob2) {
		if (ob1.getMasa() > ob2.getMasa()) {
			return ob1;
		}
		return ob2;
	}

	@Override
	public String toString() {
		return "\n*****************************\nNombre: " + nombre + "\nMasa: " + masa +" Toneladas";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoEspacial other = (ObjetoEspacial) obj;
		return Objects.equals(nombre, other.nombre);
	}
}
