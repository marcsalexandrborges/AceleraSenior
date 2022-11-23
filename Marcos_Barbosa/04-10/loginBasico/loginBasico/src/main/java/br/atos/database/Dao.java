package br.atos.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.atos.model.LoginEntidade;

public class Dao {

	private String dbUrl = "jdbc:mysql://bml8wyhdlfjqowt3gukd-mysql.services.clever-cloud.com:3306/bu75kyusmkci93tgxxay?useTimezone=true&serverTimezone=UTC";
	private String dbUser = "uviftz1zyipjtuap";
	private String dbPassword = "1jXz6C9FBRKQo2HGi8Vx";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";

	public void carregarDrive(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu ruim ao tentar carregar o Drive");
		}
	}

	public Connection pegarConexao() {

		Connection conexao = null;

		try {

			conexao = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu ruim ao criar a conexão");
		}

		return conexao;
	}

	public boolean validaLogin(LoginEntidade loginEntidade) {
		boolean validacao = false;

		carregarDrive(dbDriver);

		Connection conexao = pegarConexao();

		String sql = "select * from login where username = ? and password = ?";

		PreparedStatement pStatement;

		try {
			pStatement = conexao.prepareStatement(sql);
			pStatement.setString(1, loginEntidade.getUsername());
			pStatement.setString(2, loginEntidade.getPassword());

			ResultSet result = pStatement.executeQuery();

			validacao = result.next();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu ruim no metodo validaLogin!!!");

		}

		return validacao;

	}

}