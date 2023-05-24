package ejercicioBateria;

public class ObservadorPorcentajeBateria implements ObservadorBateria {

	@Override
	public void actualizarTiempoRestante(int tiempo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarPorcentajeBateria(int bateria) {
		System.out.println("El porcentaje de batería es: " + bateria + "%");

	}

}
