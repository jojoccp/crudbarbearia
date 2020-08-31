package sistemaBarbearia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListarClientes {
	
	public ListarClientes() throws SQLException  {
	Connection conexao = CriarConexao.getConexao();
	String sql = "SELECT * FROM clientes";
	
	Statement stmt = conexao.createStatement();
	ResultSet resultado = stmt.executeQuery(sql);
	
	List<Cliente> clientes = new ArrayList<>();
	
	while(resultado.next()) {
		int codigo = resultado.getInt("codigo");
		String nome = resultado.getString("nome") ;
		String telefone = resultado.getString("telefone") ;
		String email = resultado.getString("email") ;
		String aniversario = resultado.getString("aniversario") ;
		String fidelidade = resultado.getString("fidelidade") ;
		clientes.add(new Cliente(codigo, nome, telefone, email, aniversario, fidelidade));
		
	}
	
	for(Cliente c: clientes) {
		System.out.println("||  " + c.getCodigo() + "  |  " + c.getNome() + "  |  " + c.getTelefone() + "  |  " + c.getEmail() + "  |  " 
				+ c.getAniversario() + "  |  " + c.getFidelidade() + "  ||  "  );
	}
	
	stmt.close();
	conexao.close();
	
	}
}


