package proposedExercises.topic6;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class MainClassRequest {
	public static void main(String[] args) {
		Request request[] = new Request[100];
		request[0] = new Request("AA23", "Reducción de pago de cuota.");
		request[1] = new Request("AA27", "Ampliación de periodo vacacional.");
		request[2] = new Request("AA28", "Anulación de multa de 'Trafico'.");
		String option = null;
		char o = 0;

		do {
			option = JOptionPane.showInputDialog(null, "Ejercicio Solicitud \n"
					+ "\nA) Crear una nueva solicitud."
					+ "\nB) Modificar el estado de una Solicitud a partir del código."
					+ "\nC) Mostrar todas las solicitudes según el estado."
					+ "\nD) Modificar fecha de la solicitud."
					+ "\nE) Mostrar todas las solicitudes realizadas en una determinada fecha."
					+ "\nX) Salir.");
			o = option.toUpperCase().charAt(0);
			switch(o) {
			case 'A':
				String code = JOptionPane.showInputDialog("Introduce el codigo:");
				String title = JOptionPane.showInputDialog("Introduce el asunto: ");
				Request request1 = new Request(code,title);
				boolean saved = false;
				
				for (int i = 0; i < request.length; i++) {
					if (request[i]==null) {
						request[i]=request1;
						saved = true;
						break;			
					}
				}
				if(saved) {
					JOptionPane.showMessageDialog(null, "Se ha guardado la solicitud.\n"+ Request.showRequests(request));
					
				} else {
					JOptionPane.showMessageDialog(null, "No se ha podido guardar la solicitud.");
				}
				break;
			}
		} while (o != 'X');

	}

}
