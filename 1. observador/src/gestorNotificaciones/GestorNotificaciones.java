package gestorNotificaciones;

import java.util.ArrayList;
import java.util.List;

public class GestorNotificaciones {
	private static GestorNotificaciones instancia;
	protected List<Observador> observadores;
	
	private GestorNotificaciones() {
		observadores = new ArrayList<Observador>();
	}
}
