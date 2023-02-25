package exercise5;

public class Circulo implements Relationable {
	private float radio;
	private float area;

	public Circulo(float radio) {
		super();
		this.radio = radio;
		setArea();
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public float getArea() {
		return area;
	}

	public void setArea() {
		this.area = (float) Math.PI * radio * radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", area=" + area + "]";
	}

	@Override
	public boolean isMayorQue(Object b) {
		return this.area > ((Circulo) b).area;
	}

	@Override
	public boolean isMenorQue(Object b) {
		return this.area < ((Circulo) b).area;
	}

	@Override
	public boolean isIgualA(Object b) {
		return this.area == ((Circulo) b).area;
	}

}
