package ejercicioBateria;

import java.util.ArrayList;
import java.util.List;

public class Bateria {
	private boolean conectado;
	private boolean cargando;
	private int carga;
	private int tiempo;
	private List<ObservadorBateria> observadores;

	public Bateria() {
		this.conectado = false;
		this.cargando = false;
		this.carga = 0;
		this.tiempo = 0;
		this.observadores = new ArrayList<>();
	}

	public boolean isConectado() {
		return conectado;
	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}

	public boolean isCargando() {
		return cargando;
	}

	public void setCargando(boolean cargando) {
		this.cargando = cargando;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		if(carga >= 0 && carga <= 100) {
			this.carga = carga;
		} else {
			System.out.println("El porcentaje introducido no es válido.");
		}
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
		notificarObservadores();
	}
	
	public void addObservador(ObservadorBateria observador) {
		observadores.add(observador);
	}
	
	public void deleteObservador(ObservadorBateria observador) {
		observadores.remove(observador);
	}
	
	private void notificarObservadores() {
		for(ObservadorBateria observador : observadores) {
			observador.actualizarPorcentajeBateria(carga);
			observador.actualizarTiempoRestante(tiempo);
		}
	}
}
