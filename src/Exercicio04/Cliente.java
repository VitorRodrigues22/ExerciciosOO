package Ex_04;

public class Cliente extends Pessoa{
	
	private String cpf;
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("CPF Cliente: " + getCpf());
	}

	//CONSTRUTOR
	public Cliente(String nome, int idade, String cidadeNascimento, String cpf) {
		super(nome, idade, cidadeNascimento);
		this.cpf = cpf;
	}
	

	//GETTERS E SETTERS
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	

}
