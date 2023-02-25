package exercise5;

public class Punto2D {

	private float x;
	private float y;

	public Punto2D(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto2D [x=" + x + ", y=" + y + "]";
	}
}
