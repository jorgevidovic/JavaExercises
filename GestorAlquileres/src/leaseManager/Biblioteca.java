package leaseManager;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Biblioteca {

	// -- Comienzo del algoritmo

	static String rutaFichero = System.clearProperty("user.dir");
	static String rutaFicheroLibro = rutaFichero + "\\src\\files\\Libros.txt";
	static String rutaFicheroPeliculas = rutaFichero + "\\src\\files\\Peliculas.txt";
	static String rutaFicheroDVDMusica = rutaFichero + "\\src\\files\\DVDmusica.txt";
	static String rutaFicheroBDD = rutaFichero + "\\src\\files\\Database.txt";

	public static void main(String[] args) throws ClassNotFoundException {

		char option = 0;
		String lista, codigo;
		int c, c2;

		Alquilable[] productosAlqOrd = new Alquilable[9];

		productosAlqOrd[0] = new Libro("AA01", "El Padrino", "Mario Puzo", 446);
		productosAlqOrd[1] = new Libro("AA02", "Padre Rico Padre Pobre", "Robert Kiyosaki", 207);
		productosAlqOrd[2] = new Libro("AA03", "El arte de la guerra", "Sun Tzu", 142);

		productosAlqOrd[3] = new Pelicula("BB01", "La vida es bella", 117, "Roberto Benigni", "Drama");
		productosAlqOrd[4] = new Pelicula("BB02", "Forrest Gump", 140, "Robert Zemeckis", "Comedia");
		productosAlqOrd[5] = new Pelicula("BB03", "Gladiator", 155, "Ridley Scott", "Accion");

		productosAlqOrd[6] = new DVDMusica("CC01", "Un verano sin ti", 82, "Bad Bunny");
		productosAlqOrd[7] = new DVDMusica("CC02", "Mercury – Act 2", 58, "Imagine Dragons");
		productosAlqOrd[8] = new DVDMusica("CC03", "Paraiso", 43, "Mora");
		
		// Lee y compara los ficheros con el array actual, y posteriormente actualiza los objetos correspndientes.

		try {
			Alquilable cProductos[];
			ObjectInputStream rProductos;
			rProductos = new ObjectInputStream(new FileInputStream(rutaFicheroBDD));
			cProductos = (Alquilable[]) rProductos.readObject();

			for (Alquilable p : cProductos) {
				if (((Producto) p).isAlquilado()) {
					for (Alquilable p2 : productosAlqOrd) {
						if (p2 instanceof Libro) {
							if (((Libro) p2).getCodigo().matches(((Producto) p).getCodigo())) {
								p2.alquilar();
							}

						} else if (p2 instanceof Pelicula) {
							if (((Pelicula) p2).getCodigo().matches(((Producto) p).getCodigo())) {
								p2.alquilar();
							}
						}

						else if (p2 instanceof DVDMusica) {
							if (((DVDMusica) p2).getCodigo().matches(((Producto) p).getCodigo())) {
								p2.alquilar();
							}
						}
					}
				}
			}
			rProductos.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		do {
			option = JOptionPane.showInputDialog(" - Gestor de alquiler - \n" + "1) Alquilar un libro.\n"
					+ "2) Alquilar una película.\n" + "3) Alquilar un DVD de música.\n" + "4) Devolver un producto.\n"
					+ "5) Ver todos los productos disponibles.\n" + "6) Guardar información en ficheros.\n"
					+ "x) Salir.").toLowerCase().charAt(0);
			switch (option) {

			// Alquilar un libro -> Lista productos disponibles, y posteriormente compara el código introducido con los articulos existentes
			case '1':
				lista = "";
				c = 0;
				c2 = 0;
				for (Alquilable libro : productosAlqOrd) {
					if (libro instanceof Libro) {
						if (!((Libro) libro).isAlquilado())
							lista += libro.toString() + "\n";
						c++;
					}
				}
				codigo = JOptionPane.showInputDialog(
						"Lista de libros disponibles: \n" + lista + "\nIntroduce el código del libro a alquilar:")
						.toUpperCase();
				if (Producto.validarCodigo(codigo)) {
					for (Alquilable libro : productosAlqOrd) {
						if (libro instanceof Libro) {
							if (((Libro) libro).getCodigo().equals(codigo)) {
								libro.alquilar();
								JOptionPane.showMessageDialog(null, "El libro ha sido alquilado.");
								break;
							}
							c2++;
						}
					}
					if (c == c2) {
						JOptionPane.showMessageDialog(null, "El libro no ha sido encontrado. Intentalo de nuevo");
					}
				} else {
					JOptionPane.showMessageDialog(null, "El código introducido no es válido.");
				}

				break;

			// Alquilar una pelicula -> Lista productos disponibles, y posteriormente compara el código introducido con los articulos existentes
			case '2':
				lista = "";
				c = 0;
				c2 = 0;
				for (Alquilable pelicula : productosAlqOrd) {
					if (pelicula instanceof Pelicula) {
						if (!((Pelicula) pelicula).isAlquilado())
							lista += pelicula.toString() + "\n";
						c++;
					}
				}
				codigo = JOptionPane.showInputDialog("Lista de Peliculas disponibles: \n" + lista
						+ "\nIntroduce el código de la pelicula a alquilar:").toUpperCase();
				if (Producto.validarCodigo(codigo)) {
					for (Alquilable pelicula : productosAlqOrd) {
						if (pelicula instanceof Pelicula) {
							if (((Pelicula) pelicula).getCodigo().equals(codigo)) {
								pelicula.alquilar();
								JOptionPane.showMessageDialog(null, "El la pelicula ha sido alquilada.");
								break;
							}
							c2++;
						}
					}
					if (c == c2) {
						JOptionPane.showMessageDialog(null, "La pelicula no ha sido encontrada. Intentalo de nuevo");
					}
				} else {
					JOptionPane.showMessageDialog(null, "El código introducido no es válido.");
				}
				break;

			// Alquilar un DVD de música -> Lista productos disponibles, y posteriormente compara el código introducido con los articulos existentes
			case '3':
				lista = "";
				c = 0;
				c2 = 0;
				for (Alquilable dvdM : productosAlqOrd) {
					if (dvdM instanceof DVDMusica) {
						if (!((DVDMusica) dvdM).isAlquilado())
							lista += dvdM.toString() + "\n";
						c++;
					}
				}
				codigo = JOptionPane.showInputDialog("Lista de discos de música disponibles: \n" + lista
						+ "\nIntroduce el código del disco de música a alquilar:").toUpperCase();
				if (Producto.validarCodigo(codigo)) {
					for (Alquilable dvdM : productosAlqOrd) {
						if (dvdM instanceof DVDMusica) {
							if (((DVDMusica) dvdM).getCodigo().equals(codigo)) {
								dvdM.alquilar();
								JOptionPane.showMessageDialog(null, "El disco de música ha sido alquilado.");
								break;
							}
							c2++;
						}
					}
					if (c == c2) {
						JOptionPane.showMessageDialog(null,
								"El disco de música no ha sido encontrado. Intentalo de nuevo");
					}
				} else {
					JOptionPane.showMessageDialog(null, "El código introducido no es válido.");
				}
				break;

			// Devolver un producto -> Lista productos alquilados, y posteriormente compara el código introducido con los articulos existentes
			case '4':
				lista = "";
				c = 0;
				c2 = 0;

				for (Alquilable producto : productosAlqOrd) {
					if (producto instanceof Producto) {
						if (((Producto) producto).isAlquilado())
							lista += producto.toString() + "\n";
						c++;
					}
				}
				if (lista == "") {
					JOptionPane.showMessageDialog(null, "No hay productos alquilados.");
					break;
				}

				codigo = JOptionPane.showInputDialog(
						"Lista de productos alquilados: \n" + lista + "\nIntroduce el código del producto a devolver:")
						.toUpperCase();
				if (Producto.validarCodigo(codigo)) {
					for (Alquilable producto : productosAlqOrd) {
						if (producto instanceof Producto) {
							if (((Producto) producto).getCodigo().equals(codigo)) {
								producto.devolver();
								JOptionPane.showMessageDialog(null, "El producto ha sido devuelto.");
								break;
							}
							c2++;
						}
					}
					if (c == c2) {
						JOptionPane.showMessageDialog(null, "El producto no ha sido encontrado. Intentalo de nuevo");
					}
				} else {
					JOptionPane.showMessageDialog(null, "El código introducido no es válido.");
				}
				break;

			// Ver todos los productos disponibles
			case '5':
				lista = "";

				for (Alquilable producto : productosAlqOrd) {
					if (producto instanceof Producto) {
						if (!((Producto) producto).isAlquilado())
							lista += producto.toString() + "\n";
					}
				}
				
				JTextArea textArea = new JTextArea(lista, 40, 20);
				JScrollPane sp = new JScrollPane(textArea);
				sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				JOptionPane.showMessageDialog(null, sp);
				break;

			// Guardar información en los ficheros
			case '6':
				guardarInformacion(productosAlqOrd);
				break;

			// Salir -> Da la opción de guardar o no guardar, si le das a la opción guardar, actualiza los ficheros
			case 'x':
				String[] botones = { "Si", " No" };
				int variable = JOptionPane.showOptionDialog(null, "¿Quieres guardar la información?", "Advertencia",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[0]);

				if (variable == 0) {
					guardarInformacion(productosAlqOrd);
					option = '&';
					break;

				}
				if (variable == 1) {
					option = '&';
					break;
				}
			default:
				JOptionPane.showMessageDialog(null, "Esta opción no es valida.");
			}
		} while (option != '&');
	}
	// -- Metodo para guardar informacion --

	// El metodo se encarga de sobreescribir los ficheros de texto y de almacenamiento de objetos, para su posterior uso.
	public static void guardarInformacion(Alquilable[] productosAlqOrd) {
		FileWriter wLibro;
		try {
			wLibro = new FileWriter(rutaFicheroLibro, false);

			FileWriter wPelicula = new FileWriter(rutaFicheroPeliculas, false);
			FileWriter wDVDMusica = new FileWriter(rutaFicheroDVDMusica, false);

			BufferedWriter bfwLibro = new BufferedWriter(wLibro);
			BufferedWriter bfwPelicula = new BufferedWriter(wPelicula);
			BufferedWriter bfwDVDMusica = new BufferedWriter(wDVDMusica);

			FileOutputStream flujoSalida = new FileOutputStream(rutaFicheroBDD);
			ObjectOutputStream escritor = new ObjectOutputStream(flujoSalida);
			
			// --- Fichero BDD --

			escritor.writeObject(productosAlqOrd);
			escritor.close();

			// ---- Ficheros de texto ----

			for (Alquilable producto : productosAlqOrd) {
				if (producto != null) {
					if (producto instanceof Libro) {
						bfwLibro.write(((Libro) producto).toStringFichero());
						bfwLibro.newLine();
					}

					else if (producto instanceof Pelicula) {
						bfwPelicula.write(((Pelicula) producto).toStringFichero());
						bfwPelicula.newLine();
					}

					else if (producto instanceof DVDMusica) {
						bfwDVDMusica.write(((DVDMusica) producto).toStringFichero());
						bfwDVDMusica.newLine();
					}
				}
			}
			bfwPelicula.close();
			bfwLibro.close();
			bfwDVDMusica.close();
			JOptionPane.showMessageDialog(null, "Los ficheros han sido actualizados.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
