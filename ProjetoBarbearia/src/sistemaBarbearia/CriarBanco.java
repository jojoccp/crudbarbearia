package sistemaBarbearia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
	
	public CriarBanco() throws SQLException {
		
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "Leonardo16@";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
				
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS barbearia");
		
		System.out.println("Banco criado com sucesso!");
		
		
		conexao.close();
		
	}

	

}
