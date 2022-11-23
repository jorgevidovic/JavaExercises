package proposedExercises.topic6;

import java.time.LocalDate;

public class Request {
	private String code;
	private String title;
	private LocalDate date;
	private Status status;
	
	public Request(String code, String title) {
		super();
		if(code.length()==4) {
			this.code = code;
		}
		this.title = title;
		this.date = LocalDate.now();
		this.status = status.Pendiente;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
	
	

	@Override
	public String toString() {
		return "Request [code=" + code + ", title=" + title + ", date=" + date + ", status=" + status + "]";
	}
	
	
	
	
	
	
}
