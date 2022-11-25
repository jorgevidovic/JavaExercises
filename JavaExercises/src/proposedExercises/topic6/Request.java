package proposedExercises.topic6;

import java.time.LocalDate;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Request {
	private String code;
	private String title;
	private LocalDate date;
	private Status status;

	public Request(String code, String title) {
		super();
		if (code.length() == 4) {
			this.code = code;
		}
		this.title = title;
		this.date = LocalDate.now();
		this.status = status.Pendiente;
	}

	public String getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public static String showRequests(Request request[]) {
		int x = 0;
		for (int i = 0; i < request.length; i++) {
			if (request[i] != null) {
				x++;
			}
		}
		
		String request2[] = new String[x];

		for (int i = 0; i < request2.length; i++) {
			request2[i] = String.valueOf(request[i]);
		}
		return Arrays.toString(request2);
	}

	public static String saveRequest(Request request[], Request request1) {
		boolean saved = false;
		for (int i = 0; i < request.length; i++) {
			if (request[i] == null) {
				request[i] = request1;
				saved = true;
				break;
			}
		}
		if (saved) {
			return "Se ha guardado la solicitud.\n" + Request.showRequests(request);

		} else {
			return "No se ha podido guardar la solicitud.";
		}
	}

	@Override
	public String toString() {
		return "\nSolicitud [ Código = " + "'" + code + "'" + ", Asunto = " + "'" + title + "'" + ", Fecha = " + "'"
				+ date + "'" + ", Estado = " + "'" + status + "'" + " ]";
	}

}
