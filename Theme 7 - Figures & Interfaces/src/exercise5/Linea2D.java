package exercise5;

import java.util.Objects;

public class Linea2D implements Relationable {
	private Punto2D p1;
	private Punto2D p2;
	private float distancia;

	public Linea2D(Punto2D p1, Punto2D p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		setDistancia();
	}

	public Linea2D(int x1, int y1, int x2, int y2) {
		super();
		p1 = new Punto2D(x1, y1);
		p2 = new Punto2D(x2, y2);
		setDistancia();
	}

	public Punto2D getP1() {
		return p1;
	}

	public void setP1(Punto2D p1) {
		this.p1 = p1;
	}

	public Punto2D getP2() {
		return p2;
	}

	public void setP2(Punto2D p2) {
		this.p2 = p2;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia() {
		this.distancia = (float) Math.sqrt(
				(p2.getX() - p1.getX()) * (p2.getX() - p1.getX()) + (p2.getY() - p1.getY()) * (p2.getY() - p1.getY()));
	}

	@Override
	public boolean isMayorQue(Object b) {
		return this.distancia > ((Linea2D) b).distancia;
	}

	@Override
	public boolean isMenorQue(Object b) {
		return this.distancia < ((Linea2D) b).distancia;
	}

	@Override
	public boolean isIgualA(Object b) {
		return this.distancia == ((Linea2D) b).distancia;
	}
}
