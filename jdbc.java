package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws SQLException {
		
	//	final String url = "jdbc:mysql://localhost:3306/agenda?verifyServerCertificate=false&useSSL=true";
	//	final String usuario = "root";
	//	final String senha = "x5q5a5e5";
		
	//	Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Conexão executada com sucesso");
		
		Statement stmt = conexao.createStatement();
		stmt.execute("create TABLE IF NOT EXIST agenda3");
		
		stmt.close();
	}

}
