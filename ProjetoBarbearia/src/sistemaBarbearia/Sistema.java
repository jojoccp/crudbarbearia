package sistemaBarbearia;

import java.sql.SQLException;
import java.util.Scanner;

public class Sistema {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		
		CriarBanco criar = new CriarBanco();	
		
		CriarTabelaClientes criarTabela = new CriarTabelaClientes();
		
		System.out.println("Escolha uma opção"
				+ "\n1 - Cadastrar Cliente"
				+ "\n2 - Listar Clientes"
				+ "\n3 - Alterar Cliente"
				+ "\n4 - Excluir Cliente");
		int escolha = entrada.nextInt();
		
		
		switch (escolha) {
			case 1 :
				NovoCliente inserirCliente = new NovoCliente();
				break;
			case 2 :
				ListarClientes listarClientes = new ListarClientes();
				break;
			case 3:
				ConsultaRegistro consultaCliente = new ConsultaRegistro();
				break;
			case 4:
				ExcluirRegistro excluirCliente = new ExcluirRegistro();
				break;
		}
		
		
		
		
	}

}
