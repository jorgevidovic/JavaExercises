package exercise1;

import javax.swing.JOptionPane;

public Empleado guardarEmpleado(Empleado empleado) {
	return empleado;
}

public class Principal {
	public static void main(String[] args) {
		char o = 0;
		Empleado[] plantilla = new Empleado[10];

		do {
			o = JOptionPane.showInputDialog(null, "- Gestor de empleados -/n" 
					+ "a) Guardar un operario./n"
					+ "b) Guardar un administrativo./n"
					+ "c) Guardar un directivo./n"
					+ "b) Actualizar salario de los empleados./n" 
					+ "x) Salir.").toLowerCase().charAt(0);
			switch (o) {
			case 'a':
				Empleado empleado;
				
			}
		} while (o != 'x');
	}
}
