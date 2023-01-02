package festivalManager;

public class Grupo {
	private String nombre;
	private int tiempoActuacion;
	private int popularidad;
	private float coste;

	public Grupo(String nombre, int tiempoActuacion, int popularidad, float coste) {
		super();
		this.nombre = nombre;
		this.tiempoActuacion = tiempoActuacion;
		setPopularidad(popularidad);
		this.coste = coste;
	}

	// -- Nombre del grupo --

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// -- Tiempo de actuacion del grupo --

	public int getTiempoActuacion() {
		return tiempoActuacion;
	}

	public void setTiempoActuacion(int tiempoActuacion) {
		this.tiempoActuacion = tiempoActuacion;
	}

	// -- Popularidad del grupo --

	public int getPopularidad() {
		return popularidad;
	}

	public void setPopularidad(int popularidad) {
		if (popularidad >= 0 && popularidad <= 10) {
			this.popularidad = popularidad;
		} else {
			this.popularidad = 0;
		}
	}

	// -- Coste inicial del grupo --

	public float getCoste() {
		return coste;
	}

	public void setCoste(float coste) {
		this.coste = coste;
	}

	// -- Calcular precio final del grupo --

	public static float calcularPrecioFinal(float coste, int popularidad) {
		float coste_total = coste + (coste * popularidad) / 100.0f;
		return coste_total;
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\n\nTiempo de actuación: " + tiempoActuacion + " minutos" + "\nPopularidad: "
				+ popularidad + "\nCoste: " + coste + "€" + "\nCoste Total: " + calcularPrecioFinal(coste, popularidad)
				+ "€\n";
	}

}
