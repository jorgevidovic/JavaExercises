package bdd;

import java.sql.*;

public class ConsultaPreparada {

	public static void main(String[] args) {
		try {
			// 1.Crear conexión:
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			// 2. Crear objeto Statement y preparar consulta:
			PreparedStatement statement = conexion.prepareStatement("SELECT nombre, apellido, email, telefono FROM test.persona WHERE nombre = ?"); 
			
			//3. Establecer parametros:
			statement.setString(1, "Jorge");
			
			ResultSet resultSet = statement.executeQuery();
			
			//4. Recorrer el resultSet
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
			resultSet.close();

		} catch (Exception e) {
			System.out.println("No conecta!");
			e.printStackTrace();
		}
	}
}
