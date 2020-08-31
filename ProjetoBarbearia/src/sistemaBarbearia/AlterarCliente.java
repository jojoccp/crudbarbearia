package sistemaBarbearia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarCliente {
	
	
	AlterarCliente() throws SQLException {
	Scanner entrada = new Scanner(System.in);
	
	
	System.out.println("Informe o código da pessoa: ");
	int codigo = entrada.nextInt();
	
	
	String select = "SELECT * FROM clientes WHERE codigo = ?";
	String updateNome = "UPDATE clientes SET nome = ? WHERE codigo = ?";
	String updateTelefone = "UPDATE clientes SET telefone = ? WHERE codigo = ?";
	String updateEmail= "UPDATE clientes SET email = ? WHERE codigo = ?";
	String updateAniversario = "UPDATE clientes SET aniversario = ? WHERE codigo = ?";
	String updateFidelidade = "UPDATE clientes SET fidelidade = ? WHERE codigo = ?";
	
	Connection conexao = CriarConexao.getConexao();
	PreparedStatement stmt = conexao.prepareStatement(select);
	stmt.setInt(1, codigo);
	ResultSet r = stmt.executeQuery();
	
	System.out.println("Digite a opção para o que deseja alterar:"
			+ "\n 1 - Nome"
			+ "\n 2 - Telefone"
			+ "\n 3 - Email"
			+ "\n 4 - Aniversario");
	int escolha = entrada.nextInt();
	
	switch(escolha) {
	case 1:
		if(r.next()) {
			Cliente c = new Cliente(r.getInt(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getString(6));
			
			System.out.println("O nome atual é " + c.getNome());
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(updateNome);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Nome do cliente alterado com sucesso!");
		} else {
			System.out.println("Cliente não encontrado.");
		}
	break;
	case 2:
		if(r.next()) {
			Cliente c = new Cliente(r.getInt(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getString(6));
			
			System.out.println("O telefone atual é" + c.getTelefone());
			entrada.nextLine();
			
			System.out.println("Informe o novo telefone ");
			String novoTelefone = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(updateTelefone);
			stmt.setString(1, novoTelefone);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Telefone do cliente alterado com sucesso!");
		} else {
			System.out.println("Cliente não encontrado.");
		}
	break;
	case 3:
		if(r.next()) {
			Cliente c = new Cliente(r.getInt(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getString(6));
			
			System.out.println("O email atual é " + c.getEmail());
			entrada.nextLine();
			
			System.out.println("Informe o novo email: ");
			String novoEmail = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(updateEmail);
			stmt.setString(1, novoEmail);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Email alterado com sucesso!");
		} else {
			System.out.println("Cliente não encontrado.");
		}
	break;
	case 4:
		if(r.next()) {
			Cliente c = new Cliente(r.getInt(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getString(6));
			
			System.out.println("A data de aniversário atual é " + c.getNome());
			entrada.nextLine();
			
			System.out.println("Informe a nova data de aniversario: ");
			String novoAniversario = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(updateAniversario);
			stmt.setString(1, novoAniversario);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Data de aniversário alterada com sucesso!");
		} else {
			System.out.println("Cliente não encontrado.");
		}
	break;
		
	
	}
	
	
	
	conexao.close();
	entrada.close();
	
	
}

}
