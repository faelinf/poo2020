package aula09.salaaula.as7b.ex3;

public class Cliente {
	private String nome;
	private String telefone;
	private String cpf;
	
	public Cliente(String nome, String telefone, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	public String toString() {
		StringBuffer cs = new StringBuffer();
		cs.append("\nNome do Cliente: " + this.getNome() +
				" | Telefone do cliente: " + this.getTelefone() +
				" | Cpf do cliente: " + this.getCpf());
		
		return cs.toString();
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
