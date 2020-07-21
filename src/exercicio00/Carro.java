package Ex_01;

public class Carro {
	private String cor;
	private String modelo;
	private int qntdPortas;
	
	public void acelear() {
		System.out.println("Carro acelerando...");
	}
	
	public void frear() {
		System.out.println("Carro freando...");
	}
	
	public void recuperarDados() {
		System.out.println("Especificacoes carro"
		+ "\nCor: " + getCor()
		+ "\nModelo: " + getModelo()
		+ "\nQuantidade portas: " + getQntdPortas());
	}
	
	
	//GETTERS E SETTERS
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQntdPortas() {
		return qntdPortas;
	}

	public void setQntdPortas(int qntdPortas) {
		this.qntdPortas = qntdPortas;
	}
	
	
	
}
