package gestorNoticias;

public class Main {
	public static void main(String[] args) {
		
		//En este ejercicio está aplicado el patrón 'Observer' junto al patrón 'Singleton'
		//El 'Singleton' está aplicado en la clase principal, en este caso 'PublicadorDeNoticias'
		
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
