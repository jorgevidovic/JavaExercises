package festivalManager;

public class Festival {
	private String nombre;
	private int duracion;
	private float costeTotal;
	private Grupo[] programa = new Grupo[1];

	public Festival(String nombre, int numeroDeGrupos) {
		this.nombre = nombre;
		programa = new Grupo[numeroDeGrupos];
	}

	// -- Nombre del festival --
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// -- Duracion del festival --

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		int duracionGrupos = 0;
		for (Grupo i : programa) {
			if (i != null) {
				duracionGrupos += i.getTiempoActuacion();
			}
		}
		this.duracion = duracionGrupos;
	}

	// -- Coste total del festival --

	public float getCosteTotal() {
		return costeTotal;
	}

	public void setCosteTotal(float costeTotal) {

		int costeGrupos = 0;
		for (Grupo i : programa) {
			if (i != null) {
				costeGrupos += Grupo.calcularPrecioFinal(i.getCoste(), i.getPopularidad());
			}
		}
		this.costeTotal = costeGrupos;
	}

	public Grupo[] getPrograma() {
		return programa;
	}

	public void setPrograma(Grupo[] programa) {
		this.programa = programa;
	}

	// -- Zona de metodos para el funcionamiento del programa --

	// -- Añadir grupo al festival --

	public void addGrupo(Grupo grupo) {
		for (int i = 0; i < programa.length; i++) {
			if (programa[i] == null) {
				programa[i] = grupo;
				setCosteTotal(grupo.getCoste());
				setDuracion(grupo.getTiempoActuacion());
				break;
			}
		}
	}

	public static void addGrupo(Grupo grupo, Festival festival) {
		for (int i = 0; i < festival.getPrograma().length; i++) {
			if (festival.getPrograma()[i] == null) {
				festival.getPrograma()[i] = grupo;
				break;
			}
		}
	}

	// -- Buscar grupo en el festival --

	public static Grupo dameGrupo(int posicion, Grupo[] programa) {
		if (posicion < programa.length) {
			return programa[posicion];
		} else {
			return null;
		}
	}

	// -- Encontrar grupo mediante nombre --

	public static String encuentraGrupo(String nombreGrupo, Festival festival) {
		Grupo[] grupos = festival.getPrograma();
		String grupo = null;
		int posicion = 0;

		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				if (grupos[i].getNombre().matches(nombreGrupo)) {
					grupo = grupos[i].toString();
					posicion = i + 1;
					return "La posicion es: " + posicion + "\n" + grupo;
				}
			}
		}
		return "El grupo introducido no fue encontrado.";
	}

	// -- Obtener 3 grupos mas caros --

	public static String ordenarPorPrecio(Festival festival) {
		Grupo[] grupos = festival.getPrograma();
		Grupo[] tresGruposMasCaros = new Grupo[3];
		int contadorDeGrupos = 0;
		tresGruposMasCaros[0] = grupos[0];
		tresGruposMasCaros[1] = grupos[1];
		tresGruposMasCaros[2] = grupos[2];

		for (int i = 0; i < grupos.length; i++) {
			if (grupos[i] != null) {
				contadorDeGrupos++;
				if (contadorDeGrupos > 2) {
					if (Grupo.calcularPrecioFinal(grupos[i].getCoste(), grupos[i].getPopularidad()) > Grupo
							.calcularPrecioFinal(tresGruposMasCaros[0].getCoste(),
									tresGruposMasCaros[0].getPopularidad())) {
						tresGruposMasCaros[2] = tresGruposMasCaros[1];
						tresGruposMasCaros[1] = tresGruposMasCaros[0];
						tresGruposMasCaros[0] = grupos[i];

					} else if (Grupo.calcularPrecioFinal(grupos[i].getCoste(), grupos[i].getPopularidad()) > Grupo
							.calcularPrecioFinal(tresGruposMasCaros[1].getCoste(),
									tresGruposMasCaros[1].getPopularidad())) {
						tresGruposMasCaros[2] = tresGruposMasCaros[1];
						tresGruposMasCaros[1] = grupos[i];

					} else if (Grupo.calcularPrecioFinal(grupos[i].getCoste(), grupos[i].getPopularidad()) > Grupo
							.calcularPrecioFinal(tresGruposMasCaros[2].getCoste(),
									tresGruposMasCaros[2].getPopularidad())) {
						tresGruposMasCaros[2] = grupos[i];
					}
				}

				if (contadorDeGrupos == 2) {
					if (Grupo.calcularPrecioFinal(grupos[i].getCoste(), grupos[i].getPopularidad()) > Grupo
							.calcularPrecioFinal(tresGruposMasCaros[0].getCoste(),
									tresGruposMasCaros[0].getPopularidad())) {
						tresGruposMasCaros[1] = tresGruposMasCaros[0];
						tresGruposMasCaros[0] = grupos[i];

					} else if (Grupo.calcularPrecioFinal(grupos[i].getCoste(), grupos[i].getPopularidad()) > Grupo
							.calcularPrecioFinal(tresGruposMasCaros[1].getCoste(),
									tresGruposMasCaros[1].getPopularidad())) {
						tresGruposMasCaros[0] = grupos[i];
					}
				}
				if (contadorDeGrupos == 1) {
					tresGruposMasCaros[0] = grupos[i];
				}
			}
		}
		if (contadorDeGrupos > 2) {
			return "Grupo mas caro: " + tresGruposMasCaros[0] + "\nSegundo grupo mas caro: " + tresGruposMasCaros[1]
					+ "\nTercer grupo mas caro: " + tresGruposMasCaros[2];
		}

		else if (contadorDeGrupos == 2) {
			return "Grupo mas caro: " + tresGruposMasCaros[0] + "\nSegundo grupo mas caro: " + tresGruposMasCaros[1];
		}

		else if (contadorDeGrupos == 1) {
			return "Unico grupo: " + tresGruposMasCaros[0];
		}
		return "No hay grupos disponibles.";
	}

	// -- Ordenar grupos por popularidad --

	public static String OrdenarGruposPorPopularidad(int popularidad, Festival festival) {
		int x = 0;
		for (int i = 0; i < festival.getPrograma().length; i++) {
			if (festival.getPrograma()[i] != null) {
				if (festival.getPrograma()[i].getPopularidad() > popularidad) {
					x++;
				}
			}
		}

		Festival festival2 = new Festival(festival.getNombre() + " - Según popularidad.", x);
		for (int i = 0; i < festival.getPrograma().length; i++) {
			if (festival.getPrograma()[i] != null) {
				if (festival.getPrograma()[i].getPopularidad() > popularidad) {
					addGrupo(festival.getPrograma()[i], festival2);
				}
			}
		}
		if (x >= 1) {
			return "Popularidad introducida: " + popularidad + "\n" + "Grupos con una popularidad superior:\n"
					+ festival2.toString();
		}
		return "No hay grupos disponibles.";
	}

	// -- Mostrar toda la informacion del festival informacion del festival --

	public static String mostrarInformacionDelFestival(Festival festival) {
		int contadorDeGrupos = 0;
		for (int i = 0; i < festival.getPrograma().length; i++) {
			if (festival.getPrograma()[i] != null) {
				contadorDeGrupos++;
			}
		}
		if (contadorDeGrupos >= 1) {
			return "Duración total del festival: " + festival.getDuracion() + " minutos\n" + "Coste total: "
					+ festival.getCosteTotal() + "€\n" + festival.toString();
		}
		return "No hay grupos disponibles.";
	}

	// Metodo ToString
	@Override
	public String toString() {
		String grupo = "", grupos = "";
		for (int i = 0; i < programa.length; i++) {
			if (programa[i] != null) {
				grupo = "\n***************************************\n" + getNombre() + ". Grupo " + (i + 1)
						+ "\n***************************************\n" + Festival.dameGrupo(i, programa);
				grupos = grupos.concat(grupo);
			}
		}
		return grupos;
	}
}
