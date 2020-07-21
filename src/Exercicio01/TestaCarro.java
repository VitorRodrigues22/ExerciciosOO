package Ex_01;

public class TestaCarro {
	public static void main(String[] args) {
		
		//Para commit
		
		Carro c = new Carro();
		
		c.setCor("Amarelo");
		c.setModelo("HB20");
		c.setQntdPortas(4);
		
		c.recuperarDados();
		System.out.println("\n");
		c.acelear();
		c.frear();
		
		
	}
}
