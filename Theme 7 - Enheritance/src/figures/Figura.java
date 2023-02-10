package figures;

public class Figura {
	private String nombreFigura;
	private double perimetroFigura;
	
	public Figura(String nombreFigura, double perimetroFigura) {
		super();
		this.nombreFigura = nombreFigura;
		this.perimetroFigura = perimetroFigura;
	}

	public String getNombreFigura() {
		return nombreFigura;
	}

	public void setNombreFigura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}

	public double getPerimetroFigura() {
		return perimetroFigura;
	}

	public void setPerimetroFigura(double perimetroFigura) {
		this.perimetroFigura = perimetroFigura;
	}

	@Override
	public String toString() {
		return "Figura [nombreFigura=" + nombreFigura + ", perimetroFigura=" + perimetroFigura + "]";
	}
	
}
