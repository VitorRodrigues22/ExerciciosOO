package Ex_04;

public class Testa {
	public static void main(String[] args) {
		
		Cliente c = new Cliente("Vitor", 21, "Tabo�o da Serra", "123.456.789-01");
		Funcionario f = new Funcionario("Rodrigues", 50, "S�o Paulo", 54875);
		
		c.exibirDados();
		f.exibirDados();
		
	}
}
