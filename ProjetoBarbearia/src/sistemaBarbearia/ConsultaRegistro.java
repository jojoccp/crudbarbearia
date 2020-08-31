package sistemaBarbearia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ConsultaRegistro {
	
	public ConsultaRegistro() throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		Connection conexao = CriarConexao.getConexao();
		String sql = "SELECT * FROM clientes WHERE nome like ?";
		
		
		
		System.out.println("Informe o valor para a pesquisa: ");
		String valor = entrada.nextLine();
	
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + valor + "%");
		ResultSet resultado = stmt.executeQuery();
		
		List<Cliente> clientes = new ArrayList<>();
	
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			String telefone = resultado.getString("telefone");
			String email = resultado.getString("email");
			String aniversario = resultado.getString("aniversario");
			String fidelidade = resultado.getString("fidelidade");
			clientes.add(new Cliente(codigo, nome, telefone, email, aniversario, fidelidade));
			
		}
		
		for(Cliente c: clientes) {
			System.out.println("Cliente:"  + " || " + c.getCodigo() + " | " + c.getNome() + " | " + c.getTelefone() + " | " + c.getEmail() +
					 " | " +  c.getAniversario() + " | " +  c.getFidelidade() + " || " );
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
		
	}
	
	

}
