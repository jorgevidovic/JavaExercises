package figures;

public class Poligono extends Figura {
	private int numLados;
	private double longitudLados;

	public Poligono(String nombre, int numLados, double longitudLados) {
		super(nombre, numLados * longitudLados);
		this.numLados = numLados;
		this.longitudLados = longitudLados;
	}

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	public double getLongitudLados() {
		return longitudLados;
	}

	public void setLongitudLados(double longitudLados) {
		this.longitudLados = longitudLados;
	}

	@Override
	public String toString() {
		return "Poligono [numLados=" + numLados + ", longitudLados=" + longitudLados + super.toString() + "]";
	}

}
