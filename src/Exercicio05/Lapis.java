package Ex_05;

public class Lapis implements Escrever{
	 private String ehFeitoDe;
	 private String escreveCom;
	 
	 public Lapis() {
	        this.ehFeitoDe = "Material de madeira";
	        this.escreveCom = "grafite";
	 }

	@Override
	public void escrevendo() {
		System.out.println("Escrevendo com " + getEscreveCom());
	}

	public String getEhFeitoDe() {
		return ehFeitoDe;
	}

	public String getEscreveCom() {
		return escreveCom;
	}
	
	
	 
}
