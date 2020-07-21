package Ex_05;

public class PenaMosquito implements Escrever{
	 private String ehFeitoDe;
	 private String escreveCom;
	 
	public PenaMosquito(){
	        this.ehFeitoDe = "Material de metal";
	        this.escreveCom = "Nanquim";
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
