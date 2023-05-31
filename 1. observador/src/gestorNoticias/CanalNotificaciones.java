package gestorNoticias;

import java.util.List;

public class CanalNotificaciones implements InterfazCanal {

	@Override
	public void actualizarNoticias(List<Noticia> noticias) {
		System.out.println("*Enviando a Notificaciones*");
		for (Noticia noticia : noticias) {
			noticia.getNoticia();
			System.out.println("-----------------------------------------------\n");
		}
	}
}
