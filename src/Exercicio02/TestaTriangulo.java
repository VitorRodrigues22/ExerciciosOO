package Ex_02;

public class TestaTriangulo {
	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo(2, 5);
		Triangulo t2 = new Triangulo(8, 10);
		Triangulo t3 = new Triangulo(2.6, 9.3);
		
		System.out.println("Área triangulo 1: " + t1.triangulo());
		System.out.println("Área triangulo 2: " + t2.triangulo());
		System.out.println("Área triangulo 3: " + t3.triangulo());
		
		
	}
}
