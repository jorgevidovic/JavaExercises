package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ModificaBDD {
	public static void main(String[] args) {
		try {
			// 1.Crear Conexión
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			// 2. Crear objeto Statement
			Statement statement = conexion.createStatement();
			String instruccionSql = "INSERT INTO test.persona (nombre, apellido, email, telefono) VALUES ('Dayanet', 'Chourio', 'correo@correo.com', '963852751')";
			
			//3. Ejecutar instrucción
			statement.executeUpdate(instruccionSql);
			System.out.println("Datos insertados correctamente!");

		} catch (Exception e) {
			System.out.println("No conecta!");
			e.printStackTrace();
		}
	}
}
