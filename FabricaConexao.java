package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao{
	
	public static Connection getConexao() {
		
	try {
		final String url = "jdbc:mysql://localhost:3306/agendamento?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "x5q5a5e5";
	
		
		return DriverManager.getConnection(url, usuario, senha);
	}
	catch(SQLException e){
		throw new RuntimeException(e);
	}
	}

}
