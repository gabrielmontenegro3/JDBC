package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeletePessoa {
	
	public static void deletarPessoa() throws SQLException {
		Scanner entrada = new Scanner(System.in);

		Integer id_usuario;
		id_usuario = null;
		
		System.out.println("Digite o ID a ser DELETADO");
		id_usuario = entrada.nextInt();
		
		String sql = "DELETE FROM pessoa where codigo_pessoa = " + id_usuario + "";
		
		Connection conexao = FabricaConexao.getConexao();

		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("ID deletado com sucesso!");
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
		
		System.out.println("------------------------");
		System.out.println("------------------------");
		System.out.println("------------------------");

		
		
		deletarPessoa();
		
//		Scanner entrada = new Scanner(System.in);

//		Integer id_usuario;
	//	id_usuario = null;
		
//		System.out.println("Digite o ID a ser DELETADO");
//		id_usuario = entrada.nextInt();
		
//		sql = "DELETE FROM pessoa where codigo_pessoa = " + id_usuario + "";
		
//		conexao = FabricaConexao.getConexao();

//		stmt = conexao.createStatement();
//		stmt.execute(sql);
		
//		System.out.println("ID deletado com sucesso!");
		
		//SELECT DO BD

		
sql = "SELECT * FROM pessoa";
		
		conexao = FabricaConexao.getConexao();
	
		stmt = conexao.createStatement();
		stmt.execute(sql);
		
		resultado = stmt.executeQuery(sql);
		pessoas = new ArrayList<>();
		
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
