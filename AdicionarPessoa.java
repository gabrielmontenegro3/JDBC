package db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdicionarPessoa {
	
	public static void adicionarPessoa() throws SQLException {
		
		try {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira seu nome");
		String nome = entrada.next();

		System.out.println("Insira sua idade");
		Integer idade = entrada.nextInt();
		
		String sql = "INSERT INTO pessoa (nome_pessoa, idade_pessoa) values ('" + nome + "', " + idade + ");";
		
		Connection conexao = FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		ResultSet resultado = stmt.executeQuery(sql);
		List<Pessoa> pessoas = new ArrayList<>();

		

	
	sql = "INSERT INTO pessoa (nome_pessoa, idade_pessoa) values ('" + nome + "', " + idade + ");";
								//											("joao", 27);

	System.out.println(nome + " armazenado com sucesso!");
	
//	conexao = FabricaConexao.getConexao();
	
//	stmt = conexao.createStatement();
//	stmt.execute(sql);
	stmt.close();
	
		} catch(Exception e) {
			e.getMessage();
		}
}
	
	public static void main(String[] args) throws SQLException {
		
		//consultar pessoa objeto pra trazer o metodo
		
		ConsultarPessoa consultarPessoa = new ConsultarPessoa();

		Integer dnv;
	
	Scanner entrada = new Scanner(System.in);
		
	do{
		
//metodo consultar pessoa
		
		consultarPessoa.consultarPessoa();
		

		System.out.println("------------------------");
		System.out.println("------------------------");
		System.out.println("------------------------");
		
		// SELECT BD
		adicionarPessoa();

	
	System.out.println("Digite 1 para armazenar mais uma pessoa ao BD");
	dnv = entrada.nextInt();
	

	}while (dnv == 1);
	entrada.close();

}
}