package Ex_03;

public class TestaLivro {
	public static void main(String[] args) {
		Livro l = new Livro("PHP na pr�tica", "Marques Carvalho Da Silva , J�lia", 600);
		Livro l2 = new Livro("Use a Cabe�a Java", "Sierra, Kathy", 500);
		Livro l3 = new Livro("Monty Python", "Unknown", 800);
		
		l.recuperarDados();
		l2.recuperarDados();
		l3.recuperarDados();
	}
	
}
