package Ex_07;

public class Veiculo {
	private String nome;
	private int nroRodas;
	private double capTanque;
	private double consumo;
	private double tanque;

	public void abastecer(double qntdCombustivel) {
		tanque += qntdCombustivel;
		
		if(capTanque < tanque) {
			tanque = capTanque;
			System.out.println("A capacidade do tanque está no limite.");
		}
		
	}

	public void autonomiaVeiculo() {
		System.out.println("\nNome: " + getNome());
		System.out.println("Número de rodas: " + getNroRodas());
		System.out.println("Combustível: " + getCapTanque());
		System.out.println("Consumo: " + getConsumo());
		System.out.println("O carro pode percorrer: " + getConsumo() * tanque + "KM");
	}


	public Veiculo(double capTanque, double consumo) {
		this.capTanque = capTanque;
		this.consumo = consumo;
	}


	// GETTERS E SETTERS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNroRodas() {
		return nroRodas;
	}

	public void setNroRodas(int nroRodas) {
		this.nroRodas = nroRodas;
	}

	public double getCapTanque() {
		return capTanque;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

}
