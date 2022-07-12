package db;

import java.sql.SQLException;

public class Pessoa {

		private int codigo;
		private String nome;
		private int idade;
				
		
		public Pessoa(int codigo, String nome, int idade) {
			super();
			this.codigo = codigo;
			this.nome = nome;
			this.idade = idade;
		}
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public static void main(String[] args) throws SQLException {

		
		ConsultarPessoa consultarPessoa = new ConsultarPessoa();
		AdicionarPessoa adicionarPessoa = new AdicionarPessoa();
		DeletePessoa deletePessoa = new DeletePessoa();
		
		ConsultarPessoa.consultarPessoa();
		AdicionarPessoa.adicionarPessoa();
		ConsultarPessoa.consultarPessoa();
		DeletePessoa.deletarPessoa();
		ConsultarPessoa.consultarPessoa();

		

			
			
			
		}
	}


