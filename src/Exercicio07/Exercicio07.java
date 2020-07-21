package Ex_07;

public class Exercicio07 {
	public static void main(String[] args) {
		Veiculo v = new Veiculo(50, 10);
		Veiculo v2 = new Veiculo(50, 15);
		
		v.setNome("HB20");
		v.setNroRodas(4);
		v.abastecer(10);
		v.autonomiaVeiculo();
		
		v2.setNome("I30");
		v2.setNroRodas(4);
		v2.abastecer(10);
		v2.abastecer(10);
		v2.autonomiaVeiculo();
		
	}
}
