package Ex_04;

public class Funcionario extends Pessoa{

	private int nroMatricula;
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Número Matricula Funcionário: " + getNroMatricula());
	}
	
	//CONSTRUTOR
	public Funcionario(String nome, int idade, String cidadeNascimento, int nroMatricula) {
		super(nome, idade, cidadeNascimento);
		this.nroMatricula = nroMatricula;
	}


	//GETTERS E SETTERS
	public int getNroMatricula() {
		return nroMatricula;
	}

	public void setNroMatricula(int nroMatricula) {
		this.nroMatricula = nroMatricula;
	}
	
	
}
