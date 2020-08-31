package sistemaBarbearia;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaClientes {
	
	
	
	public CriarTabelaClientes() throws SQLException {
		Connection conexao = CriarConexao.getConexao();
		
		
		String sql = "CREATE TABLE IF NOT EXISTS clientes ("
			    + "codigo INT AUTO_INCREMENT PRIMARY KEY,"
			    + "nome VARCHAR(80) NOT NULL,"
			    + "telefone VARCHAR(12),"
			    + "email VARCHAR(80) NOT NULL,"
			    + "aniversario DATE,"
			    + "fidelidade DATE"
			    + ");";
		
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Tabela criada com sucesso!");
	}

}
