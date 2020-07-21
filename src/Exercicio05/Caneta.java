package Ex_05;

public class Caneta implements Escrever{
	 private String ehFeitoDe;
	 private String escreveCom;
	 
	 public Caneta() {
	        this.ehFeitoDe = "Material de plastico";
	        this.escreveCom = "Tinta";
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
