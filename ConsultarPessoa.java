package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoa {
	

	
	public static void consultarPessoa() throws SQLException {
		String sql = "SELECT * FROM pessoa";
		
		Connection conexao = FabricaConexao.getConexao();
	
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		ResultSet resultado = stmt.executeQuery(sql);
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo_pessoa");
			String nome = resultado.getString("nome_pessoa");
			int idade = resultado.getInt("idade_pessoa");
			
			pessoas.add(new Pessoa(codigo, nome, idade));
			
			
		}
		
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome() + ", " + p.getIdade());
		}
	}

	public static void main(String[] args) throws SQLException {
		
		String sql = "SELECT * FROM pessoa";
		
		Connection conexao = FabricaConexao.getConexao();
	
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		ResultSet resultado = stmt.executeQuery(sql);
		List<Pessoa> pessoas = new ArrayList<>();
		
		
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo_pessoa");
			String nome = resultado.getString("nome_pessoa");
			int idade = resultado.getInt("idade_pessoa");
			
			pessoas.add(new Pessoa(codigo, nome, idade));
			
			
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome() + ", " + p.getIdade());
		}
		
		
		
		stmt.close();
		
		
		
		
	}


}
