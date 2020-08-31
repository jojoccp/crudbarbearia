package sistemaBarbearia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirRegistro {
	
	public ExcluirRegistro() throws SQLException {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o código do cliente:");
		int codigo = entrada.nextInt();
		
		Connection conexao = CriarConexao.getConexao();
		String sql = "DELETE FROM clientes WHERE codigo = ?"; //se ao invés de = for > podemos excluir varios registros
		
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) { //significa que excluiu
			System.out.println("Pessoa excluida com sucesso!");
			System.out.println("Linhas afetadas: " + contador);
		} else {
			System.out.println("Codigo não encontrado!");
		}
		
		conexao.close();
		entrada.close();
	}

}
