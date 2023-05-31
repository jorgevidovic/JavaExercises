package gestorNoticias;

import java.util.List;

public class CanalEmail implements InterfazCanal {

	@Override
	public void actualizarNoticias(List<Noticia> noticias) {
		System.out.println("*Enviando a lista de E-mail*");
		for (Noticia noticia : noticias) {
			noticia.getNoticia();
			System.out.println("-----------------------------------------------\n");
		}
	}
}
