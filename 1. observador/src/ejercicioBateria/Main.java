package ejercicioBateria;

public class Main {
	public static void main(String[] args) {

		Bateria bateria = new Bateria();
		ObservadorPorcentajeBateria obsPorcentaje = new ObservadorPorcentajeBateria();
		ObservadorTiempoRestante obsTiempo = new ObservadorTiempoRestante();

		bateria.addObservador(obsPorcentaje);
		bateria.addObservador(obsTiempo);

		bateria.setConectado(true);
		bateria.setCargando(true);

		System.out.println("¿Está cargando el dispositivo?");
		System.out.println(bateria.isCargando());

		System.out.println("¿Está conectado el dispositivo?");
		System.out.println(bateria.isConectado());

		bateria.setCarga(100);
		bateria.setTiempo(300);
	}
}
