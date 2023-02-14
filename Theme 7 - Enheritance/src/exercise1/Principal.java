package exercise1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String nombre, dni, fechaN, fechaC;
		LocalDate fechaNacimiento, fechaContratacion;
		Empleado[] plantilla = new Empleado[10];
		char o = 0;

		do {
			o = JOptionPane.showInputDialog(null,
					"- Gestor de empleados -" + "\na) Guardar un operario." + "\nb) Guardar un administrativo."
							+ "\nc) Guardar un directivo." + "\nd) Actualizar salario de los empleados."
							+ "\ne) Mostrar todos los empleados." + "\nx) Salir.")
					.toLowerCase().charAt(0);
			switch (o) {

			case 'a':
				nombre = JOptionPane.showInputDialog("Introduce el nombre del operario:");
				dni = JOptionPane.showInputDialog("Introduce el DNI:");
				fechaN = JOptionPane.showInputDialog("Introduce la fecha de nacimiento del operario ");
				fechaC = JOptionPane.showInputDialog("Introduce la fecha de contratación: ");
				String seguroAccidentes = JOptionPane.showInputDialog("Introduce el número de poliza de accidentes: ");
				String responsabilidadCivil = JOptionPane
						.showInputDialog("Introduce el número de poliza de accidentes: ");

				fechaNacimiento = LocalDate.parse(fechaN, formato);
				fechaContratacion = LocalDate.parse(fechaC, formato);

				Operario operario = new Operario(nombre, dni, fechaNacimiento, fechaContratacion, seguroAccidentes,
						responsabilidadCivil);
				Empleado.guardarEmpleado(operario, plantilla);

				for (Empleado empleado2 : plantilla) {
					if (empleado2 != null)
						System.out.println(empleado2);
				}
			}
		} while (o != 'x');
	}
}
