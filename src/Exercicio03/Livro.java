package Ex_03;

public class Livro {
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public void recuperarDados() {
		System.out.println("\nTitulo: " + getTitulo()
		+ "\nAutor: " + getAutor()
		+ "\nNúmero páginas: " + getNumeroPaginas());
	}
	
	//CONSTRUTOR
	public Livro(String titulo, String autor, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	//GETTERS
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	
	
	
	
}
