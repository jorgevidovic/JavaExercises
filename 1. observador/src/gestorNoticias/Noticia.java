package gestorNoticias;

public class Noticia {
	private String titular;
	private String cuerpoNoticia;
	
	public Noticia(String titular, String cuerpoNoticia) {
		super();
		this.titular = titular;
		this.cuerpoNoticia = cuerpoNoticia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCuerpoNoticia() {
		return cuerpoNoticia;
	}

	public void setCuerpoNoticia(String cuerpoNoticia) {
		this.cuerpoNoticia = cuerpoNoticia;
	}
	
	public void getNoticia() {
		System.out.println(getTitular());
		System.out.println(getCuerpoNoticia());
	}
}
