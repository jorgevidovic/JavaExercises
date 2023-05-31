package gestorNoticias;

import java.util.ArrayList;
import java.util.List;


// Se aplicó el patrón 'Observer'
public class PublicadorDeNoticias {
	//Se inicializa una variable estatica 
	private static PublicadorDeNoticias publicador;
	
	private List<InterfazCanal> listaCanales;
	private List<Noticia> listaNoticias;

	//Se crea un constructor privado para evitar la creación de instancias directamente
	private PublicadorDeNoticias() {
		listaCanales = new ArrayList<>();
		listaNoticias = new ArrayList<>();
	}
	
	//Se crea un metodo estatico para segurar que solo se crea 1 sola instancia de la clase principal.
	public static PublicadorDeNoticias getPublicador() {
		if (publicador == null) {
			publicador = new PublicadorDeNoticias();
		}
		return publicador;
	}

	public void agregarCanal(InterfazCanal canal) {
		listaCanales.add(canal);
	}

	public void eliminarCanal(InterfazCanal canal) {
		listaCanales.remove(canal);
	}

	public void agregarNoticia(Noticia noticia) {
		listaNoticias.add(noticia);
		notificarCanales();
	}

	public void eliminarNoticia(Noticia noticia) {
		listaNoticias.remove(noticia);
	}

	private void notificarCanales() {
		for (InterfazCanal canal : listaCanales) {
			canal.actualizarNoticias(listaNoticias);
		}

		listaNoticias.clear();
	}
}
