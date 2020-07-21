package Ex_02;

public class Triangulo {
	
	private double base;
	private double altura;
	
	public double triangulo() {
		return (this.base *  this.altura) / 2;
	}

	
	//CONSTRUTOR
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//GETTERS E SETTERS
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
	
}
