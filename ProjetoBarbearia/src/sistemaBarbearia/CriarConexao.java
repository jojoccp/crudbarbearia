package sistemaBarbearia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriarConexao {

	public static Connection getConexao() {

		try {
			final String url = "jdbc:mysql://localhost/barbearia?verifyServerCertificate=false&useSSL=true";
			final String usuario = "root";
			final String senha = "Leonardo16@";

			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
