package sistemaBarbearia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NovoCliente {

	public NovoCliente() throws SQLException {
		
				
Scanner entrada = new Scanner(System.in);
		
		Auxiliares aniversarioFormatado = new Auxiliares();
		
		Date data = new Date();
		
		DateFormat formatado = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println("Informe o nome: ");
		String nome = entrada.nextLine();
		
		
		System.out.println("Informe o telefone: ");
		String telefone = entrada.nextLine();
		
		System.out.println("Informe o email: ");
		String email = entrada.nextLine();
		
		System.out.println("Informe a data de Nascimento: ");
		String aniversario = entrada.nextLine();
		
		aniversario = aniversarioFormatado.aniversarioFormatado(aniversario);
				
		String fidelidade = formatado.format(data);
		
		entrada.close();
		
		Connection conexao = CriarConexao.getConexao();

		String sql = "INSERT INTO clientes (nome, telefone, email, aniversario, fidelidade) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.setString(2, telefone);
		stmt.setString(3, email);
		stmt.setString(4, aniversario);
		stmt.setString(5, fidelidade);
		
		stmt.execute();

		System.out.println("Cliente incluido com sucesso!");
		
	}

}
