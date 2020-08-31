package sistemaBarbearia;

public class Cliente {
	
	int codigo;
	String nome;
	String telefone;
	String email;
	String aniversario;
	String fidelidade;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAniversario() {
		return aniversario;
	}
	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	public String getFidelidade() {
		return fidelidade;
	}
	public void setFidelidade(String fidelidade) {
		this.fidelidade = fidelidade;
	}
	public Cliente(int codigo, String nome, String telefone, String email, String aniversario, String fidelidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.aniversario = aniversario;
		this.fidelidade = fidelidade;
	}
	
	
	
	 

}
