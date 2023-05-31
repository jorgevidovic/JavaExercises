package gestorNoticias;

public class Main {
	public static void main(String[] args) {
		
		//En este ejercicio est� aplicado el patr�n 'Observer' junto al patr�n 'Singleton'
		//El 'Singleton' est� aplicado en la clase principal, en este caso 'PublicadorDeNoticias'
		
		PublicadorDeNoticias publicador = PublicadorDeNoticias.getPublicador();
		
		publicador.agregarCanal(new CanalEmail());
		publicador.agregarCanal(new CanalRedesSociales());
		publicador.agregarCanal(new CanalNotificaciones());
		
		Noticia noticia1 = new Noticia("Jorge Vidovic Presidente", "Lorem Ipsum...");
		Noticia noticia2 = new Noticia ("Jorge Vidovic Inaugura empresa de software", "Lorem Ipsum...");
		
		publicador.agregarNoticia(noticia1);
		publicador.agregarNoticia(noticia2);
	}
}
