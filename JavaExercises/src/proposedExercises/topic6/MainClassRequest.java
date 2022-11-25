package proposedExercises.topic6;

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
			switch (o) {

			case 'A':
				String code = JOptionPane.showInputDialog("Introduce el codigo:");
				String title = JOptionPane.showInputDialog("Introduce el asunto: ");
				Request request1 = new Request(code, title);
				JOptionPane.showConfirmDialog(null, Request.saveRequest(request, request1));

			case 'B':
				String codeResquest = JOptionPane
						.showInputDialog("Introduce el codigo de la solicitud que quieres modificar");
				Request requestSearched = null;
				boolean isFound = false;
				for (Request r : request) {
					if (r != null) {
						if (r.getCode().equals(codeResquest)) {
							isFound = true;
							requestSearched = r;
							break;
						}
					}
				}
				if(isFound) {
					String codeStatus = JOptionPane.showInputDialog(null, "Introduzca el nuevo estado:"
							+ "\n1. Pendiente."
							+ "\n2. Proceso."
							+ "\n3. Admitida."
							+ "\n4. Rechazada.");
					switch(codeStatus.charAt(0)){
					case '1':
						requestSearched.setStatus(Status.Pendiente);
						JOptionPane.showMessageDialog(null, requestSearched);
						break;
					case '2':
						requestSearched.setStatus(Status.Procesando);
						JOptionPane.showMessageDialog(null, requestSearched);
						break;
					case '3':
						requestSearched.setStatus(Status.Admitida);
						JOptionPane.showMessageDialog(null,requestSearched);
						break;
					case '4':
						requestSearched.setStatus(Status.Rechazada);
						JOptionPane.showMessageDialog(null, requestSearched);
						break;
					}
				}
				break;
			}
		} while (o != 'X');
	}

}
