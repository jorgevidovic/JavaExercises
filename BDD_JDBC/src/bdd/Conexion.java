package bdd;

import java.sql.*;

public class Conexion {
 
	public static void main(String[] args) {
		
		try {
			//1.Crear Conexión
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			
			//2. Crear objeto Statement
			Statement statement = conexion.createStatement();
			
			//3. Ejecutar consulta SQL
			ResultSet resultSet = statement.executeQuery("SELECT * FROM test.persona");
			
			//4. Recorrer el resultSet
			while(resultSet.next()) {
				System.out.println(resultSet.getString("id_persona") + " " + resultSet.getString("nombre"));
			}

		} catch (Exception e){
			System.out.println("No conecta!");
			e.printStackTrace();
		}
	}
}
