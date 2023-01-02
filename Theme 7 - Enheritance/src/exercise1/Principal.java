package exercise1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		char o = 0;
		Empleado[] plantilla = new Empleado[10];

		do {
			o = JOptionPane.showInputDialog(null,
					"- Gestor de empleados -/n" + "a) Guardar un operario./n" + "b) Guardar un administrativo./n"
							+ "c) Guardar un directivo./n" + "b) Actualizar salario de los empleados./n" + "x) Salir.")
					.toLowerCase().charAt(0);
			switch (o) {
			case 'a':
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				String nombre = JOptionPane.showInputDialog("Introduce el nombre del operario:");
				String dni = JOptionPane.showInputDialog("Introduce el DNI:");
				String fechaN = JOptionPane.showInputDialog("Introduce la fecha de nacimiento del operario ");
				String fechaC = JOptionPane.showInputDialog("Introduce la fecha de contratacion: ");

				LocalDate fechaNacimiento = LocalDate.parse(fechaN, formato);
				LocalDate fechaContratacion = LocalDate.parse(fechaC, formato);
				
				Empleado empleado = new Empleado(nombre, dni, fechaNacimiento, fechaContratacion);
				
				Empleado.guardarEmpleado(empleado, plantilla);
			}
		} while (o != 'x');
	}
}
