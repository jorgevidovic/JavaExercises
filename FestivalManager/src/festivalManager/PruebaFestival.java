package festivalManager;

import javax.swing.JOptionPane;

public class PruebaFestival {

	public static void main(String[] args) {
		try {
			int numeroDeGrupos = 100;
			Festival festival = new Festival("Festimed", numeroDeGrupos);
			String option = null;
			char o = 0;

			do {
				option = JOptionPane.showInputDialog(null,
						"Ejercicio 1 - Festival \n" + "\nA) Añadir grupo." + "\nB) Buscar grupo."
								+ "\nC) Obtener coste total." + "\nD) Mostrar grupos mas caros."
								+ "\nE) Mostrar grupo por popularidad."
								+ "\n   - Buscar grupos superiores a una popularidad introducida."
								+ "\nF) Mostrar toda la información del festival." + "\nX) Salir.");
				o = option.toUpperCase().charAt(0);
				switch (o) {

				case 'A':
					String nombreGrupo = JOptionPane.showInputDialog("Introduce el nombre del grupo a añadir:");
					int tiempoActuacion = Integer.parseInt(JOptionPane
							.showInputDialog("Introduce el tiempo de actuacion en minutos del grupo a añadir:"));
					int popularidad = Integer.parseInt(
							JOptionPane.showInputDialog("Introduce del 1 al 10 la popularidad del grupo a añadir:"));
					float coste = Float
							.parseFloat(JOptionPane.showInputDialog("Introduce el precio del grupo a añadir:"));
					Grupo grupo = new Grupo(nombreGrupo, tiempoActuacion, popularidad, coste);
					festival.addGrupo(grupo);
					JOptionPane.showMessageDialog(null, "Se ha añadido el grupo.\n" + festival.toString());
					break;

				case 'B':
					nombreGrupo = JOptionPane.showInputDialog("Introduce el nombre del grupo a buscar:");
					JOptionPane.showMessageDialog(null, Festival.encuentraGrupo(nombreGrupo, festival));
					break;

				case 'C':
					if (festival.getCosteTotal() > 0) {
						JOptionPane.showMessageDialog(null,
								"Coste Total del Festival: " + festival.getCosteTotal() + "€");
					} else {
						JOptionPane.showMessageDialog(null, "No hay grupos disponibles.");
					}

					break;

				case 'D':
					JOptionPane.showMessageDialog(null, Festival.ordenarPorPrecio(festival));
					break;

				case 'E':
					popularidad = Integer
							.parseInt(JOptionPane.showInputDialog("Introduce la popularidad de referencia:"));
					JOptionPane.showMessageDialog(null, Festival.OrdenarGruposPorPopularidad(popularidad, festival));
					break;

				case 'F':
					JOptionPane.showMessageDialog(null, Festival.mostrarInformacionDelFestival(festival));
					break;

				case 'X':
					JOptionPane.showMessageDialog(null, "Has seleccionado 'Salir'. \nHasta luego.");
					break;
				}
			} while (o != 'X');
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo ha ido mal, intentalo de nuevo.");
		}
	}
}
