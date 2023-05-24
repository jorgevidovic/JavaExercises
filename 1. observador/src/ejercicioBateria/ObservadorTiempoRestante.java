package ejercicioBateria;

public class ObservadorTiempoRestante implements ObservadorBateria {

	@Override
	public void actualizarTiempoRestante(int tiempo) {
		System.out.println("Tiempo restante de la batería: " + tiempo + " min");

	}

	@Override
	public void actualizarPorcentajeBateria(int bateria) {

	}

}
