package bancovirtual;

public class Cliente {

	private String nome;
	private String cpf;
	private String profissao;
	
	public Cliente (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		System.out.println("Um novo cliente está sendo cadastrado.");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
}
